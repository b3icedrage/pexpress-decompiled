package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class QQ0 implements Runnable {
    public final /* synthetic */ C6251qy d;
    public final /* synthetic */ PQ0<Object> e;

    public QQ0(C6251qy c6251qy, PQ0 pq0) {
        this.d = c6251qy;
        this.e = pq0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C6251qy c6251qy = this.d;
        try {
            C1717Ot1.a aVar = C1717Ot1.e;
            c6251qy.resumeWith(this.e.get());
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                cause = th;
            }
            if (th instanceof CancellationException) {
                c6251qy.l(cause);
            } else {
                C1717Ot1.a aVar2 = C1717Ot1.e;
                c6251qy.resumeWith(C1795Pt1.a(cause));
            }
        }
    }
}
