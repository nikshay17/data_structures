package BitMagic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
public class bitMagic9 {
    public static ArrayList<String> AllPossibleStrings(String s)
    {

        ArrayList<String> a=new ArrayList<String>();

        double pow=Math.pow(2,s.length());
        for(int counter=0;counter<(int)pow;counter++){
            String t="";
            for(int j=0;j<s.length();j++){
                if((counter&(1<<j))!=0){
                    t=t+s.charAt(j);


                }


            }a.add(t);
        }
        Collections.sort(a);
        a.removeAll(Arrays.asList("", null));
        // Code here
        return a;
    }
    public static void main(String[] args) {
        String s="nik";
        ArrayList<String> a=AllPossibleStrings(s);
    for(String i:a){
        System.out.print(i+" ");}
    }

}
