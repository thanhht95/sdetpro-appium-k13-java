package labs.lab_9;

import java.security.SecureRandom;

public class AnimalWithBuilder {
    private int speed;
    private String name;
    private boolean flyable;

    protected AnimalWithBuilder(Builder builder){
        this.speed = builder.speed;
        this.name = builder.name;
        this.flyable = builder.flyable;
    }
    //READ-ONLY


    public int getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }

    public boolean isFlyable() {
        return flyable;
    }

    @Override
    public String toString() {
        return "AnimalWithBuilder{" +
                "speed=" + speed +
                ", name='" + name + '\'' +
                ", flyable=" + flyable +
                '}';
    }

    //Inner class
    public static class Builder{
        private int speed;
        private String name;
        private boolean flyable;

        //WRITE-ONLY
        public Builder generateSpeed(int speed) {
            this.speed = new SecureRandom().nextInt(speed + 1);
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setFlyable(boolean flyable) {
            this.flyable = flyable;
            return this;
        }

        public AnimalWithBuilder build(){
            return new AnimalWithBuilder(this);
        }
    }
}
