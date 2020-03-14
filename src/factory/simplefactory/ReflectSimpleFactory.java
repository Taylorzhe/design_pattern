package factory.simplefactory;

import factory.simplefactory.product.Video;

/**
 * 描述：通过反射实现简单工厂，不需要更改这个类的代码，只是传参的时候传入商品类就可以
 */
public class ReflectSimpleFactory {

    public Video getVideo(Class c){
        Video video = null;
        try {
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }
}
