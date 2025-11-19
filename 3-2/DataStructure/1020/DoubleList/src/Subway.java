/**
 * 이중 연결 원형 리스트의 노드(CNode) 클래스.
 * 지하철 역 정보를 저장하며, 이전 역(llink)과 다음 역(rlink)을 가리킵니다.
 */
class CNode {
    CNode llink; // 이전 노드를 가리키는 링크 (Left Link)
    CNode rlink; // 다음 노드를 가리키는 링크 (Right Link)
    String station; // 역 이름

    /**
     * 노드 생성자.
     * 
     * @param data 저장할 역 이름
     */
    public CNode(String data) {
        station = data;
        llink = null;
        rlink = null;
    }
}

/**
 * 이중 연결 원형 리스트(Circular Doubly Linked List)를 구현한 클래스.
 * 지하철 노선도를 모델링합니다.
 */
class CircularDoublyLinkedList {
    CNode head; // 리스트의 시작(머리) 노드
    CNode tail; // 리스트의 끝(꼬리) 노드
    int stationCount = 0; // 리스트에 포함된 역의 총 개수

    /**
     * 리스트 생성자. 초기에는 head와 tail 모두 null입니다.
     */
    public CircularDoublyLinkedList() {
        head = null;
        tail = null;
    }

    /**
     * 리스트의 가장 끝(꼬리)에 새로운 역(노드)을 추가합니다.
     * 
     * @param data 추가할 역 이름
     */
    public void addLast(String data) {
        CNode newNode = new CNode(data);

        if (head == null) { // 리스트가 비어있는 경우 (첫 노드 추가)
            head = newNode;
            tail = newNode;
            // 원형 리스트이므로 head와 tail이 서로를 가리키게 합니다.
            newNode.llink = head;
            newNode.rlink = tail;
        } else { // 리스트에 노드가 이미 있는 경우
            // 새 노드를 현재 tail과 head 사이에 삽입
            newNode.rlink = head; // 새 노드의 다음은 head
            newNode.llink = tail; // 새 노드의 이전은 현재 tail

            head.llink = newNode; // 기존 head의 이전은 새 노드
            tail.rlink = newNode; // 기존 tail의 다음은 새 노드

            tail = newNode; // 새 노드를 새로운 tail로 설정
        }
        stationCount++;
    }

    /**
     * 리스트의 모든 역 이름을 순서대로 출력합니다.
     * 원형 리스트이므로 head부터 시작해 다시 head로 돌아올 때까지 반복합니다.
     */
    public void printStation() {
        CNode p = head;

        if (p == null) { // 리스트가 비어있는 경우
            System.out.println("역이 없음");
            return;
        }

        System.out.print("지하철 노선: ");
        // head부터 시작하여 rlink를 따라 순회, 다시 head가 되면 종료
        do {
            System.out.print(p.station + " ");
            p = p.rlink;
        } while (p != head);

        System.out.println();
    }

    /**
     * 지정된 이름의 역(노드)을 리스트에서 삭제합니다.
     * 
     * @param data 삭제할 역 이름
     */
    public void deleteStation(String data) {
        if (head == null) {
            System.out.println("삭제할 역이 없습니다.");
            return;
        }

        // 역이 하나만 있는 경우
        if (head == tail && head.station.equals(data)) {
            head = null;
            tail = null;
            stationCount--;
            return;
        }

        // head 노드 삭제
        if (head.station.equals(data)) {
            head = head.rlink; // head를 다음 노드로 이동
            head.llink = tail; // 새로운 head의 llink를 tail로 설정
            tail.rlink = head; // tail의 rlink를 새로운 head로 설정
            stationCount--;
            return;
        }

        // tail 노드 삭제
        if (tail.station.equals(data)) {
            tail = tail.llink; // tail을 이전 노드로 이동
            tail.rlink = head; // 새로운 tail의 rlink를 head로 설정
            head.llink = tail; // head의 llink를 새로운 tail로 설정
            stationCount--;
            return;
        }

        // 중간 노드 삭제
        CNode p = head.rlink; // head의 다음 노드부터 탐색 시작

        // head에서 시작할 경우, head 노드를 건너뛸 수 있으므로 rlink부터 시작하거나,
        // head부터 시작하고 p != head 조건을 검사하는 것이 더 정확합니다.
        // 여기서는 head를 건너뛰고 rlink부터 시작하여 tail까지 검사하는 방식으로 진행합니다.

        do {
            if (p.station.equals(data)) {
                // 삭제할 노드 p의 이전 노드(p.llink)와 다음 노드(p.rlink)를 연결
                p.llink.rlink = p.rlink;
                p.rlink.llink = p.llink;
                stationCount--;
                return; // 삭제 완료 후 종료
            }
            p = p.rlink;
        } while (p != head); // head로 돌아오기 전까지 반복 (head와 tail은 이미 위에서 처리됨)

        // 노드가 발견되지 않은 경우
        System.out.println("지정된 역(" + data + ")을 찾을 수 없습니다.");
    }

