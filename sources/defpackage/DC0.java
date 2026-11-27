package defpackage;

import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class DC0 implements BC0 {

    @NotNull
    public final C4923kf a;

    @NotNull
    public final O3 b;

    @NotNull
    public final EQ c;

    @NotNull
    public final C6610sg0 d;

    @InterfaceC3368dU(c = "com.base.feature.robot.robot.investment.providers.InvestmentAccountModelProviderBase$headerData$1", f = "InvestmentAccountModelProviderBase.kt", l = {29, 30}, m = "invokeSuspend")
    public static final class a extends AW1 implements InterfaceC1060Gj0<C6945uG, EnumC4164hF1, JM<? super C3489e3>, Object> {
        public double d;
        public int e;
        public /* synthetic */ EnumC4164hF1 g;

        public a(JM<? super a> jm) {
            super(3, jm);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x005c  */
        /* JADX WARN: Code duplicated, block: B:21:0x0060  */
        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            EnumC4164hF1 enumC4164hF1;
            EnumC4164hF1 enumC4164hF2;
            double d;
            int i;
            MN mn = MN.d;
            int i2 = this.e;
            DC0 dc0 = DC0.this;
            if (i2 == 0) {
                C1795Pt1.b(obj);
                EnumC4164hF1 enumC4164hF3 = this.g;
                this.g = enumC4164hF3;
                this.e = 1;
                Object objB = DC0.b(dc0, this);
                if (objB != mn) {
                    enumC4164hF1 = enumC4164hF3;
                    obj = objB;
                }
                return mn;
            }
            if (i2 == 1) {
                enumC4164hF1 = this.g;
                C1795Pt1.b(obj);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d = this.d;
                enumC4164hF2 = this.g;
                C1795Pt1.b(obj);
            }
            C7606xQ c7606xQ = new C7606xQ((String) obj, d, 28);
            if (enumC4164hF2 == EnumC4164hF1.g) {
                i = R.string.main_robot_demo_account_text;
            } else {
                i = R.string.main_robot_real_account_text;
            }
            return new C3489e3(i, c7606xQ);
            double dDoubleValue = ((Number) obj).doubleValue();
            EQ eq = dc0.c;
            this.g = enumC4164hF1;
            this.d = dDoubleValue;
            this.e = 2;
            obj = eq.a(false, this);
            if (obj != mn) {
                enumC4164hF2 = enumC4164hF1;
                d = dDoubleValue;
                C7606xQ c7606xQ2 = new C7606xQ((String) obj, d, 28);
                if (enumC4164hF2 == EnumC4164hF1.g) {
                    i = R.string.main_robot_demo_account_text;
                } else {
                    i = R.string.main_robot_real_account_text;
                }
                return new C3489e3(i, c7606xQ2);
            }
            return mn;
        }

        @Override // defpackage.InterfaceC1060Gj0
        public final Object k(C6945uG c6945uG, EnumC4164hF1 enumC4164hF1, JM<? super C3489e3> jm) {
            a aVar = DC0.this.new a(jm);
            aVar.g = enumC4164hF1;
            return aVar.invokeSuspend(Unit.a);
        }
    }

    public DC0(@NotNull C4923kf appDataRepository, @NotNull O3 accountModeSelectionUseCase, @NotNull EQ currencySignProvider) {
        Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
        Intrinsics.checkNotNullParameter(accountModeSelectionUseCase, "accountModeSelectionUseCase");
        Intrinsics.checkNotNullParameter(currencySignProvider, "currencySignProvider");
        this.a = appDataRepository;
        this.b = accountModeSelectionUseCase;
        this.c = currencySignProvider;
        this.d = new C6610sg0(appDataRepository.k, accountModeSelectionUseCase.k(), new a(null));
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
    public static final java.lang.Object b(defpackage.DC0 r6, defpackage.LM r7) {
        /*
            r6.getClass()
            boolean r0 = r7 instanceof defpackage.CC0
            if (r0 == 0) goto L16
            r0 = r7
            CC0 r0 = (defpackage.CC0) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.h = r1
            goto L1b
        L16:
            CC0 r0 = new CC0
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
            DC0 r6 = r0.d
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.DC0.b(DC0, LM):java.lang.Object");
    }

    @Override // defpackage.BC0
    @NotNull
    public final InterfaceC6396rf0<C3489e3> a() {
        return this.d;
    }
}
