class employee {
  int pf,tax,baseSalaryOfManager;
  int baseSalaryOfLabour;

//overriding method
    public void display_salary()
    {
      System.out.println("SALARY INFORMATION");
      System.out.println("*******************");
    }
}


class manager extends employee {

    int incentive;
          manager( int baseSalaryOfManager, int pf, int tax,int incentive) {
          this.baseSalaryOfManager=baseSalaryOfManager;
          this.pf=pf;
          this.tax=tax;
          this.incentive=incentive;
    }



    public void display_salary() {

        int netSalary=baseSalaryOfManager-(pf+tax)+ incentive;
        System.out.println("NetSalary of this Manager is:"+netSalary+"rs");
    }
}

 class labour extends employee {
      int overtime;
      labour(int baseSalaryOfLabour,int pf,int tax,int overtime) {
      this.baseSalaryOfLabour=baseSalaryOfLabour;
      this.pf=pf;
      this.tax=tax;
      this.overtime=overtime;
    }


    public void display_salary() {

        int netSalary=baseSalaryOfLabour-(pf+tax)+ overtime;
        System.out.println("NetSalary of this Labour is: "+netSalary+"rs");
    }
}
public class program_start {
    public static void main(String[] args) {

      employee em=new employee();
      em.display_salary();
        manager man=new manager(50000,1000,200,1000);
        man.display_salary();
        labour lab = new labour(30000,1000,200,100);
        lab.display_salary();



    }
}
