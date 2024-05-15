// ProxyCommandExecutor to control access based on user roles
public class ProxyCommandExecutor implements CommandExecutor {
    private CommandExecutor realExecutor;
    private String userRole;

    public ProxyCommandExecutor(String userRole) {
        this.userRole = userRole;
        this.realExecutor = new RealCommandExecutor();
    }

    public void execute(String command) {
        if (userRole.equalsIgnoreCase("admin") || !command.startsWith("rm -rf")) {
            realExecutor.execute(command);
        } else {
            System.out.println("Access denied for user role: " + userRole);
        }
    }
}
