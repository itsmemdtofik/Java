/* create a generic class with three parameter as employee details */

class employee<N, A, M> {
    N name;
    A address;
    M mobileno;

    employee(N p, A q, M r) {
        name = p;
        address = q;
        mobileno = r;
    }

    N getName() {
        return name;
    }

    A getAdress() {
        return address;
    }

    M getMobileno() {
        return mobileno;
    }

    public void display() {
        System.out.println("Type of T is =" + name.getClass().getName());
        System.out.println("The name os the employee is = " + name);

        System.out.println("Type of T is =" + address.getClass().getName());
        System.out.println("The Adress of the Employee is= " + address);

        System.out.println("Type of T is =" + mobileno.getClass().getName());
        System.out.println("The mobile No of employee is = " + mobileno);

    }
}

public class GenericDemo1 {
    public static void main(String[] args) {
        employee<String, String, Integer> Strob;
        Strob = new employee<String, String, Integer>("allen", "Manipal", 987548985);
        Strob.display();

        System.out.println("--------------------------------------------");
        System.out.println("Displaying new field");

        employee<String, String, String> strNew = new employee<String, String, String>("Tofik", "Udupi", "9598743695");
        String NameStr = strNew.getName();
        String AddressStr = strNew.getAdress();
        String MobileNo = strNew.getMobileno();
        strNew.display();

    }

}
