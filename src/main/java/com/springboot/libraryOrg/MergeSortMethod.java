package com.springboot.libraryOrg;

public class MergeSortMethod {
	
	public Comparable[] mergeSort(Comparable[] inputList) {
		if(inputList.length <= 1) {
			return inputList;
		}
		Comparable[] list1 = new Comparable[inputList.length/2];
		Comparable[] list2 = new Comparable[inputList.length - list1.length];
		System.arraycopy(inputList, 0, list1, 0, list1.length);
		System.arraycopy(inputList, list1.length, list2, 0, list2.length);
		mergeSort(list1);
		mergeSort(list2);
		merge(list1, list2, inputList);
		return inputList;
	}
    
	public void merge(Comparable[] list1, Comparable[] list2, Comparable[] resultList) {
		int indexOfList1 = 0;
		int indexOfList2 = 0;
		int indexOfMergedList = 0;
		while(indexOfList1 < list1.length && indexOfList2 < list2.length) {
			if(list1[indexOfList1].compareTo(list2[indexOfList2]) < 0) {
				resultList[indexOfMergedList] = list1[indexOfList1];
				indexOfList1++;
			}
			else {
				resultList[indexOfMergedList] = list2[indexOfList2];
				indexOfList2++;
			}
			indexOfMergedList++;
		}
		System.arraycopy(list1, indexOfList1, resultList, indexOfMergedList, list1.length - indexOfList1);
		System.arraycopy(list2, indexOfList2, resultList, indexOfMergedList, list2.length - indexOfList2);
	}
}
