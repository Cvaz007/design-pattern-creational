
package decorator;
class ReminderDecorator extends DecoratorTask {
    public ReminderDecorator(Task baseTask) {
        super(baseTask);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Adding reminder to task.");
    }
}
