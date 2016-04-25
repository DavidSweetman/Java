public interface IPerson {

	String getPhone();
	String getAddress();
	String getName();
	String getDob();
	String getCondition();
	void setName(String text);
	void setDob(String text);
	void save();
	void setCondition(String text);
	void setVitals(String text);
	void setTreatment(String text);
	String getVitals();
	void setPhone(String text);
	void setAddress(String text);
	void setCheckIn(String checkIn);
	void setCheckOut(String checkOut);

	

}
