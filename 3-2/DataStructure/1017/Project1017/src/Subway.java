class DNode {
    DNode llink;
    DNode rlink;
    String station;

    public DNode(String data) {
        station = data;
        llink = null;
        rlink = null;
    }
}

class Dlist {
    DNode head, tail;
    int staionCount = 0;

    public Dlist() {
        head = null;
        tail = null;
    }

    public void addLast(String data) {
        DNode newNode = new DNode(data);

        if (tail == null) {
            head  = newNode;
            tail = newNode;
            newNode.llink = head;
            newNode.rlink = tail;
        } else {
            newNode.rlink = head;
            newNode.llink = tail;
            head.llink = newNode;
            tail.rlink = newNode;
            tail = newNode;
        }
        staionCount++;
    }

    public void printStation() {
        DNode p = head;

        if (p == null) {
            System.out.println("역이 없음");
            return;
        }

        do {
            System.out.print(" " + p.station);
            p = p.rlink;
        } while (p != head);

        System.out.println();
    }

    public void deleteStation(String data) {
        DNode tmp, p;

        if (head.station.equals(data)) {
            head = head.rlink;
            tail.rlink = tail.rlink.rlink;
         } else if(tail.station.equals(data)) {
            tmp = tail.llink;
            tmp.rlink = head;
            tail = tmp;
         } else {
            p = head;
            do {
                p = p.rlink;
            } while (!p.station.equals(data));
            p.llink.rlink = p.rlink;
            p.rlink.llink = p.llink;
            staionCount--;
         }
    }

    public int countTotalStation() {
        return staionCount;
    }

    public int countStation(String fromS, String toS) {
        DNode lcheck, rcheck;
        int lcount = 0;
        int rcount = 0;

        lcheck = head;
        do {
            lcheck = lcheck.rlink;
        } while (!lcheck.station.equals(fromS));
        rcheck = lcheck;

        do {
            lcheck = lcheck.llink;
            lcount++;
        } while (!lcheck.station.equals(toS));
        do {
            rcheck = rcheck.rlink;
            rcount++;
        } while (!rcheck.station.equals(toS));

        if (lcount >= rcount) return rcount;
        else return lcount;
    }

    public int overlapStation(String station1, String station2) {
        DNode lstart, rstart;
        int count = 0;

        lstart = head;
        rstart = head;

        do {
            if (lstart.station == head.station) break; 
            lstart = lstart.rlink;
        } while (!lstart.station.equals(station1));
        
        do {
            if (rstart.station == head.station)
                break;
            rstart = rstart.rlink;
        } while (!rstart.station.equals(station2));
        
        do {
            lstart = lstart.llink;
            rstart = rstart.rlink.rlink;
            count++;

            if (lstart == rstart) {
                System.out.println("만난역: " + lstart.station);
                return count;
            }
            if (lstart != null && rstart != null) {
                if (lstart == rstart.llink) {
                    System.out.println("오버랩된 역: " + rstart.station + " 또는 " + lstart.station);
                    return count;
                }
                
                if (rstart == lstart.rlink) {
                    System.out.println("오버랩된 역: " + lstart.station + " 또는 " + rstart.station);
                    return count;
                }
            }
        } while (!lstart.station.equals(rstart.station));

        return -1;
    }

    public void add(String station1, String station2, String newStation) {
        DNode p, q;
        DNode newNode = new DNode(newStation);

        p = head;

        do {
            p = p.rlink;
        } while (!p.station.equals(station1));
        q = p.rlink;

        newNode.llink = p;
        newNode.rlink = q;
        p.rlink = newNode;
        q.llink = newNode;
    }
}

public class Subway {
    public static void main(String[] args) {
        Dlist sub = new Dlist();
        sub.addLast("잠실");
        sub.addLast("잠실나루");
        sub.addLast("강변");
        sub.addLast("구의");
        sub.addLast("건대입구");
        sub.printStation();
        System.out.println(sub.countStation("잠실", "구의"));
        System.out.println("이동한 역: " + sub.overlapStation("잠실", "잠실"));

    }
}
