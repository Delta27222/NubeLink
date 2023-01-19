
package Model;

public class FilesFolder {
    private int ID;
    private int ID_USER;
    private int ID_CLOUD;
    private String NAME;
    private String SIZE;
    private String REMOTE_PATH;

    public FilesFolder(int ID, int ID_USER, int ID_CLOUD, String NAME, String SIZE, String REMOTE_PATH) {
        this.ID = ID;
        this.ID_USER = ID_USER;
        this.ID_CLOUD = ID_CLOUD;
        this.NAME = NAME;
        this.SIZE = SIZE;
        this.REMOTE_PATH = REMOTE_PATH;
    }

    public int getID() {
        return ID;
    }

    public int getID_USER() {
        return ID_USER;
    }

    public int getID_CLOUD() {
        return ID_CLOUD;
    }

    public String getNAME() {
        return NAME;
    }

    public String getSIZE() {
        return SIZE;
    }

    public String getREMOTE_PATH() {
        return REMOTE_PATH;
    }
    
    
    
}
