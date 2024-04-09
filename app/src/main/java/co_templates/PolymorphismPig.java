package co_templates;

public class PolymorphismPig extends PolymorphismAnimal{
    // 상속된 method 수정하는것 : overriding
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}
