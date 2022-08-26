package com.dailycodebuffer.Springboottutorial2.service;

import com.dailycodebuffer.Springboottutorial2.entity.Department;
import com.dailycodebuffer.Springboottutorial2.error.DepartmentNotFoundException;
import com.dailycodebuffer.Springboottutorial2.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {

        return departmentRepository.save(department);
    }

    @Override
    public List<Department> fetchDepartmentList() {
        return departmentRepository.findAll();
    }

    @Override
    public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException {
       Optional<Department> department =  departmentRepository.findById(departmentId);

       if (!department.isPresent()) {
           throw new DepartmentNotFoundException("Department Not Available");
       }
       return department.get();
    }

    @Override
    public void deleteDepartmentById(Long departmentId) {
        departmentRepository.deleteById(departmentId);
    }

    @Override
    public Department updateDepartment(Long departmentId, Department department) {

        Department deptInDB = departmentRepository.findById(departmentId).get();

        if (Objects.nonNull(department.getDepartmentName()) && !"".equalsIgnoreCase(department.getDepartmentName())) {
            deptInDB.setDepartmentName(department.getDepartmentName());
        }

        if (Objects.nonNull(department.getDepartmentCode()) && !"".equalsIgnoreCase(department.getDepartmentCode())) {
            deptInDB.setDepartmentCode(department.getDepartmentCode());
        }

        if (Objects.nonNull(department.getDepartmentAddress()) && !"".equalsIgnoreCase(department.getDepartmentAddress())) {
            deptInDB.setDepartmentAddress(department.getDepartmentAddress());
        }

        return departmentRepository.save(deptInDB);
    }

    @Override
    public Department fetchDepartmentByName(String departmentName) {

        return departmentRepository.findByDepartmentNameIgnoreCase(departmentName);
    }
}
