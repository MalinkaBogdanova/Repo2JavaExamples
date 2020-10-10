package InheritanceChallenge87;

public class Vehicle {
    private String name;
    private String size;

    private int velocity;
    private int direction;
    // You should be able to hand steering, changing gears, and moving (speed in other words).
    // You will want to decide where to put the appropriate state and behaviours (fields and methods).
    // As mentioned above, changing gears, increasing/decreasing speed should be included.
    // For you specific type of vehicle you will want to add something specific for that type of car.
    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.velocity=0;
        this.direction=0;
    }
    public void steer(int direction){
        this.direction+=direction;
        System.out.println("Vehicle steers at"+direction +"degrees");
    }
    public void move(int direction, int velocity){
        this.direction=direction;
        this.velocity=velocity;
        System.out.println("The vehicle moves at "+direction+" with a velocity "+ velocity);

    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getVelocity() {
        return velocity;
    }

    public int getDirection() {
        return direction;
    }
    public void stop(){
        this.velocity=0;
    }
}
