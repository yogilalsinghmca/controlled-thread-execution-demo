package synchonizers;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ViewBlob {

    private static final String HOSTNAME = "guivmstdb01";
    private static final String PORT = "50000";
    private static final String DATABASE_NAME = "LGEST";
    private static final String USER = "lgst";
    private static final String PASSWORD = "P@sslgst";
    private static final String URN = "3798";

    public static void main(String[] args) throws Exception {
        Connection conn = null;
        try {
            Class.forName("com.ibm.db2.jcc.DB2Driver");
            String url = "jdbc:db2://" + HOSTNAME + ":" + PORT + "/" + DATABASE_NAME;
            conn = DriverManager.getConnection(url, USER, PASSWORD);

            String sql = "Select XML_DATA from KOUKIA.KSFR_DOCUMENT where PK_URN=" + URN;
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                Blob blob = rs.getBlob("XML_DATA");
                byte[] bdata = blob.getBytes(1, (int) blob.length());
                String s = new String(bdata);
                System.out.println(s);
            }
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
    }
}
