import java.util.Scanner;
public class Q3_ArrayInsertionDemo {

  public static int[] insertIntoArray(int[] beforeArray, int indexToInsert, int valueToInsert){
    int[] afterArray = new int[beforeArray.length+1];

  for(int i = 0; i<beforeArray.length; i++){
    /* conditio 1: pour chaque valeur plus petit que l'index a inserer,
    la table afterArray est completer par les valeurs de la table beforeArray */
    if( i <indexToInsert ) {
      afterArray[i] = beforeArray[i];
      /* conditio 2: pour chaque valeur plus grand ou egale a l'index a inserer,
      la table afterArray est completer par les valeurs de la table beforeArray */
      } else if(i>=indexToInsert) {
        if (i ==indexToInsert){
          afterArray[i] =valueToInsert;
          afterArray[indexToInsert+1] = beforeArray[i];
          }else{
            afterArray[i+1]=beforeArray[i];

            }

        }
    }
    return afterArray;

  }

	public static void main(String[] args){

    Scanner scan = new Scanner(System.in); // créer un scanner

    System.out.println("Combien de nombres a entrer dans la table?");
    int nombre = scan.nextInt(); // declare que le nombre a entrer est de type int
    int[] table = new int[nombre];

    System.out.println("Quel index voulez vouz changer?");
    int indexChanger = scan.nextInt();

    System.out.println("Quel est la valeur de l'index a changer?");
    int valeurChanger = scan.nextInt();

		System.out.println("Entrez les nombres de la table:");

    for (int i = 0; i<table.length; i++){
      int nombreEntre = scan.nextInt();
      table[i] = nombreEntre; // Chaque nombre qui sera entré par l'utilisateur sera la valuer de chaque position dans la table
      }
			System.out.println("Array before insertion:");
			for (int i = 0; i<table.length; i++){
				System.out.println(table[i]);
			}
			int[] newArray;
			newArray = insertIntoArray(table, indexChanger , valeurChanger);
			System.out.println("Array after insertion:");
			for (int i = 0; i < newArray.length; i++) {
				System.out.println(newArray[i]);
			}

  }
}
