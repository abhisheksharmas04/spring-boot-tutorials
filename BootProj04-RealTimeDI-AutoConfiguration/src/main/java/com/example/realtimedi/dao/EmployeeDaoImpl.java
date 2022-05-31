package com.example.realtimedi.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.example.realtimedi.bo.EmployeeBo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("empDao")
public class EmployeeDaoImpl implements IEmployeeDao{
    private static final String GET_EMP_BY_DEGS = "SELECT EMPNO,ENAME,JOB,SAL,DEPTNO,MGR FROM EMP WHERE JOB IN";

    @Autowired
    private DataSource ds;

    @Override
    public List<EmployeeBo> getEmployeesByDes(String condition) throws Exception {
        List<EmployeeBo> listBo = new ArrayList();
        EmployeeBo bo = null;
        try(// get pooled jdbc connection
            Connection con = ds.getConnection();
            Statement st = con.createStatement();
            // send and execute sql queries 
            ResultSet rs = st.executeQuery(GET_EMP_BY_DEGS+con+"ORDER BY JOB");){                
                
                //convert rs object records to list of BO class object
                while(rs.next()){
                    // copy each recrod to RS to object of EmployeeBO class
                    bo.setEmpNo(rs.getInt(1));
                    bo.setEname(rs.getString(2));
                    bo.setJob(rs.getString(3));
                    bo.setSal(rs.getDouble(4));
                    bo.setDeptNo(rs.getInt(5));
                    bo.setMgrNo(rs.getInt(6));

                    // add each EmployeeBO to list collection
                    listBo.add(bo);
                }

        }catch (SQLException se) {
            se.printStackTrace();
            throw se; // this is for exception propogation
        }catch(Exception e){
            e.printStackTrace();
            throw e;
        }
        return listBo;
    }
    
}
