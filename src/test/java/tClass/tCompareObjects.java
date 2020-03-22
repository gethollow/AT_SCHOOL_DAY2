package tClass;
import testpackage.CompareObjects;

public class tCompareObjects {

    private static Object obj1 = new Object();
    private static Object obj2 = new Object();

    private static Object object1 = obj1.getClass();
    private static Object object2 = obj2.getClass();
    public static void testCompareObjects(){
        System.out.println(CompareObjects.compare(object1,object2));
        System.out.println(CompareObjects.compareToString(object1,object2));
        System.out.println(CompareObjects.compareHashCode(object1,object2));
        System.out.println(" ");


        System.out.println(CompareObjects.compareOne(obj1,obj1));
        System.out.println(" ");

        System.out.println(object1);
        System.out.println(object2);
        System.out.println(" ");

    }
}
