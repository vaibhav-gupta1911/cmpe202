public final class PatientParentObserver implements ParentObserver {

    @Override
    public void observeTestDate(final String name) {
        // Print the details of newly announced test
        System.out.println("Lets prepare for the next test: " + name);
    }
}