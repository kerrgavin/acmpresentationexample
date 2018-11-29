
class Fact {

  public static void main(String[] args) {
    for (int i = 1; i <= 10 ;i++ ) {
      System.out.println(fact(i));
    }
  }

  static int fact(int n) {
    if(n == 1){
      return 1;
    }
    return n * fact(n-1);
  }

}
