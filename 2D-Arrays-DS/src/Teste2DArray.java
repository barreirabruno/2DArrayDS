import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Teste2DArray {
	
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("write-here.txt"));
		
		int[][] arr = new int[6][6];
		
		for(int i = 0; i < 6; i++) {
			String[] arrRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
			
			for(int j = 0; j < 6; j++) {
				int arrItem = Integer.parseInt(arrRowItems[j]);
				arr[i][j] = arrItem;
			}
		}
		
		Solution result =  new Solution();
		result.hourglassSum(arr);
		
		System.out.println(result.hourglassSum(arr));
		
		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();
		
		bufferedWriter.close();
		
		scanner.close();
	}

}
