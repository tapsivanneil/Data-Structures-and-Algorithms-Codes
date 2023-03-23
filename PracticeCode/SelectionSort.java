package PracticeCode;

public class SelectionSort {
    
    public static void main(String[] args) {
        Integer list[] = {14,89,6,8,43,56,76};
        sort(list);
        for (int k : list) {
            System.out.println(k);
        }

    }

    public static void sort(Integer list[]){
     
        for(int i = 0; i <= list.length - 1; i++){
            int min = i;

            for(int j = i + 1; j <= list.length -1 ; j++ ){

                if(list[i] < list[j]){}
                else {
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }

            }

        }

    }


}
