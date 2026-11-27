package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Lh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1444Lh0 implements KM1 {

    @NotNull
    public final KM1 d;

    public AbstractC1444Lh0(@NotNull KM1 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.d = delegate;
    }

    @Override // defpackage.KM1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.d.close();
    }

    @Override // defpackage.KM1, java.io.Flushable
    public void flush() {
        this.d.flush();
    }

    @Override // defpackage.KM1
    public void i1(@NotNull C1481Lu source, long j) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.d.i1(source, j);
    }

    @Override // defpackage.KM1
    @NotNull
    public final LZ1 o() {
        return this.d.o();
    }

    @NotNull
    public final String toString() {
        return getClass().getSimpleName() + '(' + this.d + ')';
    }
}
