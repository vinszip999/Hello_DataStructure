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
    	for (int i=size-1; i<=index; i--) {
    		elementData[i+1] = elementData[i];
    	}
    	elementData[index] = element; // index�� ��� �߰�
    	size++; // ������Ʈ ���� 1 ����
    	return true;
    	
    } // end of add
    
} // end of class