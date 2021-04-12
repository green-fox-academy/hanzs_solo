package com.company;

public class CodingHours {
    public static void main(String[] args) {

        int semLenght, hoursDaily, workdays, average, myAverage, hoursTotal;
        float percentage;

        semLenght = 17;
        hoursDaily = 8;
        workdays = 5;
        average = 52;
        myAverage = hoursDaily * workdays;
        hoursTotal = semLenght * myAverage;
        percentage = (float) myAverage / average * 100;

        System.out.println("I'm coding about " + myAverage + "hours a week, " +
                hoursTotal + " hours in a Semester. Thats " +
                percentage + "% of total average.");

    }
}
