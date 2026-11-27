package defpackage;

import android.view.View;
import androidx.core.widget.NestedScrollView;
import java.io.Serializable;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Sw1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2038Sw1 {

    @NotNull
    public final GP1 a;

    @NotNull
    public final GP1 b;

    @NotNull
    public final GP1 c;

    @NotNull
    public final GP1 d;

    @NotNull
    public final GP1 e;

    @NotNull
    public final InterfaceC6396rf0<Boolean> f;

    /* JADX INFO: renamed from: Sw1$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.inapptutorial.RobotInAppTutorialViews$allViewInflated$1", f = "RobotInAppTutorialViews.kt", l = {}, m = "invokeSuspend")
    public static final class a extends AW1 implements InterfaceC1216Ij0<View, View, View, NestedScrollView, JM<? super Boolean>, Object> {
        public /* synthetic */ View d;
        public /* synthetic */ View e;
        public /* synthetic */ View g;
        public /* synthetic */ NestedScrollView h;

        @Override // defpackage.InterfaceC1216Ij0
        public final Object c(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable) {
            a aVar = new a(5, (JM) serializable);
            aVar.d = (View) obj;
            aVar.e = (View) obj2;
            aVar.g = (View) obj3;
            aVar.h = (NestedScrollView) obj4;
            return aVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            return Boolean.valueOf((this.d == null || this.e == null || this.g == null || this.h == null) ? false : true);
        }
    }

    public C2038Sw1() {
        GP1 gp1I = C1589Ne.i(null);
        this.a = gp1I;
        this.b = C1589Ne.i(null);
        GP1 gp1I2 = C1589Ne.i(null);
        this.c = gp1I2;
        GP1 gp1I3 = C1589Ne.i(null);
        this.d = gp1I3;
        GP1 gp1I4 = C1589Ne.i(null);
        this.e = gp1I4;
        this.f = C4466ii.m(C4466ii.l(gp1I, gp1I2, gp1I3, gp1I4, new a(5, null)));
    }
}
