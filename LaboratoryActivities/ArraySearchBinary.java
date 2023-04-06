package LaboratoryActivities;
    import java.util.*;
public class ArraySearchBinary {
     
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();
    int[] list = new int[num];
    
    int loLim = sc.nextInt();
    int hiLim = sc.nextInt();
    


    for(int i = 0; i<list.length; i++){
        int arrNum = sc.nextInt();
        list[i] = arrNum;
    }

    Arrays.sort(list);
    System.out.println(search(list, loLim, hiLim, 0));
}

public static int search(int list[], int loLim, int hiLim, int counter) {
    
    int lo = 0;
    int hi = list.length -1;

    while (lo < hi){  
        
        int mid = lo + (hi-lo)/2;

        if(list[mid] > hiLim) hi = mid-1;
        if (list[mid] < loLim) lo = mid+1;
        // if(list[hi] > hiLim) hi = hi - 1;
        // if(list[lo] < loLim) lo = lo + 1;

        if(list[mid] > loLim && list[mid] < hiLim) counter++;

    } int num = list.length - counter; 
    
    return num;







}


}
