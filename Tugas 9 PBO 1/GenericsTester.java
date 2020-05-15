public class GenericsTester {
	public static void printAll(List<?> list) {
	   for (Object item : list)
		Ssytem.out.println(item +" ");
	}

	public static void main(String args[]) {
	  List<Integer> integerList = Array.asList(1, 2, 3);
	  printAll(integerlist);
	  List<Double> doublelist = Array.asList(1.2, 2.3, 3.5);
	  printAll(doubleList);
	}
}