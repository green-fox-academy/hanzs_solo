package Basics.FileIO.LicensePlates;
//## Find a Word Based on Licence Plate
//
//    The story behind this one is that my father-in-law used to be a
//    mathematician back in the 1970's in Hungary
//    and was also writing algorithms on paper.
//    He just got a new car and since the letters on his licence plate
//    were hard to remember he wanted me as a mentor in GFA
//    to write him a program
//    that tells him a word(s) that contains these letters in a certain way:
//
//    - if the licence plate starts with a vowel,
//    the word also has to start with the same vowel
//    - if it starts with a consonant, it can start with any vowel
//    but after the vowel(s) this consonant should come
//    - after vowels if the next letter on the licence plate is a consonant
//    then this consonant should come as next,
//    if the next letter on the licence plate is a vowel
//    other consonants can come between them
//    - after consonants if the next letter on the licence plate is a consonant
//    then any vowel(s) can come between them
//    but if the next character in the licence plate is a vowel
//    then no other letter can come between them
//    - the licence plate can contain a 2-5 letter long string and no numeric
//    values, only alphabetical
//
//    You can find all the words in the English language in the provided file.
//    The file is a txt file and you have to parse it to
//    create a list of words from it.
//    You can find the source file with the words here [here](../assets/words.txt)
//
//    Your task is
//
//    - to ask the user for input
//    - validate the input
//    - parse and search through the terms in the file
//    - use exception handling for both validating the input and reading the file
//    - return a list of possible words or
//    display some meaningful message if there is no such word
//
//    Some examples for expected input and output
//
//    **input:** *lmo*
//
//    **expected output:**
//    *{almond, almonds, lemon, lemons, lemonade, lemonades, limousine, limousines}*
//
//    **input**: *rdo*
//
//    **expected output:**
//    *{ardor, ardors, ardour, ardours, readout, readouts,
//    redo, redo, redoed, redo, redoes, redo, redoing, redo, redone, redo,
//    redos, redouble, redoubled, redouble, redoubles, redouble, redoubling,
//    redoubt, redoubts, redound, redounded, redound, redounding, redound,
//    redounds}*

import Basics.FileIO.LicensePlates.CustomExceptions.InvalidInputCharactersException;
import Basics.FileIO.LicensePlates.CustomExceptions.InvalidInputLenghtException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class LicensePlates {
  public static void main(String[] args) {
    //mi a fasz


    char[] input = getInput();
    getSourceData();


  }

  private static void getSourceData() {
    Path filePath = Paths.get("src/Basics/FileIO/LicensePlates/words.txt");
    List<String> content = new ArrayList<>();
    try {
      content = Files.readAllLines(filePath);
    } catch (IOException e) {
      e.printStackTrace();
    }
    List<String[]> sepContent = new ArrayList<>();
    for (String line : content) {
      sepContent.add(line.split("\t"));

    }


  }

  private static char[] getInput() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Which licence plate do you want to remember? ");
    String i = scanner.next().toLowerCase(Locale.ROOT);
    char[] input = i.toCharArray();
    try {
      validateInput(input);
      System.out.println("You entered valid input.");
      return input;
    } catch (InvalidInputLenghtException e) {
      System.err.println("ERROR: Too less or too much characters!");
      return null;
    } catch (InvalidInputCharactersException e) {
      System.err.println("ERROR: Only letters allowed!");
      return null;
    }
  }

  private static void validateInput(char[] input)
      throws InvalidInputLenghtException, InvalidInputCharactersException {
    if (input.length < 3 || input.length > 5) {
      throw new InvalidInputLenghtException();
    }

    char[] letters =
        {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
            'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    for (char ch : input) {
      boolean isLetter = false;
      for (char letter : letters) {
        if (ch == letter) {
          isLetter = true;
          break;
        }
      }
      if (!isLetter) {
        throw new InvalidInputCharactersException();
      }
    }

  }
}
