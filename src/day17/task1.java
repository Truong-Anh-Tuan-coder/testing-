package day17;

public class task1 {
	public static void main(String[] args) {

		myLinkedNode myLinkedNode= new myLinkedNode();
		for( int i = 0 ; i < 6 ; i++){
			myLinkedNode.addNode(i+1);
		}
//		myLinkedNode.getSize();
		myLinkedNode.getMiddleNode();
	}
}
