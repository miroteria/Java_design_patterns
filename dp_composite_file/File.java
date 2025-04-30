package dp_composite_file;

public class File implements FileComponent {
	final String tyoe = "FILE"
			;
	private String name;
	private int size;
	
	public File(String name, int size) {
		this.name = name;
		this.size = size;
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
		System.out.println(this.tyoe + ": " + this.name);
		
	}
	
}
