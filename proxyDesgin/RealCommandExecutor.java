// RealCommandExecutor that actually executes the commands
public class RealCommandExecutor implements CommandExecutor {
    public void execute(String command) {
        System.out.println("Executing command: " + command);
    }
}
