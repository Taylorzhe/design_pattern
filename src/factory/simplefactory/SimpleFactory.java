package factory.simplefactory;

import factory.simplefactory.product.JavaVideo;
import factory.simplefactory.product.PythonVideo;
import factory.simplefactory.product.Video;

/**
 * 描述：简单工厂实现类
 */
public class SimpleFactory{
    public Video getVedio(String type){
        if ("java".equalsIgnoreCase(type)){
            return new JavaVideo();
        }else if("python".equalsIgnoreCase(type)){
            return new PythonVideo();
        }else
            return null;
    }
}
