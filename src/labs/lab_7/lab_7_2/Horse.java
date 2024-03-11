package labs.lab_7.lab_7_2;

import java.security.SecureRandom;

public class Horse extends Animal{
    private static final int MAX_SPEED = 75;
    private static final String DEFAULT_NAME = "Horse";

    public Horse(){
        this.name = DEFAULT_NAME;
        this.speed = new SecureRandom().nextInt(MAX_SPEED + 1);
    }
}
