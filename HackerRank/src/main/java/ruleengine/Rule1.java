package ruleengine;

public class Rule1 implements Rule {

    @Override
    public void applyRule(Emp e) {

        System.out.println("Salary Greater Than 10K Rule  Executed");
    }

    @Override
    public boolean isApplicable(Emp e) {
        return Integer.valueOf(e.getSalary()) > 10000;
    }
}
