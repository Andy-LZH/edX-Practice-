public class Friend {
  public Friend(){}
  public String greeting(){
return "Hello! Happy to see you";
  }
  public String closing(){
return "Nice talking with you. Goodbye!";
  }

public static void main (String [] args) {
Friend f = new Friend();
System.out.println(f.closing());
System.out.println(f.greeting());



}

        }