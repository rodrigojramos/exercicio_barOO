package entities;

public class Bill {
	
	public char gender;
	public int beer;
	public int softDrink;
	public int barbecue;
	
	public Bill() {
	}

	public Bill(char gender, int beer, int softDrink, int barbecue) {
		this.gender = gender;
		this.beer = beer;
		this.softDrink = softDrink;
		this.barbecue = barbecue;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getBeer() {
		return beer;
	}

	public void setBeer(int beer) {
		this.beer = beer;
	}

	public int getSoftDrink() {
		return softDrink;
	}

	public void setSoftDrink(int softDrink) {
		this.softDrink = softDrink;
	}

	public int getBarbecue() {
		return barbecue;
	}

	public void setBarbecue(int barbecue) {
		this.barbecue = barbecue;
	}

	public static Double feeding(int beer, int softDrink, int barbecue) {
		double feeding = beer * 5 + softDrink * 3 + barbecue * 7;
		return feeding;	
	}
	
	
}
