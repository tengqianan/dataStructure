package Stack;

public class Stack implements StackTest{
	
	final int defaultSize = 10;
	int top;//标记元素个数
	Object[] stack;
	int maxStackSize;
	
	public Stack(){
		initiate(defaultSize);
	}
	public Stack(int Size){
		initiate(Size);
	}

	private void initiate(int Size) {
		maxStackSize = Size;
		top = 0;
		stack = new Object[Size];
		
	}

	@Override
	public void push(Object obj) throws Exception {
		if(top == maxStackSize){
			throw new Exception("栈已满！");
		}
		stack[top]=obj;
		top++;
		
	}

	@Override
	public Object pop() throws Exception {
		if(top == 0){
			throw new Exception("堆栈已空");
		}
		top--;
		return stack[top];
	}

	@Override
	public Object getTop() throws Exception {
		if(top == 0){
			throw new Exception("堆栈已空");
		}
		return stack[top-1];
	}

	@Override
	public boolean isEmpty() throws Exception {
		
		return top>0;
	}

}
