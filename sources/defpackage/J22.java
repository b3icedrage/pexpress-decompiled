package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class J22 {

    @NotNull
    public final GP1 a;

    @NotNull
    public final C1699On1 b;

    @NotNull
    public final GP1 c;

    @NotNull
    public final C1699On1 d;

    @NotNull
    public final GP1 e;

    @NotNull
    public final C1699On1 f;

    @NotNull
    public final InterfaceC6396rf0<C3279d22> g;

    @InterfaceC3368dU(c = "com.api.feature.trading.providers.TradingCurrentAssetProvider$currentAsset$1", f = "TradingCurrentAssetProvider.kt", l = {}, m = "invokeSuspend")
    public static final class a extends AW1 implements InterfaceC1138Hj0<C3279d22, C3279d22, Boolean, JM<? super C3279d22>, Object> {
        public /* synthetic */ C3279d22 d;
        public /* synthetic */ C3279d22 e;
        public /* synthetic */ boolean g;

        public a(JM<? super a> jm) {
            super(4, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            C3279d22 c3279d22 = this.d;
            C3279d22 c3279d23 = this.e;
            if (!this.g) {
                c3279d22 = c3279d23;
            }
            J22.this.e.setValue(c3279d22);
            return c3279d22;
        }

        @Override // defpackage.InterfaceC1138Hj0
        public final Object l(C3279d22 c3279d22, C3279d22 c3279d23, Boolean bool, JM<? super C3279d22> jm) {
            boolean zBooleanValue = bool.booleanValue();
            a aVar = J22.this.new a(jm);
            aVar.d = c3279d22;
            aVar.e = c3279d23;
            aVar.g = zBooleanValue;
            return aVar.invokeSuspend(Unit.a);
        }
    }

    public J22(@NotNull AbstractC4892kW0 manualAssetSelectionEnabledUseCase) {
        Intrinsics.checkNotNullParameter(manualAssetSelectionEnabledUseCase, "manualAssetSelectionEnabledUseCase");
        GP1 gp1I = C1589Ne.i(null);
        this.a = gp1I;
        C1699On1 c1699On1F = C4466ii.f(gp1I);
        this.b = c1699On1F;
        GP1 gp1I2 = C1589Ne.i(null);
        this.c = gp1I2;
        C1699On1 c1699On1F2 = C4466ii.f(gp1I2);
        this.d = c1699On1F2;
        GP1 gp1I3 = C1589Ne.i(null);
        this.e = gp1I3;
        this.f = C4466ii.f(gp1I3);
        this.g = C4466ii.m(C4466ii.k(c1699On1F, c1699On1F2, manualAssetSelectionEnabledUseCase.l(), new a(null)));
    }
}
