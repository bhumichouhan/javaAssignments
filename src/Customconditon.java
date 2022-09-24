public class Customconditon
{
    public static boolean getValidate() {
        int n1 = 0;
        int n2 = 90;
        boolean flag = n1 > 0 || n2 < 0;
        return flag;
    }
    public static void main (String[] args)
    {
//        custom conditon c = new customconditon();
//        customconditon.getValidate
        boolean flag = getValidate();
        System.out.println(flag);
    }
}



