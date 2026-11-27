package defpackage;

import io.sentry.android.core.b0;
import io.sentry.android.core.internal.modules.a;
import kotlin.Unit;

/* JADX INFO: renamed from: Bl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0675Bl implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ RunnableC0675Bl(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                C0831Dl.a aVar = (C0831Dl.a) this.e;
                C0831Dl c0831Dl = aVar.j;
                synchronized (aVar) {
                    try {
                        if (c0831Dl.c.contains(aVar)) {
                            aVar.e();
                        }
                        Unit unit = Unit.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                StringBuilder sb = new StringBuilder("Service took too long to process intent: ");
                Rj2.a aVar2 = (Rj2.a) this.e;
                sb.append(aVar2.a.getAction());
                sb.append(" Releasing WakeLock.");
                b0.e("FirebaseMessaging", sb.toString());
                aVar2.b.trySetResult(null);
                return;
            default:
                ((a) this.e).a();
                return;
        }
    }
}
