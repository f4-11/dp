package com.test.dp.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Department extends HumanResource {
    private List<HumanResource> subNodes = new ArrayList<>();
    public Department(long id) {
        super(id);
    }

    @Override
    public double calculateSalary() {
        double total = 0;
        for (HumanResource subNode : subNodes) {
            total += subNode.calculateSalary();
        }
        this.salary = total;
        return total;
    }
    public void addSubNode(HumanResource subNode) {
        subNodes.add(subNode);
    }
}
