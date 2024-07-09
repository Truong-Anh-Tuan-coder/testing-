package day17;

public class myLinkedNode {
	int size = 0;
	Node head = null;

	class Node{
		int data;
		Node next;

		public Node(){

		}

		public Node(int data){
			this.data = data;
			this.next = null;
		}
	}

	public void addNode(int data){
		Node newNode = new Node(data);
		if( size == 0 ){
			head = newNode;
		} else {
			Node temp = head;
			while( temp.next != null){
				temp = temp.next;
			}
			temp.next = newNode;
		}
		size++;
	}

	public int getNode(int index){
		Node temp = new Node();
		temp =head;
		if(index > size || index < 0 ){
			System.out.println("Blyat! stop trolling me!");
		}
		else{
			for( int i = 0 ; i < size + 1; i ++){

				if ( i == index ){
					return temp.data;
				} else{
					temp = temp.next;
				}
			}
		}
		return -1;
	}

	public void getMiddleNode(){
		if(size % 2 == 0){
			int temp =size ;
			temp ++ ;
			System.out.println("Middle number is: " + getNode(temp/2));
		}else{
			System.out.println("Middle number is: " + getNode(size/2));
		}
	}
	public void getSize(){ System.out.println(this.size);}

}
