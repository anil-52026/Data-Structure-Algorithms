package Tries;

public class TriesNode {
    char data;
    boolean isTerminating;
    TriesNode children[];

    // making constructor
    public TriesNode(char data){
        this.data = data;
        isTerminating = false;
        children = new TriesNode[26];
    }
}
 class Trie{
    private TriesNode root;
    public Trie(){
        root = new TriesNode('\0');
    }

    // Make another function
     private void add(TriesNode root, String word){

        // Base case
         if(word.length() == 0){
             root.isTerminating = true;
             return;
         }
         // we want to insert "NOTE" then
         // root ke corresponding check karna hai koi child hai ya nahi
         // root ke N ke corresponding koi child hai ya nhi . N wale index par null hai ya !null hai mean
         // child hai
         int childeIndex = word.charAt(0) - 'a';
         // agar mughe child chaiye to chiledindex pe para hoga
         TriesNode child = root.children[childeIndex];

         if(child == null){
             // hume node bana dena chaiye
             child = new TriesNode(word.charAt(0));
             root.children[childeIndex] = child;
         }
         // pass overhere child
         add(child,word.substring(1));
     }

    // Insert the word
     public void add(String word){
        // recursive call
         add(root,word);
    }


}
