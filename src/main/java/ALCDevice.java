import java.util.HashMap;
import java.util.Objects;

/***
 * @author George
 * @since 30-Mar-18
 */
public class ALCDevice {

    long device;
    private boolean valid;
    private final HashMap<Long, ALContext> contexts = new HashMap<Long, ALContext>();

    public ALCDevice(long device) {
        this.device = device;
        this.valid = true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ALCDevice alcDevice = (ALCDevice) o;
        return device == alcDevice.device &&
                valid == alcDevice.valid &&
                Objects.equals(contexts, alcDevice.contexts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(device, valid, contexts);
    }

    void addContext(ALContext context){
        synchronized (context){
            contexts.put(context.context, context);
        }
    }

    void removeContext(ALContext context){
        synchronized (context){
            contexts.remove(context.context, context);
        }
    }

    public long getDevice() {
        return device;
    }

    public void setDevice(long device) {
        this.device = device;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public HashMap<Long, ALContext> getContexts() {
        return contexts;
    }
}
