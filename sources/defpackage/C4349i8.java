package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonError;
import com.api.core.backend.domain.models.resultModels.CommonErrorClassificationKt;
import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.core.backend.domain.models.resultModels.CommonResultKt;
import com.api.core.backend.domain.models.resultModels.ResultError;
import com.api.core.backend.domain.models.resultModels.ResultOk;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.time.b;
import kotlin.time.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: i8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4349i8 {
    /* JADX WARN: Code duplicated, block: B:20:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:21:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:25:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:30:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:31:0x0100  */
    /* JADX WARN: Code duplicated, block: B:34:0x0108 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:67:0x01f1 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:70:0x0200  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x01db -> B:13:0x004f). Please report as a decompilation issue!!! */
    @Nullable
    public static final Object a(long j, @NotNull C3929g8 c3929g8, @NotNull LM lm) {
        C4139h8 c4139h8;
        int i;
        long jCurrentTimeMillis;
        int i2;
        CommonError commonError;
        long jQ;
        C4139h8 c4139h9;
        long j2;
        Function1 function1;
        String str;
        long j3;
        Function1 function2;
        long j4;
        long j5;
        long j6;
        long j7;
        int i3;
        CommonResult commonResult;
        CommonError commonError2;
        CommonError commonError3;
        ResultError resultError;
        long j8;
        long j9;
        MN mn;
        int i4;
        C2408Xg c2408Xg;
        ResultError resultError2;
        CommonError error;
        Object objInvoke;
        if (lm instanceof C4139h8) {
            c4139h8 = (C4139h8) lm;
            int i5 = c4139h8.o;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c4139h8.o = i5 - Integer.MIN_VALUE;
            } else {
                c4139h8 = new C4139h8(lm);
            }
        } else {
            c4139h8 = new C4139h8(lm);
        }
        Object obj = c4139h8.n;
        MN mn2 = MN.d;
        int i6 = c4139h8.o;
        if (i6 == 0) {
            C1795Pt1.b(obj);
            b.a aVar = b.e;
            R40 r40 = R40.MILLISECONDS;
            long jG = c.g(4000, r40);
            long jG2 = c.g(20, r40);
            i = 0;
            jCurrentTimeMillis = System.currentTimeMillis();
            i2 = Integer.MAX_VALUE;
            commonError = null;
            jQ = jG2;
            c4139h9 = c4139h8;
            j2 = jG;
            function1 = c3929g8;
            str = "add_user";
            j3 = j;
            c4139h9.i = function1;
            c4139h9.j = str;
            c4139h9.k = commonError;
            c4139h9.d = j3;
            c4139h9.e = j2;
            c4139h9.l = i2;
            c4139h9.g = jCurrentTimeMillis;
            c4139h9.h = jQ;
            c4139h9.m = i;
            c4139h9.o = 1;
            objInvoke = function1.invoke(c4139h9);
            if (objInvoke == mn2) {
                return mn2;
            }
            function2 = function1;
            i3 = i;
            long j10 = j3;
            c4139h8 = c4139h9;
            j7 = j2;
            j6 = jQ;
            j5 = jCurrentTimeMillis;
            obj = objInvoke;
            j4 = j10;
            commonResult = (CommonResult) obj;
            int i7 = i3 + 1;
            commonError2 = commonError;
            if (!(commonResult instanceof ResultOk)) {
                if (commonResult instanceof ResultError) {
                    resultError2 = (ResultError) commonResult;
                    error = resultError2.getError();
                    if (CommonErrorClassificationKt.d(resultError2.getError())) {
                        commonError3 = error;
                    }
                } else {
                    commonError3 = commonError2;
                }
                if (b.f(j6, j7) < 0) {
                    resultError = new ResultError(CommonResultKt.a(commonError3));
                } else {
                    resultError = new ResultError(CommonResultKt.a(commonError3));
                }
                commonResult = resultError;
            }
            if (commonResult instanceof ResultError) {
            }
        }
        if (i6 == 1) {
            i3 = c4139h8.m;
            long j11 = c4139h8.h;
            long j12 = c4139h8.g;
            int i8 = c4139h8.l;
            long j13 = c4139h8.e;
            j4 = c4139h8.d;
            CommonError commonError4 = c4139h8.k;
            String str2 = c4139h8.j;
            function2 = c4139h8.i;
            C1795Pt1.b(obj);
            i2 = i8;
            commonError = commonError4;
            str = str2;
            j6 = j11;
            j7 = j13;
            j5 = j12;
            commonResult = (CommonResult) obj;
            int i9 = i3 + 1;
            commonError2 = commonError;
            if (!(commonResult instanceof ResultOk)) {
                if (commonResult instanceof ResultError) {
                    resultError2 = (ResultError) commonResult;
                    error = resultError2.getError();
                    if (CommonErrorClassificationKt.d(resultError2.getError())) {
                        commonError3 = error;
                    }
                } else {
                    commonError3 = commonError2;
                }
                if (b.f(j6, j7) < 0 || i9 == i2 || System.currentTimeMillis() - j5 > b.l(j4)) {
                    resultError = new ResultError(CommonResultKt.a(commonError3));
                } else {
                    b.s(j6);
                    if (str == null || (c2408Xg = U0.P) == null) {
                        j8 = j6;
                    } else {
                        j8 = j6;
                        c2408Xg.k(str, new Integer(i9), PW0.e(new Pair("delay_ms", new Long(b.l(j8))), new Pair("error_code", commonError3 != null ? new Integer(commonError3.getCode()) : null), new Pair("error_class", commonError3 != null ? C2017Sp1.a.b(commonError3.getClass()).f() : null), new Pair("error_text", commonError3 != null ? commonError3.getText() : null), new Pair("platform_code", commonError3 != null ? commonError3.getPlatformCode() : null)));
                    }
                    c4139h8.i = function2;
                    c4139h8.j = str;
                    c4139h8.k = commonError3;
                    c4139h8.d = j4;
                    j2 = j7;
                    c4139h8.e = j2;
                    i2 = i2;
                    c4139h8.l = i2;
                    long j14 = j5;
                    c4139h8.g = j14;
                    j9 = j8;
                    c4139h8.h = j9;
                    c4139h8.m = i9;
                    c4139h8.o = 2;
                    mn = mn2;
                    if (IW.c(j9, c4139h8) == mn) {
                        return mn;
                    }
                    commonError = commonError3;
                    c4139h9 = c4139h8;
                    j3 = j4;
                    jCurrentTimeMillis = j14;
                    i4 = i9;
                    function1 = function2;
                }
                commonResult = resultError;
            }
            return ((commonResult instanceof ResultError) || (((ResultError) commonResult).getError() instanceof CommonError.UserAlreadyRegistered)) ? new ResultOk(Unit.a) : commonResult;
        }
        if (i6 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i10 = c4139h8.m;
        long j15 = c4139h8.h;
        long j16 = c4139h8.g;
        int i11 = c4139h8.l;
        long j17 = c4139h8.e;
        long j18 = c4139h8.d;
        CommonError commonError5 = c4139h8.k;
        str = c4139h8.j;
        Function1 function3 = c4139h8.i;
        C1795Pt1.b(obj);
        c4139h9 = c4139h8;
        j3 = j18;
        commonError = commonError5;
        mn = mn2;
        i4 = i10;
        function1 = function3;
        j9 = j15;
        j2 = j17;
        i2 = i11;
        jCurrentTimeMillis = j16;
        jQ = b.q(2, j9);
        MN mn3 = mn;
        i = i4;
        mn2 = mn3;
        c4139h9.i = function1;
        c4139h9.j = str;
        c4139h9.k = commonError;
        c4139h9.d = j3;
        c4139h9.e = j2;
        c4139h9.l = i2;
        c4139h9.g = jCurrentTimeMillis;
        c4139h9.h = jQ;
        c4139h9.m = i;
        c4139h9.o = 1;
        objInvoke = function1.invoke(c4139h9);
        if (objInvoke == mn2) {
            return mn2;
        }
        function2 = function1;
        i3 = i;
        long j19 = j3;
        c4139h8 = c4139h9;
        j7 = j2;
        j6 = jQ;
        j5 = jCurrentTimeMillis;
        obj = objInvoke;
        j4 = j19;
        commonResult = (CommonResult) obj;
        int i12 = i3 + 1;
        commonError2 = commonError;
        if (!(commonResult instanceof ResultOk)) {
            if (commonResult instanceof ResultError) {
                resultError2 = (ResultError) commonResult;
                error = resultError2.getError();
                if (CommonErrorClassificationKt.d(resultError2.getError())) {
                    commonError3 = error;
                }
            } else {
                commonError3 = commonError2;
            }
            if (b.f(j6, j7) < 0) {
                resultError = new ResultError(CommonResultKt.a(commonError3));
            } else {
                resultError = new ResultError(CommonResultKt.a(commonError3));
            }
            commonResult = resultError;
        }
        if (commonResult instanceof ResultError) {
        }
    }
}
