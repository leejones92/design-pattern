package dynamic.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author liyang

 * @create 2018-04-20 上午11:03
 * @description
 **/
public class CglibProxy implements MethodInterceptor {

    private Object target;

    public Object getInstatnce(Object target) {
        this.target = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.target.getClass());
        enhancer.setCallback(this);

        return enhancer.create();
    }


    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("代理开始");
        proxy.invokeSuper(obj, args);
        System.out.println("代理结束");
        return null;
    }
}
