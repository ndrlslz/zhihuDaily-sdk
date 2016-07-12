import api.ZhihuDaily;
import model.ImageSize;
import model.StartImage;
import model.Version;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ZhihuDailyUnitTest {
    private ZhihuDaily zhihuDaily;

    @Before
    public void setUp() {
        zhihuDaily = ZhihuDailyClient.create();
    }

    @Test
    public void testGetStartImage() throws IOException {
        StartImage startImage = zhihuDaily.getStartImage(ImageSize.SIZE_1080P).execute().body();
        assertNotNull(startImage);
        assertNotNull(startImage.getImg());
        assertNotNull(startImage.getText());
    }

    @Test
    public void testGetVersionOfAndroid() throws IOException {
        final String currentVersion = "2.3.0";

        Version version = zhihuDaily.getVersionOfAndroid(currentVersion).execute().body();
        assertNotNull(version);
        assertNotNull(version.getLatest());
        assertNotNull(version.getStatus());
    }

    @Test
    public void testGetVersionOfIOS() throws IOException {
        final String currentVersion = "2.3.0";

        Version version = zhihuDaily.getVersionOfIOS(currentVersion).execute().body();
        assertNotNull(version);
        assertNotNull(version.getStatus());
        assertNotNull(version.getLatest());
    }

}
