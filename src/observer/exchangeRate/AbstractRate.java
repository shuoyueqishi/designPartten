package observer.exchangeRate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractRate {
    protected List<ICompany> companyList = new ArrayList<>();
    private BigDecimal base = new BigDecimal("6.8");

    void addCompany(ICompany company) {
        this.companyList.add(company);
    }

    void removeCompany(ICompany company) {
        this.companyList.remove(company);
    }

    abstract void change(BigDecimal value);

    public BigDecimal getBase() {
        return this.base;
    }
}
