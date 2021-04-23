package Basics.OO.BlogPost;

public class BlogPost {
  //  Create a BlogPost class that has
  //      an authorName
  //      a title
  //      a text
  //      a publicationDate
  //      Create a few blog post objects:
  //      "Lorem Ipsum" titled by John Doe posted at "2000.05.04."
  //  Lorem ipsum dolor sit amet.
  //"Wait but why" titled by Tim Urban posted at "2010.10.10."
  //  A popular long-form, stick-figure-illustrated blog about almost everything.
  //"One Engineer Is Trying to Get IBM to Reckon With Trump" titled by William Turton at "2017.03.28."
  //  Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.

  private String authorName;
  private String title;
  private String text;
  private String date;

  BlogPost(String authorName) {
    this.authorName = authorName;
  }

  public void postToBlog() {
    System.out.println(title);
    System.out.println(text);
    System.out.println(authorName);
    System.out.println(date);
  }

  public String getAuthorName() {
    return authorName;
  }

  public void setAuthorName(String authorName) {
    this.authorName = authorName;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }
}
