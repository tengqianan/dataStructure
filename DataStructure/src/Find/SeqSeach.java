package Find;
//无序查找
public class SeqSeach {

	public static int seqSeach(int[] a,int elem){
		int n = a.length;
		int i=0;
		while(i<n && a[i]!= elem){
			i++;
		}
		if(i==n){
			return -1;
		}else{
			return i+1;
		}
	}
	public static void main(String[] args){
		int[] test={1,2,3,4,5,6,7,8,9};
		int elem=5;
		int res = seqSeach(test,elem);
		if(res!=-1){
			System.out.println("查找成功！查找元素在第"+res+"个元素");
		}
		else{
			System.out.println("查找失败！");
		}
	}
}
