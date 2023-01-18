
package Model;


public class Users {
    private int ID;
    private String ID_STORAGE;
    private String ROL;
    private String USERNAME;
    private String PASSWORD;

    public Users(int ID, String ID_STORAGE, String ROL, String USERNAME, String PASSWORD) {
        this.ID = ID;
        this.ID_STORAGE = ID_STORAGE;
        this.ROL = ROL;
        this.USERNAME = USERNAME;
        this.PASSWORD = PASSWORD;
    }

    public int getID() {
        return ID;
    }

    public String getID_STORAGE() {
        return ID_STORAGE;
    }

    public String getROL() {
        return ROL;
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }
    
    
}
