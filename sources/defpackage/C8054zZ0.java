package defpackage;

import java.io.Closeable;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: zZ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8054zZ0 implements Closeable {
    public final boolean d;

    @NotNull
    public final C1481Lu e;

    @NotNull
    public final Inflater g;

    @NotNull
    public final C1264Iz0 h;

    public C8054zZ0(boolean z) {
        this.d = z;
        C1481Lu source = new C1481Lu();
        this.e = source;
        Inflater inflater = new Inflater(true);
        this.g = inflater;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.h = new C1264Iz0(Cm2.e(source), inflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.h.close();
    }
}
