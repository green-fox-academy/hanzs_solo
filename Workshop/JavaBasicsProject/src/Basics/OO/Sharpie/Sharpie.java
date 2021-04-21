package Basics.OO.Sharpie;

//  Create a Sharpie class
//  We should know the followings about each sharpie:
//  color (which should be a string),
//  width (which will be a floating point number) and the
//  inkAmount (another floating point number)
//  We need to specify the color and the width at creation
//  Every sharpie is created with a default inkAmount value: 100
//  We can use() the sharpie objects: using it decreases inkAmount by 10
public class Sharpie {
  String color;
  float width;
  float inkAmount = 100;

  Sharpie(String color, float width) {
    this.color = color;
    this.width = width;
  }

  public void use(){
    inkAmount--;
  }
}
