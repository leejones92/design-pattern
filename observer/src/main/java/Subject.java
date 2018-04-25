/**
 * @author liyang

 * @create 2018-04-18 下午3:51
 * @description
 **/
public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();
}
