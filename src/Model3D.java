import java.lang.reflect.Type;

public class Model3D
{
    private static Type inputParametr;

    public static void setInputParametr(Type inputParametr) {
        Model3D.inputParametr = inputParametr;
    }

    public static Type getInputParametr() {
        return inputParametr;
    }

    private static Model3D createModel3D()
    {
        return new Model3D();
    }
}
