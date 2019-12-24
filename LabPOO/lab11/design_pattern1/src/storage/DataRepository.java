package storage;


import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 * Persists sensor data. Observable, its observers are notified when data is added it to.
 */
public class DataRepository extends Observable { // TODO make this an Observable

    private ArrayList<SensorData> data = new ArrayList<>();

    public void addData(SensorData dataRecord){
        // TODO
        data.add(dataRecord);
        super.setChanged();
        super.notifyObservers(dataRecord);
        // notifiy observers
    }

    public ArrayList<SensorData> getData() {
        return  data;
    }

}