    /**
     * 현재 리스트에 포함된 역의 총 개수를 반환합니다.
     * 
     * @return 역의 총 개수
     */
    public int countTotalStation() {
        return stationCount;
    }

    /**
     * 'fromS' 역에서 'toS' 역까지의 최단 거리를 반환합니다.
     * 양방향(시계 방향, 반시계 방향)으로 이동하며 거리를 계산합니다.
     * 
     * @param fromS 출발역 이름
     * @param toS   도착역 이름
     * @return 최단 거리 (이동하는 역의 개수)
     */
    public int countStation(String fromS, String toS) {
        if (fromS.equals(toS))
            return 0; // 출발역과 도착역이 같으면 거리 0

        CNode startNode = head;
        // 1. 출발역(fromS) 노드를 찾기
        do {
            if (startNode.station.equals(fromS))
                break;
            startNode = startNode.rlink;
        } while (startNode != head);

        if (startNode.station.equals(fromS) == false)
            return -1; // 출발역을 찾지 못한 경우

        CNode lcheck = startNode; // 반시계 방향(llink)으로 탐색 시작
        CNode rcheck = startNode; // 시계 방향(rlink)으로 탐색 시작
        int lcount = 0; // 반시계 방향 카운트
        int rcount = 0; // 시계 방향 카운트

        // 2. 반시계 방향(llink)으로 이동하며 toS 찾기
        do {
            lcheck = lcheck.llink; // 먼저 이동
            lcount++;
            if (lcheck.station.equals(toS))
                break;
        } while (lcheck != startNode); // 한 바퀴를 돌아서 출발역으로 돌아올 때까지

        // 3. 시계 방향(rlink)으로 이동하며 toS 찾기
        do {
            rcheck = rcheck.rlink; // 먼저 이동
            rcount++;
            if (rcheck.station.equals(toS))
                break;
        } while (rcheck != startNode); // 한 바퀴를 돌아서 출발역으로 돌아올 때까지

        // 도착역을 찾지 못했거나 (원형 리스트에서는 발생하기 어려움, 주로 fromS가 없을 때)
        // 두 경로 모두에서 찾은 경우 (일반적인 경우) 최단 거리를 반환
        return Math.min(lcount, rcount);
    }

