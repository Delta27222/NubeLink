package Model;
import View.Login;
import SQL.SQLConnection;
import Tools.FTPConnection;
import java.io.File;
import java.io.PrintStream;
import java.io.IOException;
import java.util.ArrayList;

    import org.apache.commons.net.ftp.FTPClient;

public class main {
    public static void main(String[] args) throws IOException {
        Login open = null;  
        open = new Login();
        open.setVisible(true);
    }
}