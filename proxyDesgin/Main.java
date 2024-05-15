// Main class to test CommandExecutor with Proxy Pattern
public class Main {
    public static void main(String[] args) {
        // Admin user
        CommandExecutor adminExecutor = new ProxyCommandExecutor("admin");
        adminExecutor.execute("ls -l");
        adminExecutor.execute("rm -rf /");

        // Normal user
        CommandExecutor normalExecutor = new ProxyCommandExecutor("normal_user");
        normalExecutor.execute("ls -l");
        normalExecutor.execute("rm -rf /");
    }
}
