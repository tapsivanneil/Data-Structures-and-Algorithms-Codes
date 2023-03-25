package SelfActivities;

public class BinarySearch2D {
    public static void main(String[] args) {
        
        int list[][] = {{1,6,7,9}, 
                        {9,13,14,17}, 
                        {18,21, 33,43}, 
                        {45,65,76,90}}; 
        
        System.out.println(search(list, 33));

    }

    public static int search(int list[][], int x){

        int lo = list[0][0]; 
        int hi = list[list.length][list.length];
        int m = lo + (hi-lo)/ 2;

        for (int i = 0; i < list.length; i++){
            for (int j = 0; j < list.length; j++){
                
                

            }
        }

    }


}
