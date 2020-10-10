package InheritanceChallenge87;

public class Mazda extends Car{
    private int roadServiceMonths;
    public Mazda(int roadServiceMonths) {
        super("Mazda", "cx3", 4, 5, 6, false);
        this.roadServiceMonths=roadServiceMonths;
    }
    public void accelerate(int rate){
        int newVelocity=getVelocity()+rate;
        if(newVelocity==0){
            stop();
        }else if((newVelocity>10)&&(newVelocity<50)){
            changeGear(1);
        }else if((newVelocity>60)&&(newVelocity<70)){
            changeGear(2);
        }else if((newVelocity>70)&&(newVelocity<80)){
            changeGear(3);
        }
        if(newVelocity>0){
            changeVelocity(newVelocity,getDirection());
        }
    }
}
