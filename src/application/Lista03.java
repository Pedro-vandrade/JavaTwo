package application;

import entities.Empregado;

import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Lista03 {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        // aqui em vez de instanciar por tipo estamos instanciando a classe do arquivo Empregado
        List<Empregado> emp = new ArrayList<>();

        System.out.print("How many employees wil be registered? ");
        int n = sc.nextInt();
        for (int i =0; i< n; i++){
            System.out.println();
            System.out.println("Employee #" + (i + 1)+": " );
            System.out.print("ID: ");
            Integer id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Empregado empregado = new Empregado(id, name, salary);
            emp.add(empregado);
//            System.out.print(emp);
        }

        System.out.print("Enter the employee id that will have its salary increased: ");
        int idemployee = sc.nextInt();
        Integer pos = position(emp,  idemployee);
        if (pos == null) {
            System.out.println("This  id does ot exist");
        }
        else {
            System.out.print("Enter percentage: ");
            double percent = sc.nextDouble();
            emp.get(pos).increaseSalary(percent);
        }
        System.out.println();
        System.out.println("List of employees: ");
        for (Empregado empregado : emp) {
            System.out.println(emp);
        }


        sc.close();
    }
    public static Integer position(List<Empregado> list, int id) {
        for (int i =0; i < list.size(); i ++) {
            if(list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }
}
