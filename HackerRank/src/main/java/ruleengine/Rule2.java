package ruleengine;

public class Rule2 implements Rule {

    @Override
    public void applyRule(Emp e) {
        System.out.println("Salary Less Than 10K Rule  Executed");
    }

    @Override
    public boolean isApplicable(Emp e) {
        return Integer.valueOf(e.getSalary()) < 10000;
    }
}
