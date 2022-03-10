package lv.professer;

/**
 * x (t) = (t ^ 2) * a * 0.5 + v0 * t + x0
 */
public class Calculator {
    public static final double GRAVITY_CONSTANT= 9.5; // always BIG LETTER FOR CONSTANT
    public static final double ANOTHER_CONSTANT= 0.5; // always BIG LETTER FOR CONSTANT

    //fallingTime, initialPosition, initialVelocity
    int fallingTime=0;
    double initialPosition=0;
    double initialVelocity=0; // same with top
//double initialPosition;
    //double initialVelocity;
    public Calculator(){

    }
    public Calculator(int fallingTime, double initialPosition, double initialVelocity) {
        this.fallingTime = fallingTime;
        this.initialPosition = initialPosition;
        this.initialVelocity = initialVelocity;
    }
    public void calculate(){
        double finalposition=(Math.pow(fallingTime,2))
                *(GRAVITY_CONSTANT *ANOTHER_CONSTANT)
                +(initialVelocity*fallingTime)
                +initialPosition;
        System.out.println("Position in : "+fallingTime+"position : "+finalposition);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator(10,5,233);
        calculator.calculate();
    }
}
