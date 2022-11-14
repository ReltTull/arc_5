import java.sql.Connection;

public class Presentation
{
    private static Model3D model3D;
    private static Redactor redactor;

    public static void setModel3D(Model3D model3D) {
        Presentation.model3D = model3D;
    }

    public static void setRedactor(Redactor redactor) {
        Presentation.redactor = redactor;
    }

    public static Model3D getModel3D() {
        return model3D;
    }

    public static Redactor getRedactor() {
        return redactor;
    }

    private static void observeModel(Model3D model)
    {
        // производим операции по обзору
    }

    private static void loadModel(Model3D model3D, Connection connection)
    {
        // операции с БД
    }
}
