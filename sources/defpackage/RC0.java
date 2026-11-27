package defpackage;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import java.text.DecimalFormat;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class RC0 implements QC0 {

    @NotNull
    public final C4617jA1 a;

    @NotNull
    public final CA b;

    @NotNull
    public final GP1 c;

    @NotNull
    public final C1699On1 d;

    @InterfaceC3368dU(c = "com.base.feature.robot.robot.investment.providers.InvestmentProgressDataProviderBase$1", f = "InvestmentProgressDataProviderBase.kt", l = {42}, m = "invokeSuspend")
    public static final class a extends AW1 implements InterfaceC1138Hj0<Integer, Boolean, Long, JM<? super Unit>, Object> {
        public int d;
        public int e;
        public /* synthetic */ int g;
        public /* synthetic */ boolean h;

        public a(JM<? super a> jm) {
            super(4, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            int i;
            boolean z;
            Object objA;
            int i2;
            GP1 gp1;
            Object value;
            long j;
            MN mn = MN.d;
            int i3 = this.e;
            RC0 rc0 = RC0.this;
            boolean z2 = true;
            if (i3 == 0) {
                C1795Pt1.b(obj);
                i = this.g;
                z = this.h;
                C4617jA1 c4617jA1 = rc0.a;
                int i4 = c4617jA1.Y;
                this.g = i;
                this.h = z;
                this.d = i4;
                this.e = 1;
                objA = c4617jA1.c.a(this);
                if (objA == mn) {
                    return mn;
                }
                i2 = i4;
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i2 = this.d;
                z = this.h;
                i = this.g;
                C1795Pt1.b(obj);
                objA = obj;
            }
            long j2 = ((C1709Or) objA).a;
            b.a aVar = b.e;
            long jMax = ((long) Math.max(i2, (int) b.r(j2, R40.SECONDS))) * 1000;
            if (rc0.b.b() != null && !z) {
                z2 = false;
            }
            boolean z3 = z2;
            long j3 = ((long) i) * 1000;
            if (j3 < 0) {
                j3 = 0;
            }
            long j4 = j3 / ((long) CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT);
            long j5 = 60;
            StringBuilder sb = new StringBuilder();
            DecimalFormat decimalFormat = new DecimalFormat("00");
            sb.append(decimalFormat.format(Integer.valueOf((int) ((j4 / j5) % j5))));
            sb.append(":");
            sb.append(decimalFormat.format(Integer.valueOf((int) (j4 % j5))));
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            String currentTimeText = QO.o(string);
            do {
                gp1 = rc0.c;
                value = gp1.getValue();
                j = ((K32) value).e;
                Intrinsics.checkNotNullParameter(currentTimeText, "currentTimeText");
            } while (!gp1.d(value, new K32(i * CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT, (int) jMax, currentTimeText, z3, j)));
            return Unit.a;
        }

        @Override // defpackage.InterfaceC1138Hj0
        public final Object l(Integer num, Boolean bool, Long l, JM<? super Unit> jm) {
            int iIntValue = num.intValue();
            boolean zBooleanValue = bool.booleanValue();
            l.longValue();
            a aVar = RC0.this.new a(jm);
            aVar.g = iIntValue;
            aVar.h = zBooleanValue;
            return aVar.invokeSuspend(Unit.a);
        }
    }

    public RC0(@NotNull C4617jA1 robotTrading, @NotNull KQ currentChartPositionProvider, @NotNull CA chartBetProvider) {
        Intrinsics.checkNotNullParameter(robotTrading, "robotTrading");
        Intrinsics.checkNotNullParameter(currentChartPositionProvider, "currentChartPositionProvider");
        Intrinsics.checkNotNullParameter(chartBetProvider, "chartBetProvider");
        this.a = robotTrading;
        this.b = chartBetProvider;
        GP1 gp1I = C1589Ne.i(new K32());
        this.c = gp1I;
        this.d = C4466ii.f(gp1I);
        C4466ii.v(C3784fT.a, C4466ii.k(robotTrading.H, robotTrading.J, currentChartPositionProvider.b(), new a(null)));
    }

    @Override // defpackage.QC0
    @NotNull
    public final C1699On1 a() {
        return this.d;
    }
}
