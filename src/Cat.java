public class Cat extends Animal implements Speakable, Runable{

    public Cat(String nickname, int legs, String owner) {
        super(nickname, legs, owner);
    }

    @Override
    public String Speak() {
        return "Meeow mewmewmew meEOOoW";
    }

    @Override
    public int RunSpeed() {
        return 10;
    }

    @Override
    public String toString() {
        return "Cat" + super.toString();
    }
}
