package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: u22, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6898u22 extends AbstractC7066uq {

    @NotNull
    public final AbstractC7949z22 e;

    @NotNull
    public final InterfaceC4118h22 f;

    @NotNull
    public final C4923kf g;

    @NotNull
    public final ReporterApi h;

    @NotNull
    public final AbstractC2199Uy0 i;

    @NotNull
    public final AbstractC4892kW0 j;

    @NotNull
    public final InterfaceC3706f42 k;

    @NotNull
    public final InterfaceC6396rf0<Boolean> l;

    @NotNull
    public final GP1 m;

    @NotNull
    public final C1699On1 n;

    @NotNull
    public final C1699On1 o;

    /* JADX INFO: renamed from: u22$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.assetselection.screens.TradingAssetsBottomSheetViewModelBase$onDismiss$1", f = "TradingAssetsBottomSheetViewModelBase.kt", l = {108, 122}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        /* JADX INFO: renamed from: u22$a$a, reason: collision with other inner class name */
        @InterfaceC3368dU(c = "com.base.feature.robot.assetselection.screens.TradingAssetsBottomSheetViewModelBase$onDismiss$1$1", f = "TradingAssetsBottomSheetViewModelBase.kt", l = {}, m = "invokeSuspend")
        public static final class C0499a extends AW1 implements Function1<JM<? super String>, Object> {
            public C0499a() {
                throw null;
            }

            @Override // defpackage.AbstractC7487wq
            public final JM<Unit> create(JM<?> jm) {
                return new C0499a(1, jm);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(JM<? super String> jm) {
                ((C0499a) create(jm)).invokeSuspend(Unit.a);
                return "close_price";
            }

            @Override // defpackage.AbstractC7487wq
            public final Object invokeSuspend(Object obj) {
                MN mn = MN.d;
                C1795Pt1.b(obj);
                return "close_price";
            }
        }

        public a(JM<? super a> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return AbstractC6898u22.this.new a(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x007a, code lost:
        
            if (r4.i.m(r9, r8) == r0) goto L27;
         */
        @Override // defpackage.AbstractC7487wq
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                MN r0 = defpackage.MN.d
                int r1 = r8.d
                r2 = 2
                r3 = 1
                u22 r4 = defpackage.AbstractC6898u22.this
                if (r1 == 0) goto L1f
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                defpackage.C1795Pt1.b(r9)
                goto L7d
            L13:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1b:
                defpackage.C1795Pt1.b(r9)
                goto L2f
            L1f:
                defpackage.C1795Pt1.b(r9)
                z22 r9 = r4.e
                rf0<d22> r9 = r9.o
                r8.d = r3
                java.lang.Object r9 = defpackage.C4466ii.o(r9, r8)
                if (r9 != r0) goto L2f
                goto L7c
            L2f:
                d22 r9 = (defpackage.C3279d22) r9
                r1 = 0
                if (r9 == 0) goto L37
                java.lang.String r9 = r9.c
                goto L38
            L37:
                r9 = r1
            L38:
                kf r5 = r4.g
                GP1 r5 = r5.p
                java.lang.Object r5 = r5.getValue()
                vF r5 = (defpackage.C7152vF) r5
                if (r5 == 0) goto L62
                java.util.ArrayList r5 = r5.a
                EH0 r5 = kotlin.collections.CollectionsKt.y(r5)
                t22 r6 = new t22
                r6.<init>()
                wd0 r5 = defpackage.JH1.h(r5, r6)
                Mf r6 = new Mf
                r7 = 1
                r6.<init>(r7)
                C42 r5 = defpackage.JH1.m(r5, r6)
                java.util.List r5 = defpackage.JH1.p(r5)
                goto L63
            L62:
                r5 = r1
            L63:
                if (r5 == 0) goto L7d
                if (r9 == 0) goto L7d
                boolean r9 = r5.contains(r9)
                if (r9 != 0) goto L7d
                u22$a$a r9 = new u22$a$a
                r9.<init>(r3, r1)
                r8.d = r2
                Uy0 r1 = r4.i
                java.lang.Object r9 = r1.m(r9, r8)
                if (r9 != r0) goto L7d
            L7c:
                return r0
            L7d:
                kotlin.Unit r9 = kotlin.Unit.a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC6898u22.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: u22$b */
    @InterfaceC3368dU(c = "com.base.feature.robot.assetselection.screens.TradingAssetsBottomSheetViewModelBase$tradingAssets$1", f = "TradingAssetsBottomSheetViewModelBase.kt", l = {}, m = "invokeSuspend")
    public static final class b extends AW1 implements InterfaceC1294Jj0<Boolean, List<? extends C3279d22>, C3279d22, C3279d22, C1491Lx0, JM<? super List<? extends C3279d22>>, Object> {
        public /* synthetic */ boolean d;
        public /* synthetic */ List e;
        public /* synthetic */ C3279d22 g;
        public /* synthetic */ C3279d22 h;
        public /* synthetic */ C1491Lx0 i;

        public b(JM<? super b> jm) {
            super(6, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            C3279d22 c3279d22A;
            MN mn = MN.d;
            C1795Pt1.b(obj);
            boolean z = this.d;
            List<C3279d22> list = this.e;
            C3279d22 c3279d22 = this.g;
            C3279d22 c3279d23 = this.h;
            C1491Lx0 c1491Lx0 = this.i;
            ArrayList arrayList = new ArrayList(XE.m(list, 10));
            for (C3279d22 c3279d24 : list) {
                AbstractC6898u22.this.getClass();
                if (z) {
                    c3279d22A = C3279d22.a(c3279d24, !c3279d24.w && c1491Lx0.j, Intrinsics.a(c3279d23.c, c3279d24.c));
                } else {
                    c3279d22A = C3279d22.a(c3279d24, true ^ Intrinsics.a(c3279d22.c, c3279d24.c), Intrinsics.a(c3279d22.c, c3279d24.c));
                }
                arrayList.add(c3279d22A);
            }
            return arrayList;
        }

        @Override // defpackage.InterfaceC1294Jj0
        public final Object q(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Serializable serializable) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            b bVar = AbstractC6898u22.this.new b((JM) serializable);
            bVar.d = zBooleanValue;
            bVar.e = (List) obj2;
            bVar.g = (C3279d22) obj3;
            bVar.h = (C3279d22) obj4;
            bVar.i = (C1491Lx0) obj5;
            return bVar.invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC6898u22(@NotNull AbstractC7949z22 assetsProvider, @NotNull InterfaceC4118h22 tradingAssetCallback, @NotNull C4923kf appData, @NotNull ReporterApi reporter, @NotNull C3069c22 tradingAmplitudeEventsLocalExperiment, @NotNull NQ currentIndicatorProvider, @NotNull AbstractC2199Uy0 indicatorUseCase, @NotNull AbstractC4892kW0 manualAssetSelectionEnabledUseCase, @NotNull InterfaceC3706f42 telemetryReporter) {
        super(tradingAssetCallback);
        Intrinsics.checkNotNullParameter(assetsProvider, "assetsProvider");
        Intrinsics.checkNotNullParameter(tradingAssetCallback, "tradingAssetCallback");
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(tradingAmplitudeEventsLocalExperiment, "tradingAmplitudeEventsLocalExperiment");
        Intrinsics.checkNotNullParameter(currentIndicatorProvider, "currentIndicatorProvider");
        Intrinsics.checkNotNullParameter(indicatorUseCase, "indicatorUseCase");
        Intrinsics.checkNotNullParameter(manualAssetSelectionEnabledUseCase, "manualAssetSelectionEnabledUseCase");
        Intrinsics.checkNotNullParameter(telemetryReporter, "telemetryReporter");
        this.e = assetsProvider;
        this.f = tradingAssetCallback;
        this.g = appData;
        this.h = reporter;
        this.i = indicatorUseCase;
        this.j = manualAssetSelectionEnabledUseCase;
        this.k = telemetryReporter;
        InterfaceC6396rf0<Boolean> interfaceC6396rf0L = manualAssetSelectionEnabledUseCase.l();
        this.l = interfaceC6396rf0L;
        GP1 gp1I = C1589Ne.i(Boolean.TRUE);
        this.m = gp1I;
        this.n = C4466ii.f(gp1I);
        this.o = k(new C6400rg0(0, new InterfaceC6396rf0[]{interfaceC6396rf0L, assetsProvider.i, new C4250hg0(assetsProvider.n, 0), new C4250hg0(assetsProvider.m, 0), currentIndicatorProvider.b}, new b(null)), C5653o60.d, new C7395wP1());
    }

    @Override // defpackage.AbstractC7066uq
    public final void m() {
        super.m();
        C5189lv.k(C3286d41.a, null, new a(null), 3);
    }
}
