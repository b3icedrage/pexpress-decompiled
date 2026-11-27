package defpackage;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: wk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7466wk implements KM1 {
    public final /* synthetic */ AN1 d;
    public final /* synthetic */ C1190Ia1 e;

    public C7466wk(AN1 an1, C1190Ia1 c1190Ia1) {
        this.d = an1;
        this.e = c1190Ia1;
    }

    @Override // defpackage.KM1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        C1190Ia1 c1190Ia1 = this.e;
        AN1 an1 = this.d;
        an1.i();
        try {
            try {
                c1190Ia1.close();
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

    @Override // defpackage.KM1, java.io.Flushable
    public final void flush() throws IOException {
        C1190Ia1 c1190Ia1 = this.e;
        AN1 an1 = this.d;
        an1.i();
        try {
            try {
                c1190Ia1.flush();
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

    @Override // defpackage.KM1
    public final void i1(@NotNull C1481Lu source, long j) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        C5417n.b(source.e, 0L, j);
        while (true) {
            long j2 = 0;
            if (j <= 0) {
                return;
            }
            C7782yE1 c7782yE1 = source.d;
            Intrinsics.checkNotNull(c7782yE1);
            while (j2 < 65536) {
                j2 += (long) (c7782yE1.c - c7782yE1.b);
                if (j2 >= j) {
                    j2 = j;
                    break;
                } else {
                    c7782yE1 = c7782yE1.f;
                    Intrinsics.checkNotNull(c7782yE1);
                }
            }
            C1190Ia1 c1190Ia1 = this.e;
            AN1 an1 = this.d;
            an1.i();
            try {
                try {
                    c1190Ia1.i1(source, j2);
                    Unit unit = Unit.a;
                    if (an1.j()) {
                        throw an1.l(null);
                    }
                    j -= j2;
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
    }

    @Override // defpackage.KM1
    public final LZ1 o() {
        return this.d;
    }

    @NotNull
    public final String toString() {
        return "AsyncTimeout.sink(" + this.e + ')';
    }
}
