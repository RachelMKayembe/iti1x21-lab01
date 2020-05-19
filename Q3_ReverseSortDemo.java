public class Q3_ReverseSortDemo {
  public static void main(String[] args){
    char[] unorderedLetters;
    unorderedLetters = new char[]{'b', 'm', 'z', 'a', 'u'};
    reverseSort(unorderedLetters);
    for (int i = 0 ; i < unorderedLetters.length; i++ )
      System.out.print(unorderedLetters[i]);
  }

  public static void reverseSort(char[] values){

      int i, j, argMax;
      char tmp;

      for (i = 0; i < values.length - 1; i++) {
        argMax = i;
        for (j = i + 1; j < values.length; j++) {
         if (values[j] > values[argMax]) { // cette condition cherche pour la valeur la plus grande de la table
           argMax = j; //Cette ligne specifie que l'index j dispose un mariable plus grand
         }
       }

       tmp = values[argMax];
       values[argMax] = values[i];
       values[i] = tmp;
     }
   }
}
