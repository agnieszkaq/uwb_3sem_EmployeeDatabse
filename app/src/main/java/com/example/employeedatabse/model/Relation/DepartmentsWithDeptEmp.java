package com.example.employeedatabse.model.Relation;

import androidx.room.Embedded;
import androidx.room.Relation;

import com.example.employeedatabse.model.Departments;
import com.example.employeedatabse.model.DeptEmp;

import java.util.List;

public class DepartmentsWithDeptEmp {
    @Embedded public Departments dept;
    @Relation(
            parentColumn = "dept_no",
            entityColumn = "dept_no"
    )
    public List<DeptEmp> deptEmps;
}
