package com.Services;

import com.bean.Employee;

import java.util.ArrayList;

public class EmployeeManager {
    private ArrayList<Employee> employeeList;
    public EmployeeManager(){
        employeeList = new ArrayList<>();
    }
    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }
    public Employee queryEmployee(String id) {
        // 遍历员工列表，查找匹配的员工
        for (Employee employee : employeeList) {
            // 比较 String 类型的 id 是否相等
            if (employee.getId().equals(id)) {
                return employee;  // 找到匹配的员工，返回该员工
            }
        }
        // 没有找到匹配的员工，返回 null
        return null;
    }



    public boolean deleteEmployee(String id) {
        for (Employee emp : employeeList) {
            if (emp.getId().equals(id)) {
                employeeList.remove(emp);
                return true;
            }
        }
        return false;
    }

    public boolean updateEmployee(String id, Employee employee){
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId().equals(id)) {
                employeeList.set(i, employee);  // 更新员工信息
                return true;  // 返回true表示更新成功
            }
        }
        return false;  // 如果没有找到匹配的员工，返回false
    }

    private void getEmployeeById(Integer id){
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId().equals(id)){
                System.out.println(employeeList.get(i).toString());
                break;
            }
        }
    }
    public ArrayList<Employee> getEmployeeList(){
        return employeeList;
    }

}
