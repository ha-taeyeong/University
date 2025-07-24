package week5.practice3;

abstract class Animal {
    private String type;

    public Animal(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    abstract void run();
    abstract void sound();
}