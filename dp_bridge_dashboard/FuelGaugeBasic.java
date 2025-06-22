package dp_bridge_dashboard;

public class FuelGaugeBasic implements DashBoardInstrument {
	@Override
	public void show() {
		System.out.println("Creating Fuel gauge - Basic design");
		
	}
	
	// Creates night version
	@Override
	public void showNight() {
		System.out.println("Creating Fuel gauge - Basic design - night version");
		
	}

}
