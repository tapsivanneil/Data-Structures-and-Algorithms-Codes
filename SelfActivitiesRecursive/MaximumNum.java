package SelfActivitiesRecursive;

public class MaximumNum {
    public static void main(String[] args) {
        
        int list[] = {5,9,11,17,21,81};

        System.out.println(search(list));
    }

    public static int search(int list[]) {
        return search(list, 0, 1);
    }

    public static int search(int list[], int index, int compare) {
        
        if(list.length == index) return -1;
        if(compare < list.length){
            if (list[index] < list[compare]){
                int temp = list[index];
                list[index] = list[compare];
                list[compare] = temp;
                return search(list, index, compare + 1);
            }
        }
       return list[0];

    }
}
