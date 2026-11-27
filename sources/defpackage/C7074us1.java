package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonError;
import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.core.backend.domain.models.resultModels.CommonResultKt;
import com.api.core.backend.domain.models.resultModels.ResultError;
import com.api.core.backend.domain.models.resultModels.ResultOk;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlin.time.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: us1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7074us1 extends C6654ss1 {
    /* JADX WARN: Code duplicated, block: B:20:0x0146  */
    /* JADX WARN: Code duplicated, block: B:21:0x0149  */
    /* JADX WARN: Code duplicated, block: B:25:0x0171  */
    /* JADX WARN: Code duplicated, block: B:27:0x0175  */
    /* JADX WARN: Code duplicated, block: B:28:0x017c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0184 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:42:0x01fa A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:45:0x020d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0213  */
    /* JADX WARN: Code duplicated, block: B:49:0x0217  */
    /* JADX WARN: Code duplicated, block: B:51:0x021f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0232  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x01d7 -> B:13:0x006e). Please report as a decompilation issue!!! */
    @Override // defpackage.InterfaceC6444rs1
    @Nullable
    public final Object a(@NotNull String str, long j, long j2, int i, int i2, @NotNull JM jm) {
        C6864ts1 c6864ts1;
        C7074us1 c7074us1;
        CommonError commonError;
        long j3;
        long j4;
        long jQ;
        long j5;
        int i3;
        String str2;
        MN mn;
        int i4;
        long jCurrentTimeMillis;
        C6864ts1 c6864ts2;
        long j6;
        int i5;
        int i6;
        int i7;
        Object obj;
        long j7;
        CommonError commonError2;
        MN mn2;
        int i8;
        long j8;
        long j9;
        long j10;
        String str3;
        int i9;
        long j11;
        CommonResult commonResult;
        int i10;
        Collection collection;
        CommonError error;
        ResultError resultError;
        int i11;
        long j12;
        long j13;
        C6864ts1 c6864ts3;
        CommonError commonError3;
        int i12;
        long j14;
        String str4;
        int i13;
        int i14;
        long j15;
        long j16;
        int i15;
        Object objB;
        MN mn3;
        if (jm instanceof C6864ts1) {
            c6864ts1 = (C6864ts1) jm;
            int i16 = c6864ts1.t;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                c6864ts1.t = i16 - Integer.MIN_VALUE;
                c7074us1 = this;
            } else {
                c7074us1 = this;
                c6864ts1 = new C6864ts1(c7074us1, (LM) jm);
            }
        } else {
            c7074us1 = this;
            c6864ts1 = new C6864ts1(c7074us1, (LM) jm);
        }
        Object obj2 = c6864ts1.r;
        MN mn4 = MN.d;
        int i17 = c6864ts1.t;
        if (i17 == 0) {
            C1795Pt1.b(obj2);
            b.a aVar = b.e;
            R40 r40 = R40.MILLISECONDS;
            long jG = c.g(4000, r40);
            long jG2 = c.g(20, r40);
            b.e.getClass();
            long j17 = b.g;
            commonError = null;
            j3 = jG;
            j4 = j;
            jQ = jG2;
            j5 = j2;
            i3 = 0;
            str2 = str;
            mn = mn4;
            C6864ts1 c6864ts4 = c6864ts1;
            i4 = i;
            jCurrentTimeMillis = System.currentTimeMillis();
            c6864ts2 = c6864ts4;
            j6 = j17;
            i5 = i2;
            i6 = Integer.MAX_VALUE;
            c6864ts2.d = c7074us1;
            c6864ts2.e = str2;
            c6864ts2.g = commonError;
            c6864ts2.h = j4;
            c6864ts2.i = j5;
            c6864ts2.n = i4;
            c6864ts2.o = i5;
            c6864ts2.j = j3;
            c6864ts2.p = i6;
            c6864ts2.k = j6;
            str4 = str2;
            i13 = i4;
            c6864ts2.l = jCurrentTimeMillis;
            c6864ts2.m = jQ;
            i14 = i3;
            c6864ts2.q = i14;
            c6864ts2.t = 1;
            c7074us1.getClass();
            j15 = j4;
            j16 = j5;
            i15 = i5;
            objB = c7074us1.a.b(new YF(i13, i15, j16, j15, str4), c6864ts2);
            mn3 = mn;
            if (objB == mn3) {
                return mn3;
            }
            long j18 = j6;
            j8 = jQ;
            j7 = j18;
            obj = objB;
            mn2 = mn3;
            i7 = i14;
            j11 = j3;
            i9 = i13;
            j9 = j16;
            j10 = j15;
            str3 = str4;
            commonError2 = commonError;
            i8 = i15;
            commonResult = (CommonResult) obj;
            i10 = i7 + 1;
            int i18 = i8;
            if (!(commonResult instanceof ResultOk)) {
                if (commonResult instanceof ResultError) {
                    error = ((ResultError) commonResult).getError();
                } else {
                    error = commonError2;
                }
                if (b.f(j8, j11) < 0) {
                    resultError = new ResultError(CommonResultKt.a(error));
                } else {
                    resultError = new ResultError(CommonResultKt.a(error));
                }
                commonResult = resultError;
            }
            c7074us1.getClass();
            if (commonResult instanceof ResultError) {
                Intrinsics.checkNotNullParameter("Failed to get candles response for local indicators.", "message");
                return commonResult;
            }
            if (!(commonResult instanceof ResultOk)) {
                throw new C6489s51();
            }
            collection = (Collection) CommonResultKt.b(commonResult);
            if (collection != null) {
            }
            Intrinsics.checkNotNullParameter("Candles response is empty.", "message");
            return commonResult;
        }
        if (i17 == 1) {
            int i19 = c6864ts1.q;
            long j19 = c6864ts1.m;
            long j20 = c6864ts1.l;
            long j21 = c6864ts1.k;
            int i20 = c6864ts1.p;
            long j22 = c6864ts1.j;
            int i21 = c6864ts1.o;
            int i22 = c6864ts1.n;
            long j23 = c6864ts1.i;
            long j24 = c6864ts1.h;
            CommonError commonError4 = c6864ts1.g;
            String str5 = c6864ts1.e;
            C7074us1 c7074us2 = c6864ts1.d;
            C1795Pt1.b(obj2);
            c7074us1 = c7074us2;
            commonError2 = commonError4;
            i8 = i21;
            i7 = i19;
            obj = obj2;
            mn2 = mn4;
            i9 = i22;
            str3 = str5;
            jCurrentTimeMillis = j20;
            j10 = j24;
            c6864ts2 = c6864ts1;
            j11 = j22;
            j8 = j19;
            j7 = j21;
            i6 = i20;
            j9 = j23;
            commonResult = (CommonResult) obj;
            i10 = i7 + 1;
            int i110 = i8;
            if (!(commonResult instanceof ResultOk)) {
                if (commonResult instanceof ResultError) {
                    error = ((ResultError) commonResult).getError();
                } else {
                    error = commonError2;
                }
                if (b.f(j8, j11) < 0 || i10 == i6 || System.currentTimeMillis() - jCurrentTimeMillis > b.l(j7)) {
                    resultError = new ResultError(CommonResultKt.a(error));
                } else {
                    b.s(j8);
                    c6864ts2.d = c7074us1;
                    c6864ts2.e = str3;
                    c6864ts2.g = error;
                    c6864ts2.h = j10;
                    c6864ts2.i = j9;
                    c6864ts2.n = i9;
                    i11 = i110;
                    c6864ts2.o = i11;
                    c6864ts2.j = j11;
                    c6864ts2.p = i6;
                    j12 = j11;
                    long j25 = j7;
                    c6864ts2.k = j25;
                    j13 = j25;
                    long j26 = jCurrentTimeMillis;
                    c6864ts2.l = j26;
                    c6864ts2.m = j8;
                    c6864ts2.q = i10;
                    c6864ts2.t = 2;
                    MN mn5 = mn2;
                    if (IW.c(j8, c6864ts2) == mn5) {
                        return mn5;
                    }
                    mn = mn5;
                    i4 = i9;
                    c6864ts3 = c6864ts2;
                    commonError3 = error;
                    i12 = i6;
                    j14 = j26;
                }
                commonResult = resultError;
            }
            c7074us1.getClass();
            if (commonResult instanceof ResultError) {
                Intrinsics.checkNotNullParameter("Failed to get candles response for local indicators.", "message");
                return commonResult;
            }
            if (!(commonResult instanceof ResultOk)) {
                throw new C6489s51();
            }
            collection = (Collection) CommonResultKt.b(commonResult);
            if (collection != null || collection.isEmpty()) {
                Intrinsics.checkNotNullParameter("Candles response is empty.", "message");
                return commonResult;
            }
            Intrinsics.checkNotNullParameter("Success candles response for local indicators.", "message");
            return commonResult;
        }
        if (i17 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i23 = c6864ts1.q;
        long j27 = c6864ts1.m;
        j14 = c6864ts1.l;
        long j28 = c6864ts1.k;
        i12 = c6864ts1.p;
        long j29 = c6864ts1.j;
        int i24 = c6864ts1.o;
        int i25 = c6864ts1.n;
        long j30 = c6864ts1.i;
        long j31 = c6864ts1.h;
        CommonError commonError5 = c6864ts1.g;
        String str6 = c6864ts1.e;
        C7074us1 c7074us3 = c6864ts1.d;
        C1795Pt1.b(obj2);
        commonError3 = commonError5;
        c7074us1 = c7074us3;
        j13 = j28;
        j12 = j29;
        i10 = i23;
        i11 = i24;
        mn = mn4;
        j8 = j27;
        j9 = j30;
        c6864ts3 = c6864ts1;
        i4 = i25;
        j10 = j31;
        str3 = str6;
        str2 = str3;
        j4 = j10;
        j5 = j9;
        jCurrentTimeMillis = j14;
        jQ = b.q(2, j8);
        i6 = i12;
        i3 = i10;
        i5 = i11;
        commonError = commonError3;
        j3 = j12;
        j6 = j13;
        c6864ts2 = c6864ts3;
        c6864ts2.d = c7074us1;
        c6864ts2.e = str2;
        c6864ts2.g = commonError;
        c6864ts2.h = j4;
        c6864ts2.i = j5;
        c6864ts2.n = i4;
        c6864ts2.o = i5;
        c6864ts2.j = j3;
        c6864ts2.p = i6;
        c6864ts2.k = j6;
        str4 = str2;
        i13 = i4;
        c6864ts2.l = jCurrentTimeMillis;
        c6864ts2.m = jQ;
        i14 = i3;
        c6864ts2.q = i14;
        c6864ts2.t = 1;
        c7074us1.getClass();
        j15 = j4;
        j16 = j5;
        i15 = i5;
        objB = c7074us1.a.b(new YF(i13, i15, j16, j15, str4), c6864ts2);
        mn3 = mn;
        if (objB == mn3) {
            return mn3;
        }
        long j110 = j6;
        j8 = jQ;
        j7 = j110;
        obj = objB;
        mn2 = mn3;
        i7 = i14;
        j11 = j3;
        i9 = i13;
        j9 = j16;
        j10 = j15;
        str3 = str4;
        commonError2 = commonError;
        i8 = i15;
        commonResult = (CommonResult) obj;
        i10 = i7 + 1;
        int i111 = i8;
        if (!(commonResult instanceof ResultOk)) {
            if (commonResult instanceof ResultError) {
                error = ((ResultError) commonResult).getError();
            } else {
                error = commonError2;
            }
            if (b.f(j8, j11) < 0) {
                resultError = new ResultError(CommonResultKt.a(error));
            } else {
                resultError = new ResultError(CommonResultKt.a(error));
            }
            commonResult = resultError;
        }
        c7074us1.getClass();
        if (commonResult instanceof ResultError) {
            Intrinsics.checkNotNullParameter("Failed to get candles response for local indicators.", "message");
            return commonResult;
        }
        if (!(commonResult instanceof ResultOk)) {
            throw new C6489s51();
        }
        collection = (Collection) CommonResultKt.b(commonResult);
        if (collection != null) {
        }
        Intrinsics.checkNotNullParameter("Candles response is empty.", "message");
        return commonResult;
    }
}
