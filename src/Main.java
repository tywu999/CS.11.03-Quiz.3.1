public class Main {

    // Question 1 - calculateGrade

    // Question 2 - fizzBuzz

    // Question 3 - frontBack

    // Question 4 - twoAsOne

    // Question 5 - endUp
    public static char calculateGrade(int a){
        if(a >= 90){
            return 'A';
        }
        if(a >=80 && a<90){
            return 'B';
        }
        if(a >= 70 && a<80){
            return 'C';
        }
        if(a >= 60 && a<70){
            return 'D';
        }
        if(a >= 50 && a<60){
            return 'E';
        }
        return 'F';
    }
    public static String fizzBuzz(int a){
        int b = a % 3;
        int c = a%5;
        if(b==0){
            if(c==0){
                return "fizzbuzz";
            }
            return "fizz";
        }
        if(c==0){
            return "buzz";
        }
        return "unlucky";
    }
    public static String frontBack(String str){
        if(str.length() > 2){
            String abc = str.substring(0, 2);
            return abc + str + abc;
        }
        if(str.length() == 2){
            return str + str + str;
        }
        return str;
    }
    public static boolean twoAsOne(int a, int b, int c){
        if(a+b == c){
            return true;
        }
        if(a-b == c){
            return true;
        }
        if(b-a == c){
            return true;
        }
        return false;
    }
    public static String endUp(String str){
        if(str.length() > 3){
            String bz = str.substring(str.length() - 3, str.length());
            String last = bz.toUpperCase();
            return str.substring(0, str.length()-3) + last;
        }
        String last = str.toUpperCase();
        return last;
    }
}


