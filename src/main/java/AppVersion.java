import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AppVersion {

    private String version;
    private String url;
    private String minSupportedOS;
    public AppVersion(String version, String url, String minSupportedOS){
        this.url = url;
        this.version = version;
        this.minSupportedOS = minSupportedOS;
    }

}
