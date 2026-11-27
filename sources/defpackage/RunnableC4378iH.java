package defpackage;

import com.appsflyer.internal.AFa1tSDK;
import com.appsflyer.internal.AFc1bSDK;
import com.google.android.material.sidesheet.SideSheetBehavior;
import io.sentry.android.core.performance.h;

/* JADX INFO: renamed from: iH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC4378iH implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ RunnableC4378iH(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                DialogC4636jH.a((DialogC4636jH) this.e);
                break;
            case 1:
                SideSheetBehavior.c cVar = (SideSheetBehavior.c) this.e;
                cVar.b = false;
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                Gd2 gd2 = sideSheetBehavior.i;
                if (gd2 != null && gd2.f()) {
                    cVar.a(cVar.a);
                } else if (sideSheetBehavior.h == 2) {
                    sideSheetBehavior.s(cVar.a);
                }
                break;
            case 2:
                AFa1tSDK.d((AFc1bSDK) this.e);
                break;
            default:
                h.a(h.this);
                break;
        }
    }
}
