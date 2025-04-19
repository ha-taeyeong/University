package week5.practice5;

public class AnimalTest {
    public static void main(String[] args) {
        Animal[] pets = {
                new Cat("Nabee"),
                new Dog(),
                new Cat(),
                new Dog(),
                new Dog("Rock")
        };
        // 피드백 수정
        for (Animal ani : pets) {
            System.out.print("\n" + ani + ani.reaction(ani));
            ani.sound();
        }
        System.out.print("\n\nPet들 중 Dog는 " + Dog.getCountDog() + "마리\n");
    }
}
