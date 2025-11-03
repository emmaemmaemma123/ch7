package ch3;
public class indexOfMax{
    public static int indexOfMax(int [] a){
        if(a.length == 0){
            return -1;
        }
        int maxnumber = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] < a[maxnumber]){
                maxnumber = i;
            }
        }
        return maxnumber;
    }
    public static void main (String [] args){
        int[] a = {2,4,6,8};
        int [] b = {9,4,0,1};
        
        System.out.println(indexOfMax(a));
        System.out.println(indexOfMax(b));
    }
}