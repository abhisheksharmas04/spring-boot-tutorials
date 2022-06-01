package com.example.realtimedi.service;

import java.util.ArrayList;
import java.util.List;

import com.example.realtimedi.bo.EmployeeBo;
import com.example.realtimedi.dao.IEmployeeDao;
import com.example.realtimedi.dto.EmployeeDto;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeManagementServiceImpl implements IEmployeManagementService{

    @Autowired
    private IEmployeeDao dao;

    @Override
    public List<EmployeeDto> fetchEmployeesByDesgs(String[] desgs) throws Exception {
        // converts desgs array into condition:
            String condition = null;
            
            StringBuffer buffer = new StringBuffer("(");
            
            for(int i=0; i<desgs.length;i++){
                if(i==desgs.length-1){ // for the last element of the array
                    buffer.append("''"+desgs[i]+"')");
                }else{
                    buffer.append("'"+desgs[i]+"',"); // for other than last element
                }
            }

            // convert stringbuffer object into string
            condition = buffer.toString();

            // use dao
            List<EmployeeBo> listBo = dao.getEmployeesByDes(condition);
            List<EmployeeDto> listDto = new ArrayList<>();
            
            // convert listBO to list DTO
            listBo.forEach(bo->{
                EmployeeDto dto = new EmployeeDto();
                BeanUtils.copyProperties(bo, dto); // properties name and types must matched
                dto.setSrNo(listDto.size()+1);
                listDto.add(dto);
            });

        return listDto;
    }
    
}
