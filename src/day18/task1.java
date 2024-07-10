package day18;

import java.text.BreakIterator;

public class task1 {
	public static void main(String [] args)
	{
		// bubble sort. arrray [5 ,2 ,3 ,1]
		int [] input = {5, 2, 3, 1,3,5,12,34}, output;
		System.out.println(" Array input: ");
		for(int element : input){
			System.out.print(element + ", ");
		}
		output = bubbleSort(input) ;

		System.out.println();


		System.out.println(" Array output: ");
		for(int element : output){
			System.out.print(element + ", ");
		}
	}

	private static int[] bubbleSort(int[] input) {
		boolean	needSort = false;
		int 	swap,
				size = input.length;

		do {
			for (int current = 0; current < size -1 ; current++) {
				int next = current + 1;

				if (input[current] > input[next]) {
					needSort = true;
					swap = input[current];
					input[current] = input[next];
					input[next] = swap;
				}
				if (next + 1  == size) {
					size --;
				}
				if(size == 1){
					return input;
				}
			}
		} while( needSort == true);
		return input;
	}
}
