/**
 * @author liyang

 * @create 2018-04-20 下午1:04
 * @description
 **/
public class CheckAndLockSingleton {
    private static CheckAndLockSingleton singleton = null;

    public synchronized static CheckAndLockSingleton getSingleton() {
        if (singleton == null) {
            singleton = new CheckAndLockSingleton();
        }
        return singleton;
    }
}
//安全的原因 synchronized保证原子性