import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[] nums = {5, 10, 15, 12, 2, 6};
        ArrayAlgorithms.multiplyBy(nums, 6);

        // original numbers list IS modified
        System.out.println(Arrays.toString(nums));

    }

}


