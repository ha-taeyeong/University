package practice1;

abstract class Action{
    protected String animal;
    public Action(String animal) {
        this.animal = animal;
    }
    abstract void move(); // abstract 붙여햐 한다.
}
