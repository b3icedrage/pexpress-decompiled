package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: by0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3052by0 implements InterfaceC2460Xx0 {

    @NotNull
    public final C3051bx1 a;

    @NotNull
    public final GP1 b;

    @NotNull
    public final InterfaceC6396rf0<C1491Lx0> c;

    /* JADX INFO: renamed from: by0$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.indicatorselection.providers.IndicatorDetailsSelectionProviderBase$selectedIndicatorDetails$1", f = "IndicatorDetailsSelectionProviderBase.kt", l = {}, m = "invokeSuspend")
    public static final class a extends AW1 implements InterfaceC1060Gj0<Integer, List<? extends C2846az0>, JM<? super C1491Lx0>, Object> {
        public /* synthetic */ int d;
        public /* synthetic */ List e;

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            return ((C2846az0) this.e.get(this.d)).a;
        }

        @Override // defpackage.InterfaceC1060Gj0
        public final Object k(Integer num, List<? extends C2846az0> list, JM<? super C1491Lx0> jm) {
            int iIntValue = num.intValue();
            a aVar = new a(3, jm);
            aVar.d = iIntValue;
            aVar.e = list;
            return aVar.invokeSuspend(Unit.a);
        }
    }

    public C3052by0(@NotNull C3051bx1 robotIndicatorProvider) {
        Intrinsics.checkNotNullParameter(robotIndicatorProvider, "robotIndicatorProvider");
        this.a = robotIndicatorProvider;
        GP1 gp1I = C1589Ne.i(0);
        this.b = gp1I;
        this.c = C4466ii.m(new C6610sg0(gp1I, robotIndicatorProvider.f, new a(3, null)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC2460Xx0
    @Nullable
    public final Object a(@NotNull C1491Lx0 c1491Lx0, @NotNull LM lm) {
        C2843ay0 c2843ay0;
        GP1 gp1;
        if (lm instanceof C2843ay0) {
            c2843ay0 = (C2843ay0) lm;
            int i = c2843ay0.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2843ay0.h = i - Integer.MIN_VALUE;
            } else {
                c2843ay0 = new C2843ay0(this, lm);
            }
        } else {
            c2843ay0 = new C2843ay0(this, lm);
        }
        Object objO = c2843ay0.e;
        MN mn = MN.d;
        int i2 = c2843ay0.h;
        if (i2 == 0) {
            C1795Pt1.b(objO);
            C2616Zx0 c2616Zx0 = new C2616Zx0(this.a.f, c1491Lx0, 0);
            gp1 = this.b;
            c2843ay0.d = gp1;
            c2843ay0.h = 1;
            objO = C4466ii.o(c2616Zx0, c2843ay0);
            if (objO == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gp1 = c2843ay0.d;
            C1795Pt1.b(objO);
        }
        gp1.setValue(objO);
        return Unit.a;
    }

    @Override // defpackage.InterfaceC2460Xx0
    @NotNull
    public final InterfaceC6396rf0<C1491Lx0> b() {
        return this.c;
    }
}
