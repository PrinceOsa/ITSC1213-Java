
/**
 * Write a description of class PayCheck here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PayCheck
{
   double hourlyRate;
   double hoursWorked;
   double grossPay;
   double federalTaxAmount;
   double stateTaxAmount;
   double FICCAAmount;
   String lastName;
   String firstName;
   double netPay;
   
   final double FEDERAL_TAX_RATE;
   final double STATE_TAX_RATE;
   final double FICA_RATE;
   
   public PayCheck(double inFTR, double inSTR, double inFR)
   {
    hourlyRate=0.0;
    hoursWorked=0.0;
    grossPay=0.0;
    federalTaxAmount=0.0;
    stateTaxAmount=0.0;
    FICCAAmount=0.0;
    lastName= "unknown";
    firstName= "unknown";
    FEDERAL_TAX_RATE=inFTR;
    STATE_TAX_RATE=inSTR;
    FICA_RATE= inFR;
    
    
    }
    public void setPayCheck(double inHR,double inHW,String inLN,String inFN)
   {
    hourlyRate= inHR;
    hoursWorked= inHW;
    lastName=inLN;
    firstName=inFN;
   
    grossPay= hoursWorked*hourlyRate;
    federalTaxAmount= grossPay* FEDERAL_TAX_RATE;
    stateTaxAmount= grossPay* STATE_TAX_RATE;
    FICCAAmount = grossPay* FICA_RATE;
    
    netPay= grossPay-FICCAAmount-stateTaxAmount-federalTaxAmount;
    }
    public void setLastName(String inName)
    {
     lastName= inName;
    }
    public void setFirstName(String inName)
    {
    firstName= inName;
    }
    public void setHourlyRate(double rate)
    {
        if(hourlyRate>5||hourlyRate<100)
        {
        hourlyRate= rate;
    }
    else{
    System.out.println("System Error!");
    }
    
    }
    public void setHoursWorked(double inHW)
    {
      if(hoursWorked>0|| hoursWorked>80)
      {
    hoursWorked= inHW;
    }
    else
    {
    
    System.out.println("System Error!");
    }
    }
    public double getHourlyRate()
    {
    return hourlyRate;
    }
    public double getHoursWorked()
    {
    return hoursWorked;
    }
    public double getGrossPay()
    {
    return grossPay;
    }
    public double getFederalTaxAmount()
    {
    return federalTaxAmount;
    }
    public double getStateTaxAmount()
    {
    return stateTaxAmount;
    }
    public double getFICAAmount()
    {
    return federalTaxAmount;
    }
    public double getNetPay()
    {
    return netPay;
    }
    public String getLastName()
    {
        return lastName;
    }
    public String getFirstName()
    {
    return firstName;
    }
    public String toString()
    {
    return ("First Name: " + firstName +
    "\nLast Name: "+ lastName+
    "\nHoursWorked: "+ hoursWorked+
    "\nHourlyRate: "+ hourlyRate+
    "\nGross Pay: "+ grossPay+
    "\nState Tax Amount: "+ stateTaxAmount+
    "\nFederal Tax Amount: "+ federalTaxAmount+
    "\n Net Pay: " +netPay);
    
    
    }
    }



