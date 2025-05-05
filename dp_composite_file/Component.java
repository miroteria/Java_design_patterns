package dp_composite_file;

	/*
	 * Common method for both - root and leafs objects
	 */
	public interface Component {
		public void showDetail(int treeLevel);
		public int getComponentSize();
		public Component findComponentByName(String name);	
		public String getComponentName();
		public String getComponentType();		
	}
