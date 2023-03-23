public class BinarySquareRoot {
    public static void main(String[] args) {
        Double list[] = {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0};
        double x = 9;
        double ep = 0.1;
        System.out.println(search(list,x,ep));

    }

    public static double search(Double list[], double x, double ep){

        double hi = list.length;
        double lo = 0;

        
        for(int i = 0; hi - lo > ep; i++ ){

            double mid = lo + (hi - lo)/2;
            double sqr = mid * mid;

            if (sqr == x) return mid;
            if (sqr > x) hi = mid - 1;
            else lo = mid + 1;

            System.out.println(mid);
        }

        return -1;

    }
}
