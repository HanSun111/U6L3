import java.util.Arrays;
public class ArrayAlgorithms
{

    public static void printExclamation(String[] wordList){
        for(int i = 0; i < wordList.length; i++){
            System.out.println(wordList[i] + "!");
        }
    }

    public static int sum(int[] numList)
    {
        int sum = 0;
        for(int i = 0; i < numList.length; i++){
            sum = sum + numList[i];
        }
        return sum;
    }


    public static double average(int[] numList)
    {
        double ave = (double)ArrayAlgorithms.sum(numList)/ numList.length;
        return ave;

        }


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


    public static void multiplyBy(int[] numList, int multiplier)
    {
        int[] numListNew = numList;
        for(int i = 0; i < numList.length ; i++) {
            numListNew[i] = numListNew[i] * multiplier;
        }
        System.out.println(Arrays.toString(numListNew));
        }


    public static int[] squares(int[] numList)
    {
        int[] numListNew = new int[numList.length];
        for(int i = 0; i < numList.length ; i++){
            numListNew[i] = numList[i] * numList[i];
        }
        return numListNew;
    }


    /** Switches each boolean value in boolList to its opposite value; true values
     *  becomes false, and false values become true.
     *  DOES mutate (modify) original boolList.
     *  PRECONDITION: boolList.length > 0
     *
     */

    public static void flipBool(boolean[] boolList) {
        for(int i = 0; i < boolList.length ; i++){
            if(boolList[i]){
                boolList[i] = false;
            }
            else
                boolList[i] = true;
        }
        System.out.println(Arrays.toString(boolList));
    }
    /** Returns a String representing the array of ints as a printable String,
     *  including open and closing brackets, with values separated by commas.
     *  This method should function identically to Arrays.toString()!

     *  Does NOT mutate (modify) original numList.
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  original array of ints to be represented in String form
     */
    public static String customToString(int[] numList){
        String sameShite = "";
        for(int i = 0; i < numList.length; i++){
            sameShite = sameShite + numList[i] + ", ";

        }
        sameShite = sameShite.substring(0, sameShite.length() - 2);
        return "[" + sameShite + "]";
    }

}


