public class IncomeTaxCalculator{
   public static void main(String[] args) {

    double salary = 2350D;
    if(salary <= 1903.98){
        System.out.println("No taxes");
    } else if(salary>=1903.98 && salary <= 2826.65){
        System.out.println("7.5% "+ (salary * 0.075));
    } else if(salary >= 2826.66 && salary  <= 37510.05){
        System.out.println("15% "+ (salary * 0.15));
    } else if(salary >= 37510.05 && salary <= 4664.68) {
        System.out.println("22.5%" + (salary * 0.225));
    } else {
        System.out.println("27.5%" + (salary * 0.0275));
    }
   }

}