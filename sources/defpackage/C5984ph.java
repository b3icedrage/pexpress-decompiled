package defpackage;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.pexpress.tool.AppImpl;
import com.pexpress.tool.R;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ph, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5984ph implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C5984ph(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float f;
        int i = 0;
        Object obj2 = this.e;
        switch (this.d) {
            case 0:
                Dl2 info = (Dl2) obj;
                int i2 = AppImpl.G;
                Intrinsics.checkNotNullParameter(info, "info");
                ((InterfaceC3706f42) obj2).a(info);
                return Unit.a;
            case 1:
                C2343Wt c2343Wt = (C2343Wt) obj;
                int i3 = ActivityC6781tV0.Q;
                ActivityC6781tV0 activityC6781tV0 = (ActivityC6781tV0) obj2;
                if (c2343Wt.b) {
                    C3086c7 c3086c7 = activityC6781tV0.H;
                    Intrinsics.checkNotNull(c3086c7);
                    BottomNavigationView bottomNavigation = c3086c7.e;
                    Intrinsics.checkNotNullExpressionValue(bottomNavigation, "bottomNavigation");
                    bottomNavigation.setVisibility(0);
                } else {
                    C3086c7 c3086c8 = activityC6781tV0.H;
                    Intrinsics.checkNotNull(c3086c8);
                    BottomNavigationView bottomNavigation2 = c3086c8.e;
                    Intrinsics.checkNotNullExpressionValue(bottomNavigation2, "bottomNavigation");
                    bottomNavigation2.setVisibility(8);
                }
                if (c2343Wt.a) {
                    InterfaceC3560eO0<C2525Yt> interfaceC3560eO0 = activityC6781tV0.n;
                    if (interfaceC3560eO0 == null) {
                        Intrinsics.l("textEllipsizer");
                        throw null;
                    }
                    C2525Yt c2525Yt = interfaceC3560eO0.get();
                    ViewGroup viewGroup = c2525Yt.a;
                    int height = viewGroup.getHeight();
                    Resources resources = viewGroup.getContext().getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                    c2525Yt.a(height - ((int) resources.getDimension(R.dimen.bottom_navigation_text_spacing)));
                    C42 c42M = JH1.m(new Id2(c2525Yt.a), new C2447Xt(c2525Yt, i));
                    Iterator it = c42M.a.iterator();
                    while (it.hasNext()) {
                        ((TextView) c42M.b.invoke((T) it.next())).setEllipsize(TextUtils.TruncateAt.END);
                    }
                    f = 90.0f;
                } else {
                    InterfaceC3560eO0<C2525Yt> interfaceC3560eO1 = activityC6781tV0.n;
                    if (interfaceC3560eO1 == null) {
                        Intrinsics.l("textEllipsizer");
                        throw null;
                    }
                    interfaceC3560eO1.get().a(-2);
                    f = 0.0f;
                }
                C3086c7 c3086c9 = activityC6781tV0.H;
                Intrinsics.checkNotNull(c3086c9);
                View childAt = c3086c9.e.getChildAt(0);
                Intrinsics.c(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
                Iterator<View> it2 = new Id2((ViewGroup) childAt).iterator();
                while (true) {
                    Jd2 jd2 = (Jd2) it2;
                    if (!jd2.hasNext()) {
                        activityC6781tV0.w().l(c2343Wt.b);
                        return Unit.a;
                    }
                    ((View) jd2.next()).setRotation(f);
                }
                break;
            case 2:
                return ((C6367rX0.b) obj2).c(((Integer) obj).intValue());
            default:
                L81 addCallback = (L81) obj;
                Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
                ((Z71) obj2).h.a();
                return Unit.a;
        }
    }
}
