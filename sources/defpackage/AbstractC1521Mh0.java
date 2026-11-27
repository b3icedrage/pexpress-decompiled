package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Mh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1521Mh0 implements UN1 {

    @NotNull
    public final UN1 d;

    public AbstractC1521Mh0(@NotNull UN1 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.d = delegate;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.d.close();
    }

    @Override // defpackage.UN1
    @NotNull
    public final LZ1 o() {
        return this.d.o();
    }

    @Override // defpackage.UN1
    public long s0(@NotNull C1481Lu sink, long j) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        return this.d.s0(sink, j);
    }

    @NotNull
    public final String toString() {
        return getClass().getSimpleName() + '(' + this.d + ')';
    }
}
