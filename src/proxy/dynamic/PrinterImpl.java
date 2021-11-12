package proxy.dynamic;

import proxy.dynamic.IPrinter;

public class PrinterImpl implements IPrinter {
    @Override
    public void print(String msg) {
        System.out.println("XLT,"+msg);
    }
}
