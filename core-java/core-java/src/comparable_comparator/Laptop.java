package comparable_comparator;

public class Laptop {

	
	
	private String company;
	private int prize;
	private int ram;
	
	
	
	public String getCompany() {
		return company;
	}



	public void setCompany(String company) {
		this.company = company;
	}



	public int getPrize() {
		return prize;
	}



	public void setPrize(int prize) {
		this.prize = prize;
	}



	public int getRam() {
		return ram;
	}



	public void setRam(int ram) {
		this.ram = ram;
	}



	public Laptop(String company, int ram,int prize) {
		this.company = company;
		this.prize = prize;
		this.ram = ram;
	}



	@Override
	public String toString() {
		return "Laptop [company=" + company + ", prize=" + prize + ", ram=" + ram + "]";
	}
	
}
