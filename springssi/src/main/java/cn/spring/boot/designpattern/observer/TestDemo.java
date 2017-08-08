package cn.spring.boot.designpattern.observer;

/**
 * Created by fengzirong on 2017-08-06.
 */
public class TestDemo {


    public static void  main(String args[]){
        ObserverManager om = new ObserverManager();
        AObserver aob = new AObserver(om);
        BObserver bob = new BObserver(om);
        CObserver cob = new CObserver();

        om.setData(5);
        om.deleteObserver(aob);
        om.setData(10);
        om.addObserver(cob);
        om.setData(15);
    }

}
