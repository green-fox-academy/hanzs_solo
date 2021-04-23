package Basics.OO.Blog;

import java.util.ArrayList;
import java.util.List;

public class Blog {
  //  Reuse your BlogPost class
  //  Create a Blog class which can:
  //  store a list of BlogPosts
  //  and has the following methods:
  //  add(BlogPost) -> adds a BlogPost to the list
  //  delete(int) -> deletes the BlogPost from the given index
  //  update(int, BlogPost) -> replaces an item at the given index with a new BlogPost

  List<BlogPost> blogPostList = new ArrayList<>();

  public void add(BlogPost blogPost){
    blogPostList.add(blogPost);
  }

  public void delete(int index){
    blogPostList.remove(index);
  }

  public void update(int index, BlogPost blogPost){
    blogPostList.remove(index);
    blogPostList.add(blogPost);
  }

}
