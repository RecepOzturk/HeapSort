import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int x;
		
		ArrayList<Integer> heap = new ArrayList<Integer>();
		x=sc.nextInt();
		heap.add(x);
		x=sc.nextInt();
		heap.add(x);
		x=sc.nextInt();
		heap.add(x);
		x=sc.nextInt();
		heap.add(x);
		x=sc.nextInt();
		heap.add(x);
		
		HeapSort.sort(heap);
		
		for (int i = 0; i < heap.size(); i++) {
			System.out.println(heap.get(i));
		}
		
	}
	

}
