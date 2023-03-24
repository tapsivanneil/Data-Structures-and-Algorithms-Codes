package SelfActivities;





public class SelectionSortAct {
    public static void main(String[] args) {
        int list[][] = {{13,89,43,76}, 
                        {18,14,9,21}, 
                        {1,7,6,45}, 
                        {9,65,80,33}};  
    sort(list);

    for (int i = 0; i < list.length; i++){
        for (int j = 0; j < list.length; j++){
            System.out.println(list[i][j]);
        }  
    }              
    }

    public static void sort(int list[][]){

        for (int i = 0; i < list.length; i++){
            for (int j = 0; j < list.length; j++){
                for (int k = 0; k < list.length; k++){
                    for (int l = 0; l < list.length; l++){
                    
                        if(list[i][j] < list[k][l]){
                            int temp = list[i][j];
                            list[i][j] = list[k][l];
                            list[k][l] = temp;
                        }
                    }
                }
            }
        }


    }
}



