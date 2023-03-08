package org.average;

import org.average.data.Student;

import java.util.*;

public class Mapper<K> {
    private List<Pair<K, Pair<Double,Integer>>> mapperOutput;

    public Mapper(List<Student> students) {
        mapperOutput = new ArrayList<>();
        for (Student student : students)
            mapperOutput.add(map(student));
    }

    public List<Pair<K, Pair<Double,Integer>>> getMapperOutput() {
        return mapperOutput;
    }

    public Pair<K, Pair<Double,Integer>> map(Student student) {
        return new Pair(
                student.getMajor(),
                new Pair(Util.getSum(Arrays.asList(student.getScore1(), student.getScore2(), student.getScore3(), student.getScore4())), 4)
        );
    }

    @Override
    public String toString() {
        return mapperOutput.toString();
    }

    public void printMapperOutput(int mapperIndex) {
        String header = "MAPPER OUTPUT";
        if (mapperIndex != -1)
            header = "MAPPER ["+mapperIndex+"] OUTPUT";

        System.out.println(header + "\n");
        for (Pair pair : mapperOutput)
            System.out.print("<" + pair.getKey() + "," + pair.getValue() + ">\n");
        System.out.println();
    }

    public void printMapperOutput() {
        printMapperOutput(-1);
    }
}
