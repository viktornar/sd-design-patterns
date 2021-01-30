package sd.design.patterns.simplified.examples.decorator;

import java.util.List;

public interface StatisticsLogger {
    void displayStatistics();

    List<Double> getExecutionTimes();
}
