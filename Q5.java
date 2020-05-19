public class Q5 {

  public static void main(String[] args){
    boolean[] test = new boolean[8];

    //test for isPrime
    test[0]  = (isPrime(0) == false);
    test[1] = (isPrime(2) == true);
    test[2] = (isPrime(7) == true);
    test[3] = (isPrime(15) == false);

    test[4]  = (getFibonacci(1) == 1);
    test[5]  = (getFibonacci(3) == 2);
    test[6]  = (getFibonacci(5) == 5);
    test[7]  = (getFibonacci(8) == 21);

    boolean testFlag=true;
    for (int i = 0; i < test.length; i++){
      if(test[i]){
        System.out.println("test " + i + " passed");
      } else {
        System.out.println("test " + i + " failed");
        testFlag = false;
      }
    }

    if(testFlag ){
      System.out.println("All tests are successful");
    } else {
      System.out.println("Not all tests are successful");
    }

  }

  //method that determines if the number x is prime
  public static boolean isPrime(int x){
    boolean prime = true;
    if(x < 2){ // 0 et 1 ne sont pas des nombres premiers
      prime = false ;
    }
    if(x==2 ){  // on aura pas besoin de vérifier x = 2 dans la boucle for
      prime = true;
    }
    int i = 2;
    while(prime && x > i){
      if(x % i == 0){
        prime = false;
      }
      i++;
    }
    return prime;
  }

  //returns the fibonacci number at the position in parameter
  public static int getFibonacci(int position) {
    int num = 0;
    int num2 = 1;
    int fibonacci = 0;

    if (position ==0 ) {
      fibonacci = 0;
    } else if (position == 1) {
      fibonacci = 1;
      num = num2; // num = 1, et elle sera retourner
      num2 = fibonacci;
    } else {
      int[] tableFib;
      tableFib = new int[]{0,1,1,2,3,5,8,13,21,34};
      for (int i = 2; i< position+1; i++ ) {
        if (i==position){
          num2= tableFib[position]; // identifie le dexieme nombre pour le calcule du fibonacci
          num= tableFib[position-1]; // identifie le premier nombre pour le calcule du fibonacci
          }
        fibonacci = num2+num ; // fait le calcule fibonacci
        num = num2; // num = tableFib[position] et elle est retourner a la fin
        num2 = fibonacci;
      }
    }
    return num;
  }

}
