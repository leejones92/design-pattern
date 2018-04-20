/**
 * @author liyang
 * @email liyang@51dojo.com
 * @create 2018-04-20 下午12:58
 * @description 饿汉式
 **/
public class EagerSingleton {
    private static EagerSingleton eagerSingleton = new EagerSingleton();

    public static EagerSingleton getEagerSingleton() {
        return eagerSingleton;
    }
}
