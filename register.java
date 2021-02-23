package test.auth.data;

public class register {
    public register() {
        super();
    }
    private long REGID;
    private String TITLENAME= "";
    private String FRISTNAME= "";
    private String LASTNAME= "";
    private long AGE;
    private String ADDRESS= "";
    private String MOBILENO= "";
    private String EMAIL= "";

    public void setREGID(long REGID) {
        this.REGID = REGID;
    }

    public long getREGID() {
        return REGID;
    }

    public void setTITLENAME(String TITLENAME) {
        this.TITLENAME = TITLENAME;
    }

    public String getTITLENAME() {
        return TITLENAME;
    }

    public void setFRISTNAME(String FRISTNAME) {
        this.FRISTNAME = FRISTNAME;
    }

    public String getFRISTNAME() {
        return FRISTNAME;
    }

    public void setLASTNAME(String LASTNAME) {
        this.LASTNAME = LASTNAME;
    }

    public String getLASTNAME() {
        return LASTNAME;
    }

    public void setAGE(long AGE) {
        this.AGE = AGE;
    }

    public long getAGE() {
        return AGE;
    }

    public void setADDRESS(String ADDRESS) {
        this.ADDRESS = ADDRESS;
    }

    public String getADDRESS() {
        return ADDRESS;
    }

    public void setMOBILENO(String MOBILENO) {
        this.MOBILENO = MOBILENO;
    }

    public String getMOBILENO() {
        return MOBILENO;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getEMAIL() {
        return EMAIL;
    }
}
