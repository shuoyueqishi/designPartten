package strategy;

public class NormalCorpse extends AbstractCorpse {

    public NormalCorpse() {
        super(new StepByStepMove(),new BiteAttack());
    }

    public NormalCorpse(IMove move,IAttack attack) {
        super(move,attack);
    }

    @Override
    public void display() {
        System.out.println("我是普通僵尸");
    }

    public

    @Override
    void move() {
        super.getMove().move();
    }

    @Override
    void attack() {
        super.getAttack().attack();
    }
}
