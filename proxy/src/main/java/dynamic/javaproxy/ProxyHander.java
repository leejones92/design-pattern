package dynamic.javaproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author liyang
 * @email liyang@51dojo.com
 * @create 2018-04-20 上午10:43
 * @description
 **/
public class ProxyHander implements InvocationHandler {

    private Object proxied;

    public ProxyHander(Object proxied) {
        this.proxied = proxied;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("poster:你好");
        Object obj = method.invoke(proxied, args);
        System.out.println("poster:投递完成");
        return obj;
    }
}
