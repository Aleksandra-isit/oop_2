public class Duck extends Animal implements Flyable, Runable, Speakable {

    public Duck(String nickname, int legs, String owner) {
        super(nickname, legs, owner);
    }

    @Override
    public int flySpeed() {
        return 45;
    }

    @Override
    public int RunSpeed() {
        return 8;
    }

    @Override
    public String Speak() {
        return "Kryiii krryii kryui!";
    }

    @Override
    public String toString() {
        return "Duck" + super.toString();
    }
}
