public class SquareRoot {
    public static void main(String[] args) {

        Double list[] = {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0};
        double x = 81;

        System.out.println(search(list,x));
    }

    public static double search(Double list[], double x){

        for(int i = 0; i <= list.length; i++){
            double sqr = list[i] * list[i];
            if (sqr == x ) return list[i]; // if the square is needed
        }

        return -1;

    }
}
