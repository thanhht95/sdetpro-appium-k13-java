package labs.lab_7.lab_7_2;

import java.security.SecureRandom;

public class Dog extends Animal{
    private static final int MAX_SPEED = 60;
    private static final String DEFAULT_NAME = "Dog";

    public Dog(){
        this.name = DEFAULT_NAME;
        this.speed = new SecureRandom().nextInt(MAX_SPEED + 1);
    }
}
