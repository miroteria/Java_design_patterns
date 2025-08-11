package dp_bridge_dashboard;

public class FrameBasic implements DashBoardFrame {
	private DashBoardInstrument speedometer;
	private DashBoardInstrument tachometer;
	private DashBoardInstrument fuelGauge; 
	
	public FrameBasic(DashBoardInstrument speedometer, 
			DashBoardInstrument tachometer, 
			DashBoardInstrument fuelGauge) 
	{
		this.speedometer = speedometer;
		this.tachometer = tachometer;
		this.fuelGauge = fuelGauge;
	}
	
	@Override
	public void showAllInstruments() {
		speedometer.show();
		tachometer.show();
		fuelGauge.show();
	}
	
	@Override
	public void showAllInstrumentsNight() {
		speedometer.showNight();
		tachometer.showNight();
		fuelGauge.showNight();
	}

	@Override
	public void createFrame() {
		System.out.println("Creating the frame BASIC design.");	
	}
		
	// Display the grid - usefull for developping purposes
	@Override
	public void showGrid() {
		System.out.println("Creating the grid - used for developping purposes.");
	}

	@Override
	public void increaseBrightness() {
		System.out.println("Increassing the brightness of the frame.");
		
	}

	@Override
	public void decreaseBrightness() {
		System.out.println("Decreassing the brightness of the frame.");
		
	}

	@Override
	public void setDefaultValues() {
		System.out.println("Setting the default values for the frame.");		
	}
}
