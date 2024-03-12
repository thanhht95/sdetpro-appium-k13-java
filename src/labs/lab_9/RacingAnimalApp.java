package labs.lab_9;

import java.util.Arrays;
import java.util.Map;

import static labs.lab_9.AnimalWithBuilder.Builder;

public class RacingAnimalApp {
    public static void main(String[] args) {

        AnimalWithBuilder eagle = new Builder().generateSpeed(100).setName("Eagle").setFlyable(true).build();
        System.out.println(eagle);
        AnimalWithBuilder falcon = new Builder().generateSpeed(30).setName("Falcon").setFlyable(false).build();
        System.out.println(falcon);
        AnimalWithBuilder snake = new Builder().generateSpeed(50).setName("Snake").setFlyable(false).build();
        System.out.println(snake);
        AnimalWithBuilder tiger = new Builder().generateSpeed(100).setName("Tiger").setFlyable(false).build();
        System.out.println(tiger);
        AnimalWithBuilder horse = new Builder().generateSpeed(75).setName("Horse").setFlyable(false).build();
        System.out.println(horse);

        Map<String,Integer> winner = new AnimalWithBuilderController().getMaxSpeed(Arrays.asList(eagle, falcon, snake, tiger, horse));
        System.out.println("The winner is " + winner.keySet() +" with speed "+ winner.values() + "km/h");
    }
}
