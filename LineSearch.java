public class LineSearch {

    public static int search(Integer list[], int x){

        for (int m = 0; m <= list.length; m++ ){
            if(list[m] == x) return m;
        }

        return -1;
    }

    public static void main(String[] args) {
        
        Integer list[] = {2,5,6,7,8,9,10,11,15,16,17};
        int x = 15;

        System.out.println(search(list, x));
        
    }

}