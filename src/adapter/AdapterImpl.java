
package adapter;
class AdapterImpl implements Target {
    private LegacySystem legacySystem;

    public AdapterImpl(LegacySystem legacySystem) {
        this.legacySystem = legacySystem;
    }

    @Override
    public void request() {
        legacySystem.legacyRequest();
    }
}