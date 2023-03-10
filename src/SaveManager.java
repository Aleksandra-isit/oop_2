import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class SaveManager {
    public void save(List<Animal> animals){
        try (FileWriter writer = new FileWriter("list.txt", false)){
            for (Animal item: animals) {
                writer.write(item.toString());
                writer.write("\n");
            }
            writer.flush();
        }catch (IOException e){
            System.out.println(e.getMessage());
            throw new RuntimeException();
        }

    }
}
