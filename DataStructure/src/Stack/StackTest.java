package Stack;

public interface StackTest {

	//进栈
	public void push(Object obj)throws Exception;
	//退栈
	public Object pop()throws Exception;
	//取栈顶
	public Object getTop()throws Exception;
	//判断栈空
	public boolean isEmpty()throws Exception;
}
