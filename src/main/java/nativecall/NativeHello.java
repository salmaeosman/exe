package nativecall;

public class NativeHello {
    static {
        try {
            String dllPath = System.getProperty("user.dir") + "/native/libnativehello.dll";
            System.load(dllPath);
        } catch (UnsatisfiedLinkError e) {
            System.err.println("Erreur lors du chargement de la DLL native : " + e.getMessage());
        }
    }

    public static native void hello();

    public static void main(String[] args) {
        hello();
    }
}
