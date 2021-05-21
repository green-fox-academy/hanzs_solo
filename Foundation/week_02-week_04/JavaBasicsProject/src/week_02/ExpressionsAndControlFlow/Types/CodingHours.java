package week_02.ExpressionsAndControlFlow.Types;

public class CodingHours {
  public static void main(String[] args) {

    // An average Green Fox attendee codes 6 hours daily
    // The semester is 17 weeks long
    //
    // Print how many hours is spent with coding in a semester by an attendee,
    // if the attendee only codes on workdays.
    //
    // Print the percentage of the coding hours in the semester if the average
    // work hours weekly is 52

    int semLength, workdays, hoursPerDay, hoursTotal, average, myAverage;
    float percentage;

    semLength = 17;
    workdays = 5;
    hoursPerDay = 8;
    average = 52;
    myAverage = hoursPerDay * workdays;
    hoursTotal = semLength * myAverage;
    percentage = (float) myAverage / average * 100;

    System.out.println("I'm coding about " + myAverage + "hours a week, " +
        hoursTotal + " hours in a Semester. Thats " +
        percentage + "% of total average.");

  }
}
