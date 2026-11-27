package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonError;
import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.core.backend.domain.models.resultModels.ResultError;
import com.api.core.backend.domain.models.resultModels.ResultOk;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: yq1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7909yq1 implements InterfaceC7699xq1 {

    @NotNull
    public static final Set<EnumC7489wq1> t;

    @NotNull
    public final C7278vq1 a;

    @NotNull
    public final VS0 b;

    @NotNull
    public final C6306rD c;

    @NotNull
    public final C7566xC1 d;

    @NotNull
    public final C1221Il e;

    @NotNull
    public final C5581nl0 f;

    @NotNull
    public final C4607j8 g;

    @NotNull
    public final InterfaceC6211ql0 h;

    @NotNull
    public final C3966gJ1 i;

    @NotNull
    public final InterfaceC0720Ca j;

    @NotNull
    public final TU1 k;

    @NotNull
    public final TM1 l;

    @NotNull
    public final C5176lq1 m;

    @NotNull
    public final InterfaceC1900Rc1 n;

    @NotNull
    public final InterfaceC3448dq1 o;

    @Nullable
    public EnumC7489wq1 p;
    public boolean q;
    public boolean r;

    @Nullable
    public String s;

    /* JADX INFO: renamed from: yq1$a */
    public static final class a {

        @NotNull
        public final EnumC7489wq1 a;

        @NotNull
        public final Object b;

        public a(@NotNull EnumC7489wq1 id, @NotNull Function1<? super JM<? super CommonResult<?>>, ? extends Object> action) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(action, "action");
            this.a = id;
            this.b = action;
        }
    }

    /* JADX INFO: renamed from: yq1$b */
    @InterfaceC3368dU(c = "com.base.library.registration.usecases.RegisterUseCaseBase$stepsFor$1$1", f = "RegisterUseCaseBase.kt", l = {142}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function1<JM<? super CommonResult<?>>, Object> {
        public int d;
        public final /* synthetic */ RP g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(RP rp, JM<? super b> jm) {
            super(1, jm);
            this.g = rp;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return AbstractC7909yq1.this.new b(this.g, jm);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super CommonResult<?>> jm) {
            return ((b) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
                return obj;
            }
            C1795Pt1.b(obj);
            this.d = 1;
            Set<EnumC7489wq1> set = AbstractC7909yq1.t;
            Object objJ = AbstractC7909yq1.this.j(this.g, this);
            return objJ == mn ? mn : objJ;
        }
    }

    static {
        EnumC7489wq1[] elements = {EnumC7489wq1.WS_AUTH, EnumC7489wq1.PLATFORM_PROFILE};
        Intrinsics.checkNotNullParameter(elements, "elements");
        t = C1526Mj.H(elements);
    }

    public AbstractC7909yq1(@NotNull C7278vq1 registerRequestUseCase, @NotNull VS0 loginRequestUseCase, @NotNull C6306rD clearDataUseCase, @NotNull C7566xC1 saveDataUseCase, @NotNull C1221Il authenticateUseCase, @NotNull C5581nl0 getPlatformUserUseCase, @NotNull C4607j8 addUserUseCase, @NotNull InterfaceC6211ql0 getUserUseCase, @NotNull C3966gJ1 setConversionUseCase, @NotNull InterfaceC0720Ca analyticsUseCase, @NotNull TU1 successRegisterUseCase, @NotNull TM1 skipTutorialUseCase, @NotNull C5176lq1 registerAndLoginParams, @NotNull InterfaceC1900Rc1 pendingAddUser, @NotNull InterfaceC3448dq1 refreshConfigUseCase) {
        Intrinsics.checkNotNullParameter(registerRequestUseCase, "registerRequestUseCase");
        Intrinsics.checkNotNullParameter(loginRequestUseCase, "loginRequestUseCase");
        Intrinsics.checkNotNullParameter(clearDataUseCase, "clearDataUseCase");
        Intrinsics.checkNotNullParameter(saveDataUseCase, "saveDataUseCase");
        Intrinsics.checkNotNullParameter(authenticateUseCase, "authenticateUseCase");
        Intrinsics.checkNotNullParameter(getPlatformUserUseCase, "getPlatformUserUseCase");
        Intrinsics.checkNotNullParameter(addUserUseCase, "addUserUseCase");
        Intrinsics.checkNotNullParameter(getUserUseCase, "getUserUseCase");
        Intrinsics.checkNotNullParameter(setConversionUseCase, "setConversionUseCase");
        Intrinsics.checkNotNullParameter(analyticsUseCase, "analyticsUseCase");
        Intrinsics.checkNotNullParameter(successRegisterUseCase, "successRegisterUseCase");
        Intrinsics.checkNotNullParameter(skipTutorialUseCase, "skipTutorialUseCase");
        Intrinsics.checkNotNullParameter(registerAndLoginParams, "registerAndLoginParams");
        Intrinsics.checkNotNullParameter(pendingAddUser, "pendingAddUser");
        Intrinsics.checkNotNullParameter(refreshConfigUseCase, "refreshConfigUseCase");
        this.a = registerRequestUseCase;
        this.b = loginRequestUseCase;
        this.c = clearDataUseCase;
        this.d = saveDataUseCase;
        this.e = authenticateUseCase;
        this.f = getPlatformUserUseCase;
        this.g = addUserUseCase;
        this.h = getUserUseCase;
        this.i = setConversionUseCase;
        this.j = analyticsUseCase;
        this.k = successRegisterUseCase;
        this.l = skipTutorialUseCase;
        this.m = registerAndLoginParams;
        this.n = pendingAddUser;
        this.o = refreshConfigUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b4, code lost:
    
        if (r9.d(r0) == r1) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(defpackage.AbstractC7909yq1 r8, defpackage.JM r9) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC7909yq1.e(yq1, JM):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object f(AbstractC7909yq1 abstractC7909yq1, JM jm) {
        C1004Fq1 c1004Fq1;
        AbstractC7909yq1 abstractC7909yq2;
        CommonResult commonResult;
        InterfaceC1900Rc1 interfaceC1900Rc1;
        abstractC7909yq1.getClass();
        if (jm instanceof C1004Fq1) {
            c1004Fq1 = (C1004Fq1) jm;
            int i = c1004Fq1.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1004Fq1.i = i - Integer.MIN_VALUE;
            } else {
                c1004Fq1 = new C1004Fq1(abstractC7909yq1, jm);
            }
        } else {
            c1004Fq1 = new C1004Fq1(abstractC7909yq1, jm);
        }
        Object objB = c1004Fq1.g;
        MN mn = MN.d;
        int i2 = c1004Fq1.i;
        if (i2 == 0) {
            C1795Pt1.b(objB);
            c1004Fq1.d = abstractC7909yq1;
            c1004Fq1.i = 1;
            objB = abstractC7909yq1.j.b(c1004Fq1);
            if (objB != mn) {
            }
            return mn;
        }
        if (i2 == 1) {
            abstractC7909yq1 = (AbstractC7909yq1) c1004Fq1.d;
            C1795Pt1.b(objB);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                CommonResult commonResult2 = (CommonResult) c1004Fq1.d;
                C1795Pt1.b(objB);
                return commonResult2;
            }
            commonResult = c1004Fq1.e;
            abstractC7909yq2 = (AbstractC7909yq1) c1004Fq1.d;
            C1795Pt1.b(objB);
        }
        if (((Boolean) objB).booleanValue()) {
            interfaceC1900Rc1 = abstractC7909yq2.n;
            c1004Fq1.d = commonResult;
            c1004Fq1.e = null;
            c1004Fq1.i = 3;
            if (interfaceC1900Rc1.d(c1004Fq1) == mn) {
                return mn;
            }
        }
        return commonResult;
        CommonResult commonResult3 = (CommonResult) objB;
        InterfaceC1900Rc1 interfaceC1900Rc2 = abstractC7909yq1.n;
        String str = abstractC7909yq1.m.a;
        c1004Fq1.d = abstractC7909yq1;
        c1004Fq1.e = commonResult3;
        c1004Fq1.i = 2;
        Object objE = interfaceC1900Rc2.e(str, c1004Fq1);
        if (objE != mn) {
            abstractC7909yq2 = abstractC7909yq1;
            commonResult = commonResult3;
            objB = objE;
            if (((Boolean) objB).booleanValue()) {
                interfaceC1900Rc1 = abstractC7909yq2.n;
                c1004Fq1.d = commonResult;
                c1004Fq1.e = null;
                c1004Fq1.i = 3;
                if (interfaceC1900Rc1.d(c1004Fq1) == mn) {
                }
            }
            return commonResult;
        }
        return mn;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:57:0x0108 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object g(AbstractC7909yq1 abstractC7909yq1, JM jm) {
        C1082Gq1 c1082Gq1;
        String str;
        Object objA;
        CommonResult commonResult;
        boolean zI;
        AbstractC7909yq1 abstractC7909yq2;
        boolean z;
        Object objK;
        abstractC7909yq1.getClass();
        if (jm instanceof C1082Gq1) {
            c1082Gq1 = (C1082Gq1) jm;
            int i = c1082Gq1.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1082Gq1.j = i - Integer.MIN_VALUE;
            } else {
                c1082Gq1 = new C1082Gq1(abstractC7909yq1, jm);
            }
        } else {
            c1082Gq1 = new C1082Gq1(abstractC7909yq1, jm);
        }
        Object objE = c1082Gq1.h;
        MN mn = MN.d;
        int i2 = c1082Gq1.j;
        if (i2 == 0) {
            C1795Pt1.b(objE);
            str = abstractC7909yq1.m.a;
            C1160Hq1 c1160Hq1 = new C1160Hq1(abstractC7909yq1, str, null);
            c1082Gq1.d = abstractC7909yq1;
            c1082Gq1.e = str;
            c1082Gq1.j = 1;
            objA = C5580nl.a("register", null, c1160Hq1, c1082Gq1);
            if (objA != mn) {
            }
            return mn;
        }
        if (i2 == 1) {
            String str2 = (String) c1082Gq1.e;
            AbstractC7909yq1 abstractC7909yq3 = (AbstractC7909yq1) c1082Gq1.d;
            C1795Pt1.b(objE);
            str = str2;
            abstractC7909yq1 = abstractC7909yq3;
            objA = objE;
        } else {
            if (i2 == 2) {
                C1795Pt1.b(objE);
                return objE;
            }
            if (i2 == 3) {
                CommonResult commonResult2 = (CommonResult) c1082Gq1.d;
                C1795Pt1.b(objE);
                return commonResult2;
            }
            if (i2 != 4) {
                if (i2 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(objE);
                return objE;
            }
            z = c1082Gq1.g;
            commonResult = (CommonResult) c1082Gq1.e;
            abstractC7909yq2 = (AbstractC7909yq1) c1082Gq1.d;
            C1795Pt1.b(objE);
        }
        if (((Boolean) objE).booleanValue()) {
            return commonResult;
        }
        zI = z;
        abstractC7909yq1 = abstractC7909yq2;
        c1082Gq1.d = null;
        c1082Gq1.e = null;
        c1082Gq1.j = 5;
        objK = abstractC7909yq1.k((ResultError) commonResult, zI, c1082Gq1);
        if (objK == mn) {
            return mn;
        }
        return objK;
        commonResult = (CommonResult) objA;
        if (commonResult instanceof ResultOk) {
            abstractC7909yq1.s = null;
            C5176lq1 c5176lq1 = abstractC7909yq1.m;
            if (c5176lq1.c.length() == 0) {
                c1082Gq1.d = null;
                c1082Gq1.e = null;
                c1082Gq1.j = 2;
                Object objL = abstractC7909yq1.l(c1082Gq1);
                if (objL != mn) {
                    return objL;
                }
            } else {
                c5176lq1.g = new RP(c5176lq1.a, c5176lq1.b, c5176lq1.c);
                c1082Gq1.d = commonResult;
                c1082Gq1.e = null;
                c1082Gq1.j = 3;
                if (abstractC7909yq1.n.f(str, c1082Gq1) != mn) {
                    return commonResult;
                }
            }
        } else {
            if (!(commonResult instanceof ResultError) || !(((ResultError) commonResult).getError() instanceof CommonError.EmailAlreadyRegistered)) {
                return commonResult;
            }
            zI = d.i(abstractC7909yq1.s, str);
            if (zI) {
                c1082Gq1.d = null;
                c1082Gq1.e = null;
                c1082Gq1.j = 5;
                objK = abstractC7909yq1.k((ResultError) commonResult, zI, c1082Gq1);
                if (objK == mn) {
                    return objK;
                }
            } else {
                c1082Gq1.d = abstractC7909yq1;
                c1082Gq1.e = commonResult;
                c1082Gq1.g = zI;
                c1082Gq1.j = 4;
                objE = abstractC7909yq1.n.e(str, c1082Gq1);
                if (objE != mn) {
                    abstractC7909yq2 = abstractC7909yq1;
                    z = zI;
                    if (((Boolean) objE).booleanValue()) {
                        return commonResult;
                    }
                    zI = z;
                    abstractC7909yq1 = abstractC7909yq2;
                    c1082Gq1.d = null;
                    c1082Gq1.e = null;
                    c1082Gq1.j = 5;
                    objK = abstractC7909yq1.k((ResultError) commonResult, zI, c1082Gq1);
                    if (objK == mn) {
                        return objK;
                    }
                }
            }
        }
        return mn;
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0132 A[Catch: all -> 0x012a, CancellationException -> 0x012c, TryCatch #5 {CancellationException -> 0x012c, all -> 0x012a, blocks: (B:73:0x012e, B:75:0x0132, B:76:0x0136, B:78:0x013a, B:80:0x013e, B:51:0x00d9, B:54:0x00e1, B:59:0x00ed, B:61:0x00f7, B:63:0x0104, B:47:0x00c1), top: B:100:0x00c1 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x013a A[Catch: all -> 0x012a, CancellationException -> 0x012c, TryCatch #5 {CancellationException -> 0x012c, all -> 0x012a, blocks: (B:73:0x012e, B:75:0x0132, B:76:0x0136, B:78:0x013a, B:80:0x013e, B:51:0x00d9, B:54:0x00e1, B:59:0x00ed, B:61:0x00f7, B:63:0x0104, B:47:0x00c1), top: B:100:0x00c1 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x013d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code duplicated, block: B:82:0x0143  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [cl, yq1] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v3, types: [cl] */
    /* JADX WARN: Type inference failed for: r12v4, types: [cl] */
    /* JADX WARN: Type inference failed for: r12v5, types: [yq1] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [yq1] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r3v12, types: [cl] */
    /* JADX WARN: Type inference failed for: r3v16, types: [cl] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [cl] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [cl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [cl] */
    /* JADX WARN: Type inference failed for: r6v8 */
    public static Object i(AbstractC7909yq1 abstractC7909yq1, LM lm) {
        C0614Aq1 c0614Aq1;
        ?? B;
        RP rp;
        ?? r6;
        String str;
        ?? r12;
        CommonResult commonResult;
        ?? r1;
        ?? r2;
        EnumC7489wq1 enumC7489wq1;
        String str2;
        if (lm instanceof C0614Aq1) {
            c0614Aq1 = (C0614Aq1) lm;
            int i = c0614Aq1.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0614Aq1.k = i - Integer.MIN_VALUE;
            } else {
                c0614Aq1 = new C0614Aq1(abstractC7909yq1, lm);
            }
        } else {
            c0614Aq1 = new C0614Aq1(abstractC7909yq1, lm);
        }
        Object objM = c0614Aq1.i;
        MN mn = MN.d;
        int i2 = c0614Aq1.k;
        try {
            try {
                if (i2 != 0) {
                    if (i2 == 1) {
                        InterfaceC3220cl interfaceC3220cl = c0614Aq1.h;
                        InterfaceC3220cl interfaceC3220cl2 = c0614Aq1.g;
                        RP rp2 = (RP) c0614Aq1.e;
                        AbstractC7909yq1 abstractC7909yq2 = c0614Aq1.d;
                        C1795Pt1.b(objM);
                        B = interfaceC3220cl;
                        r12 = abstractC7909yq2;
                        rp = rp2;
                        r6 = interfaceC3220cl2;
                    } else {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        InterfaceC3220cl interfaceC3220cl3 = c0614Aq1.g;
                        InterfaceC3220cl interfaceC3220cl4 = (InterfaceC3220cl) c0614Aq1.e;
                        AbstractC7909yq1 abstractC7909yq3 = c0614Aq1.d;
                        C1795Pt1.b(objM);
                        r1 = abstractC7909yq3;
                        r2 = interfaceC3220cl4;
                        abstractC7909yq1 = interfaceC3220cl3;
                    }
                    commonResult = (CommonResult) objM;
                    B = abstractC7909yq1;
                    r12 = r1;
                    r6 = r2;
                    if (commonResult instanceof ResultOk) {
                        r12.m.g = null;
                    }
                    enumC7489wq1 = r12.p;
                    if (enumC7489wq1 != null) {
                        str2 = enumC7489wq1.d;
                    } else {
                        str2 = null;
                    }
                    UF.a(r6, commonResult, str2);
                    if (B != 0) {
                        C3430dl.c(B);
                    }
                    return commonResult;
                }
                C1795Pt1.b(objM);
                C5176lq1 c5176lq1 = abstractC7909yq1.m;
                String str3 = c5176lq1.a;
                RP rp3 = c5176lq1.g;
                if (rp3 == null || !d.i(rp3.a, str3)) {
                    rp3 = null;
                }
                abstractC7909yq1.q = abstractC7909yq1.r || rp3 != null;
                abstractC7909yq1.r = false;
                C5176lq1 c5176lq2 = abstractC7909yq1.m;
                if (rp3 != null && (str = rp3.c) != null) {
                    c5176lq2.getClass();
                    Intrinsics.checkNotNullParameter(str, "<set-?>");
                    c5176lq2.c = str;
                }
                Pair pair = new Pair("auth.resumed", Boolean.valueOf(abstractC7909yq1.q));
                String str4 = c5176lq2.e;
                B = C6000pl.b("register", PW0.e(pair, new Pair("captcha.required", Boolean.valueOf(!(str4 == null || str4.length() == 0)))));
                try {
                    List<a> listN = abstractC7909yq1.n(rp3);
                    c0614Aq1.d = abstractC7909yq1;
                    c0614Aq1.e = rp3;
                    c0614Aq1.g = B;
                    c0614Aq1.h = B;
                    c0614Aq1.k = 1;
                    Object objM2 = abstractC7909yq1.m(listN, B, c0614Aq1);
                    if (objM2 != mn) {
                        rp = rp3;
                        objM = objM2;
                        r6 = B;
                        B = B;
                        r12 = abstractC7909yq1;
                    }
                    return mn;
                } catch (CancellationException e) {
                    e = e;
                    abstractC7909yq1 = B;
                    if (abstractC7909yq1 != 0) {
                        InterfaceC3220cl.a.a(abstractC7909yq1, EnumC4737jl.g, null, null, 6);
                    }
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    abstractC7909yq1 = B;
                    String simpleName = th.getClass().getSimpleName();
                    if (abstractC7909yq1 != 0) {
                        EnumC4737jl enumC4737jl = EnumC4737jl.e;
                        Intrinsics.checkNotNull(simpleName);
                        String strConcat = "exception:".concat(simpleName);
                        String message = th.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        InterfaceC3220cl.a.a(abstractC7909yq1, enumC4737jl, null, new JX1(simpleName, strConcat, message, th), 2);
                    }
                    throw th;
                }
                commonResult = (CommonResult) objM;
                if (commonResult instanceof ResultError) {
                    if ((rp != null ? rp.c : null) != null && CollectionsKt.z(t, r12.p) && C1603Nh1.a(((ResultError) commonResult).getError())) {
                        RP rpA = RP.a(rp);
                        r12.m.g = rpA;
                        List<a> listN2 = r12.n(rpA);
                        c0614Aq1.d = r12;
                        c0614Aq1.e = r6;
                        c0614Aq1.g = B;
                        c0614Aq1.h = null;
                        c0614Aq1.k = 2;
                        objM = r12.m(listN2, r6, c0614Aq1);
                        if (objM != mn) {
                            r1 = r12;
                            abstractC7909yq1 = B;
                            r2 = r6;
                            commonResult = (CommonResult) objM;
                            B = abstractC7909yq1;
                            r12 = r1;
                            r6 = r2;
                        }
                        return mn;
                    }
                }
                if (commonResult instanceof ResultOk) {
                    r12.m.g = null;
                }
                enumC7489wq1 = r12.p;
                if (enumC7489wq1 != null) {
                    str2 = enumC7489wq1.d;
                } else {
                    str2 = null;
                }
                UF.a(r6, commonResult, str2);
                if (B != 0) {
                    C3430dl.c(B);
                }
                return commonResult;
            } catch (Throwable th2) {
                if (abstractC7909yq1 != 0) {
                    C3430dl.c(abstractC7909yq1);
                }
                throw th2;
            }
        } catch (CancellationException e2) {
            e = e2;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // defpackage.InterfaceC7699xq1
    @Nullable
    public final EnumC7489wq1 a() {
        return this.p;
    }

    @Override // defpackage.InterfaceC7699xq1
    public final boolean b() {
        return this.q;
    }

    @Override // defpackage.InterfaceC7699xq1
    @Nullable
    public final Object c(@NotNull C1694Om c1694Om) {
        this.r = true;
        return i(this, c1694Om);
    }

    @Override // defpackage.InterfaceC7699xq1
    @Nullable
    public final Object d(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull S80 s80, @NotNull LM lm) {
        C5176lq1 c5176lq1 = this.m;
        RP rp = c5176lq1.g;
        if (rp == null || !d.i(rp.a, str)) {
            rp = null;
        }
        if (rp == null) {
            c5176lq1.g = null;
        }
        c5176lq1.getClass();
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        c5176lq1.a = str;
        Intrinsics.checkNotNullParameter(str2, "<set-?>");
        c5176lq1.b = str2;
        c5176lq1.e = str3;
        Intrinsics.checkNotNullParameter(s80, "<set-?>");
        c5176lq1.f = s80;
        return i(this, lm);
    }

    public final Object h(CommonResult commonResult, String str, LM lm) {
        String str2 = this.m.c;
        if (!(commonResult instanceof ResultOk) || str2.length() <= 0 || str2.equals(str)) {
            return Unit.a;
        }
        C7278vq1 c7278vq1 = this.a;
        c7278vq1.getClass();
        Object objX = c7278vq1.e.x(new C6735tG(str2, 2), lm);
        MN mn = MN.d;
        if (objX != mn) {
            objX = Unit.a;
        }
        if (objX != mn) {
            objX = Unit.a;
        }
        return objX == mn ? objX : Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(RP rp, LM lm) {
        C0770Cq1 c0770Cq1;
        AbstractC7909yq1 abstractC7909yq1;
        if (lm instanceof C0770Cq1) {
            c0770Cq1 = (C0770Cq1) lm;
            int i = c0770Cq1.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0770Cq1.h = i - Integer.MIN_VALUE;
            } else {
                c0770Cq1 = new C0770Cq1(this, lm);
            }
        } else {
            c0770Cq1 = new C0770Cq1(this, lm);
        }
        Object objB = c0770Cq1.e;
        MN mn = MN.d;
        int i2 = c0770Cq1.h;
        if (i2 == 0) {
            C1795Pt1.b(objB);
            String str = rp.b;
            C5176lq1 c5176lq1 = this.m;
            c5176lq1.getClass();
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            c5176lq1.b = str;
            c0770Cq1.d = this;
            c0770Cq1.h = 1;
            VS0 vs0 = this.b;
            vs0.getClass();
            objB = US0.b(vs0, c0770Cq1);
            if (objB == mn) {
                return mn;
            }
            abstractC7909yq1 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC7909yq1 = c0770Cq1.d;
            C1795Pt1.b(objB);
        }
        if (((CommonResult) objB) instanceof ResultOk) {
            C5176lq1 c5176lq2 = abstractC7909yq1.m;
            c5176lq2.g = new RP(c5176lq2.a, c5176lq2.b, c5176lq2.c);
        }
        return objB;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00ca A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(ResultError resultError, boolean z, LM lm) {
        C0848Dq1 c0848Dq1;
        String str;
        AbstractC7909yq1 abstractC7909yq1;
        CommonResult commonResult;
        CommonResult commonResult2;
        AbstractC7909yq1 abstractC7909yq2;
        if (lm instanceof C0848Dq1) {
            c0848Dq1 = (C0848Dq1) lm;
            int i = c0848Dq1.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0848Dq1.l = i - Integer.MIN_VALUE;
            } else {
                c0848Dq1 = new C0848Dq1(this, lm);
            }
        } else {
            c0848Dq1 = new C0848Dq1(this, lm);
        }
        Object obj = c0848Dq1.j;
        MN mn = MN.d;
        int i2 = c0848Dq1.l;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            String str2 = this.m.c;
            c0848Dq1.d = this;
            c0848Dq1.e = resultError;
            c0848Dq1.g = str2;
            c0848Dq1.i = z;
            c0848Dq1.l = 1;
            VS0 vs0 = this.b;
            vs0.getClass();
            Object objB = US0.b(vs0, c0848Dq1);
            if (objB != mn) {
                str = str2;
                obj = objB;
                abstractC7909yq1 = this;
            }
            return mn;
        }
        if (i2 == 1) {
            z = c0848Dq1.i;
            String str3 = (String) c0848Dq1.g;
            ResultError resultError2 = (ResultError) c0848Dq1.e;
            abstractC7909yq1 = (AbstractC7909yq1) c0848Dq1.d;
            C1795Pt1.b(obj);
            str = str3;
            resultError = resultError2;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                CommonResult commonResult3 = (CommonResult) c0848Dq1.d;
                C1795Pt1.b(obj);
                return commonResult3;
            }
            commonResult = c0848Dq1.h;
            commonResult2 = (CommonResult) c0848Dq1.g;
            str = (String) c0848Dq1.e;
            abstractC7909yq2 = (AbstractC7909yq1) c0848Dq1.d;
            C1795Pt1.b(obj);
        }
        c0848Dq1.d = commonResult;
        c0848Dq1.e = null;
        c0848Dq1.g = null;
        c0848Dq1.h = null;
        c0848Dq1.l = 3;
        if (abstractC7909yq2.h(commonResult2, str, c0848Dq1) != mn) {
            return mn;
        }
        return commonResult;
        CommonResult commonResult4 = (CommonResult) obj;
        if (!(commonResult4 instanceof ResultOk)) {
            if (!(commonResult4 instanceof ResultError)) {
                return commonResult4;
            }
            CommonError error = ((ResultError) commonResult4).getError();
            abstractC7909yq1.getClass();
            return ((error instanceof CommonError.IncorrectCredentials) || (error instanceof CommonError.EmailNotExists)) ? resultError : commonResult4;
        }
        C5176lq1 c5176lq1 = abstractC7909yq1.m;
        c5176lq1.g = new RP(c5176lq1.a, c5176lq1.b, c5176lq1.c);
        if (!z) {
            return commonResult4;
        }
        abstractC7909yq1.s = null;
        String str4 = abstractC7909yq1.m.a;
        c0848Dq1.d = abstractC7909yq1;
        c0848Dq1.e = str;
        c0848Dq1.g = commonResult4;
        c0848Dq1.h = (ResultOk) commonResult4;
        c0848Dq1.l = 2;
        if (abstractC7909yq1.n.f(str4, c0848Dq1) != mn) {
            commonResult = commonResult4;
            commonResult2 = commonResult;
            abstractC7909yq2 = abstractC7909yq1;
            c0848Dq1.d = commonResult;
            c0848Dq1.e = null;
            c0848Dq1.g = null;
            c0848Dq1.h = null;
            c0848Dq1.l = 3;
            if (abstractC7909yq2.h(commonResult2, str, c0848Dq1) != mn) {
                return commonResult;
            }
        }
        return mn;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0095 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(LM lm) {
        C0926Eq1 c0926Eq1;
        RP rp;
        AbstractC7909yq1 abstractC7909yq1;
        String str;
        AbstractC7909yq1 abstractC7909yq2;
        if (lm instanceof C0926Eq1) {
            c0926Eq1 = (C0926Eq1) lm;
            int i = c0926Eq1.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0926Eq1.i = i - Integer.MIN_VALUE;
            } else {
                c0926Eq1 = new C0926Eq1(this, lm);
            }
        } else {
            c0926Eq1 = new C0926Eq1(this, lm);
        }
        Object obj = c0926Eq1.g;
        MN mn = MN.d;
        int i2 = c0926Eq1.i;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            C5176lq1 c5176lq1 = this.m;
            String str2 = c5176lq1.a;
            rp = new RP(str2, c5176lq1.b, null);
            c5176lq1.g = rp;
            c0926Eq1.d = this;
            c0926Eq1.e = rp;
            c0926Eq1.i = 1;
            if (this.n.f(str2, c0926Eq1) != mn) {
                abstractC7909yq1 = this;
            }
            return mn;
        }
        if (i2 == 1) {
            rp = (RP) c0926Eq1.e;
            abstractC7909yq1 = (AbstractC7909yq1) c0926Eq1.d;
            C1795Pt1.b(obj);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj2 = c0926Eq1.d;
                C1795Pt1.b(obj);
                return obj2;
            }
            str = (String) c0926Eq1.e;
            abstractC7909yq2 = (AbstractC7909yq1) c0926Eq1.d;
            C1795Pt1.b(obj);
        }
        c0926Eq1.d = obj;
        c0926Eq1.e = null;
        c0926Eq1.i = 3;
        if (abstractC7909yq2.h((CommonResult) obj, str, c0926Eq1) != mn) {
            return mn;
        }
        return obj;
        String str3 = abstractC7909yq1.m.c;
        c0926Eq1.d = abstractC7909yq1;
        c0926Eq1.e = str3;
        c0926Eq1.i = 2;
        Object objJ = abstractC7909yq1.j(rp, c0926Eq1);
        if (objJ != mn) {
            str = str3;
            obj = objJ;
            abstractC7909yq2 = abstractC7909yq1;
            c0926Eq1.d = obj;
            c0926Eq1.e = null;
            c0926Eq1.i = 3;
            if (abstractC7909yq2.h((CommonResult) obj, str, c0926Eq1) != mn) {
                return obj;
            }
        }
        return mn;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005d  */
    /* JADX WARN: Code duplicated, block: B:25:0x006b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0082  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0082 -> B:30:0x0087). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object m(java.util.List r11, defpackage.InterfaceC3220cl r12, defpackage.LM r13) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC7909yq1.m(java.util.List, cl, LM):java.lang.Object");
    }

    public final List<a> n(RP rp) {
        List<a> listF = WE.f(new a(EnumC7489wq1.REGISTER, new L1(1, this, AbstractC7909yq1.class, "requestRegister", "requestRegister(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 2)), new a(EnumC7489wq1.CLEAR_DATA, new ZS0(1, this.c, InterfaceC5887pD.class, "clearOldAccountData", "clearOldAccountData(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 1)), new a(EnumC7489wq1.SAVE_TOKEN, new C2723aT0(1, this.d, InterfaceC7145vC1.class, "saveNewToken", "saveNewToken(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 1)), new a(EnumC7489wq1.WS_AUTH, new C2947bT0(1, this.e, InterfaceC1065Gl.class, "authentication", "authentication(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 1)), new a(EnumC7489wq1.PLATFORM_PROFILE, new C3156cT0(1, this.f, InterfaceC5158ll0.class, "getPlatformUser", "getPlatformUser(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 2)), new a(EnumC7489wq1.ADD_USER, new C3366dT0(1, this, AbstractC7909yq1.class, "addUser", "addUser(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 1)), new a(EnumC7489wq1.OUR_USER, new C3575eT0(1, this.h, InterfaceC6211ql0.class, "getOurUser", "getOurUser(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 1)), new a(EnumC7489wq1.CONFIG, new C3785fT0(1, this.o, InterfaceC3448dq1.class, "refreshConfig", "refreshConfig(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 1)), new a(EnumC7489wq1.CONVERSION, new C3995gT0(1, this.i, InterfaceC3546eJ1.class, "setConversion", "setConversion(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 1)), new a(EnumC7489wq1.ANALYTICS, new C0692Bq1(1, this, AbstractC7909yq1.class, "reportRegistration", "reportRegistration(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0)), new a(EnumC7489wq1.OPEN_PLATFORM, new K10(1, this.k, RU1.class, "goToPlatform", "goToPlatform(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 1)), new a(EnumC7489wq1.SKIP_TUTORIAL, new C4273hm(1, this.l, SM1.class, "skipTutorial", "skipTutorial(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 1)));
        if (rp == null) {
            return listF;
        }
        if (rp.c != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listF) {
                if (((a) obj).a != EnumC7489wq1.REGISTER) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(XE.m(listF, 10));
        for (a aVar : listF) {
            if (aVar.a == EnumC7489wq1.REGISTER) {
                aVar = new a(EnumC7489wq1.LOGIN, new b(rp, null));
            }
            arrayList2.add(aVar);
        }
        return arrayList2;
    }
}
