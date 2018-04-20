/**
 * @author liyang
 * @email liyang@51dojo.com
 * @create 2018-04-20 下午1:00
 * @description dcl double check lock
 **/
public class DoubleCheckSingleton {
    private static DoubleCheckSingleton singleton = null;
    public static Integer[] all = null;

    public DoubleCheckSingleton() {
        all = new Integer[1000 * 1000];
    }

    public static DoubleCheckSingleton getSingleton() {
        if (null == singleton) {//(1)
            synchronized (DoubleCheckSingleton.class) {
                if (null == singleton) {
                    singleton = new DoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }

    public static void main(String[] args) {
        while (true) {
            try {
                new Thread(new Runnable() {
                    public void run() {
                        getSingleton();
                    }
                }).start();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                break;
            }
        }
    }
}


//双重判断原因：线程A 线程B都进入1 线程B拿到锁 进入创建实例，然后释放锁，线程A进入如果不判断，这时会再次new一个实例，此时不能保证单例，所以需要再次判断一下
//不是线程安全：初始化到一半 指令重排序 先赋值 另一个线程判断不为空 直接return 此时有问题
