package kuyrukqueue4;
public class kuyrukqueu {
	int size;
	int count;
	Node front;
	Node rear;
	public kuyrukqueu(int size) {
		count=0;
		front=null;
		rear=null;
		this.size = size;
	}
	void enqueu(int data ) {
		Node eleman =new Node(data);
		if (dolumu()) {
			System.out.println("kuyruk dolu");
		}else if (bosmu()) {
			front=eleman;
			rear=eleman;
		}else {
			rear.next=eleman;
			rear=eleman;
		}
		count++;
	}
	
	void dequeu() {
		if (bosmu()) {
			System.out.println("kuyruk bos");
		}else {
			front=front.next;
		}
		count--;
	}
	boolean dolumu(){
		return count==size;
	}
	boolean bosmu() {
		return count==0;
	}
	
	void yazdır() {
		if (bosmu()) {
			System.out.println("bos");
		}else {
			Node temp=front;
			while(temp!=null) {
				System.out.print(temp.data + ">");
				temp=temp.next;
			}
		}
	}
	int kacelemanvar() {
		if (bosmu()) {
			return 0;
		}else {
			int kaceleman=0;
			Node temp=front;
			while(temp!=null) {
				temp=temp.next;
				kaceleman ++;
			}
			System.out.println(kaceleman + " elemanlı lıste ");
			return kaceleman;
		}
	}
}
