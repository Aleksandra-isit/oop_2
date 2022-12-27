public class Dog extends Animal implements Speakable, Runable{

    public Dog(String nickname, int legs, String owner) {
        super(nickname, legs, owner);
    }

    @Override
    public String Speak() {
        return "Wow woow WowoWOwowW!";
    }

    @Override
    public int RunSpeed() {
        return 50;
    }

    @Override
    public String toString() {
        return "Dog" + super.toString();
    }
}
