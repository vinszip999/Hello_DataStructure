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
    	for (int i=size-1; i>=index; i--) {
    		elementData[i+1] = elementData[i];
    	}
    	elementData[index] = element; // index에 노드 추가
    	size++; // 엘리먼트 숫자 1 증가
    	return true;
    	
    } // end of add
    
    public String toString() {
    	String str = "[";
    	for(int i=0; i<size; i++) {
    		str += elementData[i];
    		if(i < size-1) {
    			str += ",";
    		} // end of if
    	} // end of for
    	
    	return str + "]";
    	
    } // end of toString
    
    public Object get(int index) {
    	return elementData[index];
    	// arrayList의 장점이 get에서 나타난다.
    	// arrayList는 내부적으로 배열을 사용한다. 
    	// 그리고 그 배열에다가 index값을 줘서 특정한 위치에 있는 element를 가져오기 때문에
    	// 배열의 인덱스로 접근한다는 장점이 생긴다.
    	// 즉 arrayList로 구현한 경우, 특정한 위치에 있는 데이터를 가져오는게 굉장히 빠르다. 
    
    } // end of get
    
    public int size() {
    	return size;
    	
    } // end of size
    
    public int indexOf(Object o) {
    	for(int i=0; i<size; i++) {
    		if(o.equals(elementData[i])) {
    			return i; // 현재 index값 리턴, for문 강제 종료
    		} // end of if
    	} // end of for
    	
    	return -1; // 찾는 값이 없다
    } // end of indexOf
    
} // end of class