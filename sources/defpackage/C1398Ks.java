package defpackage;

import java.io.EOFException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Ks, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1398Ks implements KM1 {
    @Override // defpackage.KM1
    public final void i1(@NotNull C1481Lu source, long j) throws EOFException {
        Intrinsics.checkNotNullParameter(source, "source");
        source.r(j);
    }

    @Override // defpackage.KM1
    @NotNull
    public final LZ1 o() {
        return LZ1.d;
    }

    @Override // defpackage.KM1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.KM1, java.io.Flushable
    public final void flush() {
    }
}
