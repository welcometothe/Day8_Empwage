public class UC4
{
    int Full_Time = 1;
    int Part_Time = 2;
    int Wage_Per_Hrs = 20;
    int empHrs = 0;
    int empCheck = (int)Math.floor(Math.random() *10) % 3;
    UC4()  // Constructor With No Parameters
    {
        System.out.println("-----Welcome to Employee Wage Computation Program------");
        switch (empCheck) {
            case  1 :
                System.out.println("Employee Is Full Time");
                empHrs = 8;
                break;
            case  2 :
                System.out.println("Employee Is Part Time");
                empHrs = 4;
                break;
            default:
                System.out.println("Employee Is Absent");
                empHrs = 0;
        }
        int empWage = empHrs * Wage_Per_Hrs;
        System.out.println("Emp Wage : " +empWage);
    }
    public static void main(String[] args)
    {
        UC4 u4 = new UC4();
    }

}
