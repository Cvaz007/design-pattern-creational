
package decorator;
class BaseTask implements Task {
    @Override
    public void display() {
        System.out.println("Displaying BaseTask.");
    }
}