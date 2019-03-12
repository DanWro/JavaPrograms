public class Test{

	public static void main(String[] args){
		int[] a = {1};
		Test t = new Test();
		t.add(a);
		System.out.println(a[a.length - 1]);
	}

	void add(int[] i){
		i[i.length - 1]++;
	}
}