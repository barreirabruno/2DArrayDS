import java.util.ArrayList;
import java.util.List;

public class Solution {
  public int hourglassSum(int[][] arr) {
	return findMaxValue(sumPattern(arr));
  }	
  
  private List<Integer> sumPattern(int[][] arr) {
		List<Integer> resultList = new ArrayList<Integer>();
		for(int row = 0; row < arr.length-2; row++) {
			for(int column=0; column < arr.length-2; column++) {
				int sumPattern = arr[row][column]
	   					+ arr[row][column+1]
	   					+ arr[row][column+2]
	   					+ arr[row+1][column+1]
	   					+ arr[row+2][column]
	   					+ arr[row+2][column+1]
	   					+ arr[row+2][column+2];
				resultList.add(sumPattern);
			}
		}
		return resultList;
  }
  
  private int findMaxValue(List<Integer> resultList) {
		int counter = 2,
				val1 = resultList.get(0),
				val2 = resultList.get(1),
				max = Math.max(val1, val2),
				second_max = Math.min(val1, val2);
			
			while(counter <= resultList.size()-1) {
				if(resultList.get(counter) > max) {
					second_max = max;
					max = resultList.get(counter);
				} else if (resultList.get(counter) > second_max) {
					second_max = resultList.get(counter);
				}
				counter++;
			}
		return max;
  }
}
	