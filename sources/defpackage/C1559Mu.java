package defpackage;

import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Mu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1559Mu extends OutputStream {
    public final /* synthetic */ C1481Lu d;

    public C1559Mu(C1481Lu c1481Lu) {
        this.d = c1481Lu;
    }

    @NotNull
    public final String toString() {
        return this.d + ".outputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.d.j1(i);
    }

    @Override // java.io.OutputStream
    public final void write(@NotNull byte[] data, int i, int i2) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.d.c1(data, i, i2);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
    }
}
