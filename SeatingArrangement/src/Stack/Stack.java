package Stack;

public class Stack {

    private int max; // declare the max value of the stack
    private int top;  // declare the top
    int [] arr = new int[max]; // instantiate the array to the an new array to the value of the max

    //default constructor
    Stack() {
        top = -1; // this means we declare the top as -1 mean it is an imaginary index for now
    }

    //method
    //this method set the size of the maximum element in an array
    public void setMax(int size) {
        arr = new int[size];
        max = size;
        top = -1;
    }

    //push method
    public void push (int x){
        if (top == max -1){
            // if top is equal max -1 means if the max is out of bounds
            // this can also be can as if ( top > max );
            System.out.println("Stack Overflow");
            System.exit(1);// this means we not execute the code below
                                 // that return means exit the program
        }
        else {
            top++;
            // means we increment the top for example if you s.push (12) ,
            // the element will be push at the index 0
            arr[top] = x;
            // arr[++top] = x , same code from above (shortcut) means pre-increment operator
            System.out.println(x + " Stack pushed");
            // prints the element push
        }
    }

    // pop method
    public void pop (){
        if (top == -1){ // this means if the top has already lesser value of 0
            System.out.println("Stack Underflow");
            System.exit(1); // exit if the condition is true
        }
        else {
            System.out.println(arr[top] + " will be pop");
            top--; // this means if you pop the top will be decrement means the top will be remove
        }
    }

    //peek
    //this method will just simply return the value of top
    public void peek (){
        if (top == -1){
            System.out.println("Stack underflow");
           System.exit(1);
        }
        else{
            System.out.println("The top of the Stack is " + arr[top]);
        }
    }

    // this methods prints the stack
    public void print (){
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
