public class VgaToHdmiAdapter implements VgaConnector {
   private HdmiConnector hdmiConnector;

   public VgaToHdmiAdapter(HdmiConnector hdmiConnector) {
    this.hdmiConnector = hdmiConnector;
   }

   @Override
   public void connectWithVga() {
    System.out.println("Adapting HDMI to VGA...");
    hdmiConnector.connectwithHdmi();
   }
}