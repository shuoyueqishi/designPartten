package strategy;

public abstract class AbstractCorpse {

    private IMove move;
    private IAttack attack;

    abstract void move();

    abstract void attack();

    public abstract void display();

    public AbstractCorpse(IMove move, IAttack attack) {
        this.move = move;
        this.attack = attack;
    }

    public IMove getMove() {
        return move;
    }

    public void setMove(IMove move) {
        this.move = move;
    }

    public IAttack getAttack() {
        return attack;
    }

    public void setAttack(IAttack attack) {
        this.attack = attack;
    }
}
