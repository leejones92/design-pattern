/**
 * @author liyang

 * @create 2018-04-20 下午1:08
 * @description
 **/
public class DoubleCheckAndVolatileSingleton {
    private static volatile DoubleCheckAndVolatileSingleton singleton = null;

    public static DoubleCheckAndVolatileSingleton getSington() {
        if (null == singleton) {
            synchronized (DoubleCheckSingleton.class) {
                if (singleton == null) {
                    singleton = new DoubleCheckAndVolatileSingleton();
                }
            }
        }
        return singleton;
    }
}
//加volatile关键字原因 可能出现DoubleCheckAndVolatileSingleton重排序
//mem = allocate();             //为单例对象分配内存空间.
//instance = mem;               //注意，instance 引用现在是非空，但还未初始化
// ctorSingleton(instance);    //为单例对象通过instance调用构造函数

