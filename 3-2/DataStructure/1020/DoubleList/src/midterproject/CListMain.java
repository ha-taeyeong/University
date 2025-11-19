package midterproject;

import java.util.ArrayList;
import java.util.List;

/**
 * 지하철 노선의 한 역을 나타내는 노드 클래스입니다.
 * 이중 원형 연결 리스트를 위해 이전(llink) 및 다음(rlink) 노드를 가리킵니다.
 */
class CNode {
	CNode llink; // 이전 노드를 가리키는 링크 (반시계/내선 방향)
	CNode rlink; // 다음 노드를 가리키는 링크 (시계/외선 방향)
	String station;	// 역 이름
	
	public CNode(String station) {
		this.station=station;
		llink=null;
		rlink=null;
	}
}

/**
 * 지하철 2호선 노선을 표현하는 이중 원형 연결 리스트 클래스입니다.
 */
class CList {
	
	CNode head; // 리스트의 시작 (잠실역)
	CNode tail; // 리스트의 끝 (현재 방배역)
	int count=0;	// 역의 전체 개수
	
	// 한글 초성 리스트: 유니코드 계산에 사용됨
	private static final char[] CHO_SUNG = { 
	    'ㄱ', 'ㄲ', 'ㄴ', 'ㄷ', 'ㄸ', 'ㄹ', 'ㅁ', 'ㅂ', 'ㅃ', 'ㅅ', 'ㅆ', 'ㅇ', 'ㅈ', 'ㅉ', 'ㅊ', 'ㅋ', 'ㅌ', 'ㅍ', 'ㅎ' 
	};
	
	public CList() {
		head=null;
		tail=null;
	}
	
	/**
	 * 주어진 역 이름(station)에서 초성만을 추출하여 문자열로 반환합니다.
	 * 초성 검색 기능에 사용됩니다.
	 */
	private static String getInitialSound(String station) {
	    StringBuilder initial = new StringBuilder(); // 초성 결과를 담을 객체
	    for (int i = 0; i < station.length(); i++) {
	        char ch = station.charAt(i);
	        
	        // 한글 완성 글자('가' ~ '힣') 범위인지 확인
	        if (ch >= '가' && ch <= '힣') { 
	            // 유니코드 공식: (글자 코드 - '가' 코드) / 588 (초성 그룹 크기)
	            initial.append(CHO_SUNG[(ch - '가') / 588]); 
	        } else {
	            // 한글이 아닌 문자는 그대로 결과에 추가
	            initial.append(ch);
	        }
	    }
	    return initial.toString();
	}
	
	/**
	 * 노선 맨 뒤(tail)에 새 역을 추가합니다.
	 * (원형 연결 구조를 유지하면서 tail을 업데이트)
	 */
	public void addLast(String station) {
		CNode newNode=new CNode(station);
		count++;
		
		if(head == null) {
			// 노드가 없을 때: head/tail이 newNode를 가리키고, newNode는 자신을 가리킴
			head=newNode; tail=newNode;
			newNode.llink=newNode;
			newNode.rlink=newNode;
		} else {
			// 새 노드를 head와 tail 사이에 연결
			newNode.rlink=head;
			newNode.llink=tail;
			
			// 기존 head와 tail의 링크 업데이트
			head.llink=newNode;
			tail.rlink=newNode;
			
			tail=newNode; // tail을 새 노드로 지정
		}
	}
	
	/**
	 * 노선 전체 역의 이름을 순서대로 출력합니다. (외선 순환 방향: head -> rlink)
	 */
	public void printStation() {
		CNode p=head;
		if(p==null) {
			System.out.println("[노선] 역이 존재하지 않음");
			return;
		}
		System.out.print("[노선]");
		// head부터 시작하여 한 바퀴 돌아 head가 될 때까지 출력
		do {
			System.out.print(" "+p.station);
			p=p.rlink;
		} while(p!=head);
		System.out.println();
	}
	
