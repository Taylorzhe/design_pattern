package factory.simplefactory.product;

import factory.simplefactory.product.Video;

/**
 * 描述：
 */
public class PythonVideo extends Video {
    @Override
    public void product() {
        System.out.println("Python类的视频");
    }
}
