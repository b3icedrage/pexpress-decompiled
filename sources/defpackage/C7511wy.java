package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: wy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7511wy extends OG {
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(C7511wy.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public C7511wy(@NotNull C6251qy c6251qy, @Nullable Throwable th, boolean z) {
        if (th == null) {
            th = new CancellationException("Continuation " + c6251qy + " was cancelled normally");
        }
        super(th, z);
        this._resumed$volatile = 0;
    }
}
