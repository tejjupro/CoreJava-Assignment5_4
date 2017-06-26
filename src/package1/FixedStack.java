package package1;          //This java file is inside package named package1 inside src folder.

public class FixedStack implements Stack      //Class declaration implementing Stack interface.
{
	int stackArray[];         //Array will contain the elements of stack.
	int top=-1;              //It will locate the top element.
	int maxSize;             //maxSize of stack.
	int size;                //Instantaneous size of stack.
	
	public FixedStack(int maxSize)         //Constructor.
	{
		this.maxSize=maxSize;            //Initialize the maxSize.
		stackArray=new int[maxSize];     //creating array of maxSize size.
		size=0;
	}
	
	public void push(int I)           //Function to push element into stack.
	{
		if(top+1==maxSize)             //Checking weather Stack is full or not.
		    {
			 System.out.println("Stack Overflow");
			 return ;
			}
		stackArray[++top]=I;         //Pushing value into array.
		size++;          //Increasing the instantaneous size.
		System.out.println(I+" is pushed into the Stack");
	}
	
	public int pop()      //Function to pop the element from stack.
	{
		if(top==-1)          //Checking weather the stack is empty or not.
		{
			System.out.println("Stack is Empty");
			return -1;
		}
		size--;         //Decreasing the size by one.
		return stackArray[top--];      //Returning the popped out element.
	}
}      //End of class.