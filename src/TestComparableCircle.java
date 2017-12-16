public class TestComparableCircle {
    public static void main(String[] args)
    {
        //objects creation
        ComparableCircle cc=new ComparableCircle(6);
        ComparableCircle cc1=new ComparableCircle(5);
        int res= cc.compareTo(cc1);
        System.out.println("Result: "+res);
    }
}
