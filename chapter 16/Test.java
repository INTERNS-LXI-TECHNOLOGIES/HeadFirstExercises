
import java.util.ArrayList;
import java.util.List;

public class Test {


    public static void main(String[] args) {
        List<Dog> l = new ArrayList<Dog>();
        l.add(new Dog());
        
        // Type 
        System.out.println(l) ;
    }
 
}


class MyClass{


}
class Car{
}

class Animal{


}

class Dog extends Animal{

    public void woof()
    {
        System.out.println("woof");
    }

}

class Cat extends Animal {
    public void meow()
        {
System.out.println("meow");
        }
    
}