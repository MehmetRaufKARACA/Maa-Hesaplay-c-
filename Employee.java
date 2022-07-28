public class Employee {
    String name;
    int salary;
    int workhours;
    int hireYear;


    Employee(String name, int salary, int workhours, int hireYear){

        this.name = name;
        this.salary = salary;
        this.workhours =workhours;
        this.hireYear = hireYear;
    }

     double tax(){
        int tax = 0;

        if(this.salary < 0){
            System.out.println("Geçersiz bir maaş miktarı girdiniz.");
        }
        if(this.salary <= 1000){
             System.out.println("1000 lira altı maaşlara vergi uygulanmamaktadır.");
        }

        if(this.salary > 1000){
             tax = tax +  (this.salary * 3) / 100;
             
        }
        return tax;
    }

     double bonus(){
        int bonus = 0;
        if(this.workhours > 40){
            bonus = (this.workhours - 40) * 30;
            System.out.println("Kazanılan mesai ücreti : " + bonus); 
             
        }
        return bonus;

    }

    double raiseSalary(){
        
        int raise = 0;
        int workYear = 2021 - this.hireYear;

        if(this.hireYear < 0 || this.hireYear > 2021){
            System.out.println("Geçersiz bir yıl girdiniz.");
        }else{
            if(workYear > 0 && workYear < 10){
                raise = (this.salary * 5) / 100;
                
            }else if(workYear > 9 && workYear < 20){
                raise = (this.salary * 10) / 100;
                
            }else if(workYear > 19){
                raise = (this.salary * 15) / 100;
                
            }else{
                raise = 0;
            }
            
        }
        return raise;

    }

    public void printEmployee(){
        double taxableSalary = this.salary + bonus() - tax();
        double totalSalary = this.salary + bonus() + raiseSalary() - tax();
        System.out.println("İsim = " + this.name);
        System.out.println("Maaş = " + this.salary);
        System.out.println("Çalışma Saati = " + this.workhours);
        System.out.println("İşe alınığı yıl = " + this.hireYear);
        System.out.println("Vergi = " + tax());
        System.out.println("Mesai ücreti = " + bonus());
        System.out.println("Alınan zam " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + taxableSalary);
        System.out.println("Zamlı maaş : " + totalSalary);
    }
}
