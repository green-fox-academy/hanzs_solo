package com.gfa.libaryhomework;

public class Book {
  private static int nextId = 0;

  private int id;
  private String title;
  private String author;
  private int releaseYear;

  public Book(String title, String author, int releaseYear){
    this.id = nextId++;
    this.title = title;
    this.author = author;
    this.releaseYear = releaseYear;
  }

  public static int getNextId() {
    return nextId;
  }

  public static void setNextId(int nextId) {
    Book.nextId = nextId;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public int getReleaseYear() {
    return releaseYear;
  }

  public void setReleaseYear(int releaseYear) {
    this.releaseYear = releaseYear;
  }
}
