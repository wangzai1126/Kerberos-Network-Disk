package App;

import javafx.application.Application;

public class ClientApp {

    public static int AS_Port = 18000;
    public static String AS_IP = "192.168.43.114"; //192.168.43.156
    //public static String AS_IP = "192.168.150.156";
    public static int TGS_Port = 18011;
    public static String TGS_IP = "192.168.43.156";

    public static int up_Load_Server_Port = 18012;
    public static String up_Load_Server_IP = "192.168.43.114";

    public static int down_Load_Server_Port = 18013;
    public static String down_Load_Server_IP = "192.168.43.114";

    public static String TGS_ID = "TGS1";
    public static String up_Load_Server_ID = "UP1";
    public static String down_Load_Server_ID = "DOWN1";

    public static String ADc = "";
    public static String User_ID = "";
    public static String K_C_TGS = "";

    public static String K_C_UP1 = "";
    public static String K_C_DOWN1 = "";

    public static String ticket_TGS = "";
    public static String ticket_UP1 = "";
    public static String ticket_DOWN1 = "";

    public static void main(String[] args) {
        Application.launch(Starter.class);
    }
}
