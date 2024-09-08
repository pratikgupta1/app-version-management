import java.util.ArrayList;
import java.util.List;

public class PercentageReleaseStrategy implements ReleaseStrategy{

    double percentage;
    public PercentageReleaseStrategy(double percentage){
        this.percentage = percentage;
    }

    public void deploy(String version,List<Device> devices) {
        int count = (int)(devices.size() * percentage/100);
        int factor = devices.size()/count;
        for(int i = 0 ; i < devices.size() ; i++){
            if((i+1)%factor == 0){
                System.out.println("current release version set in device "+devices.get(i).getDeviceId());
                devices.get(i).setCurrentReleaseSupported(version);
            }
        }
    }
}
