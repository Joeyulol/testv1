package MySorter;

public class MySorter {
	public double[] sort(double[] d) {

		for (int i = 0; i < d.length - 1; i++) {
			for (int j = 0; j < d.length - i - 1; j++) {
				if (d[j] > d[j + 1]) {
					swap(d, j, j + 1);
				}
			}
		}
		return d;
	}

	public void swap(double d[], int k, int s) {
		double temp = d[k];
		d[k] = d[s];
		d[s] = temp;
	}
}