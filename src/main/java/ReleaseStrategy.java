import java.util.List;

public interface ReleaseStrategy {

    void deploy(String version, List<Device> devices);


}
