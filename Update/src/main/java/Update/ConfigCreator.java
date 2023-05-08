package Update;

import org.update4j.Configuration;

public class ConfigCreator {
    private String appDir = System.getProperty("user.dir");
    private  String bootstrapTarget = appDir + "\\Bootstrap\\target";
    public void createConfig()
    {
        Configuration config = Configuration.builder()

                .build();
    }
}
