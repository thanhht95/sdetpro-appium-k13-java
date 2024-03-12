package labs.lab_9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static labs.lab_9.AnimalWithBuilder.Builder;

public class AnimalWithBuilderTest {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.generateSpeed(100);
        builder.setName("Test");
        builder.setFlyable(false);

        AnimalWithBuilder animal = builder.build();
        System.out.println(animal);

        List<AnimalWithBuilder> animalList = new ArrayList<>(Arrays.asList(animal,animal));
        System.out.println(animalList.get(0));
    }
}
