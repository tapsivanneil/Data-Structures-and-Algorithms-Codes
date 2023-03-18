public class BinarySearch {
    
    public static void main(String[] args) {
        
        Integer list[] = {2,5,6,7,8,9,10,11,15,16,17};
        int x = 15;

        System.out.println(search(list, x));
        
    }

    public static int search(Integer list[], int x){
            
        int lo = 0;
        int hi = list.length;
        
        while(lo <= hi){
            int mid = lo + (hi - lo)/2;

            if (list[mid] == x) return mid;

            if (list[mid] > x) hi = mid - 1;
            else if (list[mid] < x) lo = mid + 1;

        }
        return -1;

    }


}
