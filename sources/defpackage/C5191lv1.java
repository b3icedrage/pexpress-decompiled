package defpackage;

import com.appsflyer.share.attribution.RequestError;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: lv1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5191lv1 extends C7576xG {

    @NotNull
    public final InterfaceC2452Xu1 d;

    @NotNull
    public final AbstractC7004uZ1 e;

    @NotNull
    public final InterfaceC6396rf0<InterfaceC4303hv1> f;

    @NotNull
    public final C1621Nn1 g;

    @NotNull
    public final C1621Nn1 h;

    /* JADX INFO: renamed from: lv1$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.asset_selection.RobotAssetSelectionViewModelBase$state$1", f = "RobotAssetSelectionViewModelBase.kt", l = {RequestError.NETWORK_FAILURE, RequestError.NO_DEV_KEY}, m = "invokeSuspend")
    public static final class a extends AW1 implements InterfaceC1138Hj0<C3279d22, Boolean, b, JM<? super InterfaceC4303hv1.d>, Object> {
        public int d;
        public /* synthetic */ C3279d22 e;
        public /* synthetic */ boolean g;

        public a(JM<? super a> jm) {
            super(4, jm);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
        
            if (r6 == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
        
            if (r6 == r0) goto L19;
         */
        @Override // defpackage.AbstractC7487wq
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                MN r0 = defpackage.MN.d
                int r1 = r5.d
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                defpackage.C1795Pt1.b(r6)
                goto L41
            L10:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L18:
                defpackage.C1795Pt1.b(r6)
                goto L30
            L1c:
                defpackage.C1795Pt1.b(r6)
                d22 r6 = r5.e
                boolean r1 = r5.g
                lv1 r4 = defpackage.C5191lv1.this
                if (r1 == 0) goto L38
                r5.d = r3
                java.lang.Object r6 = defpackage.C5191lv1.l(r4, r6, r5)
                if (r6 != r0) goto L30
                goto L40
            L30:
                Vj r6 = (defpackage.C2231Vj) r6
                hv1$c r0 = new hv1$c
                r0.<init>(r6)
                return r0
            L38:
                r5.d = r2
                java.lang.Object r6 = defpackage.C5191lv1.l(r4, r6, r5)
                if (r6 != r0) goto L41
            L40:
                return r0
            L41:
                Vj r6 = (defpackage.C2231Vj) r6
                hv1$a r0 = new hv1$a
                r0.<init>(r6)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.C5191lv1.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // defpackage.InterfaceC1138Hj0
        public final Object l(C3279d22 c3279d22, Boolean bool, b bVar, JM<? super InterfaceC4303hv1.d> jm) {
            boolean zBooleanValue = bool.booleanValue();
            long j = bVar.d;
            a aVar = C5191lv1.this.new a(jm);
            aVar.e = c3279d22;
            aVar.g = zBooleanValue;
            return aVar.invokeSuspend(Unit.a);
        }
    }

    public C5191lv1(@NotNull InterfaceC2452Xu1 callbacks, @NotNull AbstractC7004uZ1 timeSelectionsProvider, @NotNull AbstractC7949z22 tradingAssetsProvider, @NotNull J22 currentAssetProvider, @NotNull AbstractC1787Pr betDurationUseCase, @NotNull AbstractC4892kW0 manualAssetSelectionEnabledUseCase) {
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(timeSelectionsProvider, "timeSelectionsProvider");
        Intrinsics.checkNotNullParameter(tradingAssetsProvider, "tradingAssetsProvider");
        Intrinsics.checkNotNullParameter(currentAssetProvider, "currentAssetProvider");
        Intrinsics.checkNotNullParameter(betDurationUseCase, "betDurationUseCase");
        Intrinsics.checkNotNullParameter(manualAssetSelectionEnabledUseCase, "manualAssetSelectionEnabledUseCase");
        this.d = callbacks;
        this.e = timeSelectionsProvider;
        this.f = C4466ii.m(C4466ii.k(new C4250hg0(currentAssetProvider.g, 0), manualAssetSelectionEnabledUseCase.l(), betDurationUseCase.b, new a(null)));
        this.g = C4466ii.e(C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d));
        this.h = tradingAssetsProvider.l;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object l(C5191lv1 c5191lv1, C3279d22 c3279d22, LM lm) {
        C4551iv1 c4551iv1;
        c5191lv1.getClass();
        if (lm instanceof C4551iv1) {
            c4551iv1 = (C4551iv1) lm;
            int i = c4551iv1.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4551iv1.h = i - Integer.MIN_VALUE;
            } else {
                c4551iv1 = new C4551iv1(c5191lv1, lm);
            }
        } else {
            c4551iv1 = new C4551iv1(c5191lv1, lm);
        }
        Object objA = c4551iv1.e;
        MN mn = MN.d;
        int i2 = c4551iv1.h;
        if (i2 == 0) {
            C1795Pt1.b(objA);
            c4551iv1.d = c3279d22;
            c4551iv1.h = 1;
            objA = c5191lv1.e.a(c4551iv1);
            if (objA == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c3279d22 = c4551iv1.d;
            C1795Pt1.b(objA);
        }
        String strB = ((C1709Or) objA).c ? c3279d22.b() : c3279d22.c();
        if (strB == null) {
            strB = "";
        }
        return new C2231Vj(c3279d22.h, c3279d22.c, strB);
    }
}
