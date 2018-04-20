package staticproxy;

/**
 * @author liyang
 * @email liyang@51dojo.com
 * @create 2018-04-20 上午10:29
 * @description
 **/
public class Client {
    public static void main(String[] args) {
        Operation operation = new QuickPoster(new Boss());
        operation.post();
    }
}
