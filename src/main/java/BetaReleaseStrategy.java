import java.util.List;

public class BetaReleaseStrategy implements ReleaseStrategy{
    List<Device> devices;
    public BetaReleaseStrategy(List<Device> devices){
        this.devices = devices;
    }
    public void deploy(String version,List<Device> devices2) {
        for(Device device : devices){
            device.setCurrentReleaseSupported(version);
            System.out.println("current release set "+version);
        }
    }

}
