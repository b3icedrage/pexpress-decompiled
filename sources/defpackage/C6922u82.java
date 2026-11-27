package defpackage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: u82, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6922u82 extends OutputStream {

    @NotNull
    public final FileOutputStream d;

    public C6922u82(@NotNull FileOutputStream fileOutputStream) {
        Intrinsics.checkNotNullParameter(fileOutputStream, "fileOutputStream");
        this.d = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.d.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.d.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(@NotNull byte[] b) throws IOException {
        Intrinsics.checkNotNullParameter(b, "b");
        this.d.write(b);
    }

    @Override // java.io.OutputStream
    public final void write(@NotNull byte[] bytes, int i, int i2) throws IOException {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.d.write(bytes, i, i2);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
