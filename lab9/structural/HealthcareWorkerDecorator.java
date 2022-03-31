package structural;

public abstract class HealthcareWorkerDecorator extends HealthcareWorker{

    private HealthcareWorker worker;

    public HealthcareWorkerDecorator(HealthcareWorker worker) {
        super(worker);
        this.worker = worker;
    }

    public void service() {
        worker.service();
    }

    public double getPrice() {
        return worker.getPrice();
    }
}
