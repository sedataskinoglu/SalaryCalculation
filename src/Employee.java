public class Employee {
    String name;
    int salary;
    int workHouse;
    int hireYear;

    Employee(String name, int salary , int workHouse , int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHouse = workHouse;
        this.hireYear = hireYear;
    }

    double tax(){
        if(salary <= 1000){
           return 0;
        }else{
             return (salary * 0.03);
        }
    }

    int bonus(){
        if(workHouse>40){
            return (workHouse-40)*30;
        }else {
            return 0;
        }
    }

    double raiseSalary() {
        int yearsWorked = 2025 - hireYear;
        if (yearsWorked<10) {
            return salary*0.05;
        }else if (yearsWorked<20) {
            return salary*0.10;
        }else {
            return salary*0.15;
        }
    }

    double sumSalary(){
         return this.salary - tax() + bonus() + raiseSalary() ;
    }

    void print(){
        System.out.println(this.name + " adli calisanimizin aldigi maas: " + sumSalary());
    }

}
