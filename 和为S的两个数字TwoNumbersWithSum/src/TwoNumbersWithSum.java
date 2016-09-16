import java.util.Scanner;
/*
 * 文件名称：《剑指Offer：名企面试官精讲典型编程题(纪念版)》面试题41：和为S的两个数字
 * 时间：2016-8-24 22:44
 * 说明：1、输入一个递增排序的数组和一个数字S，在数组中查找两个数使得
 * 他们的和正好是S。
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
