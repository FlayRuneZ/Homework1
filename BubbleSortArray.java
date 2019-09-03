

import java.util.Calendar;

public class BubbleSortArray {
	private int [] element;
	private int eSize;
	
	public BubbleSortArray(int size) {
		if (size > 0)
			this.element = new int[size];
		else
			this.element = new int[10];
		
		eSize = 0;	
	}
	
	public void insert(int e) {
		this.element[eSize] = e;
		eSize++;
	}
	
	public void show() {
		for(int i=0; i < eSize; i++) {
			System.out.print(this.element[i]+" ");
		}
		
		System.out.println("");
	}
	
	public void bubbleSort() {
		int out, in;
		
		for(out = eSize - 1; out > 0;out--) {
			for(in = 0; in < out; in++) {
				if(this.element[in] > this.element[in + 1]) {
					this.swap(in, in+1);
				}
			}
		}
	}
	
	private void swap (int left, int right) {
		int temp = this.element[left];
		this.element[left] = this.element[right];
		this.element[right] = temp;
		
	}
	
	public static void main(String [] args) {
		
		for(int z = 0; z < 10; z++)	{
			int max = 100000;
				BubbleSortArray bubble = new BubbleSortArray(max);
		
				for(int i = 0; i < max; i++) {
					bubble.insert((int) (Math.random()*101));
		}
				Calendar c1 = Calendar.getInstance();
				Long c = c1.getTimeInMillis();
	
				bubble.bubbleSort();
		
				Calendar c2 = Calendar.getInstance();
				Long a = c2.getTimeInMillis();	
		
			System.out.println(a-c);
		}	
	}	
}