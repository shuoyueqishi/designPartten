package strategy;

public class Test {
    public static void main(String[] args) {
        NormalCorpse normalCorpse = new NormalCorpse();
        normalCorpse.display();
        normalCorpse.move();
        normalCorpse.attack();

        System.out.println("----------------改变策略---------------");
        BangAttack bangAttack = new BangAttack();
        BikeMove bikeMove = new BikeMove();
        normalCorpse.setAttack(bangAttack);
        normalCorpse.setMove(bikeMove);
        normalCorpse.move();
        normalCorpse.attack();
    }
}
