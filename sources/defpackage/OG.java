package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public class OG {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(OG.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    @NotNull
    public final Throwable a;

    public OG(@NotNull Throwable th, boolean z) {
        this.a = th;
        this._handled$volatile = z ? 1 : 0;
    }

    @NotNull
    public final String toString() {
        return getClass().getSimpleName() + '[' + this.a + ']';
    }
}