	/**
	 * 특정 역(station)을 노선에서 삭제합니다. (강변역 폐쇄 등)
	 */
	public void deleteStation(String station) {
		if (head == null) {
			System.out.println(station + "역을 찾을 수 없습니다.");
			return;
		}
		
		CNode p = head;
		
		// 원형 리스트 탐색
		do {
			if (p.station.equals(station)) {
				// 노드가 하나일 때 (count == 1)
				if (count == 1) { 
					head = tail = null; count = 0; 
					System.out.println(station + "역 삭제 완료 (리스트 비었음)");
					return;
				}
				
				// 삭제할 노드의 앞뒤 링크를 직접 연결하여 노드를 건너뛰게 함
				p.llink.rlink = p.rlink;
				p.rlink.llink = p.llink;

				// Head 또는 Tail 포인터 업데이트
				if (p == head) head = p.rlink; // 다음 역이 새 head가 됨
				else if (p == tail) tail = p.llink; // 이전 역이 새 tail이 됨
				
				count--;
				System.out.println(station + "역 삭제 완료");
				return;
			}
			p = p.rlink;
		} while (p != head);
		
		System.out.println(station + "역을 찾을 수 없습니다.");
	}
	
	/**
	 * 2호선 전체 정거장의 개수를 리턴합니다.
	 */
	public int countTotalStation() {
		return count;
	}
	
	/**
	 * 두 역 사이의 최소 정거장 수(경유 정거장 수)를 계산합니다.
	 * 왕십리에서 잠실까지 등, 양방향 카운트 후 작은 값을 리턴합니다.
	 */
	public int countStation(String fromS, String toS) {
		if (fromS.equals(toS)) return 0;
		if (count < 2) return -1;
		
		CNode startNode = head;
		
		// 1. 출발 역(fromS) 찾기
		do {
			if (startNode.station.equals(fromS)) break;
			startNode = startNode.rlink;
			if (startNode == head) { System.out.println(fromS + "역을 노선에서 찾을 수 없습니다."); return -1; }
		} while (startNode != head); 
		
		// 2. 정방향 (Right/rlink) 탐색 및 카운트
		int rcount = 0;
		CNode rcheck = startNode.rlink; // 출발 역 다음부터 시작
		while (!rcheck.station.equals(toS)) {
			rcount++;
			rcheck = rcheck.rlink;
		}
		
		// 3. 역방향 (Left/llink) 탐색 및 카운트
		int lcount = 0;
		CNode lcheck = startNode.llink; // 출발 역 이전부터 시작
		while (!lcheck.station.equals(toS)) {
			lcount++;
			lcheck = lcheck.llink;
		}
		
		// 4. 두 방향 중 최소값 리턴
		return Math.min(rcount, lcount);
	}
	
	/**
	 * 잠실에서 두 사람이 반대 방향(1칸 vs 2칸)으로 이동할 때 만나는 역을 찾습니다.
	 * p1: 신천쪽 (llink, 속도 1), p2: 강변쪽 (rlink, 속도 2)
	 */
	public String overlapStation(String startStation) { 
		if (count == 0) return "노선에 역이 없습니다.";
		
		CNode start = head;
		// 시작 위치(잠실역) 찾기
		do {
			if (start.station.equals(startStation)) break;
			start = start.rlink;
			if (start == head) return startStation + "역을 찾을 수 없습니다.";
		} while (start != head);


		CNode p1 = start; // 속도 1 (일반) 포인터
		CNode p2 = start; // 속도 2 (급행) 포인터
        
		for (int i = 0; i < count; i++) {
			// P1 이동 (신천쪽 일반, 1칸): 반시계 방향
			p1 = p1.llink; 

			// P2 이동 (강변쪽 급행, 2칸): 시계 방향
			p2 = p2.rlink.rlink; 
			
			// 1. 한 역에서 만남 (p1과 p2가 같은 노드를 가리킴)
			if (p1 == p2) {
				return p1.station;
			}
			
			// 2. 서로 교차하여 만남 (노드 개수가 짝수일 때, 두 노드 사이에서 만나는 경우)
			// p1의 다음(rlink)이 p2이고, p2의 이전(llink)이 p1인 경우
			if (p1.rlink == p2 && p2.llink == p1) { 
				return p1.station + " 또는 " + p2.station; 
			}
		}
		return "만나는 역을 찾을 수 없습니다.";
	}
	
