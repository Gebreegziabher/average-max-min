package org.average;

import org.average.data.Data;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n1. SINGLE MAPPER AND SINGLE REDUCER\n------------\n");

        //1. Get mapper output
        Mapper[] mapper = new Mapper[1];
        mapper[0] = new Mapper(Data.getAllStudents());
        mapper[0].printMapperOutput();

        //2. shuffle and sort mapper output
        ShufflerSorter shufflerSorter = new ShufflerSorter();
        List<Pair<Integer, Pair<String, List<Pair<Double, Integer>>>>> shufflerSorterOutput = shufflerSorter.shuffleAndSort(mapper[0].getMapperOutput(), 1);

        //reducer input
        List<Pair<String, List<Pair<Double, Integer>>>> reducerInput = new ArrayList<>();
        for (Pair<Integer, Pair<String, List<Pair<Double, Integer>>>> pair : shufflerSorterOutput) {
            reducerInput.add(pair.getValue());
        }

        //sort reducer input
        System.out.println("\nREDUCER INPUT\n");
        reducerInput = reducerInput.stream().sorted(Comparator.comparing(s -> s.getKey())).toList();
        for (Pair<String, List<Pair<Double, Integer>>> input : reducerInput) {
            System.out.println(input);
        }

        //3. Get reducer output
        Reducer[] reducer = new Reducer[1];
        reducer[0] = new Reducer(reducerInput.stream().sorted(Comparator.comparing(Pair::getKey)).collect(Collectors.toList()));

        reducer[0].printAverageOutput();
        reducer[0].printMaxOutput();
        reducer[0].printMinOutput();

        //-----Using multiple mappers and reducers-----
        System.out.println("\n2. MULTIPLE MAPPERS AND REDUCERS\n------------\n");

        int numberOfMappers = 3;
        int numberOfReducers = 3;
        Mapper[] mappers = new Mapper[numberOfMappers];
        //1. Get mappers outputs

        //Mapper 0
        mappers[0] = new Mapper(Data.getStudents1());
        mappers[0].printMapperOutput(0);

        //Mapper 1
        mappers[1] = new Mapper(Data.getStudents2());
        mappers[1].printMapperOutput(1);

        //Mapper 2
        mappers[2] = new Mapper(Data.getStudents3());
        mappers[2].printMapperOutput(2);

        //2. shuffle and sort mappers outputs
        List<Pair<String, Pair<Double, Integer>>> allMapperOutputs = new ArrayList<>();
        allMapperOutputs.addAll(mappers[0].getMapperOutput());
        allMapperOutputs.addAll(mappers[1].getMapperOutput());
        allMapperOutputs.addAll(mappers[2].getMapperOutput());

        shufflerSorter = new ShufflerSorter();
        shufflerSorterOutput = shufflerSorter.shuffleAndSort(allMapperOutputs, numberOfReducers);

        Reducer[] reducers = new Reducer[numberOfReducers];
        var groupedByPartitionId = shufflerSorterOutput.stream().collect(Collectors.groupingBy(g -> g.getKey()));
        for (Map.Entry<Integer, List<Pair<Integer, Pair<String, List<Pair<Double, Integer>>>>>> entry : groupedByPartitionId.entrySet()) {
            System.out.println("\nREDUCER [" + entry.getKey() + "] INPUT\n");
            reducerInput = entry.getValue().stream().map(m -> m.getValue()).toList();

            System.out.println(reducerInput);

            reducers[entry.getKey()] = new Reducer(reducerInput);
        }

        //3. Get reducer output
        for (int i = 0; i < reducers.length; i++) {
            if (reducers[i] != null) {
                reducers[i].printAverageOutput(i);
                reducers[i].printMaxOutput(i);
                reducers[i].printMinOutput(i);
            }
        }
    }
}