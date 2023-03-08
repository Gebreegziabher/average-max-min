package org.average.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Data {
    private static final List<Student> students1 = new ArrayList<>(Arrays.asList(
            new Student("1001", "Emily", "Anderson", "Computer Science", 100, 85, 90, 95),
            new Student("1002", "Oliver", "Baker", "Mathematics", 90, 95, 80, 85),
            new Student("1003", "Sophia", "Campbell", "Physics", 75, 85, 60, 80),
            new Student("1004", "William", "Davis", "Chemistry", 60, 75, 85, 90),
            new Student("1005", "Ava", "Edwards", "Biology", 96, 65, 88, 85)
//            ,new Student("1006", "Jacob", "Fisher", "Computer Science", 80, 85, 90, 75),
//            new Student("1007", "Mia", "Garcia", "Mathematics", 90, 80, 85, 95),
//            new Student("1008", "Ethan", "Harris", "Physics", 85, 90, 75, 80),
//            new Student("1009", "Isabella", "Jackson", "Chemistry", 75, 80, 95, 90),
//            new Student("1010", "Mason", "Kim", "Biology", 90, 85, 80, 75),
//            new Student("1011", "Evelyn", "Lee", "Computer Science", 85, 90, 75, 80),
//            new Student("1012", "Liam", "Martin", "Mathematics", 80, 75, 90, 85),
//            new Student("1013", "Charlotte", "Nelson", "Physics", 90, 85, 80, 75),
//            new Student("1014", "Noah", "Olson", "Chemistry", 95, 80, 75, 90),
//            new Student("1015", "Amelia", "Parker", "Biology", 80, 90, 95, 85),
//            new Student("1016", "Benjamin", "Quinn", "Computer Science", 75, 95, 85, 80),
//            new Student("1017", "Harper", "Ramirez", "Mathematics", 85, 80, 75, 90),
//            new Student("1018", "Lucas", "Smith", "Physics", 90, 85, 80, 75),
//            new Student("1019", "Abigail", "Taylor", "Chemistry", 75, 90, 85, 95),
//            new Student("1020", "Aiden", "Underwood", "Biology", 80, 75, 90, 85),
//            new Student("1021", "Madison", "Vaughn", "Computer Science", 90, 85, 80, 75),
//            new Student("1022", "Jackson", "Wilson", "Mathematics", 85, 80, 75, 90),
//            new Student("1023", "Emma", "Yang", "Physics", 75, 85, 90, 80),
//            new Student("1024", "Owen", "Zhang", "Chemistry", 80, 90, 85, 75),
//            new Student("1025", "Elizabeth", "Adams", "Biology", 85, 75, 80, 90),
//            new Student("1026", "Michael", "Brown", "Computer Science", 90, 85, 75, 80),
//            new Student("1027", "Sofia", "Chen", "Mathematics", 75, 90, 85, 95)
    ));
    private static final List<Student> students2 = new ArrayList<>(Arrays.asList(
            new Student("2001", "Emily", "Anderson", "Computer Science", 85, 80, 90, 95),
            new Student("2002", "Oliver", "Baker", "Mathematics", 95, 75, 80, 85),
            new Student("2003", "Sophia", "Campbell", "Physics", 75, 85, 90, 80),
            new Student("2004", "William", "Davis", "Chemistry", 88, 50, 85, 90),
            new Student("2005", "Ava", "Edwards", "Biology", 65, 78, 81, 89)
//            ,new Student("2006", "Jacob", "Fisher", "Computer Science", 80, 57, 90, 75),
//            new Student("2007", "Mia", "Garcia", "Mathematics", 90, 80, 85, 95),
//            new Student("2008", "Ethan", "Harris", "Physics", 85, 90, 75, 80),
//            new Student("2009", "Isabella", "Jackson", "Chemistry", 75, 56, 95, 90),
//            new Student("2010", "Mason", "Kim", "Biology", 90, 85, 80, 75),
//            new Student("2011", "Evelyn", "Lee", "Computer Science", 85, 90, 75, 80),
//            new Student("2012", "Liam", "Martin", "Mathematics", 80, 75, 90, 85),
//            new Student("2013", "Charlotte", "Nelson", "Physics", 90, 85, 80, 75),
//            new Student("2014", "Noah", "Olson", "Chemistry", 95, 80, 75, 90),
//            new Student("2015", "Amelia", "Parker", "Biology", 80, 62, 95, 85),
//            new Student("2016", "Benjamin", "Quinn", "Computer Science", 75, 95, 85, 80),
//            new Student("2017", "Harper", "Ramirez", "Mathematics", 85, 78, 75, 90),
//            new Student("2018", "Lucas", "Smith", "Physics", 90, 85, 80, 75),
//            new Student("2019", "Abigail", "Taylor", "Chemistry", 75, 90, 85, 95),
//            new Student("2020", "Aiden", "Underwood", "Biology", 80, 75, 90, 85)
    ));
    private static final List<Student> students3 = new ArrayList<>(Arrays.asList(
            new Student("3000", "Emily", "Anderson", "Computer Science", 85, 80, 67, 95),
            new Student("3001", "Oliver", "Baker", "Mathematics", 90, 75, 80, 85),
            new Student("3002", "Sophia", "Campbell", "Physics", 75, 58, 76, 70),
            new Student("3003", "William", "Davis", "Chemistry", 78, 75, 85, 99),
            new Student("3004", "Ava", "Edwards", "Biology", 68, 98, 73, 79)
            ,new Student("3005", "Helen", "Keller", "History", 68, 98, 73, 79)
            ,new Student("3006", "Eva", "Garcia", "Geology", 68, 98, 73, 79)
            ,new Student("3007", "Eva", "Garcia", "Pathology", 68, 98, 73, 79)
            ,new Student("3008", "Liam", "Martin", "Petroleum", 80, 75, 90, 85)
//            ,new Student("3005", "Jacob", "Fisher", "Computer Science", 80, 85, 90, 75),
//            new Student("3006", "Mia", "Garcia", "Mathematics", 100, 80, 85, 95),
//            new Student("3007", "Ethan", "Harris", "Physics", 85, 65, 75, 80),
//            new Student("3008", "Isabella", "Jackson", "Chemistry", 75, 87, 95, 90),
//            new Student("3009", "Mason", "Kim", "Biology", 90, 85, 80, 75),
//            new Student("3010", "Evelyn", "Lee", "Computer Science", 85, 76, 75, 80),
//            new Student("3011", "Liam", "Martin", "Mathematics", 80, 75, 90, 85),
//            new Student("3012", "Charlotte", "Nelson", "Physics", 90, 60, 80, 75),
//            new Student("3013", "Noah", "Olson", "Chemistry", 95, 58, 75, 90),
//            new Student("3014", "Amelia", "Parker", "Biology", 80, 90, 95, 85),
//            new Student("3015", "Benjamin", "Quinn", "Computer Science", 75, 67, 85, 80),
//            new Student("3016", "Harper", "Ramirez", "Mathematics", 85, 80, 75, 90),
//            new Student("3017", "Lucas", "Smith", "Physics", 90, 85, 80, 75)
    ));

    public static List<Student> getStudents1() {
        return students1;
    }

    public static List<Student> getStudents2() {
        return students2;
    }

    public static List<Student> getStudents3() {
        return students3;
    }

    public static List<Student> getAllStudents() {
        List<Student> allStudents = new ArrayList<>();
        allStudents.addAll(students1);
        allStudents.addAll(students2);
        allStudents.addAll(students3);
        return allStudents;
    }
}

