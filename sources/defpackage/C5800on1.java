package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonError;
import com.api.feature.analytics.reporters.ReporterApi;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: on1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5800on1 extends AbstractC1394Kq1 {

    @NotNull
    public final G50 I;

    @NotNull
    public final C5232m6 J;

    @NotNull
    public final InterfaceC5599nq1 K;

    @NotNull
    public final InterfaceC1549Mq1 L;

    @NotNull
    public final GP1 M;

    @NotNull
    public final C1699On1 N;

    /* JADX INFO: renamed from: on1$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[C4078gq1.a.values().length];
            try {
                C4078gq1.a aVar = C4078gq1.a.d;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    /* JADX INFO: renamed from: on1$b */
    @InterfaceC3368dU(c = "com.base.feature.activation.screens.reregister.ReRegistrationViewModelBase$onInit$1", f = "ReRegistrationViewModelBase.kt", l = {85}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        public b(JM<? super b> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return C5800on1.this.new b(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((b) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            Object next;
            MN mn = MN.d;
            int i = this.d;
            C5800on1 c5800on1 = C5800on1.this;
            if (i == 0) {
                C1795Pt1.b(obj);
                InterfaceC1549Mq1 interfaceC1549Mq1 = c5800on1.L;
                this.d = 1;
                obj = interfaceC1549Mq1.a(this);
                if (obj == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            List list = (List) obj;
            c5800on1.M.setValue(list);
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((C2098Tq1) next).c);
            C2098Tq1 registrationCurrency = (C2098Tq1) next;
            if (registrationCurrency != null) {
                Intrinsics.checkNotNullParameter(registrationCurrency, "registrationCurrency");
                C5189lv.k(C8056za.j(c5800on1), null, new C6639sn1(c5800on1, registrationCurrency, null), 3);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5800on1(@NotNull C4923kf appData, @NotNull ReporterApi reporter, @NotNull InterfaceC4599j6 activationRegisterCallback, @NotNull G50 emailValidationUseCase, @NotNull C1273Jc0 passwordValidationUseCase, @NotNull InterfaceC7699xq1 registerUseCase, @NotNull NB checkboxValidationUseCase, @NotNull C5232m6 showErrorUseCase, @NotNull InterfaceC5599nq1 registerDialogsManager, @NotNull InterfaceC1549Mq1 registrationCurrenciesUseCase) {
        super(emailValidationUseCase, passwordValidationUseCase, checkboxValidationUseCase, registerUseCase, appData, reporter, activationRegisterCallback);
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(activationRegisterCallback, "activationRegisterCallback");
        Intrinsics.checkNotNullParameter(emailValidationUseCase, "emailValidationUseCase");
        Intrinsics.checkNotNullParameter(passwordValidationUseCase, "passwordValidationUseCase");
        Intrinsics.checkNotNullParameter(registerUseCase, "registerUseCase");
        Intrinsics.checkNotNullParameter(checkboxValidationUseCase, "checkboxValidationUseCase");
        Intrinsics.checkNotNullParameter(showErrorUseCase, "showErrorUseCase");
        Intrinsics.checkNotNullParameter(registerDialogsManager, "registerDialogsManager");
        Intrinsics.checkNotNullParameter(registrationCurrenciesUseCase, "registrationCurrenciesUseCase");
        this.I = emailValidationUseCase;
        this.J = showErrorUseCase;
        this.K = registerDialogsManager;
        this.L = registrationCurrenciesUseCase;
        GP1 gp1I = C1589Ne.i(C5653o60.d);
        this.M = gp1I;
        this.N = C4466ii.f(gp1I);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
    
        if (r8.w((com.api.core.backend.domain.models.resultModels.CommonResult) r12, r9, r6) == r0) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object x(defpackage.C5800on1 r8, java.lang.String r9, java.lang.String r10, defpackage.S80 r11, defpackage.LM r12) {
        /*
            boolean r0 = r12 instanceof defpackage.C6849tn1
            if (r0 == 0) goto L14
            r0 = r12
            tn1 r0 = (defpackage.C6849tn1) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.i = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            tn1 r0 = new tn1
            r0.<init>(r8, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.g
            MN r0 = defpackage.MN.d
            int r1 = r6.i
            r7 = 2
            r2 = 1
            if (r1 == 0) goto L3c
            if (r1 == r2) goto L34
            if (r1 != r7) goto L2c
            defpackage.C1795Pt1.b(r12)
            goto L64
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            java.lang.String r9 = r6.e
            on1 r8 = r6.d
            defpackage.C1795Pt1.b(r12)
            goto L54
        L3c:
            defpackage.C1795Pt1.b(r12)
            xq1 r1 = r8.x
            r6.d = r8
            r6.e = r9
            r6.i = r2
            java.lang.String r4 = ""
            r2 = r9
            r3 = r10
            r5 = r11
            java.lang.Object r12 = r1.d(r2, r3, r4, r5, r6)
            if (r12 != r0) goto L53
            goto L63
        L53:
            r9 = r2
        L54:
            com.api.core.backend.domain.models.resultModels.CommonResult r12 = (com.api.core.backend.domain.models.resultModels.CommonResult) r12
            r10 = 0
            r6.d = r10
            r6.e = r10
            r6.i = r7
            java.lang.Object r8 = r8.w(r12, r9, r6)
            if (r8 != r0) goto L64
        L63:
            return r0
        L64:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5800on1.x(on1, java.lang.String, java.lang.String, S80, LM):java.lang.Object");
    }

    @Override // defpackage.C7576xG
    public final void j() {
        C5189lv.k(C8056za.j(this), null, new b(null), 3);
    }

    @Override // defpackage.M50
    public final void m(@NotNull String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        super.m(email);
        AbstractC0961Fc0 abstractC0961Fc0 = (AbstractC0961Fc0) this.e.getValue();
        if ((abstractC0961Fc0 instanceof L51) && ((L51) abstractC0961Fc0).a == EnumC6594sc0.e) {
            v(new CommonError.CurrentEmail(), EnumC7489wq1.VALIDATION, false);
        }
    }

    @Override // defpackage.M50
    public final void n() {
        o();
    }

    @Override // defpackage.AbstractC7959z50
    public final void o() {
        super.o();
        Boolean bool = Boolean.FALSE;
        GP1 gp1 = this.E;
        gp1.getClass();
        gp1.m(null, bool);
        this.C.setValue(Jc2.a);
    }

    @Override // defpackage.AbstractC1394Kq1
    public final C1273Jc0 p() {
        return this.I;
    }

    @Override // defpackage.AbstractC1394Kq1
    @Nullable
    public final Object r(@NotNull C4078gq1 c4078gq1, @NotNull JM<? super Unit> jm) {
        C5800on1 c5800on1;
        Function0<Unit> c5590nn1;
        if (a.a[c4078gq1.a.ordinal()] == 1) {
            c5800on1 = this;
            c5590nn1 = new C6010pn1(0, c5800on1, C5800on1.class, "onVpnInstructionClick", "onVpnInstructionClick()V", 0);
        } else {
            c5800on1 = this;
            c5590nn1 = new C5590nn1(0);
        }
        Function0<Unit> function0 = c5590nn1;
        boolean z = c4078gq1.c;
        Object objA = c5800on1.K.a(c4078gq1, z ? c5800on1.l : new C0658Bf0(Boolean.FALSE), z ? C8056za.j(this) : null, function0, jm);
        return objA == MN.d ? objA : Unit.a;
    }

    @Override // defpackage.AbstractC1394Kq1
    @Nullable
    public Object u(@NotNull String str, @NotNull String str2, @NotNull S80 s80, @NotNull JM<? super Unit> jm) {
        return x(this, str, str2, s80, (LM) jm);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007d A[PHI: r9
      0x007d: PHI (r9v12 on1) = (r9v10 on1), (r9v13 on1) binds: [B:26:0x0079, B:17:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x008e A[PHI: r9
      0x008e: PHI (r9v14 on1) = (r9v12 on1), (r9v18 on1) binds: [B:29:0x008a, B:16:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x0116  */
    /* JADX WARN: Code duplicated, block: B:51:0x012d  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b9, code lost:
    
        if (r9.a(r10, r6) == r0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        if (r9.a(r11, r6) == r0) goto L53;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(@org.jetbrains.annotations.NotNull com.api.core.backend.domain.models.resultModels.CommonResult r9, @org.jetbrains.annotations.NotNull java.lang.String r10, @org.jetbrains.annotations.NotNull defpackage.LM r11) {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5800on1.w(com.api.core.backend.domain.models.resultModels.CommonResult, java.lang.String, LM):java.lang.Object");
    }
}
