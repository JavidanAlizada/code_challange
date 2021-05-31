package main.structural.bridge.data_analytics.project;

import main.structural.bridge.data_analytics.process.cleaning.Cleaner;
import main.structural.bridge.data_analytics.process.collection.Collector;
import main.structural.bridge.data_analytics.process.model.Modelling;
import main.structural.bridge.data_analytics.process.storage.Storage;
import main.structural.bridge.data_analytics.process.visualization.Visualizer;

public abstract class DataAnalyticsProject {
    private Collector collector;
    private Storage storage;
    private Cleaner cleaner;
    private Modelling modelling;
    private Visualizer visualizer;


    protected Collector getCollector() {
        return collector;
    }

    public void setCollector(Collector collector) {
        this.collector = collector;
    }

    protected Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    protected Cleaner getCleaner() {
        return cleaner;
    }

    public void setCleaner(Cleaner cleaner) {
        this.cleaner = cleaner;
    }

    protected Modelling getModelling() {
        return modelling;
    }

    public void setModelling(Modelling modelling) {
        this.modelling = modelling;
    }

    protected Visualizer getVisualizer() {
        return visualizer;
    }

    public void setVisualizer(Visualizer visualizer) {
        this.visualizer = visualizer;
    }


    public abstract void showLifeCycle();
}
