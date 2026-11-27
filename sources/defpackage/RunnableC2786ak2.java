package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.work.c;
import java.util.UUID;

/* JADX INFO: renamed from: ak2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2786ak2 implements Runnable {
    public static final /* synthetic */ int k = 0;
    public final C6117qJ1<Void> d = new C6117qJ1<>();
    public final Context e;
    public final Bk2 g;
    public final c h;
    public final C3219ck2 i;
    public final C4946kk2 j;

    /* JADX INFO: renamed from: ak2$a */
    public class a implements Runnable {
        public final /* synthetic */ C6117qJ1 d;

        public a(C6117qJ1 c6117qJ1) {
            this.d = c6117qJ1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (RunnableC2786ak2.this.d.d instanceof AbstractC4575j0.b) {
                return;
            }
            try {
                C5565nh0 c5565nh0 = (C5565nh0) this.d.get();
                if (c5565nh0 == null) {
                    throw new IllegalStateException("Worker was marked important (" + RunnableC2786ak2.this.g.c + ") but did not provide ForegroundInfo");
                }
                AS0 as0C = AS0.c();
                int i = RunnableC2786ak2.k;
                String str = RunnableC2786ak2.this.g.c;
                as0C.getClass();
                RunnableC2786ak2 runnableC2786ak2 = RunnableC2786ak2.this;
                C6117qJ1<Void> c6117qJ1 = runnableC2786ak2.d;
                C3219ck2 c3219ck2 = runnableC2786ak2.i;
                Context context = runnableC2786ak2.e;
                UUID id = runnableC2786ak2.h.getId();
                c3219ck2.getClass();
                C6117qJ1 c6117qJ2 = new C6117qJ1();
                c3219ck2.a.a(new RunnableC3010bk2(c3219ck2, c6117qJ2, id, c5565nh0, context));
                c6117qJ1.l(c6117qJ2);
            } catch (Throwable th) {
                RunnableC2786ak2.this.d.k(th);
            }
        }
    }

    static {
        AS0.d("WorkForegroundRunnable");
    }

    @SuppressLint({"LambdaLast"})
    public RunnableC2786ak2(@NonNull Context context, @NonNull Bk2 bk2, @NonNull c cVar, @NonNull C3219ck2 c3219ck2, @NonNull C4946kk2 c4946kk2) {
        this.e = context;
        this.g = bk2;
        this.h = cVar;
        this.i = c3219ck2;
        this.j = c4946kk2;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"UnsafeExperimentalUsageError"})
    public final void run() {
        if (!this.g.q || Build.VERSION.SDK_INT >= 31) {
            this.d.j(null);
            return;
        }
        C6117qJ1 c6117qJ1 = new C6117qJ1();
        C4946kk2 c4946kk2 = this.j;
        c4946kk2.c.execute(new Zj2(0, this, c6117qJ1));
        c6117qJ1.f(new a(c6117qJ1), c4946kk2.c);
    }
}
