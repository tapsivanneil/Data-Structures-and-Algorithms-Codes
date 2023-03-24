package SelfActivities;

public class LinearSearcAct {
    public static void main(String[] args) {
        
        Integer list[][] = {{13,17,43,76}, 
                            {18,14,9,21}, 
                            {1,7,6,45}, 
                            {9,65,80,33}};  
                            
        System.out.println(search(list, 76));
    }

    public static int search(Integer list[][], int n){
        int m = 0; //3

        for (int i = 0; i < list.length; i++, m++){
            for (int j = 0; j < list.length; j++, m++){
                if(list[i][j] == n) return m;
                
            }
        }
        return -1;
    }
}
