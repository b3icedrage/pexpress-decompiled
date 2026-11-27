package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.feature.analytics.reporters.ReporterApi;
import com.appsflyer.share.AFInAppEventType;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ha, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1110Ha implements InterfaceC0720Ca {

    @NotNull
    public final C4923kf a;

    @NotNull
    public final ReporterApi b;

    @NotNull
    public final ZT1 c;

    @NotNull
    public final String d;

    @NotNull
    public final C5176lq1 e;

    @NotNull
    public final C3378dX0 f;

    @NotNull
    public final InterfaceC5862p6 g;

    /* JADX INFO: renamed from: Ha$a */
    @InterfaceC3368dU(c = "com.base.library.registration.usecases.AnalyticsUseCaseBase", f = "AnalyticsUseCaseBase.kt", l = {109, 111, 126, 155, 161}, m = "sendDataToAnalyticsLogin")
    public static final class a extends LM {
        public C1110Ha d;
        public C6106qG e;
        public String g;
        public /* synthetic */ Object h;
        public int j;

        public a(JM<? super a> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.h = obj;
            this.j |= Integer.MIN_VALUE;
            return C1110Ha.this.h(this);
        }
    }

    /* JADX INFO: renamed from: Ha$b */
    @InterfaceC3368dU(c = "com.base.library.registration.usecases.AnalyticsUseCaseBase$sendDataToAnalyticsLogin$2", f = "AnalyticsUseCaseBase.kt", l = {139}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        public b(JM<? super b> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return C1110Ha.this.new b(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((b) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                C1110Ha c1110Ha = C1110Ha.this;
                H91 h91 = H91.LOGIN_WRONG_ACCOUNT_TIME;
                this.d = 1;
                if (c1110Ha.b.i(h91, this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            return Unit.a;
        }
    }

    public C1110Ha(@NotNull C4923kf appData, @NotNull ReporterApi reporter, @NotNull ZT1 subIdProvider, @NotNull String placeCall, @NotNull C5176lq1 params, @NotNull C3378dX0 marketingEventsManager, @NotNull InterfaceC5862p6 activationStateProviderApi) {
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(subIdProvider, "subIdProvider");
        Intrinsics.checkNotNullParameter(placeCall, "placeCall");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(marketingEventsManager, "marketingEventsManager");
        Intrinsics.checkNotNullParameter(activationStateProviderApi, "activationStateProviderApi");
        this.a = appData;
        this.b = reporter;
        this.c = subIdProvider;
        this.d = placeCall;
        this.e = params;
        this.f = marketingEventsManager;
        this.g = activationStateProviderApi;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object d(C1110Ha c1110Ha, LM lm) {
        C0798Da c0798Da;
        if (lm instanceof C0798Da) {
            c0798Da = (C0798Da) lm;
            int i = c0798Da.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0798Da.g = i - Integer.MIN_VALUE;
            } else {
                c0798Da = new C0798Da(c1110Ha, lm);
            }
        } else {
            c0798Da = new C0798Da(c1110Ha, lm);
        }
        Object objA = c0798Da.d;
        MN mn = MN.d;
        int i2 = c0798Da.g;
        if (i2 == 0) {
            C1795Pt1.b(objA);
            GP1 gp1 = c1110Ha.a.b;
            c0798Da.g = 1;
            objA = C7236vf0.a(gp1, c0798Da);
            if (objA == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objA);
        }
        return ((FF) objA).e;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0099  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object e(C1110Ha c1110Ha, LM lm) throws Throwable {
        C0876Ea c0876Ea;
        C1110Ha c1110Ha2;
        String str;
        String str2;
        Object objA;
        String str3;
        String str4;
        String str5;
        Object objJ;
        String str6;
        String str7;
        C1110Ha c1110Ha3;
        String str8;
        if (lm instanceof C0876Ea) {
            c0876Ea = (C0876Ea) lm;
            int i = c0876Ea.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0876Ea.k = i - Integer.MIN_VALUE;
            } else {
                c0876Ea = new C0876Ea(c1110Ha, lm);
            }
        } else {
            c0876Ea = new C0876Ea(c1110Ha, lm);
        }
        Object objC = c0876Ea.i;
        MN mn = MN.d;
        int i2 = c0876Ea.k;
        if (i2 == 0) {
            C1795Pt1.b(objC);
            c0876Ea.d = c1110Ha;
            c0876Ea.k = 1;
            objC = c1110Ha.c(c0876Ea);
            if (objC != mn) {
            }
            return mn;
        }
        if (i2 == 1) {
            c1110Ha = c0876Ea.d;
            C1795Pt1.b(objC);
        } else {
            if (i2 == 2) {
                str = c0876Ea.e;
                c1110Ha2 = c0876Ea.d;
                C1795Pt1.b(objC);
                str2 = ((FF) objC).f;
                ZT1 zt1 = c1110Ha2.c;
                c0876Ea.d = c1110Ha2;
                c0876Ea.e = str;
                c0876Ea.g = str2;
                c0876Ea.k = 3;
                objA = zt1.a(c0876Ea);
                if (objA != mn) {
                    str3 = str;
                    str4 = str2;
                    objC = objA;
                    str5 = (String) objC;
                    c0876Ea.d = c1110Ha2;
                    c0876Ea.e = str3;
                    c0876Ea.g = str4;
                    c0876Ea.h = str5;
                    c0876Ea.k = 4;
                    objJ = c1110Ha2.j(c0876Ea);
                    if (objJ != mn) {
                        str6 = str4;
                        str7 = str5;
                        objC = objJ;
                        c1110Ha3 = c1110Ha2;
                        str8 = str3;
                    }
                }
                return mn;
            }
            if (i2 == 3) {
                str4 = c0876Ea.g;
                String str9 = c0876Ea.e;
                C1110Ha c1110Ha4 = c0876Ea.d;
                C1795Pt1.b(objC);
                str3 = str9;
                c1110Ha2 = c1110Ha4;
                str5 = (String) objC;
                c0876Ea.d = c1110Ha2;
                c0876Ea.e = str3;
                c0876Ea.g = str4;
                c0876Ea.h = str5;
                c0876Ea.k = 4;
                objJ = c1110Ha2.j(c0876Ea);
                if (objJ != mn) {
                    str6 = str4;
                    str7 = str5;
                    objC = objJ;
                    c1110Ha3 = c1110Ha2;
                    str8 = str3;
                }
                return mn;
            }
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str10 = c0876Ea.h;
            String str11 = c0876Ea.g;
            String str12 = c0876Ea.e;
            c1110Ha3 = c0876Ea.d;
            C1795Pt1.b(objC);
            str7 = str10;
            str6 = str11;
            str8 = str12;
        }
        return new C6438rq1(str8, str6, str7, (String) objC, c1110Ha3.d, c1110Ha3.e.f.d);
        String str13 = (String) objC;
        GP1 gp1 = c1110Ha.a.b;
        c0876Ea.d = c1110Ha;
        c0876Ea.e = str13;
        c0876Ea.k = 2;
        Object objA2 = C7236vf0.a(gp1, c0876Ea);
        if (objA2 != mn) {
            c1110Ha2 = c1110Ha;
            str = str13;
            objC = objA2;
            str2 = ((FF) objC).f;
            ZT1 zt2 = c1110Ha2.c;
            c0876Ea.d = c1110Ha2;
            c0876Ea.e = str;
            c0876Ea.g = str2;
            c0876Ea.k = 3;
            objA = zt2.a(c0876Ea);
            if (objA != mn) {
                str3 = str;
                str4 = str2;
                objC = objA;
                str5 = (String) objC;
                c0876Ea.d = c1110Ha2;
                c0876Ea.e = str3;
                c0876Ea.g = str4;
                c0876Ea.h = str5;
                c0876Ea.k = 4;
                objJ = c1110Ha2.j(c0876Ea);
                if (objJ != mn) {
                    str6 = str4;
                    str7 = str5;
                    objC = objJ;
                    c1110Ha3 = c1110Ha2;
                    str8 = str3;
                    return new C6438rq1(str8, str6, str7, (String) objC, c1110Ha3.d, c1110Ha3.e.f.d);
                }
            }
        }
        return mn;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        if (r7.g(r0) == r1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object i(defpackage.C1110Ha r7, defpackage.LM r8) {
        /*
            boolean r0 = r8 instanceof defpackage.C1188Ia
            if (r0 == 0) goto L13
            r0 = r8
            Ia r0 = (defpackage.C1188Ia) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            Ia r0 = new Ia
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.e
            MN r1 = defpackage.MN.d
            int r2 = r0.h
            r3 = 3
            r4 = 0
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L42
            if (r2 == r6) goto L3c
            if (r2 == r5) goto L36
            if (r2 != r3) goto L2e
            defpackage.C1795Pt1.b(r8)
            goto L71
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            Ha r7 = r0.d
            defpackage.C1795Pt1.b(r8)
            goto L66
        L3c:
            Ha r7 = r0.d
            defpackage.C1795Pt1.b(r8)
            goto L50
        L42:
            defpackage.C1795Pt1.b(r8)
            r0.d = r7
            r0.h = r6
            java.lang.Object r8 = r7.f(r6, r0)
            if (r8 != r1) goto L50
            goto L70
        L50:
            r0.d = r7
            r0.h = r5
            r7.getClass()
            EM r8 = defpackage.C3784fT.a
            Ja r2 = new Ja
            r2.<init>(r7, r4)
            defpackage.C5189lv.k(r8, r4, r2, r3)
            kotlin.Unit r8 = kotlin.Unit.a
            if (r8 != r1) goto L66
            goto L70
        L66:
            r0.d = r4
            r0.h = r3
            java.lang.Object r7 = r7.g(r0)
            if (r7 != r1) goto L71
        L70:
            return r1
        L71:
            com.api.core.backend.domain.models.resultModels.ResultOk r7 = new com.api.core.backend.domain.models.resultModels.ResultOk
            kotlin.Unit r8 = kotlin.Unit.a
            r7.<init>(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1110Ha.i(Ha, LM):java.lang.Object");
    }

    @Override // defpackage.InterfaceC0720Ca
    @Nullable
    public final Object a(@NotNull JM<? super CommonResult<?>> jm) {
        return h(jm);
    }

    @Override // defpackage.InterfaceC0720Ca
    @Nullable
    public final Object b(@NotNull LM lm) {
        return i(this, lm);
    }

    @Nullable
    public Object c(@NotNull LM lm) {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(boolean z, LM lm) throws Throwable {
        C0954Fa c0954Fa;
        EnumC5113la enumC5113la;
        ReporterApi reporterApi;
        C1110Ha c1110Ha;
        if (lm instanceof C0954Fa) {
            c0954Fa = (C0954Fa) lm;
            int i = c0954Fa.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0954Fa.k = i - Integer.MIN_VALUE;
            } else {
                c0954Fa = new C0954Fa(this, lm);
            }
        } else {
            c0954Fa = new C0954Fa(this, lm);
        }
        Object obj = c0954Fa.i;
        MN mn = MN.d;
        int i2 = c0954Fa.k;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            EnumC5113la enumC5113la2 = EnumC5113la.USER_ID;
            C6945uG c6945uG = (C6945uG) this.a.k.getValue();
            Long l = new Long(c6945uG != null ? c6945uG.a : 0L);
            ReporterApi reporterApi2 = this.b;
            ReporterApi.a.a(reporterApi2, enumC5113la2, l);
            EnumC5113la enumC5113la3 = EnumC5113la.CURRENCY;
            c0954Fa.d = this;
            c0954Fa.e = reporterApi2;
            c0954Fa.g = enumC5113la3;
            c0954Fa.h = z;
            c0954Fa.k = 1;
            Object objJ = j(c0954Fa);
            if (objJ == mn) {
                return mn;
            }
            enumC5113la = enumC5113la3;
            obj = objJ;
            reporterApi = reporterApi2;
            c1110Ha = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = c0954Fa.h;
            enumC5113la = c0954Fa.g;
            reporterApi = c0954Fa.e;
            c1110Ha = c0954Fa.d;
            C1795Pt1.b(obj);
        }
        ReporterApi.a.c(reporterApi, enumC5113la, obj);
        ReporterApi.a.a(c1110Ha.b, EnumC5113la.REGISTRATED, Boolean.valueOf(z));
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:46:0x0110  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(LM lm) throws Throwable {
        C1032Ga c1032Ga;
        C1110Ha c1110Ha;
        ReporterApi reporterApi;
        EnumC5113la enumC5113la;
        Object objC;
        EnumC5113la enumC5113la2;
        ReporterApi reporterApi2;
        EnumC5113la enumC5113la3;
        Object objA;
        ReporterApi reporterApi3;
        C1110Ha c1110Ha2;
        EnumC5113la enumC5113la4;
        if (lm instanceof C1032Ga) {
            c1032Ga = (C1032Ga) lm;
            int i = c1032Ga.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1032Ga.j = i - Integer.MIN_VALUE;
            } else {
                c1032Ga = new C1032Ga(this, lm);
            }
        } else {
            c1032Ga = new C1032Ga(this, lm);
        }
        Object objE = c1032Ga.h;
        MN mn = MN.d;
        int i2 = c1032Ga.j;
        if (i2 == 0) {
            C1795Pt1.b(objE);
            c1032Ga.d = this;
            c1032Ga.j = 1;
            C3378dX0 c3378dX0 = this.f;
            c3378dX0.getClass();
            kotlin.time.b.e.getClass();
            Object objC2 = c3378dX0.c(kotlin.time.b.g, c1032Ga);
            if (objC2 != mn) {
                objC2 = Unit.a;
            }
            if (objC2 != mn) {
                c1110Ha = this;
            }
            return mn;
        }
        if (i2 == 1) {
            c1110Ha = c1032Ga.d;
            C1795Pt1.b(objE);
        } else {
            if (i2 == 2) {
                c1110Ha = c1032Ga.d;
                C1795Pt1.b(objE);
                P80 p80 = (P80) objE;
                ReporterApi reporterApi4 = c1110Ha.b;
                EnumC5028l80 event = EnumC5028l80.p;
                ReporterApi.a.b(reporterApi4, event, p80, null, 12);
                Intrinsics.checkNotNullParameter(event, "event");
                reporterApi = c1110Ha.b;
                reporterApi.g(event, p80, AFInAppEventType.COMPLETE_REGISTRATION);
                L80 l80 = L80.MAX_PROFIT;
                if (c1110Ha.d.equals("Registration")) {
                    ReporterApi.a.b(reporterApi, EnumC5028l80.w, null, WE.f(EnumC5326ma.g, EnumC5326ma.d, EnumC5326ma.e), 10);
                }
                enumC5113la = EnumC5113la.AFF_ID;
                c1032Ga.d = c1110Ha;
                c1032Ga.e = reporterApi;
                c1032Ga.g = enumC5113la;
                c1032Ga.j = 3;
                objC = c1110Ha.c(c1032Ga);
                if (objC != mn) {
                    enumC5113la2 = enumC5113la;
                    objE = objC;
                    ReporterApi.a.a(reporterApi, enumC5113la2, objE);
                    reporterApi2 = c1110Ha.b;
                    enumC5113la3 = EnumC5113la.EMAIL;
                    GP1 gp1 = c1110Ha.a.k;
                    c1032Ga.d = c1110Ha;
                    c1032Ga.e = reporterApi2;
                    c1032Ga.g = enumC5113la3;
                    c1032Ga.j = 4;
                    objA = C7236vf0.a(gp1, c1032Ga);
                    if (objA != mn) {
                        C1110Ha c1110Ha3 = c1110Ha;
                        reporterApi3 = reporterApi2;
                        objE = objA;
                        c1110Ha2 = c1110Ha3;
                        enumC5113la4 = enumC5113la3;
                    }
                }
                return mn;
            }
            if (i2 == 3) {
                EnumC5113la enumC5113la5 = c1032Ga.g;
                ReporterApi reporterApi5 = c1032Ga.e;
                C1110Ha c1110Ha4 = c1032Ga.d;
                C1795Pt1.b(objE);
                enumC5113la2 = enumC5113la5;
                c1110Ha = c1110Ha4;
                reporterApi = reporterApi5;
                ReporterApi.a.a(reporterApi, enumC5113la2, objE);
                reporterApi2 = c1110Ha.b;
                enumC5113la3 = EnumC5113la.EMAIL;
                GP1 gp2 = c1110Ha.a.k;
                c1032Ga.d = c1110Ha;
                c1032Ga.e = reporterApi2;
                c1032Ga.g = enumC5113la3;
                c1032Ga.j = 4;
                objA = C7236vf0.a(gp2, c1032Ga);
                if (objA != mn) {
                    C1110Ha c1110Ha5 = c1110Ha;
                    reporterApi3 = reporterApi2;
                    objE = objA;
                    c1110Ha2 = c1110Ha5;
                    enumC5113la4 = enumC5113la3;
                }
                return mn;
            }
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            enumC5113la4 = c1032Ga.g;
            reporterApi3 = c1032Ga.e;
            c1110Ha2 = c1032Ga.d;
            C1795Pt1.b(objE);
        }
        ReporterApi.a.a(reporterApi3, enumC5113la4, ((C6945uG) objE).b);
        C6106qG c6106qG = (C6106qG) c1110Ha2.a.c.getValue();
        ReporterApi.a.a(c1110Ha2.b, EnumC5113la.FTD, Boolean.valueOf(c6106qG == null && c6106qG.d));
        return Unit.a;
        c1032Ga.d = c1110Ha;
        c1032Ga.j = 2;
        c1110Ha.getClass();
        objE = e(c1110Ha, c1032Ga);
        if (objE != mn) {
            P80 p81 = (P80) objE;
            ReporterApi reporterApi6 = c1110Ha.b;
            EnumC5028l80 event2 = EnumC5028l80.p;
            ReporterApi.a.b(reporterApi6, event2, p81, null, 12);
            Intrinsics.checkNotNullParameter(event2, "event");
            reporterApi = c1110Ha.b;
            reporterApi.g(event2, p81, AFInAppEventType.COMPLETE_REGISTRATION);
            L80 l81 = L80.MAX_PROFIT;
            if (c1110Ha.d.equals("Registration")) {
                ReporterApi.a.b(reporterApi, EnumC5028l80.w, null, WE.f(EnumC5326ma.g, EnumC5326ma.d, EnumC5326ma.e), 10);
            }
            enumC5113la = EnumC5113la.AFF_ID;
            c1032Ga.d = c1110Ha;
            c1032Ga.e = reporterApi;
            c1032Ga.g = enumC5113la;
            c1032Ga.j = 3;
            objC = c1110Ha.c(c1032Ga);
            if (objC != mn) {
                enumC5113la2 = enumC5113la;
                objE = objC;
                ReporterApi.a.a(reporterApi, enumC5113la2, objE);
                reporterApi2 = c1110Ha.b;
                enumC5113la3 = EnumC5113la.EMAIL;
                GP1 gp3 = c1110Ha.a.k;
                c1032Ga.d = c1110Ha;
                c1032Ga.e = reporterApi2;
                c1032Ga.g = enumC5113la3;
                c1032Ga.j = 4;
                objA = C7236vf0.a(gp3, c1032Ga);
                if (objA != mn) {
                    C1110Ha c1110Ha6 = c1110Ha;
                    reporterApi3 = reporterApi2;
                    objE = objA;
                    c1110Ha2 = c1110Ha6;
                    enumC5113la4 = enumC5113la3;
                    ReporterApi.a.a(reporterApi3, enumC5113la4, ((C6945uG) objE).b);
                    C6106qG c6106qG2 = (C6106qG) c1110Ha2.a.c.getValue();
                    ReporterApi.a.a(c1110Ha2.b, EnumC5113la.FTD, Boolean.valueOf(c6106qG2 == null && c6106qG2.d));
                    return Unit.a;
                }
            }
        }
        return mn;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:51:0x0115  */
    /* JADX WARN: Code duplicated, block: B:53:0x0123  */
    /* JADX WARN: Code duplicated, block: B:54:0x012b  */
    /* JADX WARN: Code duplicated, block: B:57:0x014a  */
    /* JADX WARN: Code duplicated, block: B:59:0x014e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0152  */
    /* JADX WARN: Code duplicated, block: B:63:0x0156  */
    /* JADX WARN: Code duplicated, block: B:64:0x0158  */
    /* JADX WARN: Code duplicated, block: B:65:0x015b  */
    /* JADX WARN: Code duplicated, block: B:66:0x015e  */
    /* JADX WARN: Code duplicated, block: B:68:0x0164  */
    /* JADX WARN: Code duplicated, block: B:71:0x017c  */
    /* JADX WARN: Code duplicated, block: B:75:0x0187  */
    /* JADX WARN: Code duplicated, block: B:78:0x018d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a9  */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01ab, code lost:
    
        if (r1 == r3) goto L84;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:75:0x0187, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.JM<? super com.api.core.backend.domain.models.resultModels.CommonResult<?>> r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1110Ha.h(JM):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(LM lm) throws Throwable {
        C1344Ka c1344Ka;
        if (lm instanceof C1344Ka) {
            c1344Ka = (C1344Ka) lm;
            int i = c1344Ka.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1344Ka.g = i - Integer.MIN_VALUE;
            } else {
                c1344Ka = new C1344Ka(this, lm);
            }
        } else {
            c1344Ka = new C1344Ka(this, lm);
        }
        Object objD = c1344Ka.d;
        MN mn = MN.d;
        int i2 = c1344Ka.g;
        if (i2 == 0) {
            C1795Pt1.b(objD);
            C4250hg0 c4250hg0 = new C4250hg0(this.a.k, 0);
            C1422La c1422La = new C1422La(2, null);
            c1344Ka.g = 1;
            EM em = C7236vf0.a;
            objD = C7236vf0.d(c1344Ka, "auth_analytics.real_currency", new C7447wf0(c4250hg0, c1422La, null));
            if (objD == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objD);
        }
        String upperCase = ((C6945uG) objD).g.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }
}
