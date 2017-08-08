package cn.spring.boot.designpattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by fengzirong on 2017-08-06.
 */
public class CObserver implements Observer {


    public CObserver(){
        super();
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(this.getClass().getName()+"接到通知"+((ObserverManager)o).getData());
    }
}
