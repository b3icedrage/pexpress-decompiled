package defpackage;

import com.google.android.gms.common.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class GC0 implements FC0 {

    @NotNull
    public final EQ a;

    @NotNull
    public final C6610sg0 b;

    @InterfaceC3368dU(c = "com.base.feature.robot.robot.investment.providers.InvestmentAmountProviderBase$amount$1", f = "InvestmentAmountProviderBase.kt", l = {ConnectionResult.API_DISABLED_FOR_CONNECTION}, m = "invokeSuspend")
    public static final class a extends AW1 implements InterfaceC1060Gj0<Integer, EnumC4164hF1, JM<? super C7396wQ>, Object> {
        public double d;
        public int e;
        public /* synthetic */ int g;

        public a(JM<? super a> jm) {
            super(3, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            double d;
            MN mn = MN.d;
            int i = this.e;
            if (i == 0) {
                C1795Pt1.b(obj);
                double d2 = this.g;
                EQ eq = GC0.this.a;
                this.d = d2;
                this.e = 1;
                obj = eq.a(false, this);
                if (obj == mn) {
                    return mn;
                }
                d = d2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d = this.d;
                C1795Pt1.b(obj);
            }
            return new C7396wQ(d, (String) obj);
        }

        @Override // defpackage.InterfaceC1060Gj0
        public final Object k(Integer num, EnumC4164hF1 enumC4164hF1, JM<? super C7396wQ> jm) {
            int iIntValue = num.intValue();
            a aVar = GC0.this.new a(jm);
            aVar.g = iIntValue;
            return aVar.invokeSuspend(Unit.a);
        }
    }

    public GC0(@NotNull C4617jA1 robotTrading, @NotNull O3 accountModeSelectionUseCase, @NotNull EQ currencySignProvider) {
        Intrinsics.checkNotNullParameter(robotTrading, "robotTrading");
        Intrinsics.checkNotNullParameter(accountModeSelectionUseCase, "accountModeSelectionUseCase");
        Intrinsics.checkNotNullParameter(currencySignProvider, "currencySignProvider");
        this.a = currencySignProvider;
        this.b = new C6610sg0(robotTrading.V, accountModeSelectionUseCase.k(), new a(null));
    }

    @Override // defpackage.FC0
    @NotNull
    public final C6610sg0 e() {
        return this.b;
    }
}
