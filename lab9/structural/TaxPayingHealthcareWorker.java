package structural;

public class TaxPayingHealthcareWorker extends HealthcareWorkerDecorator{

    public TaxPayingHealthcareWorker(HealthcareWorker worker) {
        super(worker);
        System.out.println("Decorate " + super.getName() + " with TaxPaying" );

    }
    public double getPrice() {
        return super.getPrice() + (super.getPrice()*10.0/100.0);
    }
}
