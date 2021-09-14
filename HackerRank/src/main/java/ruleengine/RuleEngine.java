package ruleengine;

import java.util.ArrayList;
import java.util.List;

public class RuleEngine {
    List<Rule> rules = new ArrayList<>();

    public void loadRules() {
        rules.add(new Rule1());
        rules.add(new Rule2());
        System.out.println("Rules Loaded: " + rules.size());
    }


    public void applyRules(Emp e) {
        rules.stream().filter(r -> r.isApplicable(e)).forEach(r -> r.applyRule(e));
    }
}
