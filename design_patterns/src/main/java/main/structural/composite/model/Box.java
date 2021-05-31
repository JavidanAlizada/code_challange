package main.structural.composite.model;


import main.structural.composite.feature.Measurable;
import main.structural.composite.util.MeasureUtil;

import java.util.ArrayList;
import java.util.List;

public class Box implements Measurable {
    private List<Package> packages;

    public Box() {
        packages = new ArrayList<>();
    }

    @Override
    public float getMeasure() {
        return MeasureUtil.measurePackage(getPackages());
    }

    public List<Package> getPackages() {
        return packages;
    }

    public void setPackages(List<Package> packages) {
        this.packages = packages;
    }
}
