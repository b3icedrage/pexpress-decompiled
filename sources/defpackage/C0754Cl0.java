package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonError;
import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.core.backend.domain.models.resultModels.CommonResultKt;
import com.api.core.backend.domain.models.resultModels.ResultError;
import com.api.core.backend.domain.models.resultModels.ResultOk;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.time.b;
import kotlin.time.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Cl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0754Cl0 implements InterfaceC7260vl0 {
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;
    public static final /* synthetic */ int h = 0;

    @NotNull
    public final InterfaceC7012ub2 a;

    @NotNull
    public final I50 b;

    @NotNull
    public final C4923kf c;

    static {
        b.a aVar = b.e;
        R40 r40 = R40.MILLISECONDS;
        d = c.g(400, r40);
        R40 r41 = R40.SECONDS;
        e = c.g(3, r41);
        f = c.g(8, r41);
        g = c.g(1600, r40);
    }

    public C0754Cl0(@NotNull InterfaceC7012ub2 userRepository, @NotNull I50 emailPreferenceUseCase, @NotNull C4923kf appData) {
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(emailPreferenceUseCase, "emailPreferenceUseCase");
        Intrinsics.checkNotNullParameter(appData, "appData");
        this.a = userRepository;
        this.b = emailPreferenceUseCase;
        this.c = appData;
    }

    public static boolean d(CommonError commonError) {
        return (commonError instanceof CommonError.NotAuthenticated) || (commonError instanceof CommonError.TokenError) || (commonError instanceof CommonError.UserNotInDatabase) || (commonError instanceof CommonError.UserNotInPlatformDatabase) || (commonError instanceof CommonError.RestrictedCountry) || (commonError instanceof CommonError.ConfigLocked) || (commonError instanceof CommonError.IncorrectCredentials);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0078  */
    /* JADX WARN: Code duplicated, block: B:28:0x0099  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [wl0] */
    @Override // defpackage.InterfaceC7260vl0
    @Nullable
    public final Object a(@NotNull LM lm) {
        C8101zl0 c8101zl0;
        final C0754Cl0 c0754Cl0;
        C0754Cl0 c0754Cl1;
        C3027bp1 c3027bp1;
        CommonResult commonResult;
        CommonError otherError;
        if (lm instanceof C8101zl0) {
            c8101zl0 = (C8101zl0) lm;
            int i = c8101zl0.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                c8101zl0.i = i - Integer.MIN_VALUE;
            } else {
                c8101zl0 = new C8101zl0(this, lm);
            }
        } else {
            c8101zl0 = new C8101zl0(this, lm);
        }
        Object objA = c8101zl0.g;
        MN mn = MN.d;
        int i2 = c8101zl0.i;
        if (i2 == 0) {
            C1795Pt1.b(objA);
            GP1 gp1 = this.c.f;
            c8101zl0.d = this;
            c8101zl0.i = 1;
            objA = C7236vf0.a(gp1, c8101zl0);
            if (objA != mn) {
                c0754Cl0 = this;
            }
            return mn;
        }
        if (i2 == 1) {
            C0754Cl0 c0754Cl2 = c8101zl0.d;
            C1795Pt1.b(objA);
            c0754Cl0 = c0754Cl2;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c3027bp1 = c8101zl0.e;
            C0754Cl0 c0754Cl3 = c8101zl0.d;
            C1795Pt1.b(objA);
            c0754Cl1 = c0754Cl3;
        }
        commonResult = (CommonResult) objA;
        if (commonResult instanceof ResultOk) {
            otherError = (CommonError) c3027bp1.d;
            if (otherError == null) {
                otherError = new CommonError.OtherError(null, 0, 3, null);
            }
            return new ResultError(otherError);
        }
        ResultOk resultOk = (ResultOk) commonResult;
        C6945uG c6945uG = (C6945uG) resultOk.a();
        c6945uG.getClass();
        Intrinsics.checkNotNullParameter("DEMO", "<set-?>");
        c6945uG.f = "DEMO";
        c0754Cl1.c.k.setValue(resultOk.a());
        return commonResult;
        C3027bp1 c3027bp2 = new C3027bp1();
        ?? r6 = new Function1() { // from class: wl0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                CommonError it = (CommonError) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                this.d.getClass();
                return Boolean.valueOf(C0754Cl0.d(it) || C1603Nh1.a(it));
            }
        };
        C0598Al0 c0598Al0 = new C0598Al0(c0754Cl0, (C6315rG) objA, c3027bp2, null);
        c8101zl0.d = c0754Cl0;
        c8101zl0.e = c3027bp2;
        c8101zl0.i = 2;
        objA = c0754Cl0.e("get_profile", r6, c0598Al0, c8101zl0);
        if (objA != mn) {
            c0754Cl1 = c0754Cl0;
            c3027bp1 = c3027bp2;
            commonResult = (CommonResult) objA;
            if (commonResult instanceof ResultOk) {
                otherError = (CommonError) c3027bp1.d;
                if (otherError == null) {
                    otherError = new CommonError.OtherError(null, 0, 3, null);
                }
                return new ResultError(otherError);
            }
            ResultOk resultOk2 = (ResultOk) commonResult;
            C6945uG c6945uG2 = (C6945uG) resultOk2.a();
            c6945uG2.getClass();
            Intrinsics.checkNotNullParameter("DEMO", "<set-?>");
            c6945uG2.f = "DEMO";
            c0754Cl1.c.k.setValue(resultOk2.a());
            return commonResult;
        }
        return mn;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:31:0x0114  */
    /* JADX WARN: Code duplicated, block: B:33:0x0118  */
    /* JADX WARN: Code duplicated, block: B:36:0x012e A[PHI: r16
      0x012e: PHI (r16v3 com.api.core.backend.domain.models.resultModels.CommonError) = 
      (r16v2 com.api.core.backend.domain.models.resultModels.CommonError)
      (r16v7 com.api.core.backend.domain.models.resultModels.CommonError)
     binds: [B:32:0x0116, B:34:0x012a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x0136 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:75:0x024a A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:78:0x0259  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x0275  */
    /* JADX WARN: Code duplicated, block: B:82:0x0279  */
    /* JADX WARN: Code duplicated, block: B:84:0x028b  */
    /* JADX WARN: Code duplicated, block: B:90:0x029f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0207 -> B:14:0x0055). Please report as a decompilation issue!!! */
    @Override // defpackage.InterfaceC7260vl0
    @Nullable
    public final Object b(@NotNull LM lm) {
        C7891yl0 c7891yl0;
        Object objC;
        C0754Cl0 c0754Cl0;
        int i;
        MN mn;
        int i2;
        String str;
        long j;
        long j2;
        long j3;
        long j4;
        C0754Cl0 c0754Cl1;
        C7891yl0 c7891yl1;
        ZF zf;
        CommonError commonError;
        CommonError error;
        long j5;
        long j6;
        long j7;
        C0754Cl0 c0754Cl2;
        ZF zf2;
        String str2;
        int i3;
        Object obj;
        int i4;
        CommonResult commonResult;
        CommonError error2;
        CommonError commonError2;
        ResultError resultError;
        long j8;
        long j9;
        MN mn2;
        int i5;
        long j10;
        String str3;
        C2408Xg c2408Xg;
        CommonError error3;
        int i6;
        Object objY;
        if (lm instanceof C7891yl0) {
            c7891yl0 = (C7891yl0) lm;
            int i7 = c7891yl0.q;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                c7891yl0.q = i7 - Integer.MIN_VALUE;
            } else {
                c7891yl0 = new C7891yl0(this, lm);
            }
        } else {
            c7891yl0 = new C7891yl0(this, lm);
        }
        Object obj2 = c7891yl0.o;
        MN mn3 = MN.d;
        int i8 = c7891yl0.q;
        if (i8 == 0) {
            C1795Pt1.b(obj2);
            c7891yl0.d = this;
            c7891yl0.q = 1;
            objC = c(c7891yl0);
            if (objC != mn3) {
                c0754Cl0 = this;
            }
            return mn3;
        }
        if (i8 == 1) {
            C0754Cl0 c0754Cl3 = c7891yl0.d;
            C1795Pt1.b(obj2);
            c0754Cl0 = c0754Cl3;
            objC = obj2;
        } else {
            if (i8 == 2) {
                i3 = c7891yl0.n;
                long j11 = c7891yl0.l;
                long j12 = c7891yl0.k;
                int i9 = c7891yl0.m;
                long j13 = c7891yl0.j;
                long j14 = c7891yl0.i;
                CommonError commonError3 = c7891yl0.h;
                String str4 = c7891yl0.g;
                ZF zf3 = c7891yl0.e;
                C0754Cl0 c0754Cl4 = c7891yl0.d;
                C1795Pt1.b(obj2);
                i4 = i9;
                c0754Cl2 = c0754Cl4;
                j7 = j14;
                obj = obj2;
                j6 = j12;
                error = commonError3;
                str2 = str4;
                j5 = j13;
                zf2 = zf3;
                j2 = j11;
                commonResult = (CommonResult) obj;
                int i10 = i3 + 1;
                MN mn4 = mn3;
                if (!(commonResult instanceof ResultOk)) {
                    if (commonResult instanceof ResultError) {
                        ResultError resultError2 = (ResultError) commonResult;
                        error = resultError2.getError();
                        error3 = resultError2.getError();
                        c0754Cl2.getClass();
                        if (!d(error3)) {
                            commonError2 = error;
                            if (b.f(j2, j7) < 0 || i10 == i4 || System.currentTimeMillis() - j6 > b.l(j5)) {
                                resultError = new ResultError(CommonResultKt.a(commonError2));
                            } else {
                                b.s(j2);
                                if (str2 == null || (c2408Xg = U0.P) == null) {
                                    j8 = j2;
                                } else {
                                    j8 = j2;
                                    c2408Xg.k(str2, new Integer(i10), PW0.e(new Pair("delay_ms", new Long(b.l(j8))), new Pair("error_code", commonError2 != null ? new Integer(commonError2.getCode()) : null), new Pair("error_class", commonError2 != null ? C2017Sp1.a.b(commonError2.getClass()).f() : null), new Pair("error_text", commonError2 != null ? commonError2.getText() : null), new Pair("platform_code", commonError2 != null ? commonError2.getPlatformCode() : null)));
                                }
                                c7891yl0.d = c0754Cl2;
                                c7891yl0.e = zf2;
                                c7891yl0.g = str2;
                                c7891yl0.h = commonError2;
                                c7891yl0.i = j7;
                                long j15 = j5;
                                c7891yl0.j = j15;
                                c7891yl0.m = i4;
                                long j16 = j6;
                                c7891yl0.k = j16;
                                j9 = j8;
                                c7891yl0.l = j9;
                                c7891yl0.n = i10;
                                c7891yl0.q = 3;
                                mn2 = mn4;
                                if (IW.c(j9, c7891yl0) == mn2) {
                                    return mn2;
                                }
                                i5 = i10;
                                j10 = j15;
                                c7891yl1 = c7891yl0;
                                str3 = str2;
                                zf = zf2;
                                c0754Cl1 = c0754Cl2;
                                j4 = j7;
                                j3 = j16;
                            }
                            commonResult = resultError;
                        }
                    } else {
                        commonError2 = error;
                        if (b.f(j2, j7) < 0) {
                            resultError = new ResultError(CommonResultKt.a(commonError2));
                        } else {
                            resultError = new ResultError(CommonResultKt.a(commonError2));
                        }
                        commonResult = resultError;
                    }
                }
                if (commonResult instanceof ResultOk) {
                    c0754Cl2.c.c.setValue(((ResultOk) commonResult).a());
                    GP1 gp1 = c0754Cl2.c.d;
                    Boolean bool = Boolean.TRUE;
                    gp1.getClass();
                    gp1.m(null, bool);
                    return commonResult;
                }
                if (!(commonResult instanceof ResultError)) {
                    throw new C6489s51();
                }
                error2 = ((ResultError) commonResult).getError();
                Regex regex = C1603Nh1.a;
                Intrinsics.checkNotNullParameter(error2, "<this>");
                if ((error2 instanceof CommonError.UserNotInDatabase) && !(error2 instanceof CommonError.UserNotInPlatformDatabase)) {
                    return commonResult;
                }
                GP1 gp2 = c0754Cl2.c.d;
                Boolean bool2 = Boolean.FALSE;
                gp2.getClass();
                gp2.m(null, bool2);
                return commonResult;
            }
            if (i8 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i11 = c7891yl0.n;
            long j17 = c7891yl0.l;
            long j18 = c7891yl0.k;
            int i12 = c7891yl0.m;
            j10 = c7891yl0.j;
            long j19 = c7891yl0.i;
            CommonError commonError4 = c7891yl0.h;
            String str5 = c7891yl0.g;
            ZF zf4 = c7891yl0.e;
            C0754Cl0 c0754Cl5 = c7891yl0.d;
            C1795Pt1.b(obj2);
            mn2 = mn3;
            str3 = str5;
            c0754Cl1 = c0754Cl5;
            commonError2 = commonError4;
            i4 = i12;
            i5 = i11;
            c7891yl1 = c7891yl0;
            zf = zf4;
            j4 = j19;
            j3 = j18;
            j9 = j17;
        }
        b a = new b(b.q(2, j9));
        mn = mn2;
        CommonError commonError5 = commonError2;
        b b = new b(g);
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        if (a.compareTo(b) > 0) {
            a = b;
        }
        i = i5;
        j2 = a.d;
        commonError = commonError5;
        j = j10;
        str = str3;
        i2 = i4;
        InterfaceC7012ub2 interfaceC7012ub2 = c0754Cl1.a;
        c7891yl1.d = c0754Cl1;
        c7891yl1.e = zf;
        c7891yl1.g = str;
        c7891yl1.h = commonError;
        c7891yl1.i = j4;
        c7891yl1.j = j;
        c7891yl1.m = i2;
        c7891yl1.k = j3;
        c7891yl1.l = j2;
        c7891yl1.n = i;
        i6 = i2;
        c7891yl1.q = 2;
        objY = interfaceC7012ub2.y(zf, c7891yl1);
        mn3 = mn;
        if (objY != mn3) {
            error = commonError;
            obj = objY;
            i4 = i6;
            long j20 = j4;
            zf2 = zf;
            c7891yl0 = c7891yl1;
            c0754Cl2 = c0754Cl1;
            str2 = str;
            i3 = i;
            j5 = j;
            j6 = j3;
            j7 = j20;
            commonResult = (CommonResult) obj;
            int i13 = i3 + 1;
            MN mn5 = mn3;
            if (!(commonResult instanceof ResultOk)) {
                if (commonResult instanceof ResultError) {
                    ResultError resultError3 = (ResultError) commonResult;
                    error = resultError3.getError();
                    error3 = resultError3.getError();
                    c0754Cl2.getClass();
                    if (!d(error3)) {
                        commonError2 = error;
                        if (b.f(j2, j7) < 0) {
                            resultError = new ResultError(CommonResultKt.a(commonError2));
                        } else {
                            resultError = new ResultError(CommonResultKt.a(commonError2));
                        }
                        commonResult = resultError;
                    }
                } else {
                    commonError2 = error;
                    if (b.f(j2, j7) < 0) {
                        resultError = new ResultError(CommonResultKt.a(commonError2));
                    } else {
                        resultError = new ResultError(CommonResultKt.a(commonError2));
                    }
                    commonResult = resultError;
                }
            }
            if (commonResult instanceof ResultOk) {
                c0754Cl2.c.c.setValue(((ResultOk) commonResult).a());
                GP1 gp3 = c0754Cl2.c.d;
                Boolean bool3 = Boolean.TRUE;
                gp3.getClass();
                gp3.m(null, bool3);
                return commonResult;
            }
            if (!(commonResult instanceof ResultError)) {
                throw new C6489s51();
            }
            error2 = ((ResultError) commonResult).getError();
            Regex regex2 = C1603Nh1.a;
            Intrinsics.checkNotNullParameter(error2, "<this>");
            if (error2 instanceof CommonError.UserNotInDatabase) {
            }
            GP1 gp4 = c0754Cl2.c.d;
            Boolean bool4 = Boolean.FALSE;
            gp4.getClass();
            gp4.m(null, bool4);
            return commonResult;
        }
        return mn3;
        b.e.getClass();
        long j21 = b.g;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j22 = d;
        i = 0;
        mn = mn3;
        i2 = Integer.MAX_VALUE;
        str = "our_user";
        j = f;
        j2 = j22;
        j3 = jCurrentTimeMillis;
        j4 = j21;
        c0754Cl1 = c0754Cl0;
        c7891yl1 = c7891yl0;
        zf = (ZF) objC;
        commonError = null;
        InterfaceC7012ub2 interfaceC7012ub3 = c0754Cl1.a;
        c7891yl1.d = c0754Cl1;
        c7891yl1.e = zf;
        c7891yl1.g = str;
        c7891yl1.h = commonError;
        c7891yl1.i = j4;
        c7891yl1.j = j;
        c7891yl1.m = i2;
        c7891yl1.k = j3;
        c7891yl1.l = j2;
        c7891yl1.n = i;
        i6 = i2;
        c7891yl1.q = 2;
        objY = interfaceC7012ub3.y(zf, c7891yl1);
        mn3 = mn;
        if (objY != mn3) {
            error = commonError;
            obj = objY;
            i4 = i6;
            long j23 = j4;
            zf2 = zf;
            c7891yl0 = c7891yl1;
            c0754Cl2 = c0754Cl1;
            str2 = str;
            i3 = i;
            j5 = j;
            j6 = j3;
            j7 = j23;
            commonResult = (CommonResult) obj;
            int i14 = i3 + 1;
            MN mn6 = mn3;
            if (!(commonResult instanceof ResultOk)) {
                if (commonResult instanceof ResultError) {
                    ResultError resultError4 = (ResultError) commonResult;
                    error = resultError4.getError();
                    error3 = resultError4.getError();
                    c0754Cl2.getClass();
                    if (!d(error3)) {
                        commonError2 = error;
                        if (b.f(j2, j7) < 0) {
                            resultError = new ResultError(CommonResultKt.a(commonError2));
                        } else {
                            resultError = new ResultError(CommonResultKt.a(commonError2));
                        }
                        commonResult = resultError;
                    }
                } else {
                    commonError2 = error;
                    if (b.f(j2, j7) < 0) {
                        resultError = new ResultError(CommonResultKt.a(commonError2));
                    } else {
                        resultError = new ResultError(CommonResultKt.a(commonError2));
                    }
                    commonResult = resultError;
                }
            }
            if (commonResult instanceof ResultOk) {
                c0754Cl2.c.c.setValue(((ResultOk) commonResult).a());
                GP1 gp5 = c0754Cl2.c.d;
                Boolean bool5 = Boolean.TRUE;
                gp5.getClass();
                gp5.m(null, bool5);
                return commonResult;
            }
            if (!(commonResult instanceof ResultError)) {
                throw new C6489s51();
            }
            error2 = ((ResultError) commonResult).getError();
            Regex regex3 = C1603Nh1.a;
            Intrinsics.checkNotNullParameter(error2, "<this>");
            if (error2 instanceof CommonError.UserNotInDatabase) {
            }
            GP1 gp6 = c0754Cl2.c.d;
            Boolean bool6 = Boolean.FALSE;
            gp6.getClass();
            gp6.m(null, bool6);
            return commonResult;
        }
        return mn3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(LM lm) {
        C7681xl0 c7681xl0;
        C0754Cl0 c0754Cl0;
        Long l;
        if (lm instanceof C7681xl0) {
            c7681xl0 = (C7681xl0) lm;
            int i = c7681xl0.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                c7681xl0.i = i - Integer.MIN_VALUE;
            } else {
                c7681xl0 = new C7681xl0(this, lm);
            }
        } else {
            c7681xl0 = new C7681xl0(this, lm);
        }
        Object objO = c7681xl0.g;
        MN mn = MN.d;
        int i2 = c7681xl0.i;
        if (i2 == 0) {
            C1795Pt1.b(objO);
            C6945uG c6945uG = (C6945uG) this.c.k.getValue();
            Long l2 = c6945uG != null ? new Long(c6945uG.a) : null;
            InterfaceC6396rf0<String> interfaceC6396rf0K = this.b.k();
            c7681xl0.d = this;
            c7681xl0.e = l2;
            c7681xl0.i = 1;
            objO = C4466ii.o(interfaceC6396rf0K, c7681xl0);
            if (objO == mn) {
                return mn;
            }
            c0754Cl0 = this;
            l = l2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l = c7681xl0.e;
            c0754Cl0 = c7681xl0.d;
            C1795Pt1.b(objO);
        }
        String str = (String) objO;
        C6945uG c6945uG2 = (C6945uG) c0754Cl0.c.k.getValue();
        String str2 = c6945uG2 != null ? c6945uG2.e : null;
        C6945uG c6945uG3 = (C6945uG) c0754Cl0.c.k.getValue();
        return new ZF(str, str2, l, c6945uG3 != null ? c6945uG3.d : null);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:21:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:25:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:27:0x0100  */
    /* JADX WARN: Code duplicated, block: B:30:0x0118  */
    /* JADX WARN: Code duplicated, block: B:31:0x011b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0123 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x01f6 -> B:13:0x0053). Please report as a decompilation issue!!! */
    public final Object e(String str, C7471wl0 c7471wl0, C0598Al0 c0598Al0, LM lm) {
        C0676Bl0 c0676Bl0;
        int i;
        MN mn;
        long j;
        long jQ;
        CommonError commonError;
        long j2;
        C0676Bl0 c0676Bl1;
        long j3;
        Function1 function1;
        Function1 function2;
        int i2;
        String str2;
        int i3;
        int i4;
        long j4;
        Function1 function3;
        long j5;
        String str3;
        Object objInvoke;
        CommonResult commonResult;
        CommonError commonError2;
        CommonError commonError3;
        long j6;
        MN mn2;
        int i5;
        long j7;
        long j8;
        long j9;
        C2408Xg c2408Xg;
        ResultError resultError;
        CommonError error;
        String str4;
        if (lm instanceof C0676Bl0) {
            c0676Bl0 = (C0676Bl0) lm;
            int i6 = c0676Bl0.q;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c0676Bl0.q = i6 - Integer.MIN_VALUE;
            } else {
                c0676Bl0 = new C0676Bl0(this, lm);
            }
        } else {
            c0676Bl0 = new C0676Bl0(this, lm);
        }
        Object obj = c0676Bl0.o;
        MN mn3 = MN.d;
        int i7 = c0676Bl0.q;
        if (i7 == 0) {
            C1795Pt1.b(obj);
            b.a aVar = b.e;
            long jG = c.g(4000, R40.MILLISECONDS);
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j10 = d;
            i = 0;
            mn = mn3;
            j = e;
            jQ = j10;
            commonError = null;
            j2 = jCurrentTimeMillis;
            c0676Bl1 = c0676Bl0;
            j3 = jG;
            function1 = c7471wl0;
            function2 = c0598Al0;
            i2 = 3;
            str2 = str;
            c0676Bl1.d = str2;
            c0676Bl1.e = function1;
            c0676Bl1.g = function2;
            c0676Bl1.h = commonError;
            c0676Bl1.i = j;
            c0676Bl1.j = j3;
            c0676Bl1.m = i2;
            c0676Bl1.k = j2;
            c0676Bl1.l = jQ;
            c0676Bl1.n = i;
            str4 = str2;
            c0676Bl1.q = 1;
            objInvoke = function2.invoke(c0676Bl1);
            if (objInvoke == mn) {
                return mn;
            }
            i3 = i;
            i4 = i2;
            function3 = function2;
            long j11 = j;
            str3 = str4;
            j5 = j3;
            j4 = j11;
            commonResult = (CommonResult) objInvoke;
            commonError2 = commonError;
            int i8 = i3 + 1;
            MN mn4 = mn;
            if (!(commonResult instanceof ResultOk)) {
                if (commonResult instanceof ResultError) {
                    resultError = (ResultError) commonResult;
                    error = resultError.getError();
                    if (!((Boolean) function1.invoke(resultError.getError())).booleanValue()) {
                        commonError3 = error;
                    }
                } else {
                    commonError3 = commonError2;
                }
                if (b.f(jQ, j5) < 0) {
                }
                return new ResultError(CommonResultKt.a(commonError3));
            }
            return commonResult;
        }
        if (i7 == 1) {
            int i9 = c0676Bl0.n;
            long j12 = c0676Bl0.l;
            long j13 = c0676Bl0.k;
            int i10 = c0676Bl0.m;
            long j14 = c0676Bl0.j;
            long j15 = c0676Bl0.i;
            CommonError commonError4 = c0676Bl0.h;
            Function1 function4 = c0676Bl0.g;
            Function1 function5 = c0676Bl0.e;
            String str5 = c0676Bl0.d;
            C1795Pt1.b(obj);
            str3 = str5;
            objInvoke = obj;
            C0676Bl0 c0676Bl2 = c0676Bl0;
            function1 = function5;
            i3 = i9;
            c0676Bl1 = c0676Bl2;
            function3 = function4;
            commonError = commonError4;
            mn = mn3;
            j5 = j14;
            i4 = i10;
            jQ = j12;
            j2 = j13;
            j4 = j15;
            commonResult = (CommonResult) objInvoke;
            commonError2 = commonError;
            int i11 = i3 + 1;
            MN mn5 = mn;
            if (!(commonResult instanceof ResultOk)) {
                if (commonResult instanceof ResultError) {
                    resultError = (ResultError) commonResult;
                    error = resultError.getError();
                    if (!((Boolean) function1.invoke(resultError.getError())).booleanValue()) {
                        commonError3 = error;
                    }
                } else {
                    commonError3 = commonError2;
                }
                if (b.f(jQ, j5) < 0 || i11 == i4) {
                    return new ResultError(CommonResultKt.a(commonError3));
                }
                if (System.currentTimeMillis() - j2 > b.l(j4)) {
                    return new ResultError(CommonResultKt.a(commonError3));
                }
                b.s(jQ);
                if (str3 == null || (c2408Xg = U0.P) == null) {
                    j6 = jQ;
                } else {
                    j6 = jQ;
                    c2408Xg.k(str3, new Integer(i11), PW0.e(new Pair("delay_ms", new Long(b.l(j6))), new Pair("error_code", commonError3 != null ? new Integer(commonError3.getCode()) : null), new Pair("error_class", commonError3 != null ? C2017Sp1.a.b(commonError3.getClass()).f() : null), new Pair("error_text", commonError3 != null ? commonError3.getText() : null), new Pair("platform_code", commonError3 != null ? commonError3.getPlatformCode() : null)));
                }
                c0676Bl1.d = str3;
                c0676Bl1.e = function1;
                c0676Bl1.g = function3;
                c0676Bl1.h = commonError3;
                c0676Bl1.i = j4;
                long j16 = j5;
                c0676Bl1.j = j16;
                int i12 = i4;
                c0676Bl1.m = i12;
                long j17 = j2;
                c0676Bl1.k = j17;
                long j18 = j6;
                c0676Bl1.l = j18;
                c0676Bl1.n = i11;
                c0676Bl1.q = 2;
                CommonError commonError5 = commonError3;
                if (IW.c(j18, c0676Bl1) == mn5) {
                    return mn5;
                }
                commonError = commonError5;
                mn2 = mn5;
                function2 = function3;
                i2 = i12;
                i5 = i11;
                j7 = j17;
                j8 = j18;
                j9 = j16;
            }
            return commonResult;
        }
        if (i7 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i13 = c0676Bl0.n;
        long j19 = c0676Bl0.l;
        long j20 = c0676Bl0.k;
        int i14 = c0676Bl0.m;
        j9 = c0676Bl0.j;
        j4 = c0676Bl0.i;
        CommonError commonError6 = c0676Bl0.h;
        Function1 function6 = c0676Bl0.g;
        Function1 function7 = c0676Bl0.e;
        String str6 = c0676Bl0.d;
        C1795Pt1.b(obj);
        mn2 = mn3;
        i5 = i13;
        str3 = str6;
        function2 = function6;
        c0676Bl1 = c0676Bl0;
        function1 = function7;
        commonError = commonError6;
        i2 = i14;
        j7 = j20;
        j8 = j19;
        str2 = str3;
        long j21 = j7;
        i = i5;
        j = j4;
        j3 = j9;
        mn = mn2;
        jQ = b.q(2, j8);
        j2 = j21;
        c0676Bl1.d = str2;
        c0676Bl1.e = function1;
        c0676Bl1.g = function2;
        c0676Bl1.h = commonError;
        c0676Bl1.i = j;
        c0676Bl1.j = j3;
        c0676Bl1.m = i2;
        c0676Bl1.k = j2;
        c0676Bl1.l = jQ;
        c0676Bl1.n = i;
        str4 = str2;
        c0676Bl1.q = 1;
        objInvoke = function2.invoke(c0676Bl1);
        if (objInvoke == mn) {
            return mn;
        }
        i3 = i;
        i4 = i2;
        function3 = function2;
        long j110 = j;
        str3 = str4;
        j5 = j3;
        j4 = j110;
        commonResult = (CommonResult) objInvoke;
        commonError2 = commonError;
        int i15 = i3 + 1;
        MN mn6 = mn;
        if (!(commonResult instanceof ResultOk)) {
            if (commonResult instanceof ResultError) {
                resultError = (ResultError) commonResult;
                error = resultError.getError();
                if (!((Boolean) function1.invoke(resultError.getError())).booleanValue()) {
                    commonError3 = error;
                }
            } else {
                commonError3 = commonError2;
            }
            if (b.f(jQ, j5) < 0) {
            }
            return new ResultError(CommonResultKt.a(commonError3));
        }
        return commonResult;
    }
}
