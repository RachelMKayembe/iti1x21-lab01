public class Q3_SquareArray{
	public static int[] createArray(int size){
		int[] anArray;
		anArray= new int[size];
		for(int i = 0; i < anArray.length; i++){ //
			anArray[i]=i * i;
		}
		return anArray;


	}
	public static void main(String[] arg){
		int[] elementOfArray = createArray(13); // la méthode createArray prend 13 car on veut que le chiffre maximun s'arrete a 12
		for(int i=0; i <  elementOfArray.length; i++){
			System.out.println("the square of " +i+ " is " + elementOfArray[i] );

		}


	}
		}
