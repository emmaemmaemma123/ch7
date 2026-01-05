public class letterHist{
    public static int [] histo(String str){
        int [] histo=new int[26];
        for (int i=0;i<str.length();i++){
            char c = str.charAt(i);
            int index=c-'a';
            histo[index]++;
        }
        return histo;
    }
    public static void main(String [] args){
        int [] arr = histo("abcdefghijklmnopqrstuvwxyz");
        int [] arr2 = histo("apscholar");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}