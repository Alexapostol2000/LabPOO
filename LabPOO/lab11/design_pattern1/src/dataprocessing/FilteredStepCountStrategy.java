package dataprocessing;

import main.Utils;
import storage.DataRepository;
import storage.SensorData;

import java.util.concurrent.TimeUnit;

public class FilteredStepCountStrategy implements StepCountStrategy {

    private static final int MAX_DIFF_STEPS_CONSECUTIVE_RECORDS = 1000;
    private static final long TIME_FOR_MAX_DIFF = TimeUnit.SECONDS.toMillis(1);

    private DataRepository data;
    private String strategy = Utils.FILTERED_STRATEGY;

    FilteredStepCountStrategy(DataRepository data) {
        this.data = data;
    }


    @Override
    public int getTotalSteps() {
        int steps = 0;
        long timeStampDifference = 0;
        for (int i = 0; i < data.getData().size(); i++) {
            if (data.getData().get(i).getStepsCount() > 0 &&
                data.getData().get(i).getStepsCount() < MAX_DIFF_STEPS_CONSECUTIVE_RECORDS) {
                if (i == 0) {
                    steps += data.getData().get(i).getStepsCount();
                }
                else {
                    timeStampDifference = data.getData().get(i).getTimestamp() - data.getData().get(i - 1).getTimestamp();
                    if (timeStampDifference < TIME_FOR_MAX_DIFF) {
                        steps += data.getData().get(i).getStepsCount();
                    }
                }
            }
        }
        return steps;
    }

    @Override
    public String getStrategyDescription() {
        return strategy;
    }
}
