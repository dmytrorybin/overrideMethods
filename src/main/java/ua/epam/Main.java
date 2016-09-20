package ua.epam;

public class Main {

    public static void main(String[] args) {
        Employee emp = new Employee("Elza");
        EpamDeveloper dev1 = new EpamDeveloper("Peter", 3000, 3.0);
        EpamRD rd1 = new EpamRD("Elza", 3000, 2.0, RDSpecialization.JAVA);
        EpamRD rd2 = new EpamRD("Elza", 3000, 2.0, RDSpecialization.CSHARP);
        EpamDeveloper dev3 = new EpamDeveloper("Elza", 3000, 2.0);
        EpamDeveloper dev4 = new EpamDeveloper("Elza");

        System.out.println(dev1.equals(rd1));
        System.out.println(dev1.equals(emp));
        System.out.println(emp.equals(dev3));
        System.out.println(emp.equals(dev4));

        System.out.println(dev3.hashCode());
        System.out.println(emp.hashCode());
        System.out.println(dev4.hashCode());

    }
}
