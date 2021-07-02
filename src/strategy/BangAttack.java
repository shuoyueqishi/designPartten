package strategy;

public class BangAttack implements IAttack{
    @Override
    public void attack() {
        System.out.println("用棒子打你");
    }
}
