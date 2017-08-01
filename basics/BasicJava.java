import java.util.*;
public class BasicJava {
  // public void oneToTwoFiftyFive() {
  //   for (int i = 0; i < 256; i++) {
  //     System.out.println(i);
  //   }
  // }
  // public void oddNum() {
  //   for (int i = 1; i < 256; i += 2) {
  //     System.out.println(i);
  //   }
  // }

  // public void printSum() {
  //   int sum = 0;
  //   for (int i = 0; i < 256; i++) {
  //     sum += i;
  //     System.out.println("The new number:  " + i + " Sum:" + sum);
  //   }
  // }

  // public void interating(int[] givenArray) {
  //   int length = givenArray.length;
  //   for (int i = 0; i < length; i++) {
  //     System.out.println(givenArray[i]);
  //   }
  // }
  //
  // public void findMax(int[] givenArray) {
  //   int length = givenArray.length;
  //   int maxNum = givenArray[0];
  //   for (int i = 1; i < length; i++) {
  //     if (givenArray[i] > maxNum) {
  //       maxNum = givenArray[i];
  //     }
  //   }
  //   System.out.println(maxNum);
  // }
  //
  // public void getAverage(int[] givenArray) {
  //   int length = givenArray.length;
  //   float sum = 0;
  //   for (int i = 0; i < length; i++) {
  //     sum += givenArray[i];
  //   }
  //   System.out.println(sum/length);
  // }

  // public void arrayOfOdd() {
  //   ArrayList<Integer> myArray = new ArrayList<Integer>();
  //   for (int i = 1; i < 256; i += 2) {
  //     myArray.add(i);
  //   }
  //   System.out.println(myArray);
  // }

  // public void greaterThanY(int[] givenArray, int y) {
  //   int length = givenArray.length;
  //   int count = 0;
  //   for (int i = 0; i < length; i++ ) {
  //     if (givenArray[i] > y) {
  //       count ++;
  //     }
  //   }
  //   System.out.println(count);
  // }

  // public void squareTheVal(int[] givenArray) {
  //   int length = givenArray.length;
  //   for (int i = 0; i < length; i++) {
  //     givenArray[i] *= givenArray[i];
  //   }
  //   System.out.println(Arrays.toString(givenArray));
  // }

  public void eliminateNegaNum(int[] givenArray) {
    // this is building the an empty new array as below
    ArrayList<Integer> myArray = new ArrayList<Integer>();
    int length = givenArray.length;

    for (int i = 0; i < length; i++) {
      if (givenArray[i] <  0) {
        myArray.add(0);
      }
      else{
        myArray.add(givenArray[i]);
      }
    }
    System.out.println(myArray);
  }

  public void minMaxAver(int[] givenArray) {
    ArrayList<Integer> myArray = new ArrayList<Integer>();
    int length = givenArray.length;
    int minNum = givenArray[0];
    int maxNum = givenArray[0];
    float sum = 0;
    for (int i = 0; i < length; i++) {
      if (givenArray[i] > maxNum) {
        maxNum = givenArray[i];
      }
      if (givenArray[i] < minNum) {
        minNum = givenArray[i];
      }
      sum += givenArray[i];
    }
    System.out.println("The max number is: " + maxNum);
    System.out.println("The min number is: " + minNum);
    float avg = sum / length;
    System.out.println("The average number is: " + avg);
  }

  public void shiftingVal(int[] givenArray) {
    int length = givenArray.length - 1;

    for (int i = 0; i < length; i++) {
      givenArray[i] = givenArray[i+1];
    }
    givenArray[length] = 0;

    System.out.println(Arrays.toString(givenArray));
  }











}
