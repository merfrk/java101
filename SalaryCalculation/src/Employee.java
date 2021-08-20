import static java.lang.System.*;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
   double tax(){
        if (this.salary > 1000){
            return this.salary * 3/100;
        }
        else return 0;
    }
    double bonus(){
        if (this.workHours > 40){
            return (this.workHours - 40)*30;
        }
        else {
            return 0;
        }
    }
    double raiseSalary(){
        if((2021 - this.hireYear) < 10){
            return this.salary * 0.05;
        }
        else if ((2021 - this.hireYear) > 9 && (2021 - this.hireYear) < 20){
            return this.salary * 0.10;
        }
        else {
            return this.salary * 0.15;
        }
    }

    public void printEmploInfo() {
        out.println("Adı : "+this.name);
        out.println("Maaşı : "+this.salary);
        out.println("Çakışma Saati : "+this.workHours);
        out.println("Başlangıç Yılı : "+this.hireYear);
        out.println("Vergi : "+this.tax());
        out.println("Bonus : "+this.bonus());
        out.println("Maaş Artışı : "+this.raiseSalary());
        out.println("Vergi ve Bonuslar ile birlikte maaş : "+(this.salary+bonus()-tax()));
        out.println("Toplam Maaş : "+(this.salary+bonus()+raiseSalary()-tax()));
    }

}
