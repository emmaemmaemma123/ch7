import java.util.Scanner;
public class arePrimeFactors{
    public static boolean isPrime(int num){
        if(num==0 || num==1){
            return false;
        }
        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static boolean primeFactors(int n, int [] arr){
        int sum=1;
        for(int i=0; i<arr.length;i++){
            sum=sum*arr[i];
            if(isPrime(arr[i])==true){
                return true;
            }
        }
        return sum==n;
    }
    public static void main (String [] args){
        System.out.println(primeFactors(30, new int[]{2, 3, 5}));
        System.out.println(primeFactors(28, new int[]{1, 20, 68}));
    }
}