package proxy;

public class PrinterProxy implements Printable {
    private String name;
    private Printer printer;

    public PrinterProxy() {
    }

    public PrinterProxy(String name) {
        this.name = name;
    }

    @Override
    public synchronized void setPrinterName(String name) {
        if (printer != null) {
            printer.setPrinterName(name);
        }
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String msg) {
        realize();
        printer.print(msg);
    }

    private synchronized void realize() {
        if (printer == null) {
            printer = new Printer(name);
        }
    }
}
