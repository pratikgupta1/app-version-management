import com.sun.tools.javac.util.StringUtils;

import java.util.*;

public class VersionManager {
    List<Device> devices;
    HashMap<String,App> allApps;

    public VersionManager(){
        this.devices = new ArrayList<Device>();
        this.allApps = new HashMap<String, App>();
    }

    public String uploadByteFile(byte[] file){
        return "www.google.com";
    }

    public void uploadVersion(String version, String appName,String url,String minSupportedOS){
        App app = new App(appName);
        AppVersion appVersion = new AppVersion(version,url,minSupportedOS);
        app.addVersionInfo(appVersion);
        allApps.put(appName,app);
    }


    public void releaseVersion(String version,ReleaseStrategy releaseStrategy,List<Device> devices){
        if(releaseStrategy instanceof PercentageReleaseStrategy){
            releaseStrategy.deploy(version, this.devices);
        }else {
            releaseStrategy.deploy(version,devices);
        }
    }

    public String checkForInstall(String appName, String currVersion, String currOS){
        String latestVersion = Collections.max(allApps.get(appName).getAllVersions().keySet());
        if(currVersion != null && currVersion.length() > 0){

            System.out.println("Latest version " + latestVersion);
            if(currVersion == latestVersion){
                return "Not available";
            }else {
                return latestVersion;
            }
        }else {
            // fresh install
            return latestVersion;
        }
    }

    public byte[] diffArray(){
        //return the "diff package"
        return new byte[10];
    }
}
