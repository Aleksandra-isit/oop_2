public class Beaver extends Animal implements Speakable, Swimmable{

    public Beaver(String nickname, int legs, String owner) {
        super(nickname, legs, owner);
    }

    @Override
    public String toString() {
        return "Beaver" + super.toString();
    }

    @Override
    public String Speak() {
        return "brrb brb rb BR brRBR rbr RB b";
    }

    @Override
    public int SwimmingSpeed() {
        return 8;
    }
}
