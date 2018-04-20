package dynamic.javaproxy;

import java.lang.reflect.Proxy;

/**
 * @author liyang
 * @email liyang@51dojo.com
 * @create 2018-04-20 上午10:48
 * @description 动态代理
 **/
public class Client {
    public static void main(String[] args) {
        Operation operation = new Boss();
        Operation boss = (Operation) Proxy.newProxyInstance(operation.getClass().getClassLoader(), new Class[]{Operation.class}, new ProxyHander(operation));
        boss.post();
    }
}
