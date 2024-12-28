public class Employee{
        int idcard;
        String naam;
        int salarys;
    public Employee(String name,int id,int salary){
        System.out.println("Constructor ke andar hua");
        idcard=id;
        naam=name;
        salarys=salary;
    }
    public static void main(String args[])
    {
        System.out.println("Ho gaya");
        Employee ram=new Employee("ui",10,800);
        ram.display();
        int c=5;

    }
    public void display(){
        int idcard=100;
        System.out.println(this.idcard);

    }
    public void displ(){
        int idcard=107;
        System.out.println(idcard);

    }
}