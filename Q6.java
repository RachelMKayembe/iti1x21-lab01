import java.util.Scanner;
public class Q6 {
  public static void main(String[] args){
    System.out.println("Entrez les notes des cours:");

    Scanner scan = new Scanner(System.in); // crée objet scanner declare que scan est un scanner
    double[] notesCours = new double[10]; // on cree une table avec 10 espace

    for (int i =0; i < 10; i++){
      double noteEntrer = scan.nextDouble(); // utilisateur entre seulement 10 valeurs
      notesCours[i] = noteEntrer;
    }

    System.out.println("La moyenne est " +calculateAverage(notesCours));
    System.out.println("La mediane est "+ calculateMedian(notesCours));
    System.out.println("Le nombre d'étudiant qui ont échoué est " + calculateNumberFailed(notesCours));
    System.out.println("Le nombre d'étudiant qui ont passé est " + calculateNumberPassed(notesCours));

  }

  public static double calculateAverage(double[] notes){
    double sum = 0.0;
    double moyenne;

    for(int i = 0; i < notes.length; i++){
      sum = sum + notes[i];
    }
    moyenne = sum / notes.length;
    return moyenne;
  }

  public static double calculateMedian(double[] notes){
    int i, j, argMin;
    double tmp;
    double mediane = 0.0;


    for (i = 0; i < notes.length - 1; i++) {
      argMin = i;
      for (j = i + 1; j < notes.length; j++) {
        if (notes[j] < notes[argMin]) { // cette condition cherche pour la valeur petite de la table
          argMin = j;
        }
      }

      tmp = notes[argMin];
      notes[argMin] = notes[i];
      notes[i] = tmp; // place chaque valeur dans la table notes en ordre croiddant

    }
    if (notes.length% 2 == 0){
      mediane = (notes[notes.length/2] + notes[notes.length/2-1])/2;
    }
    return mediane;
  }



  public static int calculateNumberFailed(double[] notes){
    int counter = 0;
    for(int i = 0; i < notes.length; i++){

      if (notes[i] < 50.0){
        counter++; // compte le nombre de fois que la condition est vrai
      }
    }
    return counter;

  }

  public static int calculateNumberPassed(double[] notes){
    int counter = 0;
    for(int i = 0; i < notes.length; i++){

      if (notes[i] > 50.0){
        counter= counter + 1;
      }
    }
    return counter;
  }

}
