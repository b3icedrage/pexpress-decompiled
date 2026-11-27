package defpackage;

import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class WC0 implements VC0 {

    @NotNull
    public final U22 a;

    @NotNull
    public final C5561ng0 b;

    @NotNull
    public final C5561ng0 c;

    @InterfaceC3368dU(c = "com.base.feature.robot.robot.investment.providers.InvestmentTradingLimitsProviderBase$tradingLossLimit$1", f = "InvestmentTradingLimitsProviderBase.kt", l = {45}, m = "invokeSuspend")
    public static final class a extends AW1 implements InterfaceC1138Hj0<Boolean, AbstractC6892u10<Long>, AbstractC6892u10<String>, JM<? super J32>, Object> {
        public int d;
        public int e;
        public int g;
        public /* synthetic */ boolean h;
        public /* synthetic */ AbstractC6892u10 i;
        public /* synthetic */ AbstractC6892u10 j;

        public a(JM<? super a> jm) {
            super(4, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            boolean z;
            AbstractC6892u10 abstractC6892u10;
            int i;
            int i2;
            boolean z2;
            int i3;
            int i4;
            double dLongValue;
            MN mn = MN.d;
            int i5 = this.g;
            if (i5 == 0) {
                C1795Pt1.b(obj);
                z = this.h;
                AbstractC6892u10 abstractC6892u11 = this.i;
                abstractC6892u10 = this.j;
                i = z ? R.string.on_text : R.string.off_text;
                i2 = z ? R.drawable.ic_loss_limit_on : R.drawable.ic_loss_limit_off;
                Long l = (Long) abstractC6892u11.a();
                if (l != null) {
                    dLongValue = l.longValue();
                } else {
                    U22 u22 = WC0.this.a;
                    this.i = abstractC6892u10;
                    this.h = z;
                    this.d = i;
                    this.e = i2;
                    this.g = 1;
                    Object objB = u22.b(null, this);
                    if (objB == mn) {
                        return mn;
                    }
                    z2 = z;
                    obj = objB;
                    i3 = i;
                    i4 = i2;
                }
                return new J32(z, i, new C7396wQ(dLongValue, (String) abstractC6892u10.a()), i2);
            }
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i4 = this.e;
            i3 = this.d;
            z2 = this.h;
            abstractC6892u10 = this.i;
            C1795Pt1.b(obj);
            double dDoubleValue = ((Number) obj).doubleValue();
            z = z2;
            i2 = i4;
            i = i3;
            dLongValue = dDoubleValue;
            return new J32(z, i, new C7396wQ(dLongValue, (String) abstractC6892u10.a()), i2);
        }

        @Override // defpackage.InterfaceC1138Hj0
        public final Object l(Boolean bool, AbstractC6892u10<Long> abstractC6892u10, AbstractC6892u10<String> abstractC6892u11, JM<? super J32> jm) {
            boolean zBooleanValue = bool.booleanValue();
            a aVar = WC0.this.new a(jm);
            aVar.h = zBooleanValue;
            aVar.i = abstractC6892u10;
            aVar.j = abstractC6892u11;
            return aVar.invokeSuspend(Unit.a);
        }
    }

    @InterfaceC3368dU(c = "com.base.feature.robot.robot.investment.providers.InvestmentTradingLimitsProviderBase$tradingProfitLimit$1", f = "InvestmentTradingLimitsProviderBase.kt", l = {75}, m = "invokeSuspend")
    public static final class b extends AW1 implements InterfaceC1138Hj0<Boolean, AbstractC6892u10<Long>, AbstractC6892u10<String>, JM<? super J32>, Object> {
        public int d;
        public int e;
        public int g;
        public /* synthetic */ boolean h;
        public /* synthetic */ AbstractC6892u10 i;
        public /* synthetic */ AbstractC6892u10 j;

        public b(JM<? super b> jm) {
            super(4, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            boolean z;
            AbstractC6892u10 abstractC6892u10;
            int i;
            int i2;
            boolean z2;
            int i3;
            int i4;
            double dLongValue;
            MN mn = MN.d;
            int i5 = this.g;
            if (i5 == 0) {
                C1795Pt1.b(obj);
                z = this.h;
                AbstractC6892u10 abstractC6892u11 = this.i;
                abstractC6892u10 = this.j;
                i = z ? R.string.on_text : R.string.off_text;
                i2 = z ? R.drawable.ic_profit_limit_on : R.drawable.ic_profit_limit_off;
                Long l = (Long) abstractC6892u11.a();
                if (l != null) {
                    dLongValue = l.longValue();
                } else {
                    U22 u22 = WC0.this.a;
                    this.i = abstractC6892u10;
                    this.h = z;
                    this.d = i;
                    this.e = i2;
                    this.g = 1;
                    Object objC = u22.c(null, this);
                    if (objC == mn) {
                        return mn;
                    }
                    z2 = z;
                    obj = objC;
                    i3 = i;
                    i4 = i2;
                }
                return new J32(z, i, new C7396wQ(dLongValue, (String) abstractC6892u10.a()), i2);
            }
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i4 = this.e;
            i3 = this.d;
            z2 = this.h;
            abstractC6892u10 = this.i;
            C1795Pt1.b(obj);
            double dDoubleValue = ((Number) obj).doubleValue();
            z = z2;
            i2 = i4;
            i = i3;
            dLongValue = dDoubleValue;
            return new J32(z, i, new C7396wQ(dLongValue, (String) abstractC6892u10.a()), i2);
        }

        @Override // defpackage.InterfaceC1138Hj0
        public final Object l(Boolean bool, AbstractC6892u10<Long> abstractC6892u10, AbstractC6892u10<String> abstractC6892u11, JM<? super J32> jm) {
            boolean zBooleanValue = bool.booleanValue();
            b bVar = WC0.this.new b(jm);
            bVar.h = zBooleanValue;
            bVar.i = abstractC6892u10;
            bVar.j = abstractC6892u11;
            return bVar.invokeSuspend(Unit.a);
        }
    }

    public WC0(@NotNull C4923kf appData, @NotNull U22 tradingDefaultsProvider, @NotNull O3 accountModeSelectionUseCase, @NotNull InterfaceC2152Ui1 profitLimitUseCase, @NotNull RT0 lossLimitUseCase) {
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(tradingDefaultsProvider, "tradingDefaultsProvider");
        Intrinsics.checkNotNullParameter(accountModeSelectionUseCase, "accountModeSelectionUseCase");
        Intrinsics.checkNotNullParameter(profitLimitUseCase, "profitLimitUseCase");
        Intrinsics.checkNotNullParameter(lossLimitUseCase, "lossLimitUseCase");
        this.a = tradingDefaultsProvider;
        InterfaceC6396rf0<Boolean> interfaceC6396rf0IsEnabled = lossLimitUseCase.isEnabled();
        C5981pg0 c5981pg0C = MA1.c(lossLimitUseCase.a(), lossLimitUseCase.b(), accountModeSelectionUseCase, appData);
        C1699On1 c1699On1 = appData.G;
        C1699On1 c1699On2 = appData.F;
        this.b = C4466ii.k(interfaceC6396rf0IsEnabled, c5981pg0C, MA1.c(c1699On1, c1699On2, accountModeSelectionUseCase, appData), new a(null));
        this.c = C4466ii.k(profitLimitUseCase.isEnabled(), MA1.c(profitLimitUseCase.a(), profitLimitUseCase.b(), accountModeSelectionUseCase, appData), MA1.c(c1699On1, c1699On2, accountModeSelectionUseCase, appData), new b(null));
    }

    @Override // defpackage.VC0
    @NotNull
    public final C5561ng0 a() {
        return this.b;
    }

    @Override // defpackage.VC0
    @NotNull
    public final C5561ng0 b() {
        return this.c;
    }
}
