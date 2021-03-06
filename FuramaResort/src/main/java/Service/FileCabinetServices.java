package Services;

import Commons.CSVfile;
import Commons.ReadWriteCSV;
import Models.Employee;

import java.util.List;
import java.util.Map;
import java.util.Stack;

public class FileCabinetServices {
    //    private Stack<Map.Entry<String, Employee>> employees;
    private Stack<List<Employee>> employeesStack;

    public FileCabinetServices() {
//        Map<String, Employee> employeeMap = new ReadWriteCSV().readFileEmployeeCSV();
        List<Employee> employeeList = new CSVfile().readEmployeeCsv();
        employeesStack = new Stack<>();
        for (List<Employee>  : employeeList.)
        for (Map.Entry<String, Employee> entry : employeeMap.entrySet()) {
            employees.push(entry);
        }
    }


    public Employee findEmployeeById(String id) {
        Stack<Map.Entry<String, Employee>> employees1 = (Stack<Map.Entry<String, Employee>>) employees.clone();
        while (true) {
            Map.Entry<String, Employee> entry = employees1.pop();
            if (entry == null) {
                break;
            }
            if (id.equals(entry.getKey())) {
                return entry.getValue();
            }
        }
        return null;
    }
}
