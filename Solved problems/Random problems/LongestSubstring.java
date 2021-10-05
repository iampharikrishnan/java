import java.util.Scanner;

public class LongestSubstring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s=scan.nextLine();
        System.out.println(lengthOfStr(s));
        scan.close();
    }

    private static int lengthOfStr(String s) {
        int  startOfStr=0,length=0;
        String prevStr="";
        String currentStr="";
        for(int i=0;i<s.length();i++){
            if(currentStr.indexOf(s.charAt(i))!=-1){
                currentStr+=""+s.charAt(i);
            }
            else{
                length=Math.max(length, currentStr.length());
                startOfStr += s.indexOf(s.charAt(i))+1;
                i=startOfStr;
                if(prevStr.length()<currentStr.length())
                    prevStr=currentStr;
                currentStr="";
            }
        }
        return prevStr.length();
    }
    
}
