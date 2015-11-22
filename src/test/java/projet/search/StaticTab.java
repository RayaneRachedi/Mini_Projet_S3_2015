package projet.search;

public class StaticTab {

	private Integer [] intStaticTab;
	private Float [] floatStaticTab;
	private String [] stringStaticTab;
	private Television [] teleStaticTab;
	
	public StaticTab() {
		
		intStaticTab = new Integer[5]; 
			intStaticTab[0] = 6;
			intStaticTab[1] = 8;
			intStaticTab[2] = 11;
			intStaticTab[3] = 15;
			intStaticTab[4] = 18;
			
		floatStaticTab = new Float[5];
			floatStaticTab[0] = (float) 6.0;
			floatStaticTab[1] = (float) 7.9;
			floatStaticTab[2] = (float) 8.5;
			floatStaticTab[3] = (float) 15.36;
			floatStaticTab[4] = (float) 19.5;
			
		stringStaticTab = new String[3];
			stringStaticTab[0] = "abc";
			stringStaticTab[1] = "def";
			stringStaticTab[2] = "ghi";
			
		teleStaticTab = new Television[5];
			teleStaticTab[0] = new Television("Philips", 750);
			teleStaticTab[1] = new Television("Thomson", 875);
			teleStaticTab[2] = new Television("LG", 1125);
			teleStaticTab[3] = new Television("Samsung", 1362);
			teleStaticTab[4] = new Television("Sony", 1619);		
			
	}

	public Television[] getTeleStaticTab() {
		return teleStaticTab;
	}

	public void setTeleStaticTab(Television[] teleStaticTab) {
		this.teleStaticTab = teleStaticTab;
	}

	public Integer[] getIntStaticTab() {
		return intStaticTab;
	}

	public void setIntStaticTab(Integer[] intStaticTab) {
		this.intStaticTab = intStaticTab;
	}

	public Float[] getFloatStaticTab() {
		return floatStaticTab;
	}

	public void setFloatStaticTab(Float[] floatStaticTab) {
		this.floatStaticTab = floatStaticTab;
	}

	public String[] getStringStaticTab() {
		return stringStaticTab;
	}

	public void setStringStaticTab(String[] stringStaticTab) {
		this.stringStaticTab = stringStaticTab;
	}
	
}
