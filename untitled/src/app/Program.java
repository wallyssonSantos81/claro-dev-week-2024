package app;

import app.servicees.BrazilTaxService;
import app.servicees.PensionSarvice;
import app.servicees.SalaryService;
import app.servicees.TaxService;
import entities.Employee;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner imput = new Scanner(System.in);

        //TaxService taxService = new TaxService();
        TaxService taxService = new BrazilTaxService();
        PensionSarvice pensionSarvice = new PensionSarvice();

        System.out.print("Name: ");
        String name = imput.nextLine();
        System.out.print("Salario bruto: ");
        double grossSalary = imput.nextDouble();

        Employee employee = new Employee(name, grossSalary);
        SalaryService salaryService = new SalaryService(taxService, pensionSarvice);

        double netSalary = salaryService.netSalary(employee);
        System.out.printf("Salario Liquido = %.2f%n", netSalary);

        imput.close();
        }
    }
