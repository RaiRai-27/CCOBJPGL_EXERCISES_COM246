public class Monitor {
    public void connect(VgaConnector adapter) {
        System.out.println("Monitor Expecting to be connected to a VGA port...");
        adapter.connectWithVga();
    }
}
