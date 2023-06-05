import java.util.*;

public class LineOfSight {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int personInFront = 0; 

        int[] array = new int[n];

        for(int i = 0; i <= n -1 ; i++ ){
            int num = sc.nextInt();
            array[i] = num;
        }

        for(int j = 0; j <= array.length - 1; j++){
                if(j == 0){
                    personInFront = 0;
                    System.out.print(personInFront +" ");
                }
                else if(array[j] > array[j-1]){
                    personInFront++;
                    System.out.print(personInFront +" ");
                }

                else if(array[j] == array[j-1]){
                    personInFront = 1;
                    System.out.print(personInFront +" ");
                    personInFront++;
                }

                else{
                    personInFront = 1;
                    System.out.print(personInFront +" ");
                }
        }
    }
}
