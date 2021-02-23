package test.auth.service;

import java.sql.PreparedStatement;
import java.sql.*;

import test.auth.data.user;

public class usersDAO {
    public usersDAO() {
        super();
    }

    protected user validateUser(Connection conn, String pareg) throws Exception {

        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            StringBuffer sqlStmt = new StringBuffer("SELECT USERNAME, PASSWORD, ENABLED FROM USERS WHERE USERNAME=?");
            sqlStmt.append("");

            ps = conn.prepareStatement(sqlStmt.toString());

            int vnStmtCnt = 1;
            ps.setString(vnStmtCnt++, pareg);

            rs = ps.executeQuery();
            user voUser = null;
            if (rs.next()) {
                voUser = new user();
                voUser.setUSERNAME(rs.getString("USERNAME"));
                voUser.setPASSWORD(rs.getString("PASSWORD"));
                voUser.setENABLED(rs.getString("ENABLED"));
            }
            return voUser;
        } catch (SQLException sqle) {
            throw new Exception("1, usersDAO.validateViUser : " + sqle.getMessage());
        } catch (Exception e) {
            throw new Exception("2, usersDAO.validateViUser : " + e.getMessage());
        } finally {
            if (ps != null)
                ps.close();
            if (rs != null)
                rs.close();
        }

    }

}


