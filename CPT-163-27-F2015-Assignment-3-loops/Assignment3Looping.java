package assignment3looping;

import java.util.Scanner;

public class Assignment3Looping {

    public static void main(String[] args) {
        String word = "";
        
        do{
            String backwardsWord = "";
            print("Enter a word or QUIT to exit.\n");
            
            word = getWord();
            
            if(word.equals("QUIT")){
                print("\nThank you for using this program!");
            }else{
                for(int x=0;x<word.length();x++){
                    char curChar = word.charAt(x);
                    backwardsWord = curChar + backwardsWord;
                }
                print("\n" + backwardsWord);
            }
        }while(!word.equals("QUIT"));
    }
public static String getWord(){
    Scanner myWordInput = new Scanner(System.in);
    return myWordInput.next();
}  

public static void print(String str){
    System.out.println(str);
}
}

