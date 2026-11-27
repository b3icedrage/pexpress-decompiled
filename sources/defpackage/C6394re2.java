package defpackage;

import android.view.ViewTreeObserver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: re2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6394re2 extends ML0 implements Function1<Throwable, Unit> {
    public final /* synthetic */ ViewTreeObserver d;
    public final /* synthetic */ ViewTreeObserverOnPreDrawListenerC6185qe2 e;
    public final /* synthetic */ C7062uo1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6394re2(ViewTreeObserver viewTreeObserver, ViewTreeObserverOnPreDrawListenerC6185qe2 viewTreeObserverOnPreDrawListenerC6185qe2, C7062uo1 c7062uo1) {
        super(1);
        this.d = viewTreeObserver;
        this.e = viewTreeObserverOnPreDrawListenerC6185qe2;
        this.g = c7062uo1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        ViewTreeObserver viewTreeObserver = this.d;
        Intrinsics.checkNotNullExpressionValue(viewTreeObserver, "viewTreeObserver");
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.e;
        C7062uo1 c7062uo1 = this.g;
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
        } else {
            c7062uo1.a.getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
        }
        return Unit.a;
    }
}
