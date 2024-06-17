package POTD;

public class FindWordsThatCanBeFormedbyCharacters {
    public static int countCharacters(String[] words, String chars) {
        int[] charCount = new int[26];
        for(char ch : chars.toCharArray()){
            // Count all the character
            charCount[ch-'a']++;
        }

        int result = 0;
        for(String word : words){
            // Now check if this word is good
            int[] wordCount = new int[26];
            for(char ch : word.toCharArray()){
                wordCount[ch-'a']++;
            }

            boolean flag = true;
            for(int i = 0; i<26; i++){
                if(wordCount[i] > charCount[i]){
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                result += word.length();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] words = {"cat","bt","hat","tree"};
        String chars = "ctab";
        System.out.println(countCharacters(words,chars));
    }
}
