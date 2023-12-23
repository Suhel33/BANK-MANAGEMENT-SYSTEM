public class Account{
    private int accno;
    private static int saccno = 86581742;
    private String name;
    private String fathername;
    private String address;
    private int phoneno;
    private int Aadharno;
    private int pin;
    private int bal;

    public Account(String n, String fn, String add, int ph, int aadhar, int pi, int amt){
        this.name = n;
        this.fathername = fn;
        this.address = add;
        this.phoneno = ph;
        this.Aadharno = aadhar;
        this.pin = pi;
        this.bal = amt;
        this.accno = saccno++;
    }
    
    public int getAccno(){
        return accno;
    }

    public void setAccno(int acc){
        this.accno = acc;
    }

    public static int getSaccno(){
        return saccno;
    }

    public void setSaccno(int s){
        Account.saccno = s;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        this.name = n;
    }

    public String getFathername(){
        return fathername;
    }

    public void setFathername(String fn){
        this.fathername = fn;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String add){
        this.address = add;
    }
    
    public int getPhoneno(){
        return phoneno;
    }

    public void setPhoneno(int ph){
        this.phoneno = ph;
    }

    public int getAadharno(){
        return Aadharno;
    }

    public void setAadharno(int aadhar){
        this.Aadharno = aadhar;
    }

    public int getPin(){
        return pin;
    }

    public void setPin(int pi){
        this.pin = pi;
    }

    public int getBal(){
        return bal;
    }

    public void setBal(int amt){
        this.bal = amt;
    }

    @Override
    public String toString(){
        return "***** Account Information *****\n"+" Account Number = "+accno+"\n Account Holder Name = "+name+"\n Father name = "+fathername+"\n Address = "+address+"\n Phone number = "+phoneno+"\n Aadhar number = "+Aadharno+"\n Pin number = "+pin+"\n Total Balancre = "+bal+"\n";
    }
}
