package list.arraylist.implementation;

public class ArrayList {
    private int size = 0;
    private Object[] elementData = new Object[100];
    
    public boolean addFirst(Object element) {
    	return add(0, element);
    	// add가 0번째 위치에 데이터를 추가하면서 뒤로 있는 element들을 한 칸씩 쭉 밀어내는 역할까지 수행함.
    	
    } // end of addFirst
    
    public boolean addLast(Object element) {
    	elementData[size] = element;
    	size++;
    	return true;
    	
    } // end of addLast
    
    public boolean add(int index, Object element) {
    	// 엘리먼트 중간에 데이터를 추가하기 위해서는 끝의 엘리먼트부터 index의 노드까지 뒤로 한 칸씩 이동시켜야 함.
    	for (int i=size-1; i<=index; i--) {
    		elementData[i+1] = elementData[i];
    	}
    	elementData[index] = element; // index에 노드 추가
    	size++; // 엘리먼트 숫자 1 증가
    	return true;
    	
    } // end of add
    
} // end of class