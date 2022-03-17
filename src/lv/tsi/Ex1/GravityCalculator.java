package lv.tsi.Ex1;

//Exercise 1

public class GravityCalculator {
    static final double GRAVITY = -9.81; // Earth's gravity in (m / s ^ 2)

    public static void main(String[] args){
        gravity(3,4,0);
    }
    public static void gravity(int fallingTime,double initialVelocity,double initialPosition){
        double finalPosition = Math.pow(fallingTime,2)*GRAVITY*(0.5)+(initialVelocity)*(fallingTime)+(initialPosition);
        //formula :  x (t) = (t ^ 2) * a * 0.5 + v0 * t + x0
        System.out.println("Position in " + fallingTime + "\nseconds:" + finalPosition);
    }

}
