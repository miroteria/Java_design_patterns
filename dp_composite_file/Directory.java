package dp_composite_file;

import java.util.ArrayList;
import java.util.List;

public class Directory implements Component {
	final String type = "DIR";
	
	private String name;
	private int size = 0;
	private int treeLevel = 0;
	private List<Component> components = new ArrayList<>();
	
	public Directory(String name) {
		this.name = name;
	}
	
	public void addComponent(Component component) {
		this.components.add(component);
	}
	
	public void removeComponent(Component component) {
		this.components.remove(component);
	}
	
	@Override
	public String getComponentName() {
		return this.name;
	}

	@Override
	public int getComponentSize() {
		return this.size;
	}
	
	/*
	 * This method go's through three hierarchy - for each component (directory or file) in hierarchy
	 * write's out the name of component
	 * 
	 * Is used recursion
	 * 
	 * Parameter treeLevel is used just for indentation of text in next tree level
	 * 
	 */
	@Override
	public void showDetail(int treeLevel) {
		this.treeLevel = treeLevel;
		System.out.println(this.getSpace() + this.type + ": " + this.name);
		this.components.forEach(component -> component.showDetail(this.treeLevel + 1));
	}

	@Override
	public String getComponentType() {
		return this.type;
	}
	
	public int getTreeLevel() {
		return treeLevel;
	}

	public void setTreeLevel(int treeLevel) {
		this.treeLevel = treeLevel;
	}
	
	private String getSpace() {
		String space = "";
		for (int i = 0; i < this.treeLevel; i++) {
			space += "    ";
		}
		return space;
	}



	public List<Component> getComponents() {
		return components;
	}

	
	
	/*
	 * This method is used to find out in the tree the component by the name
	 * 
	 * If the name of component is equal to the name we are looking for,
	 * than is return this component otherwise skip to another component ... and so on
	 * 
	 * is used recursion
	 * 
	 */
	@Override
	public Component findComponentByName(String name) {	
		Component c = null;
		for (Component comp : this.components) {
			//System.out.println("Comp name: " + comp.getFileName());
			if (comp.getComponentName().equals(name) ) {
				return comp;
			} else {
				c = comp.findComponentByName(name);
				if (c != null) {
					break;
				}
			}
		}
		
		return c;
	}
}
