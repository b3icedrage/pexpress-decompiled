package defpackage;

import java.io.Closeable;
import java.util.zip.Deflater;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: wZ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7424wZ0 implements Closeable {
    public final boolean d;

    @NotNull
    public final C1481Lu e;

    @NotNull
    public final Deflater g;

    @NotNull
    public final FW h;

    public C7424wZ0(boolean z) {
        this.d = z;
        C1481Lu c1481Lu = new C1481Lu();
        this.e = c1481Lu;
        Deflater deflater = new Deflater(-1, true);
        this.g = deflater;
        this.h = new FW(c1481Lu, deflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        this.h.close();
    }
}
