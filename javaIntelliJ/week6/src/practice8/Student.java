package practice8;

class Student extends Person implements IJob, IPin {
    private int enter;
    private double pay;

    public Student() {
        this(0, 0);
    }

    public Student(int enter, double hour){
        super();
        this.enter = enter;
        this.pay = getPay(hour);
        int pin = getPin();
        this.num = enter + String.format("%02d", pin);
    }

    @Override
    public double getPay(double hour){
        return hour * 7000;
    }

    @Override
    public int getPin() {
        return (int)(Math.random() * 100);
    }

    @Override
    public String toString(){
        return "Student [enter=" + enter + ", pay=" + pay + ", num="+ num + "]";
    }
}
