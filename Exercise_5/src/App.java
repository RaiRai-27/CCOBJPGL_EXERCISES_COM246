public class App {
    public static void main(String[] args) throws Exception {
       HdmiConnector oldConnector = new HdmiConnector();

       VgaConnector adapter = new VgaToHdmiAdapter(oldConnector);

       Monitor monitor = new Monitor();
       monitor.connect(adapter);
    }
}
