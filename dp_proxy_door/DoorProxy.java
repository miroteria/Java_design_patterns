import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DoorProxy implements Door {
	private Door doorLock;
	
	public DoorProxy(Door doorLock) {
		this.doorLock = doorLock;
	}
	
	@Override
	public void open(String code) {
		if (authenticate(code)) {
			System.out.println("Correct code for opening door.");
			doorLock.open("");
			this.logOpen(true);
		} else {
			System.out.println("Wrong code for opening door - try again pleace.");
			this.logOpen(false);
		}
		
	}

	public boolean authenticate(String code) {
		return "abraca-dabra-door-open".equals(code);
	}
	
	@Override
	public void close() {
		doorLock.close();
		
	}
	
	private void logOpen(boolean lockSuccess) {
		LocalDateTime myDateObj = LocalDateTime.now();
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		if (lockSuccess) {
			System.out.println("LOGGING MESSAGE: The door was open. Time: " + myDateObj.format(myFormatObj));
		} else {
			System.out.println("LOGGING MESSAGE: Unsuccessfull try open the door - wrong code. Time: " + myDateObj.format(myFormatObj));
		}
	}

}
