package br.cesed.atividade05.p3;

public class TestList {

	public static void main(String[] args) {
		SequentialList list = new SequentialList();
		
		list.addFirst(1);
		list.add(2);
		list.add(3);
		list.addFirst(4);
		list.add(5);
		list.add(6);	
		list.add(7);
		list.add(8);
		list.addFirst(9);
		list.add(10);
		list.add(11);
		list.addFirst(12);
		
		System.out.println(list);
		
		System.out.println(list.orderedList());
		
		System.out.println(list.size());

	}
}
