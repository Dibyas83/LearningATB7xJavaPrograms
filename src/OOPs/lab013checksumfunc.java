package OOPs;

public class lab013checksumfunc {
    public static int checkSum(int one, int two){
        //Write your code here●
        // Declare the necessary variable●●
        int check;
        int sum = one + two;
        if (sum < 100) {
            check = 0;
                } else if (sum > 100) {
            check = 1;
                } else {
            check = 2;
                }
        //Change the return variable as well●●
        return check;
    }
}


