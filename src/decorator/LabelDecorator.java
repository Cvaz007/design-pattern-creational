
package decorator;
class LabelDecorator extends DecoratorTask {
    public LabelDecorator(Task baseTask) {
        super(baseTask);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Adding label to task.");
    }
}
