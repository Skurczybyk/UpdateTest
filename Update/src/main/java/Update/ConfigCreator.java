package Update;

import org.update4j.Configuration;
import org.update4j.FileMetadata;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ConfigCreator {
    private String appDir = System.getProperty("user.dir");
    private String theAppTarget = appDir + "\\TheApp\\target";
    private  String bootstrapTarget = appDir + "\\Bootstrap\\target";

    public void showPath()
    {
        System.out.println(theAppTarget + "\\TheApp-1.0-SNAPSHOT.jar");
    }
    public void createConfig() throws IOException {
        Configuration config = Configuration.builder()
                .baseUri("https://github.com/Skurczybyk/UpdateTest/tree/master/TheApp/target")
                .basePath(theAppTarget)
                .file(FileMetadata.readFrom(theAppTarget + "\\TheApp-1.0-SNAPSHOT.jar"))
                .build();
        try (Writer out = Files.newBufferedWriter(Paths.get(bootstrapTarget + "\\config.xml")))
        {config.write(out);}
    }
}
