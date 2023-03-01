public class Bank {

    private String name,headofficeAdd,chairmanName;
    private int branchCount;
    private double fdInterestRate,personalLoanInterestRate,homeLoanInterestRate;

    public Bank(String name, String headofficeAdd, String chairmanName, int branchCount, double fdInterestRate, double personalLoanInterestRate, double homeLoanInterestRate) {
        this.name = name;
        this.headofficeAdd = headofficeAdd;
        this.chairmanName = chairmanName;
        this.branchCount = branchCount;
        this.fdInterestRate = fdInterestRate;
        this.personalLoanInterestRate = personalLoanInterestRate;
        this.homeLoanInterestRate = homeLoanInterestRate;
    }

    public String getName() {
        return name;
    }

    public String getHeadofficeAdd() {
        return headofficeAdd;
    }

    public String getChairmanName() {
        return chairmanName;
    }

    public int getBranchCount() {
        return branchCount;
    }

    public double getFdInterestRate() {
        return fdInterestRate;
    }

    public double getPersonalLoanInterestRate() {
        return personalLoanInterestRate;
    }

    public double getHomeLoanInterestRate() {
        return homeLoanInterestRate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeadofficeAdd(String headofficeAdd) {
        this.headofficeAdd = headofficeAdd;
    }

    public void setChairmanName(String chairmanName) {
        this.chairmanName = chairmanName;
    }

    public void setBranchCount(int branchCount) {
        this.branchCount = branchCount;
    }

    public void setFdInterestRate(double fdInterestRate) {
        this.fdInterestRate = fdInterestRate;
    }

    public void setPersonalLoanInterestRate(double personalLoanInterestRate) {
        this.personalLoanInterestRate = personalLoanInterestRate;
    }

    public void setHomeLoanInterestRate(double homeLoanInterestRate) {
        this.homeLoanInterestRate = homeLoanInterestRate;
    }

    @Override
    public String toString() {
        return "Bank" +
                "name='" + name + '\n' +
                " headofficeAdd=" + headofficeAdd + '\n' +
                "chairmanName=" + chairmanName + '\n' +
                 "branchCount=" + branchCount +
                "\n"+" fdInterestRate=" + fdInterestRate +"\n"+
                " personalLoanInterestRate=" + personalLoanInterestRate +"\n"
                +"homeLoanInterestRate=" + homeLoanInterestRate+"\n";
    }
    public static void main(String[] args)
    {
        ICICI icici=new ICICI("ICICI bank","Mumbai","Rohan Arora",50000,5.5,11.5,4.5);
        SBI sbi=new SBI("SBI bank","Delhi","Rohit Sharma",2000,7.5,9.5,5.0);

        System.out.println(icici.toString());
        System.out.println(sbi.toString());
    }
}
