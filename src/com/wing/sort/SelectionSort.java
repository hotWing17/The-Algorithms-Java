package com.wing.sort;


/**
 * @Description：选择排序算法
 */
public class SelectionSort{
	
	public static void sort(Comparable[] a) {
		int N = a.length;
		
		//将a[i]和a[i+1...N]最小的数交换
		for(int i = 0; i < N; i++) {
			
			//最小数的下标
			int min = i;
			
			//找出i+1...N最小数的下标
			for(int j = i + 1; j < N; j++) 
				if(SortUtil.less(a[j], a[min]))min = j;
			
			SortUtil.exch(a, min, i);
		}
	}
	
	public static void main(String[] args) {
		Integer[] a = {23, 152, 0, 78, 68, 88, 17};
		sort(a);
		SortUtil.show(a);
	}
	
}


