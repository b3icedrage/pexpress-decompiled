package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class V9 implements U9 {

    @NotNull
    public final VQ a;

    @NotNull
    public final Lc2 b;

    @NotNull
    public final O3 c;

    @NotNull
    public final AbstractC2327Wn1 d;

    @NotNull
    public final AbstractC6366rX e;

    @NotNull
    public final C6120qK1 f;

    @NotNull
    public final C1621Nn1 g;

    @InterfaceC3368dU(c = "com.base.feature.robot.robot.options.usecases.AmountValueUseCaseBase$amountText$1", f = "AmountValueUseCaseBase.kt", l = {33}, m = "invokeSuspend")
    public static final class a extends AW1 implements InterfaceC1060Gj0<Unit, EnumC4164hF1, JM<? super String>, Object> {
        public int d;
        public /* synthetic */ EnumC4164hF1 e;

        public a(JM<? super a> jm) {
            super(3, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                EnumC4164hF1 enumC4164hF1 = this.e;
                VQ vq = V9.this.a;
                this.d = 1;
                obj = vq.c(enumC4164hF1, this);
                if (obj == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            return String.valueOf(((Number) obj).longValue());
        }

        @Override // defpackage.InterfaceC1060Gj0
        public final Object k(Unit unit, EnumC4164hF1 enumC4164hF1, JM<? super String> jm) {
            a aVar = V9.this.new a(jm);
            aVar.e = enumC4164hF1;
            return aVar.invokeSuspend(Unit.a);
        }
    }

    public V9(@NotNull VQ currentStartAmountProvider, @NotNull Lc2 validateInputUseCaseApi, @NotNull O3 accountModeSelectionUseCase, @NotNull AbstractC2327Wn1 realAmountUseCase, @NotNull AbstractC6366rX demoAmountUseCase) {
        Intrinsics.checkNotNullParameter(currentStartAmountProvider, "currentStartAmountProvider");
        Intrinsics.checkNotNullParameter(validateInputUseCaseApi, "validateInputUseCaseApi");
        Intrinsics.checkNotNullParameter(accountModeSelectionUseCase, "accountModeSelectionUseCase");
        Intrinsics.checkNotNullParameter(realAmountUseCase, "realAmountUseCase");
        Intrinsics.checkNotNullParameter(demoAmountUseCase, "demoAmountUseCase");
        this.a = currentStartAmountProvider;
        this.b = validateInputUseCaseApi;
        this.c = accountModeSelectionUseCase;
        this.d = realAmountUseCase;
        this.e = demoAmountUseCase;
        C6120qK1 c6120qK1G = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        this.f = c6120qK1G;
        this.g = C4466ii.D(new C6610sg0(c6120qK1G, accountModeSelectionUseCase.l(), new a(null)), C3784fT.a, IK1.a.a);
    }

    @Override // defpackage.U9
    @Nullable
    public final Object a(@NotNull LM lm) throws Throwable {
        C6120qK1 c6120qK1 = this.f;
        Unit unit = Unit.a;
        Object objA = c6120qK1.a(unit, lm);
        return objA == MN.d ? objA : unit;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d1, code lost:
    
        if (r2.a(r0) == r1) goto L43;
     */
    @Override // defpackage.U9
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@org.jetbrains.annotations.NotNull java.lang.String r11, @org.jetbrains.annotations.NotNull defpackage.LM r12) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.V9.b(java.lang.String, LM):java.lang.Object");
    }

    @Override // defpackage.U9
    @NotNull
    public final C1621Nn1 c() {
        return this.g;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(String str, LM lm) {
        W9 w9;
        if (lm instanceof W9) {
            w9 = (W9) lm;
            int i = w9.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                w9.g = i - Integer.MIN_VALUE;
            } else {
                w9 = new W9(this, lm);
            }
        } else {
            w9 = new W9(this, lm);
        }
        Object objA = w9.d;
        MN mn = MN.d;
        int i2 = w9.g;
        if (i2 == 0) {
            C1795Pt1.b(objA);
            double dP = QO.p(str);
            w9.g = 1;
            objA = this.b.a(dP, w9);
            if (objA == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objA);
        }
        return new Double(Math.floor(((Number) objA).doubleValue()));
    }
}
