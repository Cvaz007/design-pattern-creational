
package decorator;
public class Main {
    public static void main(String[] args) {
        // Crear una tarea base
        Task baseTask = new BaseTask();

        // Decorar la tarea base con ReminderDecorator, PriorityDecorator y LabelDecorator
        Task decoratedTask = new ReminderDecorator(new PriorityDecorator(new LabelDecorator(baseTask)));

        // Mostrar la tarea decorada
        decoratedTask.display();

        /*
        RESULTADOS DE LA EJECUCION
        Displaying BaseTask.
        Adding label to task.
        Setting priority to task.
        Adding reminder to task.
         */
    }
}
