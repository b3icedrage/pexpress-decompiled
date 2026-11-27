package defpackage;

import io.sentry.android.core.C4498i;

/* JADX INFO: renamed from: fk2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC3848fk2 implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ RunnableC3848fk2(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                C4058gk2 c4058gk2 = (C4058gk2) this.e;
                c4058gk2.getClass();
                c4058gk2.d.g(new C7218va2(c4058gk2, 1));
                break;
            default:
                ((C4498i) this.e).h(true);
                break;
        }
    }
}
