package proxy.dynamic;

import proxy.dynamic.SayHello;
import proxy.dynamic.cglib.CgLibProxy;
import proxy.dynamic.jdk.JdkProxy;

public class TestProxy {
    public static void main(String[] args) {
        CgLibProxy cgLibProxy = new CgLibProxy();
        SayHello sayHelloProxy = (SayHello)cgLibProxy.getProxy(SayHello.class);
        sayHelloProxy.hi("Mark");

        IPrinter printerImplProxy = new JdkProxy(new PrinterImpl()).getProxy();
        printerImplProxy.print("面试通过了吗？");
    }
}
