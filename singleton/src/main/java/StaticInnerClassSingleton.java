/**
 * @author liyang

 * @create 2018-04-20 下午2:09
 * @description
 **/
public class StaticInnerClassSingleton {
    private static class InnerClass {
        private static final StaticInnerClassSingleton singletonPattern = new StaticInnerClassSingleton();
    }

    public StaticInnerClassSingleton getSingleton() {
        return InnerClass.singletonPattern;
    }
}
