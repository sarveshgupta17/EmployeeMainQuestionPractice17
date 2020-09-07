import Employee.Employeeinfo;
import java.util.Scanner;
import java.util.Arrays;
public class EmployeeMain {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Employeeinfo[] arr=new Employeeinfo[3];
         String firstname;
         String lastname;
         int salary;
         int empexp;
         long mobile;

        for(int i=0;i< arr.length;i++){
            System.out.println("enter the firstname");
            firstname=sc.nextLine();
            System.out.println("enter the lastname");
            lastname=sc.nextLine();
            System.out.println("enter salary");
            salary=sc.nextInt();
            System.out.println("enter experince");
            empexp=sc.nextInt();
            sc.nextLine();
            System.out.println("enter mobile number");
            mobile=sc.nextLong();
            sc.nextLine();
            arr[i]=new Employeeinfo(firstname,lastname,salary,empexp,mobile);


        }
        System.out.println("the array is ="+Arrays.toString(arr));
        Employeeinfo[] response=sortsalary(arr);
        System.out.println("sorted array on the basis of salary is="+ Arrays.toString(response));
        Employeeinfo[] response1=sortexp(arr);
        System.out.println("sorted array in terms of expereince is ="+Arrays.toString(response1));
    }

    public static Employeeinfo[] sortsalary(Employeeinfo[] arr){
        Employeeinfo[] arr1=arr.clone();
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1.length-1;j++){
                if(arr1[j].getSalary()<arr1[j+1].getSalary()){
                    Employeeinfo temp=arr1[j];
                    arr1[j]=arr1[j+1];
                    arr1[j+1]=temp;

                }

            }
        }
        return arr1;

    }
    public static Employeeinfo[] sortexp(Employeeinfo[] arr){
        Employeeinfo[] arr1=arr.clone();
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1.length-1;j++){
                if(arr1[j].getEmpexp()<arr1[j+1].getEmpexp()){
                    Employeeinfo temp=arr1[j];
                    arr1[j]=arr1[j+1];
                    arr1[j+1]=temp;

                }

            }
        }
        return arr1;

    }


}
