package ruleengine;

public interface Rule {
    void applyRule(Emp e);

    boolean isApplicable(Emp e);
}