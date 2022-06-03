class Stack{
    //stack implementation via object and class
    //stack LIFO(last in first out)
private int[] array; // just array declaration for stack 
private int top=-1; 
public Stack(int size){
    this.array=new int[size]; //constructor

}

//instance methods
public void push(int n){
if(this.top==array.length-1) //index starts with zero
System.out.println("stack is full");
else{
    array[++top]=n; //increment top by one and push n to that index

}



}


public void pop(){
 if(this.top==-1){ //check if stack is empty, if it is empty it can not be removed.
 System.out.println("stack is empty");
 }
 else{
     array[top--]=0; //first remove the element from top then decrement top by one.
 }
}

public void printStack(){
System.out.println("[");
for(int elements:array){ //for each loop
System.out.println(elements+",");
}
System.out.println("\b]");
}





//main method to run program via object
public static void main(String[] args) {
 Stack s=new Stack(5);//object creation and array creation with size 5
 s.printStack();
 s.pop();
 s.push(5);
 s.printStack();
 s.pop();
 s.printStack();
 s.push(6);
 s.push(8);
 s.push(9);
 s.printStack();
 s.pop();
 s.printStack();
}


}