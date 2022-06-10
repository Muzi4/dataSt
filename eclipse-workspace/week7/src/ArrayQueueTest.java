
public class ArrayQueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayQueue<Integer> aq = new ArrayQueue<>();
		Integer data;
		
		aq.enqueue(100);	aq.enqueue(200);
		aq.enqueue(300);	aq.enqueue(400);
		aq.printAll();
		data = aq.dequeue();
		aq.printAll();
	}

}
