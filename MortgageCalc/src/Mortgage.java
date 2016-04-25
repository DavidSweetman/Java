public class Mortgage {
    private double annual_interest_rate = 6.5;
    private double principle_amount;
    private double duration_years;
    private double monthly_interest_rate;
    
    public Mortgage (double annual_interest_rate, double principle_amount, double duration_years) {
        this.annual_interest_rate = annual_interest_rate;
        this.principle_amount = principle_amount;
        this.duration_years = duration_years;
        this.monthly_interest_rate = (this.annual_interest_rate/(12))/100;
    }
    
    public double monthly_repayments () {
        double monthly_repayment;
        error_checking("MIR",this.monthly_interest_rate);
        error_checking("Dur",this.duration_years);
        double numerator = this.monthly_interest_rate*Math.pow(((1+this.monthly_interest_rate)),(this.duration_years*12)); 
        error_checking("Numerator",numerator);
        double denominator = Math.pow((1+this.monthly_interest_rate), (this.duration_years*12))-1;
        error_checking("Denominator",denominator);
        monthly_repayment = this.principle_amount*(numerator/denominator);
        return Math.round(monthly_repayment*100.0)/100.0;
    }
    
    public void error_checking(String label,double v) {
        System.out.println(label + ": " + v);
    }
    
    public void display_rates() {
        System.out.println("Annual interest rate: " + this.annual_interest_rate);
        System.out.println("Duration Years: " + this.duration_years);
        System.out.println("Monthly Interest Rate: " + this.monthly_interest_rate);
        System.out.println("Principle Amount: " + this.principle_amount);
    }
}