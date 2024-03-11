package labs.lab_7.lab_7_2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnimalController {
    public static void main(String[] args) {
        Animal horse = new Horse();
        System.out.println("This is a " + horse.name + " with speed " + horse.speed + "km/h");
        Animal tiger = new Tiger();
        System.out.println("This is a " + tiger.name + " with speed " + tiger.speed + "km/h");
        Animal dog = new Dog();
        System.out.println("This is a " + dog.name + " with speed " + dog.speed + "km/h");

        Map<String,Integer> winner = new AnimalController().getMaxSpeed(Arrays.asList(horse, tiger, dog));
        System.out.println("The winner is " + winner.keySet() +" with speed "+ winner.values() + "km/h");
    }
    public Map<String,Integer> getMaxSpeed (List<Animal> animalList){
        int maxSpeed = 0;
        String name = "";
        Map<String,Integer> winner = new HashMap<>();
        for (Animal animal : animalList) {
            if (maxSpeed < animal.getSpeed()) {
                maxSpeed = animal.getSpeed();
                name = animal.getName();
            }
        }
        winner.put(name,maxSpeed);
        return winner;
    }
}
