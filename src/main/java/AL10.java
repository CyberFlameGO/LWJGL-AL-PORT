import java.nio.IntBuffer;

/***
 * @author George
 * @since 30-Mar-18
 */
public class AL10 {

    public static final int AL_NO_ERROR = org.lwjgl.openal.AL10.AL_NO_ERROR;
    public static final int AL_BUFFER = org.lwjgl.openal.AL10.AL_BUFFER;
    public static final int AL_SOURCE_STATE = org.lwjgl.openal.AL10.AL_SOURCE_STATE;
    public static final int AL_PLAYING = org.lwjgl.openal.AL10.AL_PLAYING;
    public static final int AL_LOOPING = org.lwjgl.openal.AL10.AL_LOOPING;
    public static final int AL_TRUE = org.lwjgl.openal.AL10.AL_TRUE;
    public static final int AL_REFERENCE_DISTANCE = org.lwjgl.openal.AL10.AL_REFERENCE_DISTANCE;
    public static final int AL_ROLLOFF_FACTOR = org.lwjgl.openal.AL10.AL_ROLLOFF_FACTOR;
    public static final int AL_POSITION = org.lwjgl.openal.AL10.AL_POSITION;

    public static void genBuffers(IntBuffer buffer){
        org.lwjgl.openal.AL10.alGenBuffers(buffer);
    }

    public static void genSources(IntBuffer buffer){
        org.lwjgl.openal.AL10.alGenSources(buffer);
    }
}
