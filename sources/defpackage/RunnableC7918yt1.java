package defpackage;

import android.graphics.Typeface;
import io.sentry.cache.m;

/* JADX INFO: renamed from: yt1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC7918yt1 implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ RunnableC7918yt1(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                ((C7708xt1.e) this.e).c((Typeface) this.g);
                break;
            default:
                m mVar = (m) this.e;
                NG1 ng1 = (NG1) this.g;
                if (ng1 != null) {
                    mVar.f(ng1, "level.json");
                } else {
                    mVar.a("level.json");
                }
                break;
        }
    }
}
