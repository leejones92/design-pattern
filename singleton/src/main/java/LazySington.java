/**
 * @author liyang
 * @email liyang@51dojo.com
 * @create 2018-04-20 下午12:57
 * @description 懒汉式
 **/
public class LazySington {
    private static LazySington singleton = null;

    public static LazySington getSingleton() {
        if (null == singleton) {
            singleton = new LazySington();
        }
        return singleton;
    }
}