	/**
	 * 특정 역(afterS) 다음에 새 역(newS)을 삽입합니다. 
	 * (예: 방배와 사당 사이 별당역 추가용)
	 */
	public void addBetween(String afterS, String newS) {
		if (head == null) {
			System.out.println("노선이 비어있습니다.");
			return;
		}
		CNode p = head;
		
		// afterS 역을 찾습니다.
		do {
			if (p.station.equals(afterS)) {
				CNode newNode = new CNode(newS);
				CNode next = p.rlink;
				
				// 새 노드를 p와 next 사이에 연결
				newNode.llink = p;
				newNode.rlink = next;
				p.rlink = newNode;
				next.llink = newNode;
				
				count++;
				System.out.println(newS + "역을 " + afterS + "역 다음에 추가했습니다.");
				return;
			}
			p = p.rlink;
		} while (p != head);

		System.out.println(afterS + "역을 찾을 수 없어 추가하지 못했습니다.");
	}
	
	/**
	 * 초성 검색 질의(initialQuery)에 해당하는 모든 역 이름을 List로 반환합니다.
	 */
	public List<String> searchByInitial(String initialQuery) {
	    List<String> results = new ArrayList<>();
	    if (head == null || initialQuery == null || initialQuery.isEmpty()) {
	        return results;
	    }
	    
	    String queryInitial = getInitialSound(initialQuery); // 쿼리의 초성 추출
	    
	    CNode p = head;
	    // 원형 리스트 순회
	    do {
	        String stationInitial = getInitialSound(p.station); // 역 이름의 초성 추출
	        
	        // 역 이름의 초성이 검색 쿼리의 초성을 포함하는지 확인
	        if (stationInitial.contains(queryInitial)) {
	            results.add(p.station);
	        }
	        p = p.rlink;
	    } while (p != head);
	    
	    return results;
	}
}

public class CListMain {
	
	public static void main(String[] args) {
		System.out.println("--- 지하철 2호선 이중 원형 연결 리스트 구현 테스트 ---");
		
		CList sub2 = new CList();
		
		// 1. 초기 노선 구성: 실제 2호선 노선 역을 일부 순서대로 추가
		sub2.addLast("잠실"); // head
		sub2.addLast("잠실나루");
		sub2.addLast("강변");
		sub2.addLast("구의");
		sub2.addLast("건대입구");
		sub2.addLast("왕십리");
		sub2.addLast("강남");
		sub2.addLast("교대");
		sub2.addLast("사당");
		sub2.addLast("방배"); // tail
		
		System.out.print("초기 노선:");
		sub2.printStation();
		System.out.println("총 역 개수: " + sub2.countTotalStation() + "개");

		// -------------------------------------------------------------
		// 1. 강변역 제거 
		// -------------------------------------------------------------
		sub2.deleteStation("강변");
		System.out.print("1. 강변 삭제 후:");
		sub2.printStation();
		System.out.println("현재 총 역 개수: " + sub2.countTotalStation() + "개");

		// -------------------------------------------------------------
		// 2. 왕십리에서 잠실까지 최소 정거장 수
		// -------------------------------------------------------------
		System.out.println("2. 왕십리에서 잠실까지 최소 정거장 수: " + 
                           sub2.countStation("왕십리", "잠실") + " 정거장");

		// -------------------------------------------------------------
		// 3. 방배와 사당 사이에 별당역 추가
		// -------------------------------------------------------------
		sub2.addBetween("사당", "별당");
		System.out.print("3. 별당역 추가 후:");
		sub2.printStation();
		System.out.println("현재 총 역 개수: " + sub2.countTotalStation() + "개");
		
		// -------------------------------------------------------------
		// 4. 잠실에서 만나는 역 계산
		// -------------------------------------------------------------
		System.out.println("4. 잠실에서 만나는 역: " + 
                           sub2.overlapStation("잠실"));
		
		// -------------------------------------------------------------
		// 5. 초성 검색 기능 테스트 (추가된 기능)
		// -------------------------------------------------------------
		System.out.println("\n--- 5. 초성 검색 기능 테스트 ---");
		System.out.println("검색 (ㄱㅅ): " + sub2.searchByInitial("ㄱㅅ")); // 구의, 강남, 교대 (초성 일치)
		System.out.println("검색 (ㅈㅅ): " + sub2.searchByInitial("ㅈㅅ")); // 잠실, 잠실나루 (초성 일치)
		System.out.println("검색 (ㅇㅅㄹ): " + sub2.searchByInitial("ㅇㅅㄹ")); // 왕십리 (초성 일치)
		System.out.println("검색 (ㅂㅂ): " + sub2.searchByInitial("ㅂㅂ")); // 방배, 별당 (초성 일치)
	}
	
}
