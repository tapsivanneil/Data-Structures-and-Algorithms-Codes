package SelfActivitiesRecursive;

public class RecursiveSearchDivisible {
    public static void main(String[] args) {
        int list[] = {5,9,11,17,21,81};
        int x = 3;

        System.out.println(search(list, x));
    }

    public static int search(int list[], int x) {
        return search(list, x, 0, 0);
    }

    public static int search(int list[], int x, int y, int z) {
        
        // x = test  y = counter z = indexing
        if(z < list.length){
            if(list[z] % x == 0){
                y ++;
                return search(list, x, y, z + 1);
            }   return search(list, x, y, z + 1);
        }
       return y;
    }

        


}
