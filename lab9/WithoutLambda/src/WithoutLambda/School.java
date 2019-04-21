import java.util.ArrayList;
import java.util.List;

public final class School implements Subject {
    public static void main(final String[] args) {

        final School school = new School();
        AnxiousParentObserver anxiousParent = new AnxiousParentObserver();
        PatientParentObserver patientParent = new PatientParentObserver();

        school.attach(anxiousParent);
        school.attach(patientParent);

        school.notify1("Maths - Monday");
        school.notify1("Science - Friday");
    }

    private final List<ParentObserver> parents = new ArrayList<ParentObserver>();

    @Override
    public void notify1(final String name) {
        for (final ParentObserver parent : this.parents) {
            parent.observeTestDate(name);
        }
    }

    @Override
    public void attach(final ParentObserver parent) {
        this.parents.add(parent);
    }

    @Override
    public void detach(final ParentObserver parent) {
        this.parents.remove(parent);
    }
}