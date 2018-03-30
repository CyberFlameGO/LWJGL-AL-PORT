import java.nio.ByteBuffer;
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

    public static void bufferData(int buffer, int format, ByteBuffer data, int frequency){
        org.lwjgl.openal.AL10.alBufferData(buffer, format, data, frequency);
    }

    public static void sourceI(int source, int name, int value){
        org.lwjgl.openal.AL10.alSourcei(source, name, value);
    }

    public static int getSourceI(int source, int name){
        return org.lwjgl.openal.AL10.alGetSourcei(source, name);
    }

    public static String getString(int name){
        return org.lwjgl.openal.AL10.alGetString(name);
    }

    public static int getError(){
        return org.lwjgl.openal.AL10.alGetError();
    }

    public static void sourceF(int source, int name, float value){
        org.lwjgl.openal.AL10.alSourcef(source, name, value);
    }

    public static void sourcePlay(int source){
        org.lwjgl.openal.AL10.alSourcePlay(source);
    }

    public static void sourceStop(IntBuffer sources){
        org.lwjgl.openal.AL10.alSourceStopv(sources);
    }

    public static void deleteSources(IntBuffer sources){
        org.lwjgl.openal.AL10.alDeleteSources(sources);
    }

    public static void listen3f(int name, float v1, float v2, float v3){
        org.lwjgl.openal.AL10.alListener3f(name, v1, v2, v3);
    }

    public static void source3f(int source, int name, float v1, float v2, float v3){
        org.lwjgl.openal.AL10.alSource3f(source, name, v1, v2, v3);
    }

    public static void sourceStop(int source){
        org.lwjgl.openal.AL10.alSourceStop(source);
    }
}
