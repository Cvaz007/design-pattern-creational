
package adapter;
public class Main {
    public static void main(String[] args) {
        // Crear instancia de Adaptee y Adapter
        Adaptee adaptee = new Adaptee();
        Adapter adapter = new Adapter(adaptee);

        // Usar el Adapter para realizar la solicitud
        adapter.request(); // Llamada a specificRequest de Adaptee

        // Crear instancia de LegacySystem y AdapterImpl
        LegacySystem legacySystem = new LegacySystem();
        AdapterImpl adapterImpl = new AdapterImpl(legacySystem);

        // Usar el AdapterImpl para realizar la solicitud
        adapterImpl.request(); // Llamada a legacyRequest de LegacySystem

        /*
        RESULTADOS DE LA EJECUCION
        Specific request managed by Adaptee.
        Legacy application managed by LegacySystem.
         */
    }
}