package list.arraylist.implementation;

public class Main {

    public static void main(String[] args) {
    	// ArrayList.java ������ Ŭ���� �ν��Ͻ�ȭ
    	ArrayList numbers = new ArrayList(); 
    	// ������ ��ġ�� ������ �߰�
    	numbers.addLast(10);
    	numbers.addLast(20);
    	numbers.addLast(30);
    	numbers.addLast(40);
    	// �߰� ��ġ�� ������ �߰�
    	numbers.add(1, 15);
    	// ù��° ��ġ�� ������ �߰�
    	numbers.addFirst(5);
    	
    } // end of main

} // end of class