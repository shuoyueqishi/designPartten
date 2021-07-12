package observer.exchangeRate;

import java.math.BigDecimal;

public class ExportCompany implements ICompany {
    private String name;

    public ExportCompany(String name) {
        this.name = name;
    }

    @Override
    public void update(BigDecimal change) {
        BigDecimal zero = new BigDecimal(0);
        if (change.compareTo(zero) > 0) {
            System.out.println("人民币汇率上涨" + change + "," + name + ",出口公司赔钱了");
        } else {
            System.out.println("人民币汇率下跌" + change + "," + name + ",出口公司赚钱了");
        }
    }
}
