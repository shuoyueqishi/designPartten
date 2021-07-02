package strategy;

public class StepByStepMove implements IMove {
    @Override
    public void move() {
        System.out.println("一步一步逼近你");
    }
}
