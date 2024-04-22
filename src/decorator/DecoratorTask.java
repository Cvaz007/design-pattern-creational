
package decorator;
class DecoratorTask implements Task {
    private Task baseTask;

    public DecoratorTask(Task baseTask) {
        this.baseTask = baseTask;
    }

    @Override
    public void display() {
        baseTask.display();
    }
}
