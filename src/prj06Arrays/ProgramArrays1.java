package prj06Arrays;

import java.util.Arrays;

public class ProgramArrays1 {

	public static void main(String[] args) {
		//1. В одномерном массиве сначала положительные потом отрицательные за один проход по массиву.
		/*int [] arr = {5,2,6,4,1,3,-3,-5,-6} ;
		Arrays.sort(arr);
		for(int i = 0; i <  arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println("");
		
		int n = arr.length;
		//Переменная, которая будет использоваться при обмене элементов
		int temp;
 
		for (int i = 0; i < n/2; i++) {
		    temp = arr[n-i-1];
		    arr[n-i-1] = arr[i];
		    arr[i] = temp;
		}
		//Выводим конечный массив в консоль
		for (int i=0; i<arr.length; i++){
			System.out.print(arr[i] +"  ");
		}
		*/
		//1. В одномерном массиве сначала положительные потом отрицательные за один проход по массиву.
		int [] arr = {5,2,6,4,1,3,-3,-5,-6} ;
		int ibeg = 0 ;
		int iend = arr.length-1 ;
		for (; ibeg < iend; ibeg++) {
			if(arr[ibeg]<0) 
			for (; iend > ibeg; iend--) {
				if(arr[iend]>0) {
					int t = arr[ibeg];
					arr[ibeg]=arr[iend];
					arr[iend]=t;
					break;
				}
			}
		}
		for (int i : arr) {
			System.out.print(i+"  ");
		}
		
		
	}

}
