package quests;

import java.util.Scanner;

public class AdditionsSub {
    public void methodsSubs() {
        System.out.println("MethodsSubs - MethodsSubs()");
    }

    // 접근자 리턴 메소드이름(파라메터){
    // return 0;
    // }
    public void methoodsSubs() {
        System.out.println("methodssubs - methodsSubs()");
    }

    // with params
    /*
     * public void methodsSubsWithParams(String fname, int count){
     * System.out.
     * println("MethodsSubs - methodsSubsWithParams(String fname, int count)");
     * System.out.println("params : fname-"+fname);
     * return ;
     * }
     */
    public int methodsSubsWithParams(int firstNumber, int secondNumber) {
        System.out.println("MethodsSubs - methodsSubsWithParams(int firstNumber, int secondNumber)");
        System.out.println("params : firstNumber-" + firstNumber + ", secondNumber-" + secondNumber);
        int resultNumber = firstNumber + secondNumber;
        System.out.println("result = " + resultNumber);
        return resultNumber;
    }
    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);

    //     System.out.print("firstNumber");
    //     int firstNumber = scanner.nextInt();
    //     System.out.print("secondNumber");
    //     int secondNumber = scanner.nextInt();
    //     int resultNumber = firstNumber + secondNumber;
    //     System.out.print("result = " + resultNumber);

    //     scanner.close();
    }