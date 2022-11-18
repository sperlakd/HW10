package hw9;
//data from https://www.energy.gov/eere/vehicles/articles/fotw-1223-january-31-2022-average-carbon-dioxide-emissions-2021-model-year#:~:text=The%20average%20production%2Dweighted%20carbon,%E2%80%92%20a%20decrease%20of%2049%25.


public class Car implements CarbonFootprint {

	String make = "Mazda";
	String model = "Miata";
	int mpg = 32;
	int milesDriven = 12000;															//average miles driven in a year
	int co2PerMile = 348;																//grams
	
	
	public String getCarbonFootprint() {
		//System.out.println("The carbon footprint of a " + make + " " + model + " or similar car per " + milesDriven + " miles driven is: " + (milesDriven * co2PerMile)/1000 + "Kg of CO2");
		String msg = "The carbon footprint of a " + make + " " + model + " or similar car per " + milesDriven + " miles driven is: " + (milesDriven * co2PerMile)/1000 + "Kg of CO2";
		return msg;
		
	}


	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", mpg=" + mpg + ", milesDriven=" + milesDriven
				+ ", co2PerMile=" + co2PerMile + "]";
	}
}
