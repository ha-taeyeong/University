package example.arrays;

class iMember implements Comparable<iMember>{
    String name;
    iMember(String name){
        this.name = name;
    }
    @Override
    public int compareTo(iMember o) {
        return this.name.compareTo(o.name);
    }
}
