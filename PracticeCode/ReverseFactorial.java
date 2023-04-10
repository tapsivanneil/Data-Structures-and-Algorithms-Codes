package PracticeCode;
    import java.util.*;
public class ReverseFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println(revFactorial(num));

    }

    public static int revFactorial(int num){
        return revFactorial(num, 1);
    }

    public static int revFactorial(int num, int counter){    
        num = num / counter;
        if(num == 1) return counter;
        if(num == counter) return counter;
        if(num < 1) return -1;
        return revFactorial(num, counter + 1);    
        
    }

}
