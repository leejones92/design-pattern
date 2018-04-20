/**
 * @author liyang
 * @email liyang@51dojo.com
 * @create 2018-04-19 上午9:54
 * @description
 **/
public class ConcreteCommand implements Command {

    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        receiver.action();
    }
}
