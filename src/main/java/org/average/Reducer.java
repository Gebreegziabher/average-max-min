package org.average;

import java.util.*;
import java.util.stream.Collectors;

public class Reducer {
    private List<Pair<String, Double>> averageScorePerMajor;
    private List<Pair<String, Double>> maxScorePerMajor;
    private List<Pair<String, Double>> minScorePerMajor;
    public Reducer(List<Pair<String, List<Pair<Double, Integer>>>> majors) {
        averageScorePerMajor = average(majors);
        maxScorePerMajor = max(majors);
        minScorePerMajor = min(majors);
    }

//    public List<Pair<String, Double>> reduceStream(List<Pair<String, List<Double>>> majors) {
//        List<Pair<String, Double>> output = new ArrayList<>();
//        Map<String, List<Pair<String, List<Double>>>> groupedByKey = majors.stream().collect(Collectors.groupingBy(f -> f.getKey()));
//        for (Map.Entry<String, List<Pair<String, List<Double>>>> entry : groupedByKey.entrySet()) {
//            List<Pair<String, List<Double>>> valueList = entry.getValue().stream().collect(Collectors.toList());
//            List<Double> listOfAverages = valueList.stream().flatMap(f -> f.getValue().stream()).collect(Collectors.toList());
//            output.add(new Pair<>(entry.getKey(), Util.getAverage(listOfAverages)));
//        }
//        return output;
//    }

    public List<Pair<String, Double>> average(List<Pair<String, List<Pair<Double, Integer>>>> majors) {
        List<Pair<String, Double>> output = new ArrayList<>();
        for (Pair<String, List<Pair<Double, Integer>>> pair : majors) {
            double sumOfScores = Util.getSum(pair.getValue().stream().map(m -> m.getKey()).collect(Collectors.toList()));
            double sumOfCounts = Util.getSum(pair.getValue().stream().map(m -> m.getValue()).collect(Collectors.toList()));
            output.add(new Pair<>(pair.getKey(), sumOfScores/sumOfCounts));
        }
        return output;
    }

    public List<Pair<String, Double>> max(List<Pair<String, List<Pair<Double, Integer>>>> majors) {
        List<Pair<String, Double>> output = new ArrayList<>();
        for (Pair<String, List<Pair<Double, Integer>>> pair : majors) {
            double max = pair.getValue().stream().map(m -> m.getKey()).max(Comparator.comparingDouble(f -> f.doubleValue())).get();
            output.add(new Pair<>(pair.getKey(), max));
        }
        return output;
    }

    public List<Pair<String, Double>> min(List<Pair<String, List<Pair<Double, Integer>>>> majors) {
        List<Pair<String, Double>> output = new ArrayList<>();
        for (Pair<String, List<Pair<Double, Integer>>> pair : majors) {
            double max = pair.getValue().stream().map(m -> m.getKey()).min(Comparator.comparingDouble(f -> f.doubleValue())).get();
            output.add(new Pair<>(pair.getKey(), max));
        }
        return output;
    }

    public void printAverageOutput(int reducerIndex) {
        String header = "\nREDUCER OUTPUT: AVERAGE";
        if (reducerIndex != -1)
            header = "\nREDUCER ["+reducerIndex+"] OUTPUT: AVERAGE";

        System.out.println(header + "\n");
        for (Pair pair : averageScorePerMajor)
            System.out.print("<" + pair.getKey() + "," + pair.getValue() + ">\n");
        System.out.println();
    }

    public void printAverageOutput() {
        printAverageOutput(-1);
    }
    public void printMaxOutput(int reducerIndex) {
        String header = "REDUCER OUTPUT: MAX";
        if (reducerIndex != -1)
            header = "REDUCER ["+reducerIndex+"] OUTPUT: MAX";

        System.out.println(header + "\n");
        for (Pair pair : maxScorePerMajor)
            System.out.print("<" + pair.getKey() + "," + pair.getValue() + ">\n");
        System.out.println();
    }

    public void printMaxOutput() {
        printMaxOutput(-1);
    }
    public void printMinOutput(int reducerIndex) {
        String header = "REDUCER OUTPUT: MIN";
        if (reducerIndex != -1)
            header = "REDUCER ["+reducerIndex+"] OUTPUT: MIN";

        System.out.println(header + "\n");
        for (Pair pair : minScorePerMajor)
            System.out.print("<" + pair.getKey() + "," + pair.getValue() + ">\n");
        System.out.println();
    }

    public void printMinOutput() {
        printMinOutput(-1);
    }
}
