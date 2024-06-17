package DynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class p {
    static List<Integer> list1=new ArrayList<>();
    static List<Integer> list2=new ArrayList<>();

    public static void main(String[] args) {
        String s1="abac";
        String s2="cab";
        System.out.println(shortestSupersequence(s1,s2));
    }
    public static String shortestSupersequence(String s1, String s2) {
        int i, j,n=s1.length(),m=s2.length();

        int t[][] = new int[n + 1][m + 1];
        for (i = 1; i < n + 1; i++) {
            for (j = 1; j < m + 1; j++) {
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    t[i][j]=1+t[i-1][j-1];
                }
                else{
                    t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
                }
            }
        }
        StringBuilder str=new StringBuilder();
        function(t,str,n,m,s1,s2);
        System.out.println(str.toString());
        helper(s1,s2,str);
        return str.toString();
    }
    static void function(int t[][],StringBuilder str,int n,int m,String s1,String s2){
        if(n==0||m==0){
            return ;
        }
        if(s1.charAt(n-1)==s2.charAt(m-1)){
            function(t,str,n-1,m-1,s1,s2);
            str.append(s1.charAt(n-1));
            list1.add(n-1); list2.add(m-1); // stores the index of matched character

        }
        else{
            if(t[n-1][m]>t[n][m-1]){
                function(t,str,n-1,m,s1,s2);
            }
            else{
                function(t,str,n,m-1,s1,s2);
            }

        }

    }


    static void helper(String s1,String s2,StringBuilder str){

        String s="";

        int i=0,j=0,k=0,gap=0,next=0,nextofN=0;

        if(list1.get(j)!=0){
            s=s1.substring(0, list1.get(j));
            str.insert(i,s);
            i+=s.length();
        }


        if(list2.get(k)!=0){
            s=s2.substring(0, list2.get(k));
            str.insert(i,s);
            i+=s.length();

        }


        while(j!=list1.size()-1 || k!=list2.size()-1){
            if(j!=list1.size()-1){
                next=list1.get(j)+1;
                nextofN=list1.get(j+1);
                s=s1.substring(next,nextofN);
                str.insert(i+1,s);
                gap+=s.length();
                j++;
            }


            if(k!=list2.size()-1){
                next=list2.get(k)+1;
                nextofN=list2.get(k+1);
                s=s2.substring(next,nextofN);
                str.insert(i+1,s);
                gap+=s.length();
                k++;
            }

            i+=gap+1;
            gap=0;
        }

        if(list1.get(j)!=s1.length()-1){
            s=s1.substring(list1.get(j)+1,s1.length());
            str.insert(i+1,s);
        }


        if(list2.get(k)!=s2.length()-1){
            s=s2.substring(list2.get(k)+1,s2.length());
            str.insert(i+1,s);
       }
   }
}