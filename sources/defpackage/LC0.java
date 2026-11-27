package defpackage;

import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class LC0 implements KC0 {

    @NotNull
    public final InterfaceC6396rf0<Integer> a;

    @InterfaceC3368dU(c = "com.base.feature.robot.robot.investment.providers.InvestmentDirectionResProviderBase$directionResId$1", f = "InvestmentDirectionResProviderBase.kt", l = {}, m = "invokeSuspend")
    public static final class a extends AW1 implements InterfaceC1138Hj0<H32.a, Boolean, K32, JM<? super Integer>, Object> {
        public /* synthetic */ H32.a d;
        public /* synthetic */ boolean e;
        public /* synthetic */ K32 g;

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            int i;
            MN mn = MN.d;
            C1795Pt1.b(obj);
            H32.a aVar = this.d;
            boolean z = this.e;
            K32 k32 = this.g;
            if (z || k32.d) {
                i = R.drawable.ic_search;
            } else {
                i = aVar == H32.a.CALL_UP ? R.drawable.ic_arrow_up : R.drawable.ic_arrow_down;
            }
            return new Integer(i);
        }

        @Override // defpackage.InterfaceC1138Hj0
        public final Object l(H32.a aVar, Boolean bool, K32 k32, JM<? super Integer> jm) {
            boolean zBooleanValue = bool.booleanValue();
            a aVar2 = new a(4, jm);
            aVar2.d = aVar;
            aVar2.e = zBooleanValue;
            aVar2.g = k32;
            return aVar2.invokeSuspend(Unit.a);
        }
    }

    public LC0(@NotNull C4617jA1 robotTrading, @NotNull QC0 progressDataProviderBase) {
        Intrinsics.checkNotNullParameter(robotTrading, "robotTrading");
        Intrinsics.checkNotNullParameter(progressDataProviderBase, "progressDataProviderBase");
        this.a = C4466ii.m(C4466ii.k(robotTrading.X, robotTrading.J, progressDataProviderBase.a(), new a(4, null)));
    }

    @Override // defpackage.KC0
    @NotNull
    public final InterfaceC6396rf0<Integer> a() {
        return this.a;
    }
}
