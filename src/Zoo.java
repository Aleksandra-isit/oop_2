import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals = new ArrayList<>();

    public Zoo AddAnimal(Animal animal) {
        animals.add(animal);
        return this;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "animals=" + animals +
                '}';
    }

    public String Talk() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Speakable item : getSpeakable()) {
            stringBuilder.append(item.Speak() + "\n");
        }
        return stringBuilder.toString();
    }

    private List<Speakable> getSpeakable() {
        List<Speakable> result = new ArrayList<>();
        for (Animal item : animals) {
            if (item instanceof Speakable) {
                result.add((Speakable) item);
            }
        }
        result.add(new Radio());
        return result;
    }

    public List<Runable> getRunable() {
        List<Runable> result = new ArrayList<>();
        for (Animal item : animals) {
            if (item instanceof Runable) {
                result.add((Runable) item);
            }
        }
        return result;
    }

    public List<Flyable> getFlyable(){
        List<Flyable> result = new ArrayList<>();
        for (Animal item: animals) {
            if (item instanceof Flyable){
                result.add((Flyable) item);
            }
        }
        return result;
    }

    public int getChampionSpeed(){
        int champion = 0;
        for (Runable item: getRunable()) {
            if (item.RunSpeed() > champion){
                champion = item.RunSpeed();
            }
        }
        return champion;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public List<Swimmable> getSwimmable(){
        List<Swimmable> results = new ArrayList<>();
        for (Animal item: animals) {
            if (item instanceof Swimmable){
                results.add((Swimmable) item);
            }
        }
        return results;
    }

}
