import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Device {
    String deviceId;
    String currOS;
    String currentReleaseSupported;
    public Device(String deviceId, String currOS){
        this.deviceId = deviceId;
        this.currOS = currOS;
    }

}
