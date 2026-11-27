package defpackage;

import android.content.Context;
import java.util.UUID;

/* JADX INFO: renamed from: bk2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3010bk2 implements Runnable {
    public final /* synthetic */ C6117qJ1 d;
    public final /* synthetic */ UUID e;
    public final /* synthetic */ C5565nh0 g;
    public final /* synthetic */ Context h;
    public final /* synthetic */ C3219ck2 i;

    public RunnableC3010bk2(C3219ck2 c3219ck2, C6117qJ1 c6117qJ1, UUID uuid, C5565nh0 c5565nh0, Context context) {
        this.i = c3219ck2;
        this.d = c6117qJ1;
        this.e = uuid;
        this.g = c5565nh0;
        this.h = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (!(this.d.d instanceof AbstractC4575j0.b)) {
                String string = this.e.toString();
                Bk2 bk2O = this.i.c.o(string);
                if (bk2O == null || bk2O.b.b()) {
                    throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                this.i.b.g(string, this.g);
                this.h.startService(RW1.b(this.h, ED.i(bk2O), this.g));
            }
            this.d.j(null);
        } catch (Throwable th) {
            this.d.k(th);
        }
    }
}
