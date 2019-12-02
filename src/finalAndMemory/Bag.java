package finalAndMemory;

public class Bag {
    final String color;

    // final instance variable must be initialized
    // once it is initilized  then value for the color cannot be changed
    // Option 1; Intilized it rightaway . Give a value when declaring the
    // instance variables
    // Option 2: Initialize it within the constructor . Because instance variables cannot be used
    // without creating an object. If we use constructor  to initialize the FINAL INSTANCE VARIABLES, it allows,
    //Option 3: Instance initializer , it is used to initialize instance varaiables.
    // It is the same as static block but it is for non-static variables.
    // Instance initializer block gets executed right before constructor.
    // Why to use initializer block?
    // we could be running few different codes to bring a value to initialize
    // In initializer block we can write any code , but we can't write any
    // code at instance variable level.


    public Bag(){
        this.color="Red";

    }
    public Bag(String color){
        this.color=color;
    }
}
