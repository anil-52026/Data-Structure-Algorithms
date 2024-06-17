package POTD;

public class MaximumScore {
        public static int maxScore(String s) {
            int n = s.length();
            int count1 = 0;
            // int count2 = 0;
            int max = 0;
            int sum =0;
            for(int i = 0; i<n; i++){
                char ch = s.charAt(i);
                if(ch == '0'){
                    count1++;
                }

                int count2 = 0;
                for(int j = i+1; j<n; j++){
                    char che = s.charAt(j);
                    if(che == '1'){
                        count2++;
                    }
                }
                sum = count1 + count2;
                max= Math.max(sum,max);
            }
            return max;
        }
        public static void main(String[] args) {
        String s = "011101";
        System.out.println(maxScore(s));

    }
    }

