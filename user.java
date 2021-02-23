package test.auth.data;

public class user {
    public user() {
        super();
    }
    private String USERNAME="";
    private String PASSWORD="";
    private String ENABLED="";

    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME;
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setENABLED(String ENABLED) {
        this.ENABLED = ENABLED;
    }

    public String getENABLED() {
        return ENABLED;
    }
}
