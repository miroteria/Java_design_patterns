package dp_composite_file;

public class TreeFactory {
	
	/*
	 * This method is used for creating test data
	 * 
	 * Creates the tree with directories and files...
	 * 
	 * */
	public Component createTree() {
		Directory root = new Directory("ROOT");
		Directory pictures = new Directory("PICTURES");
		root.addComponent(pictures);
			Directory vacation = new Directory("VACATION");
			pictures.addComponent(vacation);
				Directory vacationCanaria = new Directory("VACATION_CANARIEN");
				vacation.addComponent(vacationCanaria);
					vacationCanaria.addComponent(new File("picCanaria-1.jpg", 256));
					vacationCanaria.addComponent(new File("picCanaria-2.jpg", 256));
					vacationCanaria.addComponent(new File("picCanaria-3.jpg", 256));
					vacationCanaria.addComponent(new File("picCanaria-4.jpg", 256));
				Directory vacationCroatia = new Directory("VACATION_CROATIA");
				vacation.addComponent(vacationCroatia);
					vacationCroatia.addComponent(new File("picCroatia-1.jpg", 256));
					vacationCroatia.addComponent(new File("picCroatia-2.jpg", 256));
				Directory vacationItaly = new Directory("VACATION_ITALY");
				vacation.addComponent(vacationItaly);
					vacationItaly.addComponent(new File("picItaly-1.jpg", 256));
					vacationItaly.addComponent(new File("picItaly-2.jpg", 256));
					vacationItaly.addComponent(new File("picItaly-3.jpg", 256));
				
		return root;
	}		
	
}
