/**@ Write a java program of varags */

class Varargs {

  static void vTest(int... v) {
    System.out.println("Number of argument " + v.length);
    System.out.println("Contents");

    for (int i = 0; i < v.length; i++) 
      System.out.println("Args is " + i + "," + v[i]);
      System.out.println();

  }
  public static void main(String[] args) {
    vTest(10);
    vTest(1,3,9);
    vTest();

  }
}