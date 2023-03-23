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
        int m = 0;
        int x = 0;
        int y = 0; 

        for (int i = 0; x < list.length; x++, m++){
            if(list[x][y] == n) return m;
            for (int j = 0; y < list.length; y++, m++){
                if(list[x][y] == n) return m;
                
            }
        }
        return -1;
    }
}
