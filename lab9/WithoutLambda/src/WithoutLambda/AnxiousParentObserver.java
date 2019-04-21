public final class AnxiousParentObserver implements ParentObserver {

    @Override
    public void observeTestDate(final String name) {
        // Print the details of newly announced test
        System.out.println("Oh No, again a test: " + name);
    }
}