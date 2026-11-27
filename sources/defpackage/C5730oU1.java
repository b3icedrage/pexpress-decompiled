package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonError;
import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.core.backend.domain.models.resultModels.CommonResultKt;
import com.api.core.backend.domain.models.resultModels.ResultError;
import com.api.core.backend.domain.models.resultModels.ResultOk;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlin.time.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: oU1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5730oU1 implements InterfaceC4209hU1 {

    @NotNull
    public final L32 a;

    @NotNull
    public final InterfaceC6444rs1 b;

    @NotNull
    public final C4923kf c;

    @NotNull
    public final AbstractC7949z22 d;

    public C5730oU1(@NotNull L32 tradingRepository, @NotNull InterfaceC6444rs1 requestCandlesHistoryUseCase, @NotNull C4923kf appData, @NotNull AbstractC7949z22 tradingAssetsProvider) {
        Intrinsics.checkNotNullParameter(tradingRepository, "tradingRepository");
        Intrinsics.checkNotNullParameter(requestCandlesHistoryUseCase, "requestCandlesHistoryUseCase");
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(tradingAssetsProvider, "tradingAssetsProvider");
        this.a = tradingRepository;
        this.b = requestCandlesHistoryUseCase;
        this.c = appData;
        this.d = tradingAssetsProvider;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:22:0x0100  */
    /* JADX WARN: Code duplicated, block: B:25:0x012c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0131  */
    /* JADX WARN: Code duplicated, block: B:30:0x0147  */
    /* JADX WARN: Code duplicated, block: B:34:0x0165  */
    /* JADX WARN: Code duplicated, block: B:36:0x0169  */
    /* JADX WARN: Code duplicated, block: B:37:0x0170  */
    /* JADX WARN: Code duplicated, block: B:40:0x0177 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:51:0x01cd A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:52:0x01d7 A[PHI: r0
      0x01d7: PHI (r0v8 com.api.core.backend.domain.models.resultModels.CommonResult) = 
      (r0v7 com.api.core.backend.domain.models.resultModels.CommonResult)
      (r0v21 com.api.core.backend.domain.models.resultModels.CommonResult)
     binds: [B:32:0x0161, B:45:0x0191] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x01df  */
    /* JADX WARN: Code duplicated, block: B:55:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:57:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:61:0x0204  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x01b8 -> B:50:0x01c4). Please report as a decompilation issue!!! */
    @Override // defpackage.InterfaceC4209hU1
    @Nullable
    public final Object a(@NotNull I10 i10, int i, @NotNull LM lm) {
        C5520nU1 c5520nU1;
        C5730oU1 c5730oU1;
        int i2;
        int i3;
        long j;
        CommonError commonError;
        long j2;
        long j3;
        long jQ;
        I10 i11;
        int i4;
        long j4;
        int i5;
        int i6;
        long j5;
        long j6;
        CommonError commonError2;
        long j7;
        I10 i12;
        Object obj;
        CommonResult commonResult;
        List list;
        List listB0;
        ArrayList arrayListF0;
        Object objB;
        List list2;
        int i7;
        CommonError error;
        ResultError resultError;
        int i8;
        C5520nU1 c5520nU2;
        Long l;
        long jCurrentTimeMillis;
        long j8;
        Long l2;
        long jCurrentTimeMillis2;
        Object objC;
        if (lm instanceof C5520nU1) {
            c5520nU1 = (C5520nU1) lm;
            int i9 = c5520nU1.q;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c5520nU1.q = i9 - Integer.MIN_VALUE;
                c5730oU1 = this;
            } else {
                c5730oU1 = this;
                c5520nU1 = new C5520nU1(c5730oU1, lm);
            }
        } else {
            c5730oU1 = this;
            c5520nU1 = new C5520nU1(c5730oU1, lm);
        }
        Object obj2 = c5520nU1.o;
        MN mn = MN.d;
        int i13 = c5520nU1.q;
        if (i13 == 0) {
            C1795Pt1.b(obj2);
            b.a aVar = b.e;
            R40 r40 = R40.MILLISECONDS;
            long jG = c.g(4000, r40);
            long jG2 = c.g(20, r40);
            b.e.getClass();
            long j9 = b.g;
            long jCurrentTimeMillis3 = System.currentTimeMillis();
            i2 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            i3 = 0;
            j = jCurrentTimeMillis3;
            commonError = null;
            j2 = j9;
            j3 = jG;
            jQ = jG2;
            i11 = i10;
            i4 = i;
            c5520nU1.d = c5730oU1;
            c5520nU1.e = i11;
            c5520nU1.g = commonError;
            c5520nU1.h = i4;
            c5520nU1.k = j3;
            c5520nU1.i = i2;
            c5520nU1.l = j2;
            c5520nU1.m = j;
            c5520nU1.n = jQ;
            c5520nU1.j = i3;
            i8 = i4;
            c5520nU1.q = 1;
            String strF = c5730oU1.d.f(i11);
            C4923kf c4923kf = c5730oU1.c;
            c5520nU2 = c5520nU1;
            l = (Long) c4923kf.y.getValue();
            if (l != null) {
                jCurrentTimeMillis = l.longValue();
            } else {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            j8 = jQ;
            long j10 = CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT;
            b.a aVar2 = b.e;
            long jR = (jCurrentTimeMillis / j10) - (((long) (i8 + 1)) * b.r(i11.b, R40.SECONDS));
            l2 = (Long) c4923kf.y.getValue();
            if (l2 != null) {
                jCurrentTimeMillis2 = l2.longValue();
            } else {
                jCurrentTimeMillis2 = System.currentTimeMillis();
            }
            objC = c5730oU1.b.c(strF, jCurrentTimeMillis2 / j10, jR, c5520nU2);
            if (objC != mn) {
                i12 = i11;
                obj = objC;
                c5520nU1 = c5520nU2;
                j7 = j8;
                i6 = i8;
                j4 = j2;
                j6 = j3;
                commonError2 = commonError;
                i5 = i2;
                j5 = j;
                commonResult = (CommonResult) obj;
                i3++;
                if (commonResult instanceof ResultOk) {
                    list = (List) CommonResultKt.b(commonResult);
                    if (list != null) {
                        listB0 = CollectionsKt.b0(i6, list);
                    } else {
                        listB0 = null;
                    }
                    if (listB0 == null) {
                        listB0 = C5653o60.d;
                    }
                    arrayListF0 = CollectionsKt.f0(listB0);
                    String str = i12.a.l;
                    c5520nU1.d = arrayListF0;
                    c5520nU1.e = null;
                    c5520nU1.g = null;
                    c5520nU1.h = i6;
                    c5520nU1.q = 3;
                    objB = c5730oU1.b(str, c5520nU1);
                    if (objB != mn) {
                        list2 = arrayListF0;
                        obj2 = objB;
                        i7 = i6;
                    }
                } else {
                    if (commonResult instanceof ResultError) {
                        error = ((ResultError) commonResult).getError();
                    } else {
                        error = commonError2;
                    }
                    if (b.f(j7, j6) < 0) {
                        resultError = new ResultError(CommonResultKt.a(error));
                        commonResult = resultError;
                        list = (List) CommonResultKt.b(commonResult);
                        if (list != null) {
                            listB0 = CollectionsKt.b0(i6, list);
                        } else {
                            listB0 = null;
                        }
                        if (listB0 == null) {
                            listB0 = C5653o60.d;
                        }
                        arrayListF0 = CollectionsKt.f0(listB0);
                        String str2 = i12.a.l;
                        c5520nU1.d = arrayListF0;
                        c5520nU1.e = null;
                        c5520nU1.g = null;
                        c5520nU1.h = i6;
                        c5520nU1.q = 3;
                        objB = c5730oU1.b(str2, c5520nU1);
                        if (objB != mn) {
                            list2 = arrayListF0;
                            obj2 = objB;
                            i7 = i6;
                        }
                    } else {
                        resultError = new ResultError(CommonResultKt.a(error));
                        commonResult = resultError;
                        list = (List) CommonResultKt.b(commonResult);
                        if (list != null) {
                            listB0 = CollectionsKt.b0(i6, list);
                        } else {
                            listB0 = null;
                        }
                        if (listB0 == null) {
                            listB0 = C5653o60.d;
                        }
                        arrayListF0 = CollectionsKt.f0(listB0);
                        String str3 = i12.a.l;
                        c5520nU1.d = arrayListF0;
                        c5520nU1.e = null;
                        c5520nU1.g = null;
                        c5520nU1.h = i6;
                        c5520nU1.q = 3;
                        objB = c5730oU1.b(str3, c5520nU1);
                        if (objB != mn) {
                            list2 = arrayListF0;
                            obj2 = objB;
                            i7 = i6;
                        }
                    }
                }
            }
            return mn;
        }
        if (i13 == 1) {
            int i14 = c5520nU1.j;
            j7 = c5520nU1.n;
            long j11 = c5520nU1.m;
            long j12 = c5520nU1.l;
            int i15 = c5520nU1.i;
            long j13 = c5520nU1.k;
            i6 = c5520nU1.h;
            CommonError commonError3 = c5520nU1.g;
            I10 i16 = c5520nU1.e;
            C5730oU1 c5730oU2 = (C5730oU1) c5520nU1.d;
            C1795Pt1.b(obj2);
            c5730oU1 = c5730oU2;
            obj = obj2;
            i12 = i16;
            j4 = j12;
            i3 = i14;
            i5 = i15;
            j5 = j11;
            j6 = j13;
            commonError2 = commonError3;
            commonResult = (CommonResult) obj;
            i3++;
            if (commonResult instanceof ResultOk) {
                if (commonResult instanceof ResultError) {
                    error = ((ResultError) commonResult).getError();
                } else {
                    error = commonError2;
                }
                if (b.f(j7, j6) < 0) {
                    resultError = new ResultError(CommonResultKt.a(error));
                    commonResult = resultError;
                    list = (List) CommonResultKt.b(commonResult);
                    if (list != null) {
                        listB0 = CollectionsKt.b0(i6, list);
                    } else {
                        listB0 = null;
                    }
                    if (listB0 == null) {
                        listB0 = C5653o60.d;
                    }
                    arrayListF0 = CollectionsKt.f0(listB0);
                    String str4 = i12.a.l;
                    c5520nU1.d = arrayListF0;
                    c5520nU1.e = null;
                    c5520nU1.g = null;
                    c5520nU1.h = i6;
                    c5520nU1.q = 3;
                    objB = c5730oU1.b(str4, c5520nU1);
                    if (objB != mn) {
                        list2 = arrayListF0;
                        obj2 = objB;
                        i7 = i6;
                    }
                } else {
                    resultError = new ResultError(CommonResultKt.a(error));
                    commonResult = resultError;
                    list = (List) CommonResultKt.b(commonResult);
                    if (list != null) {
                        listB0 = CollectionsKt.b0(i6, list);
                    } else {
                        listB0 = null;
                    }
                    if (listB0 == null) {
                        listB0 = C5653o60.d;
                    }
                    arrayListF0 = CollectionsKt.f0(listB0);
                    String str5 = i12.a.l;
                    c5520nU1.d = arrayListF0;
                    c5520nU1.e = null;
                    c5520nU1.g = null;
                    c5520nU1.h = i6;
                    c5520nU1.q = 3;
                    objB = c5730oU1.b(str5, c5520nU1);
                    if (objB != mn) {
                        list2 = arrayListF0;
                        obj2 = objB;
                        i7 = i6;
                    }
                }
            } else {
                list = (List) CommonResultKt.b(commonResult);
                if (list != null) {
                    listB0 = CollectionsKt.b0(i6, list);
                } else {
                    listB0 = null;
                }
                if (listB0 == null) {
                    listB0 = C5653o60.d;
                }
                arrayListF0 = CollectionsKt.f0(listB0);
                String str6 = i12.a.l;
                c5520nU1.d = arrayListF0;
                c5520nU1.e = null;
                c5520nU1.g = null;
                c5520nU1.h = i6;
                c5520nU1.q = 3;
                objB = c5730oU1.b(str6, c5520nU1);
                if (objB != mn) {
                    list2 = arrayListF0;
                    obj2 = objB;
                    i7 = i6;
                }
            }
            return mn;
        }
        if (i13 == 2) {
            int i17 = c5520nU1.j;
            long j14 = c5520nU1.n;
            long j15 = c5520nU1.m;
            long j16 = c5520nU1.l;
            int i18 = c5520nU1.i;
            long j17 = c5520nU1.k;
            int i19 = c5520nU1.h;
            CommonError commonError4 = c5520nU1.g;
            I10 i110 = c5520nU1.e;
            C5730oU1 c5730oU3 = (C5730oU1) c5520nU1.d;
            C1795Pt1.b(obj2);
            c5730oU1 = c5730oU3;
            i11 = i110;
            j3 = j17;
            i4 = i19;
            long j18 = j15;
            i2 = i18;
            int i20 = 2;
            i3 = i17;
            commonError = commonError4;
            j7 = j14;
            jQ = b.q(i20, j7);
            j2 = j16;
            j = j18;
            c5520nU1.d = c5730oU1;
            c5520nU1.e = i11;
            c5520nU1.g = commonError;
            c5520nU1.h = i4;
            c5520nU1.k = j3;
            c5520nU1.i = i2;
            c5520nU1.l = j2;
            c5520nU1.m = j;
            c5520nU1.n = jQ;
            c5520nU1.j = i3;
            i8 = i4;
            c5520nU1.q = 1;
            String strF2 = c5730oU1.d.f(i11);
            C4923kf c4923kf2 = c5730oU1.c;
            c5520nU2 = c5520nU1;
            l = (Long) c4923kf2.y.getValue();
            if (l != null) {
                jCurrentTimeMillis = l.longValue();
            } else {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            j8 = jQ;
            long j19 = CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT;
            b.a aVar3 = b.e;
            long jR2 = (jCurrentTimeMillis / j19) - (((long) (i8 + 1)) * b.r(i11.b, R40.SECONDS));
            l2 = (Long) c4923kf2.y.getValue();
            if (l2 != null) {
                jCurrentTimeMillis2 = l2.longValue();
            } else {
                jCurrentTimeMillis2 = System.currentTimeMillis();
            }
            objC = c5730oU1.b.c(strF2, jCurrentTimeMillis2 / j19, jR2, c5520nU2);
            if (objC != mn) {
                i12 = i11;
                obj = objC;
                c5520nU1 = c5520nU2;
                j7 = j8;
                i6 = i8;
                j4 = j2;
                j6 = j3;
                commonError2 = commonError;
                i5 = i2;
                j5 = j;
                commonResult = (CommonResult) obj;
                i3++;
                if (commonResult instanceof ResultOk) {
                    if (commonResult instanceof ResultError) {
                        error = ((ResultError) commonResult).getError();
                    } else {
                        error = commonError2;
                    }
                    if (b.f(j7, j6) < 0 || i3 == i5 || System.currentTimeMillis() - j5 > b.l(j4)) {
                        resultError = new ResultError(CommonResultKt.a(error));
                        commonResult = resultError;
                        list = (List) CommonResultKt.b(commonResult);
                        if (list != null) {
                            listB0 = CollectionsKt.b0(i6, list);
                        } else {
                            listB0 = null;
                        }
                        if (listB0 == null) {
                            listB0 = C5653o60.d;
                        }
                        arrayListF0 = CollectionsKt.f0(listB0);
                        String str7 = i12.a.l;
                        c5520nU1.d = arrayListF0;
                        c5520nU1.e = null;
                        c5520nU1.g = null;
                        c5520nU1.h = i6;
                        c5520nU1.q = 3;
                        objB = c5730oU1.b(str7, c5520nU1);
                        if (objB != mn) {
                            list2 = arrayListF0;
                            obj2 = objB;
                            i7 = i6;
                        }
                    } else {
                        b.s(j7);
                        c5520nU1.d = c5730oU1;
                        c5520nU1.e = i12;
                        c5520nU1.g = error;
                        c5520nU1.h = i6;
                        c5520nU1.k = j6;
                        c5520nU1.i = i5;
                        long j20 = j6;
                        long j21 = j4;
                        c5520nU1.l = j21;
                        c5520nU1.m = j5;
                        c5520nU1.n = j7;
                        c5520nU1.j = i3;
                        i20 = 2;
                        c5520nU1.q = 2;
                        if (IW.c(j7, c5520nU1) != mn) {
                            int i21 = i5;
                            commonError = error;
                            i11 = i12;
                            i4 = i6;
                            j16 = j21;
                            j3 = j20;
                            j18 = j5;
                            i2 = i21;
                            jQ = b.q(i20, j7);
                            j2 = j16;
                            j = j18;
                            c5520nU1.d = c5730oU1;
                            c5520nU1.e = i11;
                            c5520nU1.g = commonError;
                            c5520nU1.h = i4;
                            c5520nU1.k = j3;
                            c5520nU1.i = i2;
                            c5520nU1.l = j2;
                            c5520nU1.m = j;
                            c5520nU1.n = jQ;
                            c5520nU1.j = i3;
                            i8 = i4;
                            c5520nU1.q = 1;
                            String strF3 = c5730oU1.d.f(i11);
                            C4923kf c4923kf3 = c5730oU1.c;
                            c5520nU2 = c5520nU1;
                            l = (Long) c4923kf3.y.getValue();
                            if (l != null) {
                                jCurrentTimeMillis = l.longValue();
                            } else {
                                jCurrentTimeMillis = System.currentTimeMillis();
                            }
                            j8 = jQ;
                            long j110 = CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT;
                            b.a aVar4 = b.e;
                            long jR3 = (jCurrentTimeMillis / j110) - (((long) (i8 + 1)) * b.r(i11.b, R40.SECONDS));
                            l2 = (Long) c4923kf3.y.getValue();
                            if (l2 != null) {
                                jCurrentTimeMillis2 = l2.longValue();
                            } else {
                                jCurrentTimeMillis2 = System.currentTimeMillis();
                            }
                            objC = c5730oU1.b.c(strF3, jCurrentTimeMillis2 / j110, jR3, c5520nU2);
                            if (objC != mn) {
                                i12 = i11;
                                obj = objC;
                                c5520nU1 = c5520nU2;
                                j7 = j8;
                                i6 = i8;
                                j4 = j2;
                                j6 = j3;
                                commonError2 = commonError;
                                i5 = i2;
                                j5 = j;
                                commonResult = (CommonResult) obj;
                                i3++;
                                if (commonResult instanceof ResultOk) {
                                    if (commonResult instanceof ResultError) {
                                        error = ((ResultError) commonResult).getError();
                                    } else {
                                        error = commonError2;
                                    }
                                    if (b.f(j7, j6) < 0) {
                                        resultError = new ResultError(CommonResultKt.a(error));
                                        commonResult = resultError;
                                        list = (List) CommonResultKt.b(commonResult);
                                        if (list != null) {
                                            listB0 = CollectionsKt.b0(i6, list);
                                        } else {
                                            listB0 = null;
                                        }
                                        if (listB0 == null) {
                                            listB0 = C5653o60.d;
                                        }
                                        arrayListF0 = CollectionsKt.f0(listB0);
                                        String str8 = i12.a.l;
                                        c5520nU1.d = arrayListF0;
                                        c5520nU1.e = null;
                                        c5520nU1.g = null;
                                        c5520nU1.h = i6;
                                        c5520nU1.q = 3;
                                        objB = c5730oU1.b(str8, c5520nU1);
                                        if (objB != mn) {
                                            list2 = arrayListF0;
                                            obj2 = objB;
                                            i7 = i6;
                                        }
                                    } else {
                                        resultError = new ResultError(CommonResultKt.a(error));
                                        commonResult = resultError;
                                        list = (List) CommonResultKt.b(commonResult);
                                        if (list != null) {
                                            listB0 = CollectionsKt.b0(i6, list);
                                        } else {
                                            listB0 = null;
                                        }
                                        if (listB0 == null) {
                                            listB0 = C5653o60.d;
                                        }
                                        arrayListF0 = CollectionsKt.f0(listB0);
                                        String str9 = i12.a.l;
                                        c5520nU1.d = arrayListF0;
                                        c5520nU1.e = null;
                                        c5520nU1.g = null;
                                        c5520nU1.h = i6;
                                        c5520nU1.q = 3;
                                        objB = c5730oU1.b(str9, c5520nU1);
                                        if (objB != mn) {
                                            list2 = arrayListF0;
                                            obj2 = objB;
                                            i7 = i6;
                                        }
                                    }
                                } else {
                                    list = (List) CommonResultKt.b(commonResult);
                                    if (list != null) {
                                        listB0 = CollectionsKt.b0(i6, list);
                                    } else {
                                        listB0 = null;
                                    }
                                    if (listB0 == null) {
                                        listB0 = C5653o60.d;
                                    }
                                    arrayListF0 = CollectionsKt.f0(listB0);
                                    String str10 = i12.a.l;
                                    c5520nU1.d = arrayListF0;
                                    c5520nU1.e = null;
                                    c5520nU1.g = null;
                                    c5520nU1.h = i6;
                                    c5520nU1.q = 3;
                                    objB = c5730oU1.b(str10, c5520nU1);
                                    if (objB != mn) {
                                        list2 = arrayListF0;
                                        obj2 = objB;
                                        i7 = i6;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    list = (List) CommonResultKt.b(commonResult);
                    if (list != null) {
                        listB0 = CollectionsKt.b0(i6, list);
                    } else {
                        listB0 = null;
                    }
                    if (listB0 == null) {
                        listB0 = C5653o60.d;
                    }
                    arrayListF0 = CollectionsKt.f0(listB0);
                    String str11 = i12.a.l;
                    c5520nU1.d = arrayListF0;
                    c5520nU1.e = null;
                    c5520nU1.g = null;
                    c5520nU1.h = i6;
                    c5520nU1.q = 3;
                    objB = c5730oU1.b(str11, c5520nU1);
                    if (objB != mn) {
                        list2 = arrayListF0;
                        obj2 = objB;
                        i7 = i6;
                    }
                }
            }
            return mn;
        }
        if (i13 != 3) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i7 = c5520nU1.h;
        list2 = (List) c5520nU1.d;
        C1795Pt1.b(obj2);
        return new C5097lU1(new C5310mU1((InterfaceC6396rf0) obj2, list2, i7), i7);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC4209hU1
    @Nullable
    public final Object b(@NotNull String assetId, @NotNull LM lm) {
        C4887kU1 c4887kU1;
        if (lm instanceof C4887kU1) {
            c4887kU1 = (C4887kU1) lm;
            int i = c4887kU1.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4887kU1.h = i - Integer.MIN_VALUE;
            } else {
                c4887kU1 = new C4887kU1(this, lm);
            }
        } else {
            c4887kU1 = new C4887kU1(this, lm);
        }
        Object obj = c4887kU1.e;
        Object obj2 = MN.d;
        int i2 = c4887kU1.h;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            Intrinsics.checkNotNullParameter(assetId, "assetId");
            c4887kU1.d = assetId;
            c4887kU1.h = 1;
            this.a.getClass();
            obj = C5020l60.d;
            if (obj == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            assetId = c4887kU1.d;
            C1795Pt1.b(obj);
        }
        int i3 = 2;
        return new C6339rO(new C6759tO(CommonResultKt.c((InterfaceC6396rf0) obj, "graphic.value_updates"), i3), assetId, i3);
    }
}
