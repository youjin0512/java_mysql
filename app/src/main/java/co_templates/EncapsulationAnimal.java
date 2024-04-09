package co_templates;

public class EncapsulationAnimal { 
    public int firstNum ;
    public int secondNum ;
    private int result ;

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