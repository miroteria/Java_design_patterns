public class Main {
	
	public static void main(String[] args) {
		Door door = new DoorProxy(new DoorLock());
		door.open("abraca-dabra-door-open");
		door.open("123456");
		door.close();
	}
}
