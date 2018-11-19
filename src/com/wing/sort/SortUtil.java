package com.wing.sort;


/**
 * @Description：排序中需要使用到的一些工具（比较、交换、打印结果、判断是否排序完成）
 */
public class SortUtil {
	
	/**
	 * @Description: 比较两者大小(前者小则返回true)
	 * @return
	 */
	static boolean less(Comparable v, Comparable w) {return v.compareTo(w) < 0;}
	
	
	/**
	 * @Description: 交换传入下标的两个元素
	 */
	static void exch(Comparable[] a, int i, int j) {Comparable t = a[i];a[i] = a[j];a[j] = t;}
	
	
	/**
	 * @Description: 单行打印数组
	 */
	static void show(Comparable[] a) {
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	
	/**
	 * @Description: 判断传入数组是否已经排好序
	 */
	static boolean isSorted(Comparable[] a) {
		for(int i =  1; i < a.length; i++) {
			if(less(a[i], a[i-1]))return false;
		}
		return true;
	}
}
