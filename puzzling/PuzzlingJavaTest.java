
public class PuzzlingJavaTest {
    public static void main(String[] args){
      PuzzlingJava puzzle = new PuzzlingJava();

      // int[] arr = {3,5,1,2,7,9,8,13,25,32};
      // System.out.println(puzzle.sumAndGT(arr));

      // String[] arr = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
      // System.out.println(puzzle.shuffleAndGT(arr));
      // puzzle.shuffleDisplay();

      System.out.println(puzzle.randomTen());
      puzzle.sortedRandomTen();
      System.out.println(puzzle.genRandomString());
      System.out.println(puzzle.tenRandString());
 }
}
