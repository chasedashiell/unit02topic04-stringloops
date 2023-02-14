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
    int[] solution = new int[count];
    count = 0;
    for (int i = text.length() - 1; i >= 0; i--){
      String sub = text.substring(i, i+1);
      if (sub.indexOf(searchTerm) != -1){
        solution[count] = i;
        count++;
      }
    }
    return solution;
  }

  public static void main(String[] args) {

    // testing of static methods goes here
    //System.out.println(reverseCharacters("taco cat"));
    System.out.println(Arrays.toString(indexesOfAll("c", "attack")));
  }
}