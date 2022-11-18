package hw9;
// data from https://www.istructe.org/IStructE/media/Public/TSE-Archive/2020/Carbon-footprint-benchmarking-data-for-buildings.pdf


public class Building implements CarbonFootprint {
	
	int height = 1000;																//meters
	int stories = 100;																
	String buildingStyle = "Gothic";
	int area = 10000; 																//m^2
	int co2PerMeter = 200;															//kgCO2 per m^2
	
	
	
	public String getCarbonFootprint() {
		//System.out.println("The carbon footprint of a building of area " + area + "m^2 is: " + (co2PerMeter * area) + "Kg of CO2");
		String msg = "The carbon footprint of a building of area " + area + "m^2 is: " + (co2PerMeter * area) + "Kg of CO2";
		return msg;
	}



	@Override
	public String toString() {
		return "Building [height=" + height + ", stories=" + stories + ", buildingStyle=" + buildingStyle + ", area="
				+ area + ", co2PerMeter=" + co2PerMeter + "]";
	}
}
