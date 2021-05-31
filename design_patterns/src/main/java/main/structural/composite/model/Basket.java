package main.structural.composite.model;

import main.structural.composite.feature.Measurable;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Measurable> measurables;

    public Basket() {
        measurables = new ArrayList<>();
    }

    public List<Measurable> getMeasurables() {
        return measurables;
    }

    public void setMeasurables(List<Measurable> measurables) {
        this.measurables = measurables;
    }

    public void add(Measurable measurable) {
        getMeasurables().add(measurable);
    }

    public void remove(Measurable measurable) {
        getMeasurables().remove(measurable);
    }

    public float getSummaryWeight() {
        float weight = 0f;
        for (Measurable measurable : measurables) {
            weight += measurable.getMeasure();
        }
        return weight;
    }
}
