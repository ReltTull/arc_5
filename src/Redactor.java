public class Redactor
{
    private static Model3D model3D;

    public static void setModel3D(Model3D model3D) {
        Redactor.model3D = model3D;
    }

    public static Model3D getModel3D() {
        return model3D;
    }

    private static Model3D redactModel(Model3D model3D)
    {
        // операции с моделью 3д
        return model3D;
    }
}
