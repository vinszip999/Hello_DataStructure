package list.arraylist.implementation;

public class Main {

    public static void main(String[] args) {
    	// ArrayList.java 파일의 클래스 인스턴스화
    	ArrayList numbers = new ArrayList(); 
    	// 마지막 위치에 데이터 추가
    	numbers.addLast(10);
    	numbers.addLast(20);
    	numbers.addLast(30);
    	numbers.addLast(40);
    	// 중간 위치에 데이터 추가
    	numbers.add(1, 15);
    	// 첫번째 위치에 데이터 추가
    	numbers.addFirst(5);
    	
    } // end of main

} // end of class