package observer.exchangeRate;

import java.math.BigDecimal;

public class RmbRate extends AbstractRate {
    @Override
    void change(BigDecimal value) {
        System.out.println("人民币汇率变了。。。。。。。");
        BigDecimal diff = value.subtract(getBase());
        for (ICompany company:companyList) {
            company.update(diff);
        }
    }
}
