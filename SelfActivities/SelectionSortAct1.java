package SelfActivities;

import java.util.ArrayList;

public class SelectionSortAct1 {
    public static void main(String[] args) {
        Integer list[][] = {{13,17,43,76}, 
                            {18,14,9,21}, 
                            {1,7,6,45}, 
                            {9,65,80,33}};  

        ArrayList<Integer> sortedList = new ArrayList<Integer>();
        sort(list, sortedList);
        System.out.println(sortedList);
    }

    public static void sort(Integer list[][], ArrayList sortedList){

        for(int x = 0; x<list.length; x++){
            for(int y = 0; y<list.length; y++)
                sortedList.add(list[x][y]);
                
        }

        // for(int i = 0; i<sortedList.size(); i++){
        //     int min = i;
        //     for(int j = i + 1; j<=sortedList.size();j++){
               
        //         if(sortedList.get(i) < sortedList.get(j)){}


        //     }
        // }



    }
}
