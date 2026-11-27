package defpackage;

import java.io.Closeable;
import java.io.Flushable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface KM1 extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    void i1(@NotNull C1481Lu c1481Lu, long j);

    @NotNull
    LZ1 o();
}
