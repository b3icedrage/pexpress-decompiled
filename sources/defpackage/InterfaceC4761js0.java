package defpackage;

import java.io.Closeable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: js0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC4761js0 extends Closeable {

    /* JADX INFO: renamed from: js0$a */
    public enum a {
        UNKNOWN,
        CONNECTED,
        DISCONNECTED,
        NO_PERMISSION
    }

    /* JADX INFO: renamed from: js0$b */
    public interface b {
        void c(@NotNull a aVar);
    }

    void G0(@NotNull b bVar);

    @NotNull
    a J0();

    @Nullable
    String O();

    boolean o0(@NotNull b bVar);
}
