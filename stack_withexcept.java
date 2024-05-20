import java.util.*;

class stack {
	int arr[];
	int top;


	stack() {
	arr = new int[10];
	top = 0;
	}

	public void push(int item)throws overflowexcept{
	if (top>=9){
	throw new overflowexcept("overflow error!");
	}
	top++;
	arr[top]= item;
	}

	public void pop()throws underflowexcept{
	if (top==0){
	throw new underflowexcept("underflow error!");
	}
	int item = arr[top];
	top--;
	System.out.println("item pooped: "+ item);
	}

	public static void main(String args[]){
		stack o = new stack();
		Scanner i = new Scanner(System.in);
		int c,item;
		while (true){
		c= i.nextInt();
		switch(c){
		case 1:
			item = i.nextInt();
			try{
			o.push(item);}
			catch(Exception e){
			System.out.println(e);}
			break;

		case 2:
			try{
			o.pop();}
			catch(Exception e){
			System.out.println(e);}
			break;

}
}
} 	

}


class overflowexcept extends Exception{
	overflowexcept(String str){
	super(str);
	}
}



class underflowexcept extends Exception{
	underflowexcept(String str){
	super(str);
	}
}
