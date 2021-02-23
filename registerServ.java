package test.reg.service;

import java.sql.Connection;
import test.auth.data.register;

import test.auth.service.usersDAO;

import test.util.ApplicationException;
import test.util.conDB;

public class registerServ {
    public registerServ() {
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

    public register validateregister(long pareg) throws Exception {
        register voReg = null;
        try {
            conn = this.conDB();
            registerDAO voregisterDAO = new registerDAO();
            voReg = voregisterDAO.validateregister(conn, pareg);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        } finally {
            if (conn != null) {
                conDB.closeDBConnection(conn);
            }
        }
        return voReg;
    }
}
