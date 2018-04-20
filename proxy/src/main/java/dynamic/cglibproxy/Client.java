package dynamic.cglibproxy;

/**
 * @author liyang
 * @email liyang@51dojo.com
 * @create 2018-04-20 上午11:45
 * @description
 **/
public class Client {
    public static void main(String[] args) {
        CglibProxy cglibProxy = new CglibProxy();
        Boss boss = (Boss) cglibProxy.getInstatnce(new Boss());
        boss.post();
    }
}
