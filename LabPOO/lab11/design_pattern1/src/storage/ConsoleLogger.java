package storage;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class ConsoleLogger implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        SensorData printable = (SensorData)arg;
        System.out.println(printable.toString());
    }
}
