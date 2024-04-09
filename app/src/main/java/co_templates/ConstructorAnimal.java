package co_templates;

public class ConstructorAnimal { 
    public int firstNum ;
    public int secondNum ;
    private int result ;

    public ConstructorAnimal(){
        System.out.println("ConstructorAnimal()");
    }

    public ConstructorAnimal(int firstNumber, int secondNumber){
        System.out.println("ConstructorAnimal(int firstNumber, int secondNumber)");
        this.firstNum = firstNumber;
        this.secondNum = secondNumber; // 생성자로 초기화
    }

    public void setResult(int number){
        this.result = number;
    }

    public int getResult(){
        return this.result;
    }


    public void animalSound() {
        System.out.println("The animal makes a sound");
    }

    public void byPass(int firstNumber, int secondNumber) {
        this.firstNum = firstNumber; // this.firstNum : 안(내부)에 있는 것, firstNumber : 밖에서 들어온 값
        this.secondNum = secondNumber;
        this.result = firstNumber + secondNumber;
        // this.result = result;
        return;
    }
}