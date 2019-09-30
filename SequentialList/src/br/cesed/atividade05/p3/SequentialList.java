package br.cesed.atividade05.p3;

import java.util.Arrays;

public class SequentialList {
	
	private static final int INITIAL_SIZE = 4;
	private static final int INCREASE_FACTOR = 2;
	private static final int INITICIAL_POSITION = 0;
	Object[] list = new Object[INITIAL_SIZE];
	public int inserted;
	
	
	public void addFirst(Object value){
		if(inserted == 0) {
			list[inserted] = value;
			inserted++;
		}else {
			movePositions();
			list[INITICIAL_POSITION] = value;
			inserted++;
		}
	}
	
	public void add(Object value){
		if(inserted == list.length) {
			doubleSize();
			list[inserted] = value;
			inserted++;
		}else {
			list[inserted] = value;
			inserted++;
		}
	}
	
	public int size() {
		return list.length;
	}
	
	public String orderedList() {
		order();
		return "SequencialList [list=" + Arrays.toString(list) + "]";
	}
	
	private void order() {
		for (int i = 1; i < list.length; i++){
			
			int aux = (int) list[i];
			int j = i;
			
			while ((j > 0) && ((int) list[j-1] > (int) aux)){
				list[j] = list[j-1];
				j -= 1;
			}
			list[j] = aux;
                
		}
	}
	
	private void movePositions() {
		Object[] tempList = new Object[list.length + 1];
		for (int i = 1; i < tempList.length; i++) {
			tempList[i] = list[i-1];
		}
		list = tempList;
	}
	
	private void doubleSize() {
		Object[] tempList = new Object[list.length * INCREASE_FACTOR];
		for (int i = 0; i < list.length; i++) {
			tempList[i] = list[i];
		}
		list = tempList;
	}

	@Override
	public String toString() {
		return "SequencialList [list=" + Arrays.toString(list) + "]";
	}
	

}
