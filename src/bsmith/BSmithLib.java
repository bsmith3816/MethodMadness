package bsmith;

public class BSmithLib {
    public static void println(String str){
        System.out.println(str);
    }
    public static String dateStr(String date){
        return date.substring(0,2) + "-" + date.substring(3,5) + "-" + date.substring(6);
    }
    public static String cutOut(String mainstr, String substr){
        int a = mainstr.indexOf(substr);
        if(a < 0)
            return mainstr;
        else if (a > 0)
        {
            return mainstr.substring(0,a) + mainstr.substring(a + substr.length());
        }
        return mainstr.substring(a + substr.length());
    }
    //Math Methods
    public static int sumUpTo(int num){
        int total = 0;
        for(int i=0; i<=num; i++) {
            total += i;
        }
        return total;
    }
    public static void primePrinter(int num){
        int n = 0;
        String result = "";
        int i = 2;
        int k = 0;
        while(n < num) {
            for(int j = 1;j <= i; j++) {
                if(i % j == 0){
                    k++;
                }
                if(k == 2){
                    result += i + " ";
                    n++;
                }
            }
            i++;
        }
        System.out.println(result);
    }
}

