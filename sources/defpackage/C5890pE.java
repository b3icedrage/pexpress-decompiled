package defpackage;

import java.io.Closeable;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: pE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5890pE implements Closeable, KN {

    @NotNull
    public final CoroutineContext d;

    public C5890pE(@NotNull CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.d = context;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ED.d(this.d, null);
    }

    @Override // defpackage.KN
    @NotNull
    /* JADX INFO: renamed from: f */
    public final CoroutineContext getE() {
        return this.d;
    }
}
