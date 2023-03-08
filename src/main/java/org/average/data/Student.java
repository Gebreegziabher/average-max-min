package org.average.data;

public class Student {
    private String id;
    private String firstName;
    private String lastName;
    private String major;
    private double score1;
    private double score2;
    private double score3;
    private double score4;

    public Student(String id, String firstName, String lastName, String major, double score1, double score2, double score3, double score4) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        this.score4 = score4;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMajor() {
        return major;
    }

    public double getScore1() {
        return score1;
    }

    public double getScore2() {
        return score2;
    }

    public double getScore3() {
        return score3;
    }

    public double getScore4() {
        return score4;
    }
}
