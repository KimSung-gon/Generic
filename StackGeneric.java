package homework;

public class StackGeneric {
	public static void main(String arg[]){
		Stack<Integer> stackInteger = new Stack<Integer>();	
		stackInteger.push(1);
		stackInteger.push(2);
		System.out.println(stackInteger.pop());
		System.out.println(stackInteger.pop());
		
		Stack<String> stackString = new Stack<String>();	
		stackString.push("Kookmin University");
		stackString.push("Korea Seoul");
		System.out.println(stackString.pop());
		System.out.println(stackString.pop());
	}
}

class Stack<T> {
	
	Node<T> top;
	
	Stack(){
		top = null;
	}
	
	public T pop() {
		T tmp = top.data;
		top = top.next;
		return tmp;
	}
	
	public void push(T data) {
		Node<T> newNode = new Node<T>(data);
		if(top == null)
			top = newNode;
		else{
			newNode.next = top;
			top = newNode;
		}
		
	}
}

class Node<T>{
	
	Node<T> next;
	T data;
	
	public Node(T data) {
		this.data = data;
	}
}

