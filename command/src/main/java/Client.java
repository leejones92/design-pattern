/**
 * @author liyang
 * @email liyang@51dojo.com
 * @create 2018-04-19 上午9:54
 * @description
 **/
public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);


        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.action();
    }
}
