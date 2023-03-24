package PracticeCode;

public class RecursiveLinearSearch {
    

    public static void main(String[] args) {
        Integer list[] = {4,17,19,7,8};
        int x = 7;

        System.out.println(search(list, x));

    }

    public static int search(Integer list[], int x) {
        return search(list, 0, x);
    }
    
    public static int search(Integer list[], int m, int x) {
        if(list.length == m ) return -1;
        if(list[m] != x){
            return search(list, m+1, x);
        }
        else{return m;}
    
    }
    


}
