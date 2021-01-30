package sd.design.patterns.simplified.examples.decorator;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class Main {
    public static void main(String... args) {
        StatisticsLogger executionTimesBaseStatistics = new ExecutionTimesBaseStatistics(new ArrayList<>(){{
            add(10.0);
            add(20.0);
            add(30.0);
        }});

        var withAverage = new WithAverageExecutionTimeStatisticLogger(executionTimesBaseStatistics);
        withAverage.displayStatistics();
    }

    static class WithAverageExecutionTimeStatisticLogger implements StatisticsLogger {
        private final StatisticsLogger statisticsLogger;

        WithAverageExecutionTimeStatisticLogger(StatisticsLogger statisticsLogger) {
            this.statisticsLogger = statisticsLogger;
        }

        @Override
        public void displayStatistics() {
            statisticsLogger.displayStatistics();
            OptionalDouble average = statisticsLogger.getExecutionTimes().stream().mapToDouble(d->d).average();
            System.out.printf("Average execution time: %.2f%n", average.getAsDouble());
        }

        @Override
        public List<Double> getExecutionTimes() {
            return statisticsLogger.getExecutionTimes();
        }
    }
}
