public class RecursiveLineSearch {
    
    public static int search(Integer list[], Integer x) {
        return search(list, 0, x);
    }

    public static int search(Integer list[], int m, int x){
        if(list.length == m) return -1; 
        if (list[m] == x){ //m = 1 2 3 4
            return m;
        }
            return search(list, m+1, x);
        }



public static void main(String[] args) {
        
    Integer list[] = {1,2,3,4,5};  
    int x = 5;

    System.out.println(RecursiveLineSearch.search(list, 5));
}
}



// list[] = {4,17,19,7,8}
// x = 7


