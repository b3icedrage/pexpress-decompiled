package defpackage;

import android.annotation.SuppressLint;
import androidx.work.c;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class Zk2 implements Runnable {
    public final /* synthetic */ String d;
    public final /* synthetic */ RunnableC2790al2 e;

    public Zk2(RunnableC2790al2 runnableC2790al2, String str) {
        this.e = runnableC2790al2;
        this.d = str;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"SyntheticAccessor"})
    public final void run() {
        RunnableC2790al2 runnableC2790al2 = this.e;
        try {
            try {
                c.a aVar = runnableC2790al2.u.get();
                if (aVar == null) {
                    AS0.c().a(RunnableC2790al2.w, runnableC2790al2.i.c + " returned a null result. Treating it as a failure.");
                } else {
                    AS0 as0C = AS0.c();
                    String str = RunnableC2790al2.w;
                    String str2 = runnableC2790al2.i.c;
                    aVar.toString();
                    as0C.getClass();
                    runnableC2790al2.l = aVar;
                }
                runnableC2790al2.b();
            } catch (InterruptedException e) {
                e = e;
                AS0.c().b(RunnableC2790al2.w, this.d + " failed because it threw an exception/error", e);
                runnableC2790al2.b();
            } catch (CancellationException unused) {
                AS0 as0C2 = AS0.c();
                String str3 = RunnableC2790al2.w;
                as0C2.getClass();
                runnableC2790al2.b();
            } catch (ExecutionException e2) {
                e = e2;
                AS0.c().b(RunnableC2790al2.w, this.d + " failed because it threw an exception/error", e);
                runnableC2790al2.b();
            }
        } catch (Throwable th) {
            runnableC2790al2.b();
            throw th;
        }
    }
}
