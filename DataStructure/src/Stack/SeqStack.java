package Stack;

public class SeqStack {

	public static void main(String[] args){
		Stack mystack = new Stack();
		int test[] = {1,3,5,7,9};
		int n=5;
		
			try {
				for(int i=0;i<n;i++){
				mystack.push(new Integer(test[i]));
				}
				System.out.println("当前栈顶元素为："+mystack.getTop());
				System.out.println("当前出栈序列：");
				while(mystack.isEmpty()){
					System.out.println(mystack.pop());
				}
			} catch (Exception e) {
				
				System.out.println(e.getMessage());
			}
		
	}
}
