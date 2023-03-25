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
        //return search(list, x, 0, 0);
        return search(list, x, 0, 0);

    }

    public static boolean search(Integer list[][], int x,  int i, int j) {

        if(i >= list.length && j >= list.length) return false;

        if(i < list.length){
            if(j < list.length){
                if(list[i][j] == x) return true;
                return search(list, x, i, j + 1);
            } 
        }
        return search(list, x, i + 1, j);  
        

    }


}
