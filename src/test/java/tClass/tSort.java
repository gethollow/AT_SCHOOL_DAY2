package tClass;

import testpackage.Sort;

import java.util.Arrays;

public class tSort{

    private static int[] array = {2,4,6,8,10,20,40,80};

    public static void testSort(){
        System.out.println(Arrays.toString(Sort.reverseSort(array)));
    }

}
