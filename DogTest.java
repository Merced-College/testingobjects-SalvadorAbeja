public class DogTest {

  public static void main(String[] args) {
    // A1: Create a Dog with no constructors defined.
    Dog dog1 = new Dog();

    // A2: Print the object directly.
    System.out.println("Printing dog1 directly:");
    System.out.println(dog1);
    
    Dog d1 = new Dog();
  
    System.out.println("\nDefaults for d1 fields (before any assignment):");
    System.out.println("name = " + d1.getName());   // expected: null
    System.out.println("age = " + d1.getAge());     // expected: 0
    System.out.println("breed = " + d1.getBreed()); // expected: null

    Dog d2 = new Dog(); // uses default constructor values
    System.out.println("\nd2 after default constructor:");
    System.out.println("name = " + d2.getName() + ", age = " + d2.getAge() + ", breed = " + d2.getBreed());

    Dog d3 = new Dog("Rex", 4, "Collie"); // uses parameterized constructor
    System.out.println("\nd3 after parameterized constructor:");
    System.out.println("name = " + d3.getName() + ", age = " + d3.getAge() + ", breed = " + d3.getBreed());

    System.out.println("\nPrinting objects after overriding toString():");
    System.out.println("d2 = " + d2);
    System.out.println("d3 = " + d3);

    System.out.println("\nMutating public fields directly:");
    //d3.age() = 5;      // direct write
    d3.setAge(5);
    //d3.name = "Max"; // direct write
    d3.setName("Max");
    System.out.println("After mutation, d3 = " + d3); // uses toString()
    
  } //ends main
} //ends class

