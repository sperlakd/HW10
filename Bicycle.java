package hw9;
//data https://www.theguardian.com/environment/bike-blog/2021/sep/23/why-arent-more-big-bike-firms-tracking-their-environmental-impact


public class Bicycle implements CarbonFootprint {
	
	String brand = "Schwinn";
	int standoverHeight = 32;
	int co2Production = 134;													//KG
	
	
	public String getCarbonFootprint() {
		//System.out.println("The carbon footprint of a bicycle is almost entirely in it's production an amounts to a lifetime CO2 cost of: " + co2Production + "Kg.");
		String msg = "The carbon footprint of a bicycle is almost entirely in it's production an amounts to a lifetime CO2 cost of: " + co2Production + "Kg.";
		return msg;
	}


	@Override
	public String toString() {
		return "Bicycle [brand=" + brand + ", standoverHeight=" + standoverHeight + ", co2Production=" + co2Production
				+ "]";
	}
}
