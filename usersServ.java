package test.auth.service;

import java.sql.Connection;
import test.auth.data.user;
import test.util.ApplicationException;
import test.util.conDB;

public class usersServ {
    public usersServ() {
        super();
    }

    private Connection conn = null;

    protected Connection conDB() throws Exception {
        conn = conDB.getConnection(); 
        if (conn == null) {
            throw new ApplicationException("Can not Open Database Connection. ");
        }
        return conn;
    }

    public user validateUser(String paUserLogin) throws Exception {
        user voUser = null;
        try {
            conn = this.conDB();
            usersDAO voUsersDAO = new usersDAO();
            voUser = voUsersDAO.validateUser(conn, paUserLogin);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        } finally {
            if (conn != null) {
                conDB.closeDBConnection(conn);
            }
        }
        return voUser;
    }
}
