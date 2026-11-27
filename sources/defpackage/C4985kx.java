package defpackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4985kx implements UN1 {
    public boolean d;
    public final /* synthetic */ InterfaceC2833av e;
    public final /* synthetic */ C3677ex.b g;
    public final /* synthetic */ C2814ao1 h;

    public C4985kx(InterfaceC2833av interfaceC2833av, C3677ex.b bVar, C2814ao1 c2814ao1) {
        this.e = interfaceC2833av;
        this.g = bVar;
        this.h = c2814ao1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (!this.d) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (!C6806tc2.i(this)) {
                this.d = true;
                this.g.a();
            }
        }
        this.e.close();
    }

    @Override // defpackage.UN1
    @NotNull
    public final LZ1 o() {
        return this.e.o();
    }

    @Override // defpackage.UN1
    public final long s0(@NotNull C1481Lu sink, long j) throws Throwable {
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            long jS0 = this.e.s0(sink, j);
            C2814ao1 c2814ao1 = this.h;
            if (jS0 == -1) {
                if (!this.d) {
                    this.d = true;
                    c2814ao1.close();
                }
                return -1L;
            }
            sink.p(c2814ao1.e, sink.e - jS0, jS0);
            c2814ao1.c();
            return jS0;
        } catch (IOException e) {
            if (this.d) {
                throw e;
            }
            this.d = true;
            this.g.a();
            throw e;
        }
    }
}
