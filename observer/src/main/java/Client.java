/**
 * @author liyang
 * @create 2018-04-18 下午4:11
 * @description
 **/
public class Client {
    public static void main(String[] args){
        Subject bird = new Bird();
        Observer xiaoMing = new Person(bird);
        bird.notifyObserver();
    }
}
