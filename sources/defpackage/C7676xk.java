package defpackage;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: xk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7676xk implements UN1 {
    public final /* synthetic */ AN1 d;
    public final /* synthetic */ IA0 e;

    public C7676xk(AN1 an1, IA0 ia0) {
        this.d = an1;
        this.e = ia0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        IA0 ia0 = this.e;
        AN1 an1 = this.d;
        an1.i();
        try {
            try {
                ia0.close();
                Unit unit = Unit.a;
                if (an1.j()) {
                    throw an1.l(null);
                }
            } catch (IOException e) {
                if (!an1.j()) {
                    throw e;
                }
                throw an1.l(e);
            }
        } catch (Throwable th) {
            an1.j();
            throw th;
        }
    }

    @Override // defpackage.UN1
    public final LZ1 o() {
        return this.d;
    }

    @Override // defpackage.UN1
    public final long s0(@NotNull C1481Lu sink, long j) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        IA0 ia0 = this.e;
        AN1 an1 = this.d;
        an1.i();
        try {
            try {
                long jS0 = ia0.s0(sink, j);
                if (an1.j()) {
                    throw an1.l(null);
                }
                return jS0;
            } catch (IOException e) {
                if (an1.j()) {
                    throw an1.l(e);
                }
                throw e;
            }
        } catch (Throwable th) {
            an1.j();
            throw th;
        }
    }

    @NotNull
    public final String toString() {
        return "AsyncTimeout.source(" + this.e + ')';
    }
}
