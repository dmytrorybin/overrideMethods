package ua.app;

/**
 * Created by Dmytro_Rybin on 9/19/2016.
 */
public class EpamRD extends Employee {
    private int salary;
    private double yearsEmployed;
    private RDSpecialization spec;

    public EpamRD(String name, int salary, double yearsEmployed, RDSpecialization spec) {
        super(name);
        this.salary = salary;
        this.yearsEmployed = yearsEmployed;
        this.name = name;
        this.spec = spec;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EpamRD)) return false;

        EpamRD epamRD = (EpamRD) o;

        if (salary != epamRD.salary) return false;
        if (Double.compare(epamRD.yearsEmployed, yearsEmployed) != 0) return false;
        return spec == epamRD.spec;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = salary;
        temp = Double.doubleToLongBits(yearsEmployed);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (spec != null ? spec.hashCode() : 0);
        return result;
    }
}
