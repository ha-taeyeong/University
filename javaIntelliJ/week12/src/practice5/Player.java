package practice5;

import java.util.Objects;

class Player{
    private String name;
    private int num;

    public Player(String name, int num) {
        this.name = name;
        this.num = num;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Player){
            Player p = (Player) obj;
            if(name.equals(p.name) && num == p.num){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        // name, age가 같으면 항상 같은 해시코드를 반환합니다.
        return Objects.hash(name, num);
    }

    @Override
    public String toString() {
        return "Player [name=" + name + ", num=" + num + "]";
    }
}
