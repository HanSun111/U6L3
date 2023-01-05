import java.util.Arrays;
public class ArrayAlgorithms
{
    /** Prints each String in wordList, on its own line, followed by “!”.
     *  Does NOT mutate (modify) wordList.
     *  PRECONDITION: wordList.length > 0
     *
     *  @param wordList  original array of Strings; does not get modified
     */
    public static void printExclamation(String[] wordList){
        for(int i = 0; i < wordList.length; i++){
            System.out.println(wordList[i] + "!");
        }
    }
    /** Returns the sum of all values in numList.
     *  Does NOT mutate (modify) numList.
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  array of integers to find sum
     *  @return  the sum of all numbers in the list
     */
    public static int sum(int[] numList)
    {
        int sum = 0;
        for(int i = 0; i < numList.length; i++){
            sum = sum + numList[i];
        }
        return sum;
    }

    /** Returns the average of all values in numList, as a double.
     *  Does NOT mutate (modify) numList.
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  array of integers to find average
     *  @return  the average of all numbers in the list
     *
     *  Use your sum method for this! (don’t rewrite that logic!)
     */
    public static double average(int[] numList)
    {
        double ave = (double)ArrayAlgorithms.sum(numList)/ numList.length;
        return ave;

        }

    /** Returns the value in numList that represents the minimum value in numList.
     *  Does NOT mutate (modify) numList.
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  array of integers to find minimum
     *  @return  the minimum value in the array
     */
    public static int minimum(int[] numList)
    {
        int smol = numList[0];
        for(int i = 0; i < numList.length - 1; i++){
            if (numList[i + 1] < smol) {
                smol = numList[i + 1];
            }
        }
        return smol;
    }

    /** Returns the value in numList that represents the maximum value in numList.
     *  Does NOT mutate (modify) numList.
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  array of integers to find maximum
     *  @return  the maximum value in the array
     */
    public static int maximum(int[] numList)
    {
        int huge = numList[0];
        for(int i = 0; i < numList.length - 1; i++){
            if (numList[i + 1] > huge) {
                huge = numList[i + 1];
            }
        }
        return huge;
    }

    /** Multiplies each number in numList by multiplier.
     *  DOES mutate (modify) original numList.
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  original array of integers, modified by method
     *  @param multiplier  number to multiply each element in numList
     */
    public static void multiplyBy(int[] numList, int multiplier)
    {
        int[] numListNew = numList;
        for(int i = 0; i < numList.length ; i++) {
            numListNew[i] = numListNew[i] * multiplier;
        }
        System.out.println(Arrays.toString(numListNew));
        }

    /** Returns a NEW array containing the squares of the elements in the original
     *  numList array, in the same position.
     *  Does NOT mutate (modify) original numList.
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  original array of integers to be squared
     *  @return  new array containing squares of the values in numList
     */
    public static int[] squares(int[] numList)
    {
        int[] numListNew = numList;
        for(int i = 0; i < numList.length ; i++){
            numListNew[i] = numListNew[i] * numListNew[i];
        }
        System.out.println(Arrays.toString(numListNew));
    }

}


