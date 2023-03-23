package event;

import event.observer.impl.Subscriber;
import event.publisher.impl.JobSite;

public class JobSearch {
    public static void main(String[] args) {
        JobSite jobSite = new JobSite();
        Subscriber Ivan = new Subscriber("Ivan");
        Subscriber Olga = new Subscriber("Olga");
        String vacansy1 = "Junior Java";
        String vacansy2 = "Middle Python";
        jobSite.addVacansy(vacansy1);
        jobSite.addVacansy(vacansy2);
        jobSite.add(Ivan);
        jobSite.add(Olga);
        String vacansy3 = "Senior back-end";
        jobSite.addVacansy(vacansy3);
        jobSite.removeVacansy(vacansy1);
    }
}
