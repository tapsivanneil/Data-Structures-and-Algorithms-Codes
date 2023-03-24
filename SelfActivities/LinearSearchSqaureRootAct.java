package SelfActivities;

public class LinearSearchSqaureRootAct {
    public static void main(String[] args) {
        int list[][] = {{13,89,43,76}, 
                        {18,14,9,21,56}, 
                        {1,7,6,45}, 
                        {9,65,80,33}};  

        int x = 36;
        System.out.println(search(list, x));
        
    }

    public static int search(int list[][], int x) {
        int m = 0;

        for(int i=0; i<list.length; i++){
            for(int j=0; j<list.length; j++, m++){
                int sqr = list[i][j] * list[i][j];
                if(sqr == x) return m; // squareroot

            }
    
        }
        return -1;
    }
}
