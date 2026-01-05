public class anagram{
    public static boolean isAnagram(String a, String b){
        String a1="";
        String b1="";
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=' '){
                a1+=Character.toLowerCase(a.charAt(i));
            }
        }
        for(int i=0;i<b.length();i++){
            if(b.charAt(i)!=' '){
                b1+=Character.toLowerCase(b.charAt(i));
            }
        }
        if(a1.length()!=b1.length()){
            return false;
        }
        for(int x=0;x<a.length();x++){
            char c=a1.charAt(x);
            int index=b1.indexOf(c);
            if(index==-1){
                return false;
            }
            b1 = b1.substring(0, index) + b1.substring(index + 1);
        }
        return true;
    }
    public static void main (String [] args){
        System.out.println(isAnagram("stop","pots"));
        System.out.println(isAnagram("car","hat"));
    }
}
