package com.api.core.backend.domain.models.resultModels;

import defpackage.C1795Pt1;
import defpackage.C2017Sp1;
import defpackage.C2408Xg;
import defpackage.IW;
import defpackage.InterfaceC3368dU;
import defpackage.LM;
import defpackage.MN;
import defpackage.PW0;
import defpackage.U0;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.core.backend.domain.models.resultModels.CommonResultKt", f = "CommonResult.kt", l = {104}, m = "repeatWithChangingDelay-P-Y79PE")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
final class CommonResultKt$repeatWithChangingDelay$1<T> extends LM {
    int I$0;
    int I$1;
    long J$0;
    long J$1;
    long J$2;
    long J$3;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;

    public CommonResultKt$repeatWithChangingDelay$1() {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x007e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x007f  */
    /* JADX WARN: Code duplicated, block: B:14:0x0083  */
    /* JADX WARN: Code duplicated, block: B:16:0x0096 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:17:0x0097  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0176 -> B:52:0x0185). Please report as a decompilation issue!!! */
    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        int i;
        long jCurrentTimeMillis;
        MN mn;
        long j;
        long j2;
        long j3;
        int i2;
        Function1 function1;
        Function1 function2;
        String str;
        Function1 function3;
        CommonError commonError;
        CommonResult commonResult;
        CommonError error;
        long j4;
        int i3;
        CommonResultKt$repeatWithChangingDelay$1<T> commonResultKt$repeatWithChangingDelay$1;
        MN mn2;
        long j5;
        C2408Xg c2408Xg;
        CommonResultKt$repeatWithChangingDelay$1<T> commonResultKt$repeatWithChangingDelay$2 = this;
        commonResultKt$repeatWithChangingDelay$2.result = obj;
        int i4 = (commonResultKt$repeatWithChangingDelay$2.label | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        commonResultKt$repeatWithChangingDelay$2.label = i4;
        MN mn3 = MN.d;
        if (i4 == 0) {
            C1795Pt1.b(obj);
            i = 0;
            jCurrentTimeMillis = System.currentTimeMillis();
            mn = mn3;
            j = 0;
            j2 = 0;
            j3 = 0;
            i2 = 0;
            function1 = null;
            function2 = null;
            str = null;
            function3 = null;
            commonError = null;
            commonResult = (CommonResult) function3.invoke(new Integer(i));
            int i5 = i + 1;
            long j6 = jCurrentTimeMillis;
            if (!(commonResult instanceof ResultOk)) {
                return commonResult;
            }
            if (commonResult instanceof ResultError) {
                error = ((ResultError) commonResult).getError();
                if (((Boolean) function1.invoke(commonResult)).booleanValue()) {
                    return commonResult;
                }
            } else {
                error = commonError;
            }
            if (b.f(j, j3) < 0 || i5 == i2) {
                return new ResultError(CommonResultKt.a(error));
            }
            if (System.currentTimeMillis() - j6 > b.l(j2)) {
                return new ResultError(CommonResultKt.a(error));
            }
            b.s(j);
            if (str == null || (c2408Xg = U0.P) == null) {
                j4 = j;
            } else {
                j4 = j;
                c2408Xg.k(str, new Integer(i5), PW0.e(new Pair("delay_ms", new Long(b.l(j4))), new Pair("error_code", error != null ? new Integer(error.getCode()) : null), new Pair("error_class", error != null ? C2017Sp1.a.b(error.getClass()).f() : null), new Pair("error_text", error != null ? error.getText() : null), new Pair("platform_code", error != null ? error.getPlatformCode() : null)));
            }
            commonResultKt$repeatWithChangingDelay$2.L$0 = function2;
            commonResultKt$repeatWithChangingDelay$2.L$1 = function1;
            commonResultKt$repeatWithChangingDelay$2.L$2 = str;
            commonResultKt$repeatWithChangingDelay$2.L$3 = function3;
            commonResultKt$repeatWithChangingDelay$2.L$4 = error;
            long j7 = j3;
            commonResultKt$repeatWithChangingDelay$2.J$0 = j7;
            int i6 = i2;
            commonResultKt$repeatWithChangingDelay$2.I$0 = i6;
            long j8 = j2;
            commonResultKt$repeatWithChangingDelay$2.J$1 = j8;
            commonResultKt$repeatWithChangingDelay$2.J$2 = j6;
            long j9 = j4;
            commonResultKt$repeatWithChangingDelay$2.J$3 = j9;
            i3 = i5;
            commonResultKt$repeatWithChangingDelay$2.I$1 = i3;
            Function1 function4 = function1;
            commonResultKt$repeatWithChangingDelay$2.label = 1;
            Object objC = IW.c(j9, commonResultKt$repeatWithChangingDelay$2);
            commonResultKt$repeatWithChangingDelay$1 = commonResultKt$repeatWithChangingDelay$2;
            mn2 = mn;
            if (objC == mn2) {
                return mn2;
            }
            j3 = j7;
            j5 = j9;
            function1 = function4;
            commonError = error;
            i2 = i6;
            j2 = j8;
            jCurrentTimeMillis = j6;
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i7 = commonResultKt$repeatWithChangingDelay$2.I$1;
            j5 = commonResultKt$repeatWithChangingDelay$2.J$3;
            long j10 = commonResultKt$repeatWithChangingDelay$2.J$2;
            long j11 = commonResultKt$repeatWithChangingDelay$2.J$1;
            int i8 = commonResultKt$repeatWithChangingDelay$2.I$0;
            long j12 = commonResultKt$repeatWithChangingDelay$2.J$0;
            CommonError commonError2 = (CommonError) commonResultKt$repeatWithChangingDelay$2.L$4;
            function3 = (Function1) commonResultKt$repeatWithChangingDelay$2.L$3;
            str = (String) commonResultKt$repeatWithChangingDelay$2.L$2;
            Function1 function5 = (Function1) commonResultKt$repeatWithChangingDelay$2.L$1;
            Function1 function6 = (Function1) commonResultKt$repeatWithChangingDelay$2.L$0;
            C1795Pt1.b(obj);
            function2 = function6;
            function1 = function5;
            commonError = commonError2;
            j3 = j12;
            i2 = i8;
            j2 = j11;
            jCurrentTimeMillis = j10;
            i3 = i7;
            commonResultKt$repeatWithChangingDelay$1 = commonResultKt$repeatWithChangingDelay$2;
            mn2 = mn3;
        }
        long j13 = ((b) function2.invoke(new b(j5))).d;
        i = i3;
        j = j13;
        mn = mn2;
        commonResultKt$repeatWithChangingDelay$2 = commonResultKt$repeatWithChangingDelay$1;
        commonResult = (CommonResult) function3.invoke(new Integer(i));
        int i9 = i + 1;
        long j14 = jCurrentTimeMillis;
        if (!(commonResult instanceof ResultOk)) {
            return commonResult;
        }
        if (commonResult instanceof ResultError) {
            error = ((ResultError) commonResult).getError();
            if (((Boolean) function1.invoke(commonResult)).booleanValue()) {
                return commonResult;
            }
        } else {
            error = commonError;
        }
        if (b.f(j, j3) < 0) {
        }
        return new ResultError(CommonResultKt.a(error));
    }
}