    /**
     * 두 역(station1, station2)에서 동시에 출발하여 만나는 지점까지 이동한 횟수를 계산합니다.
     * station1에서는 llink(뒤로) 이동, station2에서는 rlink.rlink(두 칸 앞으로) 이동합니다.
     * 
     * @param station1 첫 번째 출발역 이름
     * @param station2 두 번째 출발역 이름
     * @return 만나는 지점까지 이동한 횟수 (만난 역 이름도 출력)
     */
    public int overlapStation(String station1, String station2) {
        CNode lstart = head;
        CNode rstart = head;
        int count = 0;

        // 1. station1 노드 찾기
        do {
            if (lstart.station.equals(station1))
                break;
            lstart = lstart.rlink;
        } while (lstart != head);

        // 2. station2 노드 찾기
        do {
            if (rstart.station.equals(station2))
                break;
            rstart = rstart.rlink;
        } while (rstart != head);

        // 만약 station1 또는 station2가 리스트에 없다면 -1 반환
        if (!lstart.station.equals(station1) || !rstart.station.equals(station2)) {
            System.out.println("출발 역을 찾을 수 없습니다.");
            return -1;
        }

        // 3. 이동하며 만나는 지점 찾기
        // lstart는 llink(이전 역)로 1칸, rstart는 rlink.rlink(두 칸 다음 역)로 2칸 이동
        do {
            lstart = lstart.llink; // station1 출발, 반시계 방향 1칸 이동
            rstart = rstart.rlink.rlink; // station2 출발, 시계 방향 2칸 이동 (노드 수 n에 따라 만나는 속도를 조절)
            count++;

            // 경우 1: 같은 노드에서 만난 경우 (lstart == rstart)
            if (lstart == rstart) {
                System.out.println("만난 역: " + lstart.station);
                return count;
            }

            // 경우 2: 서로 교차하여 지나친 경우 (서로 이웃한 노드인 경우)
            // (a) lstart 바로 다음이 rstart
            if (lstart.rlink == rstart) {
                System.out.println("오버랩된 지점: " + lstart.station + "와 " + rstart.station + " 사이");
                // 만난 지점은 lstart나 rstart 중 하나를 임의로 출력하거나, 사이를 명시
                return count;
            }
            // (b) rstart 바로 다음이 lstart (이 로직은 위의 (a)에서 이미 다루어질 가능성이 높지만 안전을 위해 포함)
            if (rstart.rlink == lstart) {
                System.out.println("오버랩된 지점: " + rstart.station + "와 " + lstart.station + " 사이");
                return count;
            }

            // 한 바퀴를 돌아 출발 노드를 다시 만날 경우 무한 루프 방지를 위해 조건 추가 필요
            // 이 구현에서는 순회 조건을 lstart.station.equals(rstart.station)로 두었으나,
            // 이는 두 노드가 같은 역에 도착했을 때만 종료되므로,
            // 교차 지점(이웃한 노드) 체크가 더 중요합니다.

        } while (true); // 논리적으로는 언젠가 만나거나 교차해야 하므로 무한 루프 대신 위의 조건으로 종료

        // 위에서 return이 발생하지 않으면 -1 반환 (만나지 않는 상황은 없으므로 도달할 일은 거의 없음)
    }

    /**
     * 'station1' 역과 'station2' 역 사이에 'newStation'을 삽입합니다.
     * station1 -> newStation -> station2 순서로 연결됩니다.
     * 
     * @param station1   새 역의 이전 역 이름
     * @param station2   새 역의 다음 역 이름
     * @param newStation 삽입할 새 역 이름
     */
    public void add(String station1, String station2, String newStation) {
        CNode p, q;
        CNode newNode = new CNode(newStation);

        p = head;

        // 1. station1 노드(p) 찾기
        do {
            if (p.station.equals(station1))
                break;
            p = p.rlink;
        } while (p != head);

        // p가 station1이 아닐 경우 (리스트에 없는 경우) 처리
        if (!p.station.equals(station1)) {
            System.out.println("삽입할 위치의 이전 역(" + station1 + ")을 찾을 수 없습니다.");
            return;
        }

        // 2. station2 노드(q)는 p의 다음 노드
        q = p.rlink;

        // 실제 q의 역 이름이 station2와 일치하는지 확인하는 로직이 없으나, 원본 코드의 의도를 따름.
        // 정확히는 p의 rlink가 station2인지 확인하는 로직이 필요함.
        if (!q.station.equals(station2)) {
            System.out.println(station1 + "의 다음 역이 " + station2 + "가 아닙니다. 삽입 위치 오류.");
        }

        // 3. 새 노드 삽입 및 링크 업데이트
        newNode.llink = p; // 새 노드의 이전은 p
        newNode.rlink = q; // 새 노드의 다음은 q
        p.rlink = newNode; // p의 다음은 새 노드
        q.llink = newNode; // q의 이전은 새 노드

        stationCount++;
        System.out.println(newStation + " 역을 " + station1 + "와 " + station2 + " 사이에 추가했습니다.");
    }

