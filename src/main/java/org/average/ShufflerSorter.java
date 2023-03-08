package org.average;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ShufflerSorter {

    public ShufflerSorter() {
    }

    //Example: [<0, [<Geography, [(sum, count), (sum, count)), (sum, count)]>, <Mathematics, [85.5, 97.8, 90.0]>]>,
    //          <1, [<Biology, [85.5, 97.8, 90.0, 89.7]>, <Physics, [85.5, 97.8, 90.0]>]>]
    public List<Pair<Integer,Pair<String, List<Pair<Double, Integer>>>>> shuffleAndSort(List<Pair<String, Pair<Double, Integer>>> pairs, int numberOfReducers){
        Map<String, List<Pair<String, Pair<Double, Integer>>>> grouped = pairs.stream().sorted(Comparator.comparing(s -> s.getKey())).collect(Collectors.groupingBy(f -> f.getKey()));
        List<Pair<Integer,Pair<String, List<Pair<Double, Integer>>>>> output = new ArrayList<>();

        //shuffle
        for(Map.Entry<String, List<Pair<String, Pair<Double, Integer>>>> entry: grouped.entrySet()){
            int partition = getPartition(entry.getKey(), numberOfReducers);
            var sumAndCountPairsList = entry.getValue().stream().map(Pair::getValue).toList();
            output.add(new Pair(partition, new Pair(entry.getKey(), sumAndCountPairsList)));
        }
        return output.stream().sorted(Comparator.comparing(s -> s.getKey())).toList();
    }

    public int getPartition(String key, int numberOfReducers) {
        return Math.abs((int) key.hashCode()) % numberOfReducers;
    }
}
