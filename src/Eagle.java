public class Eagle extends Animal implements Speakable, Flyable{

    public Eagle(String nickname, int legs, String owner) {
        super(nickname, legs, owner);
    }

    @Override
    public int flySpeed() {
        return 80;
    }

    @Override
    public String Speak() {
        return "orel razgovarivaet...";
    }

    @Override
    public String toString() {
        return "Eagle" + super.toString();
    }
}