    /**
     * 주어진 초성 문자열과 일치하는 역 이름을 찾아 출력합니다.
     * 한국어 초성 분리 로직을 사용합니다.
     * @param initials 검색할 초성 문자열 (예: "ㅈㅅ")
     */
    public void StationNameInitials(String initials) {
        // 한국어 초성 문자열 (유니코드 순서에 맞춤)
        final String CHO = "ㄱㄲㄴㄷㄸㄹㅁㅂㅃㅅㅆㅇㅈㅉㅊㅋㅌㅍㅎ";
        
        // 필터링된 역을 저장할 임시 리스트
        CircularDoublyLinkedList filteredStation = new CircularDoublyLinkedList();
        CNode SCirculation = head;
        
        if (SCirculation == null) {
            System.out.println("필터링할 역이 없습니다.");
            return;
        }
        
        int initialsLength = initials.length();
        int targetChoIndex;
        
        // 1. 첫 번째 글자의 초성만 일치하는 역을 먼저 필터링
        targetChoIndex = CHO.indexOf(initials.charAt(0));
        
        // 첫 번째 초성으로 필터링
        do {
            String currentStation = SCirculation.station;
            // 역 이름이 initialsLength보다 짧을 경우 예외 처리
            if (currentStation.length() >= 1) { 
                char uniVal = currentStation.charAt(0);
                
                // 한글 유니코드 범위(AC00) 내에 있는지 확인
                if (uniVal >= 0xAC00 && uniVal <= 0xD7A3) { 
                    // 초성 인덱스 계산: (글자 - 0xAC00) / 28 / 21
                    int cho = (uniVal - 0xAC00) / 28 / 21; 
                    
                    if (cho == targetChoIndex) {
                        filteredStation.addLast(currentStation);
                    }
                }
            }
            SCirculation = SCirculation.rlink;
        } while (SCirculation != head);

        // 2. 두 번째 이후의 글자 초성으로 필터링
        for (int i = 1; i < initialsLength; i++) {
            if (filteredStation.head == null) {
                // 이미 필터링된 역이 없다면 더 이상 진행할 필요 없음
                break;
            }

            CNode current = filteredStation.head;
            targetChoIndex = CHO.indexOf(initials.charAt(i));
            
            // 필터링된 리스트를 순회하며 삭제 (원형 리스트 순회 중 삭제는 복잡하므로 next 노드를 미리 저장해야 함)
            do {
                CNode next = current.rlink; // 다음 노드를 미리 저장
                String currentStationName = current.station;

                // 역 이름이 현재 초성 인덱스(i)보다 짧으면 삭제
                if (currentStationName.length() <= i) {
                     filteredStation.deleteStation(currentStationName);
                } else {
                    char uniVal = currentStationName.charAt(i);
                    int cho = -1; // 초성 인덱스 초기화
                    
                    if (uniVal >= 0xAC00 && uniVal <= 0xD7A3) { 
                        // 한글인 경우 초성 계산
                        cho = (uniVal - 0xAC00) / 28 / 21;
                    } 
                    // 한글이 아니거나 (cho == -1), 초성이 일치하지 않으면 삭제
                    
                    if (cho != targetChoIndex) {
                        filteredStation.deleteStation(currentStationName);
                    }
                }

                // 삭제 후 리스트가 비었는지 확인
                if (filteredStation.head == null) {
                    break;
                }
                
                current = next; // 다음 노드로 이동
            } while (current != filteredStation.head); // 필터링된 리스트를 한 바퀴 순회
        }

        filteredStation.printStation();
    }
}

public class Subway {
    public static void main(String[] args) {
        // CircularDoublyLinkedList 클래스 인스턴스 생성
        CircularDoublyLinkedList sub = new CircularDoublyLinkedList();

        // 노선도에 역 추가 (addLast)
        sub.addLast("잠실");
        sub.addLast("잠실나루");
        sub.addLast("강변");
        sub.addLast("구의");
        sub.addLast("건대입구");

        sub.printStation(); // 현재 노선도 출력
        System.out.println("2호선의 총 역의 수: " + sub.countTotalStation());

        // 잠실에서 구의까지의 최단 거리 계산
        int distance = sub.countStation("잠실", "구의");
        System.out.println("잠실에서 구의까지의 최단 거리: " + distance + "개 역");

        // 잠실에서 잠실로 돌아오는 최단 거리 계산 (한 노드만 있을 경우를 테스트하기 위함)
        int overlapCount = sub.overlapStation("잠실", "잠실");
        System.out.println("이동한 횟수(만남/교차): " + overlapCount);

        System.out.println("--- 역 삽입 테스트 ---");
        // 잠실나루와 강변 사이에 "별당" 역 삽입
        sub.add("잠실나루", "강변", "별당");
        sub.printStation(); // 삽입 후 노선도 출력

        System.out.println("--- 역 삭제 테스트 ---");
        // 구의 역 삭제
        sub.deleteStation("구의");
        sub.printStation();
        System.out.println("2호선의 총 역의 수: " + sub.countTotalStation());
        
        System.out.println("--- 초성 검색 테스트 ---");
        // "ㅈㅅㄴㄹ" 초성과 일치하는 역 검색
        sub.StationNameInitials("ㅈㅅㄴㄹ");
    }
}