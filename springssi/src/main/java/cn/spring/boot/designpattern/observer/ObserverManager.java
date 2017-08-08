package cn.spring.boot.designpattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by fengzirong on 2017-08-06.
 */
public class ObserverManager extends Observable {

    private int data = 0;

    public int getData() {
        return data;
    }

    public void setData(int i) {
        if(this.data!=i){
            this.data=i;
            setChanged();
        }
        notifyObservers();
    }
}
