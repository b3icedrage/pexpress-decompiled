package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: uo1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7062uo1<T extends View> implements InterfaceC5975pe2<T> {

    @NotNull
    public final T a;

    /* JADX WARN: Multi-variable type inference failed */
    public C7062uo1(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.a = view;
    }

    @Override // defpackage.OM1
    @Nullable
    public final Object a(@NotNull C5170lo1 frame) {
        C1433Ld1 c1433Ld1B = InterfaceC5975pe2.a.b(this);
        if (c1433Ld1B != null) {
            return c1433Ld1B;
        }
        C6251qy c6251qy = new C6251qy(1, C5885pC0.b(frame));
        c6251qy.r();
        ViewTreeObserver viewTreeObserver = this.a.getViewTreeObserver();
        ViewTreeObserverOnPreDrawListenerC6185qe2 viewTreeObserverOnPreDrawListenerC6185qe2 = new ViewTreeObserverOnPreDrawListenerC6185qe2(viewTreeObserver, c6251qy, this);
        viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC6185qe2);
        c6251qy.u(new C6394re2(viewTreeObserver, viewTreeObserverOnPreDrawListenerC6185qe2, this));
        Object objQ = c6251qy.q();
        if (objQ == MN.d) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objQ;
    }

    @Override // defpackage.InterfaceC5975pe2
    @NotNull
    public final T b() {
        return this.a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7062uo1) {
            return Intrinsics.a(this.a, ((C7062uo1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "RealViewSizeResolver(view=" + this.a + ", subtractPadding=true)";
    }
}
