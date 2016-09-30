package ua.app;

/**
 * Created by Dmytro_Rybin on 9/19/2016.
 */
public class Employee {
    protected String name;

    Employee(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        return name.equals(employee.name);

    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
