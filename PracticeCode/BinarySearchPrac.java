package PracticeCode;

public class BinarySearchPrac {
    public static void main(String[] args) {
        
        Integer list[] = {2,5,6,7,8,9,10,11,15,16,17};
        int x = 7;

        System.out.println(search(list, x));

    }

    
    public static int search(Integer list[], int x){
        
        int hi = list.length;
        int lo = 0;
        
        

        for (int i = 0; lo < hi; i++ ){
            
            int mid = lo + (hi - lo)/2;

            if(list[mid] == x) return mid;

            if (list[mid] > x ) hi = mid - 1;
            else lo = mid + 1;
        }

        return -1;


    }
}
