package dataprocessing;

import main.Utils;
import storage.DataRepository;
import storage.SensorData;

public class BasicStepCountStrategy implements StepCountStrategy {

    private DataRepository data;
    private String strategy = Utils.BASIC_STRATEGY;

    BasicStepCountStrategy(DataRepository data) {
        this.data = data;
    }

    @Override
    public int getTotalSteps() {
        int steps = 0;
        for (SensorData sData : data.getData()) {
            steps = steps + sData.getStepsCount();
        }
        return steps;
    }

    @Override
    public String getStrategyDescription() {
        return strategy;
    }
}
