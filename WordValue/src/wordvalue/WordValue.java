package wordvalue;

public class WordValue {

    public static void main(String[] args) {
        int wordAsciiValue;
        char char1 = 'O';
        char char2 = 'r';
        char char3 = 'd';
        char char4 = 'o';
        
        wordAsciiValue = (int)char1 + (int)char2 + (int)char3 + (int)char4;
                
        System.out.println("The sum of the ascii values of the 4 letters of Ordo is " + wordAsciiValue);
    }
    
}
