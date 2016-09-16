import java.util.Scanner;
/*
 * �ļ����ƣ�����ָOffer���������Թپ������ͱ����(�����)��������41����ΪS����������
 * ʱ�䣺2016-8-24 22:44
 * ˵����1������һ����������������һ������S���������в���������ʹ��
 * ���ǵĺ�������S��
 * */

public class TwoNumbersWithSum {

	public static boolean FindTwoNumbersWithSum(int []a,int sum)
	{
		boolean isFound=false;
		if(a==null){
			return isFound;
		}
		int begin=0;
		int end=a.length-1;
		long currentSum=0;
		while(begin<end){
			currentSum=a[begin]+a[end];
			while((currentSum==sum)&&(begin<end)){
				isFound=true;
				System.out.println(a[begin]+","+a[end]);
				++begin;
				--end;
				if(begin<end){
					currentSum=a[begin]+a[end];
				}
				
			}
			if(currentSum>sum){
				end--;
			}
			begin++;
		}
		
		return isFound;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			int n=in.nextInt();
			int []a=new int[n];
			for(int i=0;i<n;i++){
				a[i]=in.nextInt();
			}
			int sum=in.nextInt();
			FindTwoNumbersWithSum(a, sum);
		}
	}

}
