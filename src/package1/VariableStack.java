package package1;
//This java file is inside package named package1 inside src folder.

public class VariableStack implements Stack    //Class declaration which implements the interface Stack.
{
int stackArray[];        //Array to store elements.
int top=-1;        //Locate the top element of the stock.
int maxSize;       //maximun size of stack.
int size;         //Instantaneous size of stack.

public VariableStack(int maxSize)    //Constructor.
{
	this.maxSize=maxSize;          //maximum size of stack.
	stackArray=new int[maxSize];     //creating array of given size.
	size=0;
}

public void push(int I)      //Function to push the element into stack.
{
	if(top+1==maxSize)      //checking weather the size of stack is needed to increase or not.
		growArraySize();
	stackArray[++top]=I;        //Pushing Array in the element.
	size++;        //Increamenting size of array.
	System.out.println(I+" is pushed into stack");
}

public int pop()       //Function to pop elememt from the stack.
{
	if(top==-1)      //Check weather the stack is empty or not.
	{
		System.out.println("Stack is empty");
		return -1;
	}
	size--;       //Decreamenting the size of array.
	return stackArray[top--];        //Returning the popped out element.
}

public void growArraySize()     //Function to increase the size of array.
{
	int temp[]=new int[2*maxSize];      //creating the temporary array.
	for(int i=0;i<size;i++)          //Copying elements in the temporary array.
		temp[i]=stackArray[i];
	stackArray=temp;          //Assigning the temporary array to stack array.
	maxSize=2*maxSize;        //Doubling the maximum Size.
	System.out.println("Stack array size is doubled");
}
}    //End of class..