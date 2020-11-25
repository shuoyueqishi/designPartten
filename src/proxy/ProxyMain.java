package proxy;

public class ProxyMain {
    public static void main(String[] args) {
        Printable printer = new PrinterProxy("Alex");
        System.out.println("Current name is "+printer.getPrinterName());
        printer.setPrinterName("莹蓉小可爱");
        System.out.println("Now, name is "+printer.getPrinterName());
        printer.print("I like the summer day");
        printer.print("Because we can spend all day on the beach!");
    }
}
