import java.util.ArrayList;

public class ArrayListTab {

	private ArrayList<Integer> intArrayListTab;
	private ArrayList<Float> floatArrayListTab;
	private ArrayList<String> stringArrayListTab;
	private ArrayList<Television> teleArrayListTab;
	
	public ArrayListTab() {
		intArrayListTab = new ArrayList<Integer>();
			intArrayListTab.add(6);
			intArrayListTab.add(8);
			intArrayListTab.add(10);
			intArrayListTab.add(11);
			intArrayListTab.add(12);
			intArrayListTab.add(14);
			intArrayListTab.add(15);
		
		floatArrayListTab = new ArrayList<Float>();
			floatArrayListTab.add((float) 6.0);
			floatArrayListTab.add((float) 8.4);
			floatArrayListTab.add((float) 10.1);
			floatArrayListTab.add((float) 11.9);
			floatArrayListTab.add((float) 12.95);
			floatArrayListTab.add((float) 14.35);
			floatArrayListTab.add((float) 15.49);
			
		stringArrayListTab = new ArrayList<String>();
			stringArrayListTab.add("a");
			stringArrayListTab.add("abc");
			stringArrayListTab.add("cad");
			stringArrayListTab.add("dee");
			stringArrayListTab.add("def");
			stringArrayListTab.add("fas");
			stringArrayListTab.add("gga");
			
		teleArrayListTab = new ArrayList<Television>();
			teleArrayListTab.add(new Television("Philips", 750));
			teleArrayListTab.add(new Television("Thomson", 875));
			teleArrayListTab.add(new Television("LG", 1125));
			teleArrayListTab.add(new Television("Samsung", 1362));
			teleArrayListTab.add(new Television("Sony", 1619));
			
	}

	public ArrayList<Integer> getIntArrayListTab() {
		return intArrayListTab;
	}

	public void setIntArrayListTab(ArrayList<Integer> intArrayListTab) {
		this.intArrayListTab = intArrayListTab;
	}

	public ArrayList<Float> getFloatArrayListTab() {
		return floatArrayListTab;
	}

	public void setFloatArrayListTab(ArrayList<Float> floatArrayListTab) {
		this.floatArrayListTab = floatArrayListTab;
	}

	public ArrayList<String> getStringArrayListTab() {
		return stringArrayListTab;
	}

	public void setStringArrayListTab(ArrayList<String> stringArrayListTab) {
		this.stringArrayListTab = stringArrayListTab;
	}

	public ArrayList<Television> getTeleArrayListTab() {
		return teleArrayListTab;
	}

	public void setTeleArrayListTab(ArrayList<Television> teleArrayListTab) {
		this.teleArrayListTab = teleArrayListTab;
	}
	
}
