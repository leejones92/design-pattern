/**
 * @author liyang
 * @email liyang@51dojo.com
 * @create 2018-04-18 下午3:59
 * @description
 **/
public class Person implements Observer {

    public Person(Subject bird) {
        bird.registerObserver(this);
    }

    public void update(String message) {
        System.out.println(message);
        System.out.println("Person: I know");
    }
}
