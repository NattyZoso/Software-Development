
public class GenericStackTest {

	public static void main(String[] args) {
		GenericStack<String> stack1 = new GenericStack<>();
		
		stack1.push("London");
		stack1.push("Paris");
		stack1.push("Berlin");
		stack1.push("Beijing");
		
		System.out.println(stack1.toString());
		
		GenericStack<Integer> stack2 = new GenericStack<>();
		
		stack2.push(1);
		stack2.push(2);
		stack2.push(3);
		stack2.push(4);
		
		System.out.println(stack2.toString());
	}

}
