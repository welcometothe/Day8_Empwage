public class UC5
{
    int Emp_Day_Hr = 0;
    int Emp_Wage_Hr = 20;
    int totalSalary = 0;
    double empcheck = (Math.floor(Math.random() * 100) % 3);
    public void set(int EmpFull_Time,int Emp_Part_Time)  //Method inside Parameter
    {
        for(int day=1; day<=20; day++ )
        {
            if (empcheck == EmpFull_Time) {
                Emp_Day_Hr = 8;
            } else if (empcheck == Emp_Part_Time) {
                Emp_Day_Hr = 4;
            } else {
                Emp_Day_Hr = 0;
            }
        }
    }
    void get()
    {
        System.out.println("-----Welcome to Employee Wage Computation Program------");
        System.out.println("Employee Total Monthly Wages is " + (Emp_Day_Hr * Emp_Wage_Hr)+totalSalary);
    }

    public static void main(String[] args)
    {
        UC5 U5 = new UC5();
        U5.set(1,2);
        U5.get();
    }
}
