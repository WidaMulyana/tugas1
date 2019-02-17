public class Manajer extends Employee {
    private Long bonus;

    public Manajer(Long bonus, String name, String address, Long Salary) {
        super(name, address, Salary);
        this.bonus = bonus;
    }

    public Long getBonus() {
        return bonus;
    }

    public void setBonus(Long bonus) {
        this.bonus = bonus;
    }

    @Override
    public Long getSalary() {
        return super.getSalary(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
