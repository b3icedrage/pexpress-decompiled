package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: hi2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4260hi2 extends C7576xG {

    @NotNull
    public final C4923kf d;

    @NotNull
    public final GP1 e;

    @NotNull
    public final C1699On1 f;

    @NotNull
    public final C6120qK1 g;

    @NotNull
    public final C1621Nn1 h;

    @NotNull
    public final C6120qK1 i;

    @NotNull
    public final C1621Nn1 j;

    @NotNull
    public final C6120qK1 k;

    @NotNull
    public final C1621Nn1 l;

    /* JADX INFO: renamed from: hi2$a */
    @InterfaceC3368dU(c = "com.api.feature.webpage.viewmodel.WebViewModel$reload$1", f = "WebViewModel.kt", l = {30}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        public a(JM<? super a> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return AbstractC4260hi2.this.new a(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                C6120qK1 c6120qK1 = AbstractC4260hi2.this.g;
                Unit unit = Unit.a;
                this.d = 1;
                if (c6120qK1.a(unit, this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            return Unit.a;
        }
    }

    public AbstractC4260hi2(@NotNull C4923kf appData) {
        Intrinsics.checkNotNullParameter(appData, "appData");
        this.d = appData;
        GP1 gp1I = C1589Ne.i(Boolean.FALSE);
        this.e = gp1I;
        this.f = C4466ii.f(gp1I);
        C6120qK1 c6120qK1G = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        this.g = c6120qK1G;
        this.h = C4466ii.e(c6120qK1G);
        C6120qK1 c6120qK1G2 = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        this.i = c6120qK1G2;
        this.j = C4466ii.e(c6120qK1G2);
        C6120qK1 c6120qK1G3 = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        this.k = c6120qK1G3;
        this.l = C4466ii.e(c6120qK1G3);
    }

    public void l() {
        C5189lv.k(C8056za.j(this), null, new a(null), 3);
    }
}
