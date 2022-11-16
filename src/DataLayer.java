import java.lang.reflect.Type;
import java.util.ArrayList;

public class DataLayer
{
    private static ArrayList<Model3D> models;
    private static ArrayList<Render> renders;
    private static ArrayList<Animation> animations;

    public static void addModels(ArrayList<Model3D> models, Model3D model3D) {
        models.add(model3D);
    }

    public static void addRenders(ArrayList<Render> renders, Render render) {
        renders.add(render);
    }

    public static void addAnimations(ArrayList<Animation> animations, Animation animation) {
        animations.add(animation);
    }

    public static Model3D getModel(int index) {
        return models.get(index);
    }

    public static Render getRender(int index) {
        return renders.get(index);
    }

    public static Animation getAnimation(int index) {
        return animations.get(index);
    }

    public static Model3D modelTypeConvertation(Type inputModel)
    {
        // конвертация
        return new Model3D();
    }
}
