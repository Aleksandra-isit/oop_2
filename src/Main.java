public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.AddAnimal(new Cat("Cheese", 4, "Slava")).AddAnimal(new Dog("Arckhi", 4, "John"))
                .AddAnimal(new Duck("Donald", 2, "semen"))
                .AddAnimal(new Eagle("Totoro", 2, "Damon"))
                .AddAnimal(new Beaver("Muffin", 4, "Donald Duck"))
                .AddAnimal(new Beaver("Charly", 4, "Tom and Jerry"));
        System.out.println("Зоопарк:");
        System.out.println(zoo);
        System.out.println("Говорящий зоопарк:");
        System.out.println(zoo.Talk());
        System.out.println("Скорость бега:");
        for (Runable item: zoo.getRunable()) {
            System.out.println(item.RunSpeed());
        }
        System.out.println("Чемпион среди бегунов");
        System.out.println(zoo.getChampionSpeed());
        System.out.println("Скорость летающих:");
        for (Flyable item: zoo.getFlyable()) {
            System.out.println(item.flySpeed());
        }
        SaveManager manager = new SaveManager();
        manager.save(zoo.getAnimals());
        System.out.println("Скорость плавующих:");
        for (Swimmable item: zoo.getSwimmable()) {
            System.out.println(item.SwimmingSpeed());
        }

    }
}