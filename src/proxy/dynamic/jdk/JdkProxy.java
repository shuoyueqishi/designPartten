package proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxy implements InvocationHandler {
    private Object object;

    public JdkProxy(Object object) {
        this.object=object;
    }

    public <T> T getProxy(){
        return (T)Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("JDK PROXY before invoke method:"+method.getName());
        Object result = method.invoke(object, args);
        System.out.println("JDK PROXY after invoke method:"+method.getName());
        return result;
    }
}
