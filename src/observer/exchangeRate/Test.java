package observer.exchangeRate;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args ) {
        RmbRate rmbRate = new RmbRate();
        rmbRate.addCompany(new ImportCompany("HUAWEI"));
        rmbRate.addCompany(new ImportCompany("OPPO"));
        rmbRate.addCompany(new ImportCompany("XIAOMI"));
        rmbRate.addCompany(new ExportCompany("TENCENT"));
        rmbRate.addCompany(new ExportCompany("ALIBABA"));
        rmbRate.addCompany(new ExportCompany("MEITUAN"));
        rmbRate.change(new BigDecimal("6.9"));
        rmbRate.change(new BigDecimal("6.0"));
        rmbRate.change(new BigDecimal("6.98"));
        rmbRate.change(new BigDecimal("8.9"));
    }
}
