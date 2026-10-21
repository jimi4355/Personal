package com.porn.service;

import com.porn.dto.EmployeeLoginDTO;
import com.porn.entity.Employee;

public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

}
