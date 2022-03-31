package structural;

import java.util.LinkedHashSet;
import java.util.Set;

public class HealthcareWorkerTeam implements HealthcareServiceable {

    private Set<HealthcareServiceable> members;

    public HealthcareWorkerTeam(){
        members = new LinkedHashSet<HealthcareServiceable>();
    }


    public void addMember(HealthcareServiceable person){
        members.add(person);
    }

    public void removeMember(HealthcareServiceable person){
        members.remove(person);
    }

    @Override
    public void service() {
        for (HealthcareServiceable person: members
             ) {
            person.service();
        }
    }

    @Override
    public double getPrice() {
        double keep = 0;
        for (HealthcareServiceable person: members
        ) {
            keep = keep + person.getPrice();
        }
        return keep;
    }
}
