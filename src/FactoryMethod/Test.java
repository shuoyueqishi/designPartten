package FactoryMethod;

import FactoryMethod.framework.Factory;
import FactoryMethod.framework.Product;
import FactoryMethod.idcard.IDCardFactory;

public class Test {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1= factory.create("小米");
        Product card2 = factory.create("小蓉");
        Product card3 = factory.create("小马");
        card1.use();
        card2.use();
        card3.use();
    }

}
