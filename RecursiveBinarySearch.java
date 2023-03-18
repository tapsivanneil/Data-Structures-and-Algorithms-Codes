public class RecursiveBinarySearch {

    public static int search(Integer list[], int x){
       return search(list, 0, list.length -1, x);
    }

    public static int search(Integer list[], int lo, int hi, int x ){
        
        int mid = lo + (hi - lo)/2;
        
        if(list[mid] == x) return mid;

        if (list[mid] > x) return search(list, lo, mid - 1, x);
        else return search(list, mid - 1, hi, x);
    }

    public static void main(String[] args) {
        
        Integer list[] = {2,5,6,7,8,9,10,11,15,16,17};
        int x = 15;

        System.out.println(RecursiveBinarySearch.search(list, x));
    }

}
