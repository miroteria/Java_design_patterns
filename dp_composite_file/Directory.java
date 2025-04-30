package dp_composite_file;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileComponent {
	final String tyoe = "DIR";
	
	private String name;
	private int size = 0;
	private List<FileComponent> components = new ArrayList();
	
	public Directory(String name) {
		this.name = name;
	}
	
	public void addComponent(FileComponent component) {
		this.components.add(component);
	}
	
	public void removeComponent(FileComponent component) {
		this.components.remove(component);
	}
	
	@Override
	public String getFileName() {
		return this.name;
	}

	@Override
	public int getFileSize() {
		return this.size;
	}

	@Override
	public void showTree() {
		
		
	}

}
