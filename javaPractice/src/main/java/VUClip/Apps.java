package VUClip;

public class Apps {
    String appName;
    String apiName;
    String version;

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Apps(String appName, String apiName, String version) {
        this.appName = appName;
        this.apiName = apiName;
        this.version = version;
    }
}
