public class Practice3 {

  public static void main(String[] args) {
    double width = 10.5;
    double height = 8.7;
    double areaPerBucket = 1.2;
    if (width > 0 && height > 0 && areaPerBucket > 0) {


      int extraBucket = 2;
      double additionalBucket = (width * height % areaPerBucket);
      int additionalBucket1 = (int) (width * height / areaPerBucket);

      if (additionalBucket == 0) {
        System.out.println(additionalBucket1);
      } else {
        System.out.println(additionalBucket1 + 1);
      }


      System.out.println(additionalBucket);


    }else{
      System.out.println("Not a wall");//else 一定与if同层，if{ }else{}
    }
  }
}
