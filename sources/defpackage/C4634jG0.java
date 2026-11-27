package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: jG0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4634jG0 {

    @NotNull
    private volatile /* synthetic */ Object _closeWaitJob;

    @NotNull
    private volatile /* synthetic */ int closed;

    static {
        AtomicReferenceFieldUpdater.newUpdater(C4634jG0.class, Object.class, "_closeWaitJob");
    }
}
