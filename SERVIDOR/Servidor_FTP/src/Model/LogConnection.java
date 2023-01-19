
package Model;

public class LogConnection {
    private int ID;
    private String USERNAME;
    private String F_INIT;
    private String F_FIN;
    private String DIFF;

    public LogConnection(int ID, String USERNAME, String F_INIT, String F_FIN, String DIFF) {
        this.ID = ID;
        this.USERNAME = USERNAME;
        this.F_INIT = F_INIT;
        this.F_FIN = F_FIN;
        this.DIFF = DIFF;
    }

    public int getID() {
        return ID;
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public String getF_INIT() {
        return F_INIT;
    }

    public String getF_FIN() {
        return F_FIN;
    }

    public String getDIFF() {
        return DIFF;
    }
    
    
}
