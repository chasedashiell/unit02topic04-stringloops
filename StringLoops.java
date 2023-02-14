import java.util.Arrays;

public class StringLoops {

  public static String reverseCharacters(String word){
    String newWord = word.substring(word.length());
    int prevPos = word.length();
    for (int pos = word.length()-1; pos >= 0; pos--){
      newWord += word.substring(pos, prevPos);
      prevPos = pos;
    }
    return newWord;
  }

  public static int[] indexesOfAll(String searchTerm, String text) {
    int count = 0;
    for (int i = text.length() - 1; i >= 0; i--){
      String sub = text.substring(i, i+1);
      if (sub.indexOf(searchTerm) != -1){
        count++;
      }
    }
    if (count == 0){
      System.out.println("The letter you entered is not in the word you entered.");
      return null;
    }
    int[] solution = new int[count];
    count = 0;
    for (int i = 0; i <= text.length() -1; i++){
      String sub = text.substring(i, i+1);
      if (sub.indexOf(searchTerm) != -1){
        solution[count] = i;
        count++;
      }
    }
    return solution;
  }

  public static boolean hasRepeatedConsecutives(String word){
    for (int i = 0; i <= word.length()-2; i++){
      String letter1 = word.substring(i, i+1);
      String letter2 = word.substring(i+1, i+2);
      if (letter1.equals(letter2)){
        return true;
      }
    }
    return false;
  }

  public static String reverseWords(String sentence) {
    String newSentence = " " + sentence + " "; 
    int count = 0; 
    boolean lastSpace = false;
    int index2 = 0;
    int index1 = 0;
    String sol = " ";
    for (int i = newSentence.length(); i > 0; i--){
      boolean add = false;
      if(newSentence.substring(i-1, i).equals(" ") && lastSpace){
        count++;
        System.out.println(count);
        index1 = i;
        System.out.println("index1: " + index1);
        System.out.println("index2: " + index2);
        sol += newSentence.substring(index1, index2);
        index1=index2;
        index2 = 0;
        lastSpace = false;
      }if (newSentence.substring(i-1, i).equals(" ") && !lastSpace){
        lastSpace = true;
        index2 = i;
      }

    }
    System.out.println(count);
    return sol;
  }

  public static void main(String[] args) {

    //testing of static methods goes here
    //System.out.println(reverseCharacters("taco cat"));
    //System.out.println(Arrays.toString(indexesOfAll("b", "attack")));
    //System.out.println(hasRepeatedConsecutives("alibi"));
    System.out.println(reverseWords("cat taco"));
  }
}