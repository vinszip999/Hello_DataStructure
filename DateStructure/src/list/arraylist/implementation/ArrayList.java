package list.arraylist.implementation;

public class ArrayList {
    private int size = 0;
    private Object[] elementData = new Object[100];
    
    public boolean addFirst(Object element) {
    	return add(0, element);
    	// add�� 0��° ��ġ�� �����͸� �߰��ϸ鼭 �ڷ� �ִ� element���� �� ĭ�� �� �о�� ���ұ��� ������.
    	
    } // end of addFirst
    
    public boolean addLast(Object element) {
    	elementData[size] = element;
    	size++;
    	return true;
    	
    } // end of addLast
    
    public boolean add(int index, Object element) {
    	// ������Ʈ �߰��� �����͸� �߰��ϱ� ���ؼ��� ���� ������Ʈ���� index�� ������ �ڷ� �� ĭ�� �̵����Ѿ� ��.
    	for (int i=size-1; i>=index; i--) {
    		elementData[i+1] = elementData[i];
    	}
    	elementData[index] = element; // index�� ��� �߰�
    	size++; // ������Ʈ ���� 1 ����
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
    	// arrayList�� ������ get���� ��Ÿ����.
    	// arrayList�� ���������� �迭�� ����Ѵ�. 
    	// �׸��� �� �迭���ٰ� index���� �༭ Ư���� ��ġ�� �ִ� element�� �������� ������
    	// �迭�� �ε����� �����Ѵٴ� ������ �����.
    	// �� arrayList�� ������ ���, Ư���� ��ġ�� �ִ� �����͸� �������°� ������ ������. 
    
    } // end of get
    
    public int size() {
    	return size;
    	
    } // end of size
    
    public int indexOf(Object o) {
    	for(int i=0; i<size; i++) {
    		if(o.equals(elementData[i])) {
    			return i; // ���� index�� ����, for�� ���� ����
    		} // end of if
    	} // end of for
    	
    	return -1; // ã�� ���� ����
    } // end of indexOf
    
} // end of class