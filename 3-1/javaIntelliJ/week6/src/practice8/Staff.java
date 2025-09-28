package practice8;

class Staff extends Person implements IJob, IPin {
    private double pay;
    protected static int count = 1; // 생성 순서

    public Staff(){
        this(0);
    }

    public Staff(double hour){
        super();
        this.pay = (int)getPay(hour);
        this.num = String.valueOf(count++) + String.format("%02d", getPin());
    }

    @Override
    public double getPay(double hour){
        return hour * 8000;
    }

    @Override
    public int getPin() {
        return (int)(Math.random() * 100);
    }

    @Override
    public String toString(){
        return "Staff [pay=" + pay + ", num=" + num + "]";
    }


}
