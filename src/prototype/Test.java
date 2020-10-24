package prototype;

import prototype.business.MessageBox;
import prototype.business.UnderLinePen;
import prototype.framework.Manager;
import prototype.framework.Product;

public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager();
        UnderLinePen underLinePen = new UnderLinePen('-');
        MessageBox messageBox = new MessageBox('*');
        MessageBox messageBox1 = new MessageBox('+');
        manager.register("underLinePen",underLinePen);
        manager.register("messageBox",messageBox);
        manager.register("messageBox1",messageBox1);

        Product product = manager.create("underLinePen");
        product.use("hello, my wife");
        Product product1 = manager.create("messageBox");
        product1.use("我要睡觉了");
        Product product2 = manager.create("messageBox1");
        product2.use("设计模式");
    }
}
