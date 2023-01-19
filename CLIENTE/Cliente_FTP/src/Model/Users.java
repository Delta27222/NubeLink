package Model;


public class Users {
    private static int ID;
    private static String ID_STORAGE;
    private static String ROL;
    private static String USERNAME;
    private static String PASSWORD;

    public Users(int ID, String ID_STORAGE, String ROL, String USERNAME, String PASSWORD) {
        Users.ID = ID;
        Users.ID_STORAGE = ID_STORAGE;
        Users.ROL = ROL;
        Users.USERNAME = USERNAME;
        Users.PASSWORD = PASSWORD;
    }

    public static int getID() {
        return ID;
    }

    public String getID_STORAGE() {
        return ID_STORAGE;
    }

    public String getROL() {
        return ROL;
    }

    public static String getUSERNAME() {
        return USERNAME;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }
    
    
}
