package Basics.OO.BlogPost;

public class Main {
  public static void main(String[] args) {
    //    Create a BlogPost class that has
    //        an authorName
    //        a title
    //        a text
    //        a publicationDate
    //        Create a few blog post objects:
    //    "Lorem Ipsum" titled by John Doe posted at "2000.05.04."
    //    Lorem ipsum dolor sit amet.
    //    "Wait but why" titled by Tim Urban posted at "2010.10.10."
    //    A popular long-form, stick-figure-illustrated blog about almost everything.
    //    "One Engineer Is Trying to Get IBM to Reckon With Trump" titled by William Turton at "2017.03.28."
    //    Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.

    System.out.println();

    BlogPost blogPost01 = new BlogPost("mad_man01");
    blogPost01.setTitle("Hello Motherfuckers!");
    blogPost01.setText("I am " + blogPost01.getAuthorName() + " and this is my first post.");
    blogPost01.setDate("21.04.20");
    blogPost01.postToBlog();

    System.out.println();

    BlogPost blogpost02 = new BlogPost("mad_man01");
    blogpost02.setTitle("Second post");
    blogpost02.setText("This is my second post.");
    blogpost02.setDate("21.04.30");
    blogpost02.postToBlog();
  }
}
