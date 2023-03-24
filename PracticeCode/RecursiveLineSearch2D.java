package PracticeCode;

public class RecursiveLineSearch2D {
    public static void main(String[] args) {
        int list[][] = {{13,89,43,76}, 
                        {18,14,9,21,56}, 
                        {1,7,6,45}, 
                        {9,65,80,33}};  

        int x = 1;

        System.out.println(search(list, x));
    }

    public static int search(int list[][], int x) {
        return search(list, 0, 0, 0, x);
    }

    public static int search(int list[][], int m, int i, int j , int x) {
        
        if(i < list.length){
            if(j < list.length){
                if(list[i][j] == x) return m;
                else search(list, m++, i, j++, x);
            }
            return -2;
        }
        return -1;
    }

}
