package defpackage;

import android.view.ViewTreeObserver;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: qe2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC6185qe2 implements ViewTreeObserver.OnPreDrawListener {
    public boolean d;
    public final /* synthetic */ ViewTreeObserver e;
    public final /* synthetic */ C6251qy g;
    public final /* synthetic */ C7062uo1 h;

    public ViewTreeObserverOnPreDrawListenerC6185qe2(ViewTreeObserver viewTreeObserver, C6251qy c6251qy, C7062uo1 c7062uo1) {
        this.e = viewTreeObserver;
        this.g = c6251qy;
        this.h = c7062uo1;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        C7062uo1 c7062uo1 = this.h;
        C1433Ld1 c1433Ld1B = InterfaceC5975pe2.a.b(c7062uo1);
        if (c1433Ld1B != null) {
            ViewTreeObserver viewTreeObserver = this.e;
            Intrinsics.checkNotNullExpressionValue(viewTreeObserver, "viewTreeObserver");
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            } else {
                c7062uo1.a.getViewTreeObserver().removeOnPreDrawListener(this);
            }
            if (!this.d) {
                this.d = true;
                C1717Ot1.a aVar = C1717Ot1.e;
                this.g.resumeWith(c1433Ld1B);
            }
        }
        return true;
    }
}
