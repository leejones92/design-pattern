package staticproxy;

/**
 * @author liyang

 * @create 2018-04-20 上午10:23
 * @description
 **/
public class QuickPoster implements Operation {
    private Boss boss = new Boss();

    public QuickPoster(Boss boss) {
        this.boss = boss;
    }

    public void post() {
        System.out.println("poster:你好");
        boss.post();
        System.out.println("poster:投递完成");
    }
}
