package bsmith; //Brandon Smith 9/24/18

public class BSmithLib {
    public static void println(String str){
        System.out.println(str);
    }

    public static boolean isPalindrome(String word){
        String word1 = word;
        String word2 = "";
        for(int i = word.length()-1;i >= 0;i--){
            word2 += word1.substring(i);
            word1 = word1.substring(0,i);
        }
        if(word.equals(word2)){
            return true;
        }
        return false;
    }

    public static String dateStr(String date){
        return date.substring(3,5) + "-" + date.substring(0,2) + "-" + date.substring(6);
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

    public static int stringUnion(String word1,String word2,String word3){
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        word3 = word3.toLowerCase();
        int result = 0;
        String letter;
        for(int i = 97;i <= 124; i++){
            letter = Character.toString ((char) i);
            if(word1.contains(letter) && word2.contains(letter)){
                result++;
            } else if(word1.contains(letter) && word3.contains(letter)){
                result++;
            } else if(word2.contains(letter) && word3.contains(letter)){
                result++;
            }
        }
        return result;
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
        int primesfound = 0;
        String result = "";
        int test = 2;
        int factors = 0;
        while(primesfound < num) {
            for(int divisor = 1;divisor <= test; divisor++) {
                if (test % divisor == 0) {
                    factors++;
                }
            }
            if(factors == 2){
                result += test + " ";
                primesfound++;
            }
            test++;
            factors = 0;
        }
        System.out.println(result);
    }
}

