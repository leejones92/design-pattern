/**
 * @author liyang
 * @email liyang@51dojo.com
 * @create 2018-04-19 上午9:55
 * @description
 **/
public class Invoker {

    private Command command;

    public void action() {
        command.execute();
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
