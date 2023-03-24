package SelfActivitiesRecursive;

public class RecursiveLinearSearchBool2D {
    public static void main(String[] args) {
        Integer list[][] = {{13,17,43,76}, 
                            {18,14,9,21}, 
                            {1,7,6,45}, 
                            {9,65,80,33}};  
                            
        System.out.println(search(list, 76));
    }

    public static boolean search(Integer list[][], int x) {
        return search(list, x, 0, 0);
    }

    public static boolean search(Integer list[][], int x, int i, int j) {
        
        while(i < list.length){
            while(j < list.length){
                if(list[i][j] == x) return true;
                else j++; return search(list, x, i, j);
            }
            i++; return search(list, x, i++, j); 
        }
        return false;

    }
}
