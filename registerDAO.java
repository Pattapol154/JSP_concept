package test.reg.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import test.auth.data.register;

public class registerDAO {
    public registerDAO() {
        super();
    }
    protected register validateregister(Connection conn, long paUserLogin) throws Exception {

        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            StringBuffer sqlStmt = new StringBuffer("SELECT REGID, TITLENAME, FRISTNAME, LASTNAME, AGE,ADDRESS, MOBILENO, EMAIL FROM REGISTER WHERE REGID=?");
            sqlStmt.append("");

            ps = conn.prepareStatement(sqlStmt.toString());

            int vnStmtCnt = 1;
            ps.setLong(vnStmtCnt++, paUserLogin);

            rs = ps.executeQuery();
            register voReg = null;
            if (rs.next()) {
                voReg = new register();
                voReg.setREGID(rs.getLong("REGID"));
                voReg.setTITLENAME(rs.getString("TITLENAME"));
                voReg.setFRISTNAME(rs.getString("FRISTNAME"));
                voReg.setLASTNAME(rs.getString("LASTNAME"));
                voReg.setAGE(rs.getLong("AGE"));
                voReg.setADDRESS(rs.getString("ADDRESS"));
                voReg.setMOBILENO(rs.getString("MOBILENO"));
                voReg.setEMAIL(rs.getString("EMAIL"));            
            }
            return voReg;
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

