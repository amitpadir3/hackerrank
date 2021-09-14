package ruleengine;

public class RuleEngineMain {

    public static void main(String ar[]) {

        RuleEngine ruleEngine = new RuleEngine();
        ruleEngine.loadRules();
        Emp e = new Emp("1", "Amit", "1000");
        ruleEngine.applyRules(e);
    }
}

class Emp {
    String id;
    String name;
    String salary;

    public Emp(String id, String name, String salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}