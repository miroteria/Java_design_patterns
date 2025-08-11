package dp_bridge_dashboard;

public class Main {

	public static void main(String[] args) {
		DashBoardFrame frame = new FrameBasic(new SpeedometerBasic(), 
				new TachometerBasic(), 
				new FuelGaugeBasic());
		frame.createFrame();
		frame.showAllInstruments();
	}

}
