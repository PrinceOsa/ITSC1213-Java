
/**
 * This class hold the methods and fields to hold an create a Client object
 *
 * @author Chidi Osakwe
 * @version 11/18/2018
 */
public class Client
{
    //Each human has
   private String lastname;//String field that hold a Clients last name
   private String  firstname;//String field that hold a Clients first name
   private String address;//String field that holds a Clients address
   private String ID;//String field that holds a Clients ID
   private Pet[] pet;//Pet field that hold a pet object
   private int numberVisits;//Int field that hold a Clients number of visits
   private double balance;//Double field that hold a Clients Balance
   
   //Each pet has
   
   /**
    * No args constructor that  creates a Client object and intializes the fields to default values
    */
   public Client()
   {
    lastname="unknown";//Initializes last name to Unknown
    firstname= "unknown";//Initializes first name to Unknown
    address= "unknown";//Initializes Address to Unknown
    ID= "unknown";//Initializes ID to Unknown
    numberVisits= 0;//Initializes numberVisits to 0
    balance= 0.0;//Initializes balance to 0.0
    
    }
    /**
     * This constructor creates a Client object that takes in the user input
     * @param String inLN takes in a String parameter
     * @param String inFN takes in a String parameter 
     * @param String inAdd takes in a String parameter 
     * @param String inID takes in a String parameter 
     * @param int inNV takes in a int parameter 
     * @param double inB takes in a double parameter
     * @param Pet[] an takes in a pet Parameter 
     */
    public Client(String inLN, String inFN, String inAdd, String inID, int inNV, double inB, Pet[] an)
    {
    lastname=inLN;//Sets last name to inLN
    firstname=inFN;// sets first name to inFN
    address=inAdd;// Sets address to inAdd
    ID=inID;//Sets ID to inID
    numberVisits=inNV;// sets numberVisits to inNV
    balance=inB;// Sets balance to inB
    pet= an;// sets pet to an
    
    }
    /**
     * This set method sets the number of visits to the users input
     * @param int inVisittakes in a int as a parameter
     */
    public void setVisits(int inVisit)
    {
    
    numberVisits=inVisit;// sets numberVisits to inNV
        }
        /**
         * This set method sets the address to the users input 
         * @param String inAdd takes in a string as a parameter 
         */
    public void setAdd(String inAdd)
    {
    
    address=inAdd;// Sets the address to inAdd
    }
    /**
     * This set method sets the ID to the user input 
     * @param String inID takes in a string as a parameter
     */
    public void setID(String inID)
    {
    
    ID=inID;// Sets ID to inID
        }
        /**
         * This set method sets the First name to the users input
         * @param String inFN takes in a string as a parameter
         */
    public void setFN(String inFN)
    {
    
    firstname=inFN;//Sets firstname to inFN
        }
        /**
         * This set method sets the Last name to the users input 
         * @param String inLN takes in a string as a parameter
         */
    public void setLN(String inLN)
    {
    
    lastname=inLN;//Sets last name in inLN
        }
    /**
     * this set method sets balance to the users input 
     * @param double inBalance takes in a double as a parameter
     */
    public void setBalance(double inBalance)
    {
        balance=inBalance;//Sets balance to inBalance
    }
    public void setPet(Pet[] inP)
    {
    pet=inP;
    }
    /**
     * 
     * This get method return the field ID
     */
    public String getID()
    {
    return ID;//Returns the String ID 
    }
    /**
     * This get method return the field lastname
     */
    public String getLName()
    {
    return lastname;//Returns the String lastname 
    }
    /**
     * This get method return the field firstname
     */
    public String getFName()
    {
    return firstname;//Returns the String firstname 
    }
    /**
     * This get method return the field balance 
     */
      public double getBalance()
    {
    return balance;//Returns the double balance 
    }
    /**
     * This get method return the field Address
     */
    public String getAddress()
    {
    return address;//Returns the String address 
    }
    /**
     * This get method return the field getNumbersVisits
     */
    public int getNumberVisits()
    {
    return numberVisits;//Returns the Int numberVisits 
    }
    /**
     * This toString method return the textual representation of the Client object
     */
    public String toString()
    {
      String re="\n"+"First Name: "+firstname+ "\n Last Name: "+lastname+ "\n Address: "+address+
      "\n ID: "+ID+ "\n Number of Visits: "+numberVisits+"\n Balance: "+balance+"\n";
    for(int i=0; i<pet.length; i++)
    {
    re= re.concat(pet[i].toString());//prints the petTostring
    }
    return re;
    }
    /**
     * this get method return the toString of the Pet Object 
     */
    public String getPet()
    {
    String pn="";
    for(int t=0; t<pet.length; t++)
    {
    pn= pn.concat(pet[t].toString());//Gets the pet String of the client only 
    }
    return pn;
    }
    /**
     * This get method returns the Pet[]
     */
    public Pet[] getPett()
    {
    return pet;// returns the pet array
    }
    /**
     * This equals method compares two pet objects and checks if they're equal or not 
     * @param Client takes in a Client object
     */
    public boolean equals(Client other)
    {
    return (this.ID.equals(other.ID));// returns a boolean 
    }
}
