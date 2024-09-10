package AbstractMethod;

public class DayScholar extends Student {
	
	private int busNumber;
	private float distance;
	

	public DayScholar(int studentId, String studentName, String department, String gender, String category,
			double collegeFee,int busNumber, float distance) {
		super(studentId,studentName,department,gender,category,collegeFee);
		this.busNumber = busNumber;
		this.distance = distance;
	}


	public DayScholar() {
		super();
	}


	public int getBusNumber() {
		return busNumber;
	}


	public void setBusNumber(int busNumber) {
		this.busNumber = busNumber;
	}


	public float getDistance() {
		return distance;
	}


	public void setDistance(float distance) {
		this.distance = distance;
	}


	@Override
	public double calculateTotalFee() {
		// TODO Auto-generated method stub
		double totalFee=getCollegeFee();
		if(distance>30||distance<=40) {
			totalFee+=28000;
		}
		if(distance>20||distance<=30) {
			totalFee+=20000;
		}
		if(distance>10||distance<=20) {
			totalFee+=12000;
		}
		else if (distance<=10) {
			totalFee+=6000;
		}
		return totalFee;
	}

}
