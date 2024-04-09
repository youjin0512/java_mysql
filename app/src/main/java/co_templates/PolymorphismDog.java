package co_templates;

public class PolymorphismDog extends PolymorphismAnimal {
    // public void animalSound() {
    // System.out.println("The dog says: bow wow");
    // }
    public int speed(int kmeter){
        int result = (int) (kmeter * 1000) ; // km를 meter로 변경
        return result ;
    }
}