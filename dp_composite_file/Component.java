package design_patterns.dp_composite_file;

public interface Component {
	public void showDetail(int treeLevel);
	public int getComponentSize();
	public Component findComponentByName(String name);	
	public String getComponentName();
	public String getComponentType();		
}
