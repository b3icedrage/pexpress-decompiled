package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonError;
import com.api.core.backend.domain.models.resultModels.CommonErrorClassificationKt;
import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.core.backend.domain.models.resultModels.ResultError;
import com.api.core.backend.domain.models.resultModels.ResultOk;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class XS0 implements WS0 {

    @NotNull
    public final VS0 a;

    @NotNull
    public final C40 b;

    @NotNull
    public final C6306rD c;

    @NotNull
    public final C7566xC1 d;

    @NotNull
    public final C1221Il e;

    @NotNull
    public final C5581nl0 f;

    @NotNull
    public final InterfaceC6211ql0 g;

    @NotNull
    public final InterfaceC0720Ca h;

    @NotNull
    public final QU1 i;

    @NotNull
    public final C5176lq1 j;

    @NotNull
    public final GG k;

    @NotNull
    public final InterfaceC3448dq1 l;

    @Nullable
    public EnumC7489wq1 m;
    public boolean n;

    public static final class a {

        @NotNull
        public final EnumC7489wq1 a;

        @NotNull
        public final C2784ak0 b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull EnumC7489wq1 id, @NotNull Function1<? super JM<? super CommonResult<?>>, ? extends Object> action) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(action, "action");
            this.a = id;
            this.b = (C2784ak0) action;
        }
    }

    @InterfaceC3368dU(c = "com.base.library.registration.usecases.LoginUseCaseBase", f = "LoginUseCaseBase.kt", l = {115, 117}, m = "addUserIfPending")
    public static final class b extends LM {
        public XS0 d;
        public /* synthetic */ Object e;
        public int h;

        public b(JM<? super b> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.e = obj;
            this.h |= Integer.MIN_VALUE;
            return XS0.this.c(this);
        }
    }

    public XS0(@NotNull VS0 loginRequestUseCase, @NotNull C40 duoAuthRequestUseCase, @NotNull C6306rD clearDataUseCase, @NotNull C7566xC1 saveDataUseCase, @NotNull C1221Il authenticateUseCase, @NotNull C5581nl0 getPlatformUserUseCase, @NotNull C4607j8 addUserUseCase, @NotNull InterfaceC6211ql0 getOurUserUseCase, @NotNull C3966gJ1 setConversionUseCase, @NotNull InterfaceC0720Ca analyticsUseCase, @NotNull QU1 successLoginUseCase, @NotNull TM1 skipTutorialUseCase, @NotNull C5176lq1 registerAndLoginParams, @NotNull GG completePendingRegistration, @NotNull InterfaceC3448dq1 refreshConfigUseCase) {
        Intrinsics.checkNotNullParameter(loginRequestUseCase, "loginRequestUseCase");
        Intrinsics.checkNotNullParameter(duoAuthRequestUseCase, "duoAuthRequestUseCase");
        Intrinsics.checkNotNullParameter(clearDataUseCase, "clearDataUseCase");
        Intrinsics.checkNotNullParameter(saveDataUseCase, "saveDataUseCase");
        Intrinsics.checkNotNullParameter(authenticateUseCase, "authenticateUseCase");
        Intrinsics.checkNotNullParameter(getPlatformUserUseCase, "getPlatformUserUseCase");
        Intrinsics.checkNotNullParameter(addUserUseCase, "addUserUseCase");
        Intrinsics.checkNotNullParameter(getOurUserUseCase, "getOurUserUseCase");
        Intrinsics.checkNotNullParameter(setConversionUseCase, "setConversionUseCase");
        Intrinsics.checkNotNullParameter(analyticsUseCase, "analyticsUseCase");
        Intrinsics.checkNotNullParameter(successLoginUseCase, "successLoginUseCase");
        Intrinsics.checkNotNullParameter(skipTutorialUseCase, "skipTutorialUseCase");
        Intrinsics.checkNotNullParameter(registerAndLoginParams, "registerAndLoginParams");
        Intrinsics.checkNotNullParameter(completePendingRegistration, "completePendingRegistration");
        Intrinsics.checkNotNullParameter(refreshConfigUseCase, "refreshConfigUseCase");
        this.a = loginRequestUseCase;
        this.b = duoAuthRequestUseCase;
        this.c = clearDataUseCase;
        this.d = saveDataUseCase;
        this.e = authenticateUseCase;
        this.f = getPlatformUserUseCase;
        this.g = getOurUserUseCase;
        this.h = analyticsUseCase;
        this.i = successLoginUseCase;
        this.j = registerAndLoginParams;
        this.k = completePendingRegistration;
        this.l = refreshConfigUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00a6 A[Catch: all -> 0x00ba, TryCatch #3 {all -> 0x00ba, blocks: (B:46:0x009c, B:48:0x00a6, B:53:0x00bc, B:54:0x00c3, B:56:0x00c6, B:57:0x00cc), top: B:61:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c6 A[Catch: all -> 0x00ba, TryCatch #3 {all -> 0x00ba, blocks: (B:46:0x009c, B:48:0x00a6, B:53:0x00bc, B:54:0x00c3, B:56:0x00c6, B:57:0x00cc), top: B:61:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object d(XS0 xs0, LM lm) {
        YS0 ys0;
        InterfaceC3220cl interfaceC3220clB;
        Object objE;
        InterfaceC3220cl interfaceC3220cl;
        Throwable th;
        InterfaceC3220cl interfaceC3220cl2;
        String simpleName;
        String message;
        CancellationException e;
        XS0 xs1;
        if (lm instanceof YS0) {
            ys0 = (YS0) lm;
            int i = ys0.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                ys0.j = i - Integer.MIN_VALUE;
            } else {
                ys0 = new YS0(xs0, lm);
            }
        } else {
            ys0 = new YS0(xs0, lm);
        }
        Object obj = ys0.h;
        MN mn = MN.d;
        int i2 = ys0.j;
        try {
            if (i2 == 0) {
                C1795Pt1.b(obj);
                xs0.m = null;
                String str = xs0.j.e;
                interfaceC3220clB = C6000pl.b("login", OW0.b(new Pair("captcha.required", Boolean.valueOf(!(str == null || str.length() == 0)))));
                try {
                    ys0.d = xs0;
                    ys0.e = interfaceC3220clB;
                    ys0.g = interfaceC3220clB;
                    ys0.j = 1;
                    objE = xs0.e(interfaceC3220clB, ys0);
                    if (objE == mn) {
                        return mn;
                    }
                    interfaceC3220cl = interfaceC3220clB;
                    xs1 = xs0;
                } catch (CancellationException e2) {
                    InterfaceC3220cl interfaceC3220cl3 = interfaceC3220clB;
                    e = e2;
                    interfaceC3220cl2 = interfaceC3220cl3;
                    if (interfaceC3220cl2 != null) {
                        InterfaceC3220cl.a.a(interfaceC3220cl2, EnumC4737jl.g, null, null, 6);
                    }
                    throw e;
                } catch (Throwable th2) {
                    InterfaceC3220cl interfaceC3220cl4 = interfaceC3220clB;
                    th = th2;
                    interfaceC3220cl2 = interfaceC3220cl4;
                    simpleName = th.getClass().getSimpleName();
                    if (interfaceC3220cl2 != null) {
                        EnumC4737jl enumC4737jl = EnumC4737jl.e;
                        Intrinsics.checkNotNull(simpleName);
                        String strConcat = "exception:".concat(simpleName);
                        message = th.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        InterfaceC3220cl.a.a(interfaceC3220cl2, enumC4737jl, null, new JX1(simpleName, strConcat, message, th), 2);
                    }
                    throw th;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC3220cl2 = ys0.g;
                interfaceC3220cl = ys0.e;
                XS0 xs2 = ys0.d;
                try {
                    C1795Pt1.b(obj);
                    interfaceC3220clB = interfaceC3220cl2;
                    xs1 = xs2;
                    objE = obj;
                } catch (CancellationException e3) {
                    e = e3;
                    if (interfaceC3220cl2 != null) {
                        InterfaceC3220cl.a.a(interfaceC3220cl2, EnumC4737jl.g, null, null, 6);
                    }
                    throw e;
                } catch (Throwable th3) {
                    th = th3;
                    simpleName = th.getClass().getSimpleName();
                    if (interfaceC3220cl2 != null) {
                        EnumC4737jl enumC4737jl2 = EnumC4737jl.e;
                        Intrinsics.checkNotNull(simpleName);
                        String strConcat2 = "exception:".concat(simpleName);
                        message = th.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        InterfaceC3220cl.a.a(interfaceC3220cl2, enumC4737jl2, null, new JX1(simpleName, strConcat2, message, th), 2);
                    }
                    throw th;
                }
            }
            CommonResult commonResult = (CommonResult) objE;
            EnumC7489wq1 enumC7489wq1 = xs1.m;
            UF.a(interfaceC3220cl, commonResult, enumC7489wq1 != null ? enumC7489wq1.d : null);
            if (interfaceC3220clB != null) {
                C3430dl.c(interfaceC3220clB);
            }
            return commonResult;
        } catch (Throwable th4) {
            if (xs0 != 0) {
                C3430dl.c(xs0);
            }
            throw th4;
        }
    }

    @Override // defpackage.WS0
    @Nullable
    public final EnumC7489wq1 a() {
        return this.m;
    }

    @Override // defpackage.WS0
    @Nullable
    public final Object b(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull C1146Hm.f fVar) {
        C5176lq1 c5176lq1 = this.j;
        c5176lq1.getClass();
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        c5176lq1.a = str;
        Intrinsics.checkNotNullParameter(str2, "<set-?>");
        c5176lq1.b = str2;
        c5176lq1.e = str3;
        S80 s80 = S80.EMAIL_AUTH;
        Intrinsics.checkNotNullParameter(s80, "<set-?>");
        c5176lq1.f = s80;
        return d(this, fVar);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Nullable
    public final Object c(@NotNull JM<? super CommonResult<?>> jm) {
        b bVar;
        XS0 xs0;
        XS0 xs1;
        if (jm instanceof b) {
            bVar = (b) jm;
            int i = bVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.h = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(jm);
            }
        } else {
            bVar = new b(jm);
        }
        b bVar2 = bVar;
        Object objC = bVar2.e;
        MN mn = MN.d;
        int i2 = bVar2.h;
        boolean z = false;
        if (i2 != 0) {
            if (i2 == 1) {
                xs0 = bVar2.d;
                C1795Pt1.b(objC);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                xs1 = bVar2.d;
                C1795Pt1.b(objC);
            }
            xs1.n = false;
            return new ResultOk(Unit.a);
        }
        C1795Pt1.b(objC);
        String str = this.j.a;
        bVar2.d = this;
        bVar2.h = 1;
        kotlin.time.b.e.getClass();
        long j = kotlin.time.b.g;
        objC = this.k.c(str, j, j, bVar2);
        if (objC != mn) {
            xs0 = this;
        }
        return mn;
        CommonResult commonResult = (CommonResult) objC;
        if (commonResult instanceof ResultError) {
            ResultError resultError = (ResultError) commonResult;
            CommonError error = resultError.getError();
            Intrinsics.checkNotNullParameter(error, "<this>");
            if (!CommonErrorClassificationKt.d(error) && !(error instanceof CommonError.RestrictedCountry)) {
                GG gg = xs0.k;
                CommonError error2 = resultError.getError();
                bVar2.d = xs0;
                bVar2.h = 2;
                if (gg.b("login", error2, bVar2) != mn) {
                    xs1 = xs0;
                    xs1.n = false;
                    return new ResultOk(Unit.a);
                }
                return mn;
            }
        }
        if ((commonResult instanceof ResultOk) && ((Boolean) ((ResultOk) commonResult).a()).booleanValue()) {
            z = true;
        }
        xs0.n = z;
        return commonResult;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x01df  */
    /* JADX WARN: Code duplicated, block: B:26:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:30:0x0205  */
    /* JADX WARN: Code duplicated, block: B:44:0x0249  */
    /* JADX WARN: Code duplicated, block: B:46:0x024d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0252  */
    /* JADX WARN: Code duplicated, block: B:50:0x0258  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r6v2, types: [ak0, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0205 -> B:31:0x020c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object e(defpackage.InterfaceC3220cl r35, defpackage.LM r36) {
        /*
            Method dump skipped, instruction units count: 612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.XS0.e(cl, LM):java.lang.Object");
    }
}
