package dp_composite_file;

public interface Component {
	public void showDetail();
	public int getComponentSize();
	public String getComponentName();
	public String getComponentType();
	public Component getComponentByName(String name);
	public void setTreeLevel(int treeLevel);
	
	
}
