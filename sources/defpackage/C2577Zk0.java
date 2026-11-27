package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonError;
import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.core.backend.domain.models.resultModels.CommonResultKt;
import com.api.core.backend.domain.models.resultModels.ResultError;
import com.api.core.backend.domain.models.resultModels.ResultOk;
import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlin.time.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Zk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2577Zk0 implements InterfaceC2421Xk0 {

    @NotNull
    public final InterfaceC7816yQ a;

    @NotNull
    public final C4923kf b;

    @NotNull
    public final ReporterApi c;

    public C2577Zk0(@NotNull InterfaceC7816yQ currencyRepository, @NotNull C4923kf appDataRepository, @NotNull ReporterApi reporter) {
        Intrinsics.checkNotNullParameter(currencyRepository, "currencyRepository");
        Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        this.a = currencyRepository;
        this.b = appDataRepository;
        this.c = reporter;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:25:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:27:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:40:0x0124 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:43:0x0131  */
    /* JADX WARN: Code duplicated, block: B:45:0x0160  */
    /* JADX WARN: Code duplicated, block: B:47:0x0164  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0110 -> B:13:0x0043). Please report as a decompilation issue!!! */
    public static Object b(C2577Zk0 c2577Zk0, LM lm) {
        C2499Yk0 c2499Yk0;
        C2577Zk0 c2577Zk1;
        long jG;
        long jG2;
        long j;
        long jCurrentTimeMillis;
        int i;
        int i2;
        CommonError commonError;
        long j2;
        long j3;
        long j4;
        C2577Zk0 c2577Zk2;
        CommonError error;
        int i3;
        int i4;
        Object resultError;
        int i5;
        Object objB;
        if (lm instanceof C2499Yk0) {
            c2499Yk0 = (C2499Yk0) lm;
            int i6 = c2499Yk0.o;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c2499Yk0.o = i6 - Integer.MIN_VALUE;
                c2577Zk1 = c2577Zk0;
            } else {
                c2577Zk1 = c2577Zk0;
                c2499Yk0 = new C2499Yk0(c2577Zk1, lm);
            }
        } else {
            c2577Zk1 = c2577Zk0;
            c2499Yk0 = new C2499Yk0(c2577Zk1, lm);
        }
        Object obj = c2499Yk0.m;
        MN mn = MN.d;
        int i7 = c2499Yk0.o;
        int i8 = 1;
        if (i7 == 0) {
            C1795Pt1.b(obj);
            b.a aVar = b.e;
            R40 r40 = R40.MILLISECONDS;
            jG = c.g(4000, r40);
            jG2 = c.g(20, r40);
            b.e.getClass();
            j = b.g;
            jCurrentTimeMillis = System.currentTimeMillis();
            i = 5;
            i2 = 0;
            commonError = null;
            InterfaceC7816yQ interfaceC7816yQ = c2577Zk1.a;
            c2499Yk0.d = c2577Zk1;
            c2499Yk0.e = commonError;
            c2499Yk0.g = jG;
            c2499Yk0.k = i;
            c2499Yk0.h = j;
            c2499Yk0.i = jCurrentTimeMillis;
            c2499Yk0.j = jG2;
            c2499Yk0.l = i2;
            c2499Yk0.o = i8;
            objB = interfaceC7816yQ.b(c2499Yk0);
            if (objB != mn) {
                int i9 = i2;
                c2577Zk2 = c2577Zk1;
                i4 = i9;
                long j5 = jCurrentTimeMillis;
                j3 = j;
                j4 = j5;
                long j6 = jG;
                i3 = i;
                error = commonError;
                obj = objB;
                j2 = j6;
                resultError = (CommonResult) obj;
                int i10 = i4 + i8;
                if (!(resultError instanceof ResultOk)) {
                    if (resultError instanceof ResultError) {
                        error = ((ResultError) resultError).getError();
                    }
                    if (b.f(jG2, j2) >= 0) {
                        resultError = new ResultError(CommonResultKt.a(error));
                    } else {
                        resultError = new ResultError(CommonResultKt.a(error));
                    }
                }
                if (!(resultError instanceof ResultOk)) {
                    if (resultError instanceof ResultError) {
                        MN0.a(c2577Zk2.c, ((ResultError) resultError).getError(), "Error in get currency requests");
                    }
                    return Boolean.FALSE;
                }
                KF commonCurrencies = (KF) ((ResultOk) resultError).a();
                c2577Zk2.getClass();
                Intrinsics.checkNotNullParameter(commonCurrencies, "commonCurrencies");
                commonCurrencies.a.add(new LF(-1, 0, 0, "DEMO", "Đ"));
                GP1 gp1 = c2577Zk2.b.i;
                gp1.getClass();
                gp1.m(null, commonCurrencies);
                return Boolean.TRUE;
            }
            return mn;
        }
        if (i7 == 1) {
            i4 = c2499Yk0.l;
            long j7 = c2499Yk0.j;
            long j8 = c2499Yk0.i;
            long j9 = c2499Yk0.h;
            int i11 = c2499Yk0.k;
            long j10 = c2499Yk0.g;
            CommonError commonError2 = c2499Yk0.e;
            C2577Zk0 c2577Zk3 = c2499Yk0.d;
            C1795Pt1.b(obj);
            i3 = i11;
            error = commonError2;
            c2577Zk2 = c2577Zk3;
            j2 = j10;
            j3 = j9;
            j4 = j8;
            jG2 = j7;
            resultError = (CommonResult) obj;
            int i12 = i4 + i8;
            if (!(resultError instanceof ResultOk)) {
                if (resultError instanceof ResultError) {
                    error = ((ResultError) resultError).getError();
                }
                if (b.f(jG2, j2) >= 0 && i12 != i3 && System.currentTimeMillis() - j4 <= b.l(j3)) {
                    b.s(jG2);
                    c2499Yk0.d = c2577Zk2;
                    c2499Yk0.e = error;
                    c2499Yk0.g = j2;
                    c2499Yk0.k = i3;
                    c2499Yk0.h = j3;
                    c2499Yk0.i = j4;
                    c2499Yk0.j = jG2;
                    c2499Yk0.l = i12;
                    i5 = 2;
                    c2499Yk0.o = 2;
                    if (IW.c(jG2, c2499Yk0) != mn) {
                        C2577Zk0 c2577Zk4 = c2577Zk2;
                        i2 = i12;
                        c2577Zk1 = c2577Zk4;
                    }
                    return mn;
                }
                resultError = new ResultError(CommonResultKt.a(error));
            }
            if (!(resultError instanceof ResultOk)) {
                if (resultError instanceof ResultError) {
                    MN0.a(c2577Zk2.c, ((ResultError) resultError).getError(), "Error in get currency requests");
                }
                return Boolean.FALSE;
            }
            KF commonCurrencies2 = (KF) ((ResultOk) resultError).a();
            c2577Zk2.getClass();
            Intrinsics.checkNotNullParameter(commonCurrencies2, "commonCurrencies");
            commonCurrencies2.a.add(new LF(-1, 0, 0, "DEMO", "Đ"));
            GP1 gp2 = c2577Zk2.b.i;
            gp2.getClass();
            gp2.m(null, commonCurrencies2);
            return Boolean.TRUE;
        }
        if (i7 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i13 = c2499Yk0.l;
        jG2 = c2499Yk0.j;
        j4 = c2499Yk0.i;
        j3 = c2499Yk0.h;
        i3 = c2499Yk0.k;
        j2 = c2499Yk0.g;
        error = c2499Yk0.e;
        C2577Zk0 c2577Zk5 = c2499Yk0.d;
        C1795Pt1.b(obj);
        i2 = i13;
        c2577Zk1 = c2577Zk5;
        i5 = 2;
        long j11 = j3;
        jCurrentTimeMillis = j4;
        j = j11;
        jG2 = b.q(i5, jG2);
        i = i3;
        i8 = 1;
        long j12 = j2;
        commonError = error;
        jG = j12;
        InterfaceC7816yQ interfaceC7816yQ2 = c2577Zk1.a;
        c2499Yk0.d = c2577Zk1;
        c2499Yk0.e = commonError;
        c2499Yk0.g = jG;
        c2499Yk0.k = i;
        c2499Yk0.h = j;
        c2499Yk0.i = jCurrentTimeMillis;
        c2499Yk0.j = jG2;
        c2499Yk0.l = i2;
        c2499Yk0.o = i8;
        objB = interfaceC7816yQ2.b(c2499Yk0);
        if (objB != mn) {
            int i14 = i2;
            c2577Zk2 = c2577Zk1;
            i4 = i14;
            long j13 = jCurrentTimeMillis;
            j3 = j;
            j4 = j13;
            long j14 = jG;
            i3 = i;
            error = commonError;
            obj = objB;
            j2 = j14;
            resultError = (CommonResult) obj;
            int i15 = i4 + i8;
            if (!(resultError instanceof ResultOk)) {
                if (resultError instanceof ResultError) {
                    error = ((ResultError) resultError).getError();
                }
                if (b.f(jG2, j2) >= 0) {
                    resultError = new ResultError(CommonResultKt.a(error));
                } else {
                    resultError = new ResultError(CommonResultKt.a(error));
                }
            }
            if (!(resultError instanceof ResultOk)) {
                if (resultError instanceof ResultError) {
                    MN0.a(c2577Zk2.c, ((ResultError) resultError).getError(), "Error in get currency requests");
                }
                return Boolean.FALSE;
            }
            KF commonCurrencies3 = (KF) ((ResultOk) resultError).a();
            c2577Zk2.getClass();
            Intrinsics.checkNotNullParameter(commonCurrencies3, "commonCurrencies");
            commonCurrencies3.a.add(new LF(-1, 0, 0, "DEMO", "Đ"));
            GP1 gp3 = c2577Zk2.b.i;
            gp3.getClass();
            gp3.m(null, commonCurrencies3);
            return Boolean.TRUE;
        }
        return mn;
    }

    @Override // defpackage.InterfaceC2421Xk0
    @Nullable
    public final Object a(@NotNull UM0 um0) {
        return b(this, um0);
    }
}
