public class DoorLock implements Door {

	@Override
	public void open(String code) {
		System.out.println("Unlocking the door.");
	}

	@Override
	public void close() {
		System.out.println("Locking up the door.");
		
	}
}
