import java.util.*;
public class Associative {
  public int x;// class object: "variables that are common to all objects"- - Oracle
  public int y;
  public int z;

  public Associative(int x, int y, int z){//constructor of the class
this.x = x;// remember this. method
this.y = y;
this.z = z;

  }


  public int firstTwo(){
    return (x+y)*z;

  }
  public int lastTwo(){
    return x+(y*z);


  }


  public static void main(String[] args){
    System.out.println("please enter the number");
    Scanner search = new Scanner(System.in);
    int a = search.nextInt();
    int b = search.nextInt();
    int c = search.nextInt();
    Associative clue = new Associative(a,b,c);// create a object
    int F = clue.firstTwo();
    int L= clue.lastTwo();
  System.out.println("Grouping the first two terms" +", " + "(" + a + "+" + b +")" + " * " +c +" = " + F );
System.out.println("Grouping the first two terms" +", " + a + " + " +"("+ b + "*" + c + ")"  +" = " + L);




  }
}
