//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

abstract class Animal {
  // Abstract method (does not have a baby)
  public abstract void animalSound();

  // Regular method
  public void sleep() {
      System.out.println("Zzz");
  }
}

class Pig extends Animal {
  public void animalSound() {
      // the body of animalSound is provided here
      System.out.println("the pig seys: wee wee");
  }
}


public class MainAbstract {

  public static void main(String[] args) {
      Pig myPig = new Pig(); // Create a Pig object
      myPig.animalSound();
      myPig.sleep();

  }

}