package practice5;

public class Test{
    public static void main(String[] args) {
        Integer[] list = { 32,5,36,8,41,74,59,9,11};
        Byte[] blist = {4,12,7,84,23,4};

        MyMath<Integer> m = new MyMath<>();
        MyMath<Byte> bm = new MyMath<>();
        System.out.printf("average(Integer) : %.2f\n",m.getAverage(list));
        System.out.printf("average(Byte) :%.2f\n", bm.getAverage(blist));
    }
}
