package defpackage;

import android.content.Intent;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Y60 implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ Y60(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
        this.h = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                ((Z60) this.e).lambda$processIntent$0((Intent) this.g, (TaskCompletionSource) this.h);
                break;
            default:
                C2872b52 c2872b52 = (C2872b52) this.e;
                c2872b52.getClass();
                C5127ld1.a aVarC = C5127ld1.C();
                aVarC.p();
                C5127ld1.x((C5127ld1) aVarC.e, (C6416rk0) this.g);
                c2872b52.d(aVarC, (EnumC1134Hi) this.h);
                break;
        }
    }
}
