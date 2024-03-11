package labs.lab_7.lab_7_2;

import java.security.SecureRandom;

public class Tiger extends Animal{
    private static final int MAX_SPEED = 100;
    private static final String DEFAULT_NAME = "Tiger";

    public Tiger(){
        this.name = DEFAULT_NAME;
        this.speed = new SecureRandom().nextInt(MAX_SPEED + 1);
    }
}
