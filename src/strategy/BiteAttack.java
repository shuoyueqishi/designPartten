package strategy;

public class BiteAttack implements IAttack{
    @Override
    public void attack() {
        System.out.println("咬你");
    }
}
