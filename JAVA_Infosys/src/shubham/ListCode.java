package shubham;

import java.util.ArrayList;
import java.util.List;

public class ListCode {

	public static void main(String[] args) {
		List<Integer>integerList1=new ArrayList<>();
		integerList1.addAll(List.of(12,45,89,90,76));
		
		List<Integer>integerList2=new ArrayList<>();
		integerList1.addAll(List.of(12,45,89,90,70+6));
		
		List<Integer>integerList3=new ArrayList<>();
		integerList1.addAll(List.of(12,45,98,89,90,76));
		
		List<String>stringList=new ArrayList<>();
		for(Integer val:integerList1) {
			stringList.add(val.toString());
		}
			System.out.println("1:"+integerList1.equals(integerList1));
			System.out.println("2:"+integerList1.equals(integerList2));
			System.out.println("3:"+integerList1.equals(integerList3.remove(2)));
			System.out.println("4:"+integerList1.equals(stringList));
		
	}

}
