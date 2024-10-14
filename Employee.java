class Employee{
    float Salary=500;
    //System.out.println("Salary of Employee is "+Salary);
}
    class Programmer extends Employee{
    int Bonus;
    void display(){
        //System.out.println("Salary of the employee is"+(Salary+Bonus));
    }
    public static void main(String args[]){
        Employee e =new Employee();
        Programmer p =new Programmer();
        e.Salary=500;
        p.Bonus=100;
        System.out.println("Salary of the employee is"+e.Salary);
        System.out.println("Bonus for the Programmer is"+p.Bonus);
    }
}
