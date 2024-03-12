package labs.lab_9;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnimalWithBuilderController {
    public static Map<String,Integer> getMaxSpeed (List<AnimalWithBuilder> animalList){
        int maxSpeed = 0;
        String name = "";
        Map<String,Integer> winner = new HashMap<>();
        for (AnimalWithBuilder animal : animalList) {
            if (maxSpeed < animal.getSpeed()) {
                maxSpeed = animal.getSpeed();
                name = animal.getName();
            }
        }
        winner.put(name,maxSpeed);
        return winner;
    }
}
