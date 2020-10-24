package FactoryMethod.idcard;

import FactoryMethod.framework.Product;

import java.util.Properties;

public class IDCard extends Product {
    private String owner;

    IDCard(String owner) {
        System.out.println("制作" + owner + "的ID卡");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("使用" + owner + "的卡");
    }

    public String getOwner() {
        return owner;
    }
}
