package app.servicees;

import entities.Employee;

public class SalaryService {

    private TaxService taxService;
    private PensionSarvice pensionSarvice;

    public SalaryService( TaxService taxService, PensionSarvice pensionSarvice){
        this.taxService = taxService;
        this.pensionSarvice = pensionSarvice;
    }

    public double netSalary(Employee employee){

        return employee.getGrossSalary() - taxService.tax(employee.getGrossSalary())
                - pensionSarvice.discount(employee.getGrossSalary());
    }

}
