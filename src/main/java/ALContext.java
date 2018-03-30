import org.lwjgl.BufferUtils;

import java.nio.IntBuffer;

/***
 * @author George
 * @since 30-Mar-18
 */
 class ALContext {

    long context;
    private boolean valid;
    ALContext(long context) {
        this.context = context;
        this.valid = true;
    }

    public boolean equals(Object context){
        if(context instanceof ALContext){
            return ((ALContext)context).context == this.context; //dont ask
        }
        return super.equals(context);
    }

    static IntBuffer createAttrList(int frequency, int refresh, int synch){
        IntBuffer list = BufferUtils.createIntBuffer(8);
        //todo
        return list;
    }

    public long getContext() {
        return context;
    }

    public boolean isValid() {
        return valid;
    }
}
