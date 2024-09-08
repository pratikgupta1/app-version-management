import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@Getter
@Setter
public class App {
    private String appName;
    private HashMap<String,AppVersion> allVersions;

    public App(String appName){
        this.appName = appName;
        this.allVersions = new HashMap<String, AppVersion>();
    }

    public void addVersionInfo(AppVersion appVersion){
        allVersions.put(appVersion.getVersion(),appVersion);
    }
}
