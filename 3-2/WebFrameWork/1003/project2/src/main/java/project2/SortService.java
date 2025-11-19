package project2;

public class SortService {
	private final Sort sorter;
	
	public SortService(Sort sorter) {
		this.sorter = sorter;
	}
	
	public void runSort(int[] data) {
		sorter.sort(data);
	}

}
