public class AboutMe {

  public String myName(){
    return "Phil";
  }
  public String mySchool(){
    return "Purdue University";
  }
  public int myAge(){
    return 36;
  }


  public static void main(String[] args){
    AboutMe andy = new AboutMe();

System.out.println("My name is " + (andy.myName()) + ", " + "and I attend " + (andy.mySchool()) + ". " + "I am " + (andy.myAge()) + " years old.");
  }
}
