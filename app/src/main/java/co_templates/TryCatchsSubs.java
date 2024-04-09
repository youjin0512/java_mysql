package co_templates;

import java.util.ArrayList;
// 외부 입력
import java.util.Scanner;

public class TryCatchsSubs {
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
        int resultNumber = 0;
        try {
            // Block of code to try
            System.out.println("MethodsSubs - methodsSubsWithParams(int firstNumber, int secondNumber)");
            System.out.println("params : firstNumber-" + firstNumber + ", secondNumber-" + secondNumber);
            resultNumber = firstNumber + secondNumber;
        } catch (Exception e) {
            // Block of code to handle errors
        }
        return resultNumber;
    }

    // public static void main(String[] args) {
    // Scanner scanner = new Scanner(System.in);

    // System.out.print("firstNumber");
    // int firstNumber = scanner.nextInt();
    // System.out.print("secondNumber");
    // int secondNumber = scanner.nextInt();
    // int resultNumber = firstNumber + secondNumber;
    // System.out.print("result = " + resultNumber);

    // scanner.close();
    // }

    public int returnException(int firstNumber) {
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(1);
        myNumbers.add(2);
        myNumbers.add(3);

        int result = 0;
        try {
            System.out.println(myNumbers.get(10));
            result = myNumbers.get(10);
        } catch (Exception e) {
            System.out.println("catch (Exception e)" + e.getMessage());
            result = myNumbers.get(0);
        }
        return result;
    }
}