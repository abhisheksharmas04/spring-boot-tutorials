package com.example.realtimedi.controller;

import java.util.ArrayList;
import java.util.List;

import com.example.realtimedi.dto.EmployeeDto;
import com.example.realtimedi.service.IEmployeManagementService;
import com.example.realtimedi.vo.EmployeeVo;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import ch.qos.logback.core.joran.util.beans.BeanUtil;

@Controller("controller")
public class MainController {
    
    @Autowired
    private IEmployeManagementService service;

    public List<EmployeeVo> showEmpsByDes(String desgs[]) throws Exception{
        List<EmployeeDto> listDto = service.fetchEmployeesByDesgs(desgs);
        //convert List DTO to EMployeeVO
        List<EmployeeVo> listVo = new ArrayList<>();
        listDto.forEach(dto ->{
            EmployeeVo vo = new EmployeeVo();
            BeanUtils.copyProperties(dto, vo);
            // copy extra properties.
            vo.setEmpNo(String.valueOf(dto.getSrNo()));

            listVo.add(vo);
        });

        return listVo;
    }
}
