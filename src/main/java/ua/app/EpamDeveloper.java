package ua.app;

/**
 * Created by Dmytro_Rybin on 9/19/2016.
 */
public class EpamDeveloper extends Employee {
    private int salary;
    private double yearsEmployed;

    public EpamDeveloper(String name) {
        super(name);
    }

    public EpamDeveloper(String name, int salary, double yearsEmployed) {
        super(name);
        this.salary = salary;
        this.yearsEmployed = yearsEmployed;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EpamDeveloper)) return false;
        if (!super.equals(o)) return false;

        EpamDeveloper that = (EpamDeveloper) o;

        if (salary != that.salary) return false;
        return Double.compare(that.yearsEmployed, yearsEmployed) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        result = 31 * result + salary;
        temp = Double.doubleToLongBits(yearsEmployed);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
