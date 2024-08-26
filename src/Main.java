public class Main {
    public static void main(String[] args) {
        printEqual(1,1,1);
        printEqual(1,1,2);
        printEqual(-1,-1,-1);
        printEqual(1,2,3);
        printEqual(1,2,1);
        printEqual(2,1,1);

    }

    public static void printYearsAndDays(long minutes){

        if (minutes < 0)
        {
            System.out.println( "Invalid Value");
            return;
        }
        long year = ((minutes /60) /24) /365;
        long day = ((minutes /60) /24) % 365;
        System.out.println(minutes + " min = " + year + " y and " + day + " d");

    }

    public static void printEqual(int num1, int num2, int num3){
        if(num1 < 0 || num2 < 0 || num3 < 0){
            System.out.println("Invalid Value");
            return;
        }

        if(num1 == num2){
            if(num2 == num3) {
                System.out.println("All numbers are equal");
            } else if (num2 != num3) {
                System.out.println("Neither all are equal or different");
            }
            return;
        }
        if(num1 != num2){
            if (num1 == num3) {
                System.out.println("Neither all are equal or different");
            } else if (num2 == num3) {
                System.out.println("Neither all are equal or different");
            } else {
                System.out.println("All numbers are different");
            }
        }

    }

}
