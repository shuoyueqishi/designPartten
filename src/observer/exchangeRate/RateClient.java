package observer.exchangeRate;

import java.math.BigDecimal;

public class RateClient {
    public static void main(String[] args ) {
        RmbRate rmbRate = new RmbRate();
        rmbRate.addCompany(new ExportCompany("腾讯"));
        rmbRate.addCompany(new ExportCompany("阿里巴巴"));
        rmbRate.addCompany(new ExportCompany("美团"));
        rmbRate.change(new BigDecimal("6.9"));
        rmbRate.change(new BigDecimal("6.0"));
        rmbRate.change(new BigDecimal("6.98"));
        rmbRate.change(new BigDecimal("8.9"));
    }
}
