package LinearList;

public  class LinearList implements List {
	
	final int defaultSize = 10;
	int maxSize;   //线性表长度
	int size;      //线性表元素个数
	Object[] listArray;
	
	LinearList(){
		initiate(defaultSize);
	}

	LinearList(int size){
		initiate(size);
	}
	
	public void initiate(int Size) {
		maxSize = Size;
		size = 0;
		listArray = new Object[Size];
		
	}

	
	public void insert(int i, Object obj) throws Exception {
	
		if(size == maxSize){
			throw new Exception("线性表已满，无法插入！");
		}
		if(i>size){
			throw new Exception("插入下标位置错误！");
		}
		for(int j=size;j>i;j--){
			listArray[j]=listArray[j-1];
		}
		listArray[i]=obj;
		size++;
	}

	
	public Object delete(int i) throws Exception {
		if(size == 0){
			throw new Exception("线性表已空，无法删除！");
		}
		if(i>size-1){
			throw new Exception("删除下标位置错误！");
		}
		Object it = listArray[i];
		for(int j=i;j<size-1;j++){
			listArray[j]=listArray[j+1];
		}
		size--;
		return it;
	}

	@Override
	public void update(int i, Object obj) throws Exception {
		if(size == 0){
			throw new Exception("线性表已空，无法替换！");
		}
		if(i>size-1){
			throw new Exception("获取下标位置已空！");
		}
		listArray[i]=obj;
		
	}

	@Override
	public Object getData(int i) throws Exception {
		if(size == 0){
			throw new Exception("线性表已空，无法获取下标！");
		}
		if(i>=size){
			throw new Exception("获取下标位置错误！");
		}
		return listArray[i];
	}

	@Override
	public int size() {
		
		return size;
	}

	@Override
	public boolean isEmpty() {
		
		return size==0;
	}

}
