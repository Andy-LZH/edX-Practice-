public class Thingy {
  public int val;
  public Thingy(int val) {this.val = val;}
  public int crazyCalc(int input) {
    return ((val * input) + 1) / (val % input);
  }
}

