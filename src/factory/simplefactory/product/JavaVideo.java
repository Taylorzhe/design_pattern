package factory.simplefactory.product;

import factory.simplefactory.product.Video;

/**
 * 描述：
 */
public class JavaVideo extends Video {
    @Override
    public void product() {
        System.out.println("Java类的视频");
    }
}
