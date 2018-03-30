import org.lwjgl.openal.AL;

/***
 * @author George
 * @since 30-Mar-18
 */
public class ALC10 {

    static ALContext context;

    public static final int ALC_FREQUENCY = org.lwjgl.openal.ALC10.ALC_FREQUENCY;
    public static final int ALC_REFRESH = org.lwjgl.openal.ALC10.ALC_REFRESH;
    public static final int ALC_SYNC = org.lwjgl.openal.ALC10.ALC_SYNC;
    public static final int ALC_NO_ERROR = org.lwjgl.openal.ALC10.ALC_NO_ERROR;
    public static final int ALC_DEFAULT_DEVICE_SPECIFIER = org.lwjgl.openal.ALC10.ALC_DEFAULT_DEVICE_SPECIFIER;
    public static final int ALC_DEVICE_SPECIFIER = org.lwjgl.openal.ALC10.ALC_DEVICE_SPECIFIER;


    public static int getError(ALCDevice device){
        if(device == null){
            return org.lwjgl.openal.AL10.alGetError();
        }
        return org.lwjgl.openal.AL10.alGetError();
    }

    public static java.lang.String alcGetString(ALCDevice device, int pname) {
        if (device == null) {
            return org.lwjgl.openal.ALC10.alcGetString(device.toString());
        }

        return org.lwjgl.openal.ALC10.alcGetString(device.device, pname);
    }

    public static boolean alcIsExtensionPresent(ALCDevice device, java.lang.String extName) {
        if (device == null) {
            return org.lwjgl.openal.ALC10.alcIsExtensionPresent(AL.alcDevice.device, extName);
        }

        return org.lwjgl.openal.ALC10.alcIsExtensionPresent(device.device, extName);
    }

    public static ALContext alcCreateContext(ALCDevice device, java.nio.IntBuffer attrList) {
        long alContextHandle = org.lwjgl.openal.ALC10.alcCreateContext(device.device, attrList);
        context = new ALContext(alContextHandle);
        return context;
    }

    public static ALContext alcGetCurrentContext() {
        return context;
    }

    public static ALCDevice alcGetContextsDevice(ALContext context) {
        return AL.alcDevice;
    }

    public static void alcGetInteger(ALCDevice device, int pname, java.nio.IntBuffer integerdata) {
        org.lwjgl.openal.ALC10.alcGetInteger(device.device, pname, integerdata);
    }
}