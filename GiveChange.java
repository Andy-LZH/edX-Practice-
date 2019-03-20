public class GiveChange {

    /** @param p number of pennies
     *   @return number of quarters
     */
    public static int getQuarters(int p) {
      //TODO: method definition for getQuarters
      p = 197;

      return p / 25;


    }

    /** @param p number of pennies
     *   @param q number of quarters
     *   @return number of dimes
     */
    public static int getDimes(int p, int q) {
      //TODO: method definition for getDimes
      p = 197 - q * 25;
      return p / 10;




    }

    /** @param p number of pennies
     *   @param q number of quarters
     *   @param d number of dimes
     *   @return number of nickels
     */
    public static int getNickels(int p, int q, int d) {
      //TODO: method definition for getNickels
      p = 197 - q * 25 - 10 * d;

      return p / 5;



    }

    /** @param p number of pennies
     *   @param q number of quarters
     *   @param d number of dimes
     *   @param n number of nickels
     *   @return number of leftover pennies
     */
    public static int getPennies(int p, int q, int d, int n) {
      //TODO: method definition for getPennies

      return p - 25 * q - 10 * d - n * 5;


    }

    public static void main(String[] args) {
      int pennies = 197;
      int q = getQuarters(pennies);
      int d = getDimes(pennies, q);
      int n = getNickels(pennies, q, d);
      int p = getPennies(pennies, q, d, n);
      String str = String.format("The customer should recieve %d " +
              "quarters, %d dimes, %d nickels, " +
              "and %d pennies.", q, d, n, p);
      System.out.println(str);
    }

  }


