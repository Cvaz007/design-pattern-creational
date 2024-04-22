
package decorator;
class PriorityDecorator extends DecoratorTask {
    public PriorityDecorator(Task baseTask) {
        super(baseTask);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Setting priority to task.");
    }
}
