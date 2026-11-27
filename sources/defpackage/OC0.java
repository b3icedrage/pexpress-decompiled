package defpackage;

import com.pexpress.tool.R;
import java.text.NumberFormat;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class OC0 implements MC0 {

    @NotNull
    public final C4923kf a;

    @NotNull
    public final O3 b;

    @NotNull
    public final EQ c;

    @NotNull
    public final C6610sg0 d;

    @InterfaceC3368dU(c = "com.base.feature.robot.robot.investment.providers.InvestmentProfitProviderBase$currentProfit$1", f = "InvestmentProfitProviderBase.kt", l = {36, 45}, m = "invokeSuspend")
    public static final class a extends AW1 implements InterfaceC1060Gj0<Double, EnumC4164hF1, JM<? super C7606xQ>, Object> {
        public double d;
        public int e;
        public String g;
        public String h;
        public int i;
        public /* synthetic */ double j;

        public a(JM<? super a> jm) {
            super(3, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            double d;
            int i;
            double d2;
            String str;
            int i2;
            String str2;
            String str3;
            double d3;
            MN mn = MN.d;
            int i3 = this.i;
            OC0 oc0 = OC0.this;
            if (i3 == 0) {
                C1795Pt1.b(obj);
                d = this.j;
                int i4 = d > 0.0d ? R.color.robotCurrentInvestmentPositiveProfitText : R.color.robotCurrentInvestmentNotPositiveProfitText;
                String str4 = d <= 0.0d ? "" : "+";
                if (d < 0.0d) {
                    d = 0.0d;
                }
                this.g = str4;
                this.e = i4;
                this.j = d;
                this.d = d;
                this.i = 1;
                Object objB = OC0.b(oc0, this);
                if (objB != mn) {
                    i = i4;
                    obj = objB;
                    d2 = d;
                    str = str4;
                }
                return mn;
            }
            if (i3 == 1) {
                double d4 = this.d;
                double d5 = this.j;
                i = this.e;
                str = this.g;
                C1795Pt1.b(obj);
                d2 = d4;
                d = d5;
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                double d6 = this.j;
                int i5 = this.e;
                String str5 = this.h;
                String str6 = this.g;
                C1795Pt1.b(obj);
                str2 = str5;
                str3 = str6;
                i2 = i5;
                d3 = d6;
            }
            return new C7606xQ((String) obj, d3, i2, str3, str2);
            Double d7 = new Double(d2 / ((Number) obj).doubleValue());
            NumberFormat numberFormat = NumberFormat.getInstance();
            numberFormat.setMaximumFractionDigits(2);
            numberFormat.setMinimumFractionDigits(2);
            String str7 = numberFormat.format(d7);
            Intrinsics.checkNotNullExpressionValue(str7, "format(...)");
            String strO = QO.o(str7);
            EQ eq = oc0.c;
            this.g = str;
            this.h = strO;
            this.e = i;
            this.j = d;
            this.i = 2;
            Object objA = eq.a(false, this);
            if (objA != mn) {
                i2 = i;
                double d8 = d;
                str2 = strO;
                obj = objA;
                str3 = str;
                d3 = d8;
                return new C7606xQ((String) obj, d3, i2, str3, str2);
            }
            return mn;
        }

        @Override // defpackage.InterfaceC1060Gj0
        public final Object k(Double d, EnumC4164hF1 enumC4164hF1, JM<? super C7606xQ> jm) {
            double dDoubleValue = d.doubleValue();
            a aVar = OC0.this.new a(jm);
            aVar.j = dDoubleValue;
            return aVar.invokeSuspend(Unit.a);
        }
    }

    public OC0(@NotNull C4617jA1 robotTrading, @NotNull C4923kf appDataRepository, @NotNull O3 accountModeSelectionUseCase, @NotNull EQ currencySignProvider) {
        Intrinsics.checkNotNullParameter(robotTrading, "robotTrading");
        Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
        Intrinsics.checkNotNullParameter(accountModeSelectionUseCase, "accountModeSelectionUseCase");
        Intrinsics.checkNotNullParameter(currencySignProvider, "currencySignProvider");
        this.a = appDataRepository;
        this.b = accountModeSelectionUseCase;
        this.c = currencySignProvider;
        this.d = new C6610sg0(robotTrading.W, accountModeSelectionUseCase.k(), new a(null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
    
        if (r7 == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007b, code lost:
    
        if (r7 == r1) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.OC0 r6, defpackage.LM r7) {
        /*
            r6.getClass()
            boolean r0 = r7 instanceof defpackage.NC0
            if (r0 == 0) goto L16
            r0 = r7
            NC0 r0 = (defpackage.NC0) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.h = r1
            goto L1b
        L16:
            NC0 r0 = new NC0
            r0.<init>(r6, r7)
        L1b:
            java.lang.Object r7 = r0.e
            MN r1 = defpackage.MN.d
            int r2 = r0.h
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L42
            if (r2 == r5) goto L3c
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            defpackage.C1795Pt1.b(r7)
            goto L7e
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            defpackage.C1795Pt1.b(r7)
            goto L6a
        L3c:
            OC0 r6 = r0.d
            defpackage.C1795Pt1.b(r7)
            goto L56
        L42:
            defpackage.C1795Pt1.b(r7)
            O3 r7 = r6.b
            rf0 r7 = r7.k()
            r0.d = r6
            r0.h = r5
            java.lang.Object r7 = defpackage.C4466ii.o(r7, r0)
            if (r7 != r1) goto L56
            goto L7d
        L56:
            hF1 r2 = defpackage.EnumC4164hF1.g
            r5 = 0
            if (r7 != r2) goto L6f
            kf r6 = r6.a
            GP1 r6 = r6.k
            r0.d = r5
            r0.h = r4
            java.lang.Object r7 = defpackage.C7236vf0.a(r6, r0)
            if (r7 != r1) goto L6a
            goto L7d
        L6a:
            uG r7 = (defpackage.C6945uG) r7
            double r6 = r7.k
            goto L82
        L6f:
            kf r6 = r6.a
            GP1 r6 = r6.k
            r0.d = r5
            r0.h = r3
            java.lang.Object r7 = defpackage.C7236vf0.a(r6, r0)
            if (r7 != r1) goto L7e
        L7d:
            return r1
        L7e:
            uG r7 = (defpackage.C6945uG) r7
            double r6 = r7.j
        L82:
            java.lang.Double r0 = new java.lang.Double
            r0.<init>(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.OC0.b(OC0, LM):java.lang.Object");
    }

    @Override // defpackage.MC0
    @NotNull
    public final C6610sg0 a() {
        return this.d;
    }
}
