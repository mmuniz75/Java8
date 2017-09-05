package others;

import java.util.LinkedList;
import java.util.Queue;

public class QueueFeature {

	public static void main(String args[]) {
		Queue<String> queue = new LinkedList<String>();

		queue.add("Marcelo");
		queue.add("Carol");
		queue.add("Fafael");
		queue.add("Fabiola");
		
		queue.stream().forEach(System.out::println);
		
		System.out.println("----------------");
		System.out.println(queue.peek());
		System.out.println("----------------");
		queue.stream().forEach(System.out::println);
		System.out.println("----------------");
		
		System.out.println(queue.poll());
		System.out.println("----------------");
		queue.stream().forEach(System.out::println);

	}

}
