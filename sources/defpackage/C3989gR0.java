package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonError;
import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.core.backend.domain.models.resultModels.CommonResultKt;
import com.api.core.backend.domain.models.resultModels.ResultError;
import com.api.core.backend.domain.models.resultModels.ResultOk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlin.time.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: gR0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3989gR0 implements InterfaceC3360dR0 {
    public static final long j;

    @NotNull
    public final C4923kf a;

    @NotNull
    public final InterfaceC4209hU1 b;

    @NotNull
    public final A92 c;

    @NotNull
    public final InterfaceC6444rs1 d;

    @NotNull
    public final C6038px e;

    @NotNull
    public final InterfaceC4862kM0 f;

    @Nullable
    public String g;

    @NotNull
    public final GP1 h;

    @NotNull
    public final C1699On1 i;

    static {
        b.a aVar = b.e;
        j = c.g(60, R40.SECONDS);
    }

    public C3989gR0(@NotNull C4923kf appData, @NotNull InterfaceC4209hU1 subscribeToValueUpdatesUseCase, @NotNull A92 unsubscribeFromValueUpdatesUseCase, @NotNull InterfaceC6444rs1 requestCandlesHistoryUseCase, @NotNull C6038px cachedCandlesProvider, @NotNull InterfaceC4862kM0 lastCandleIdProvider) {
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(subscribeToValueUpdatesUseCase, "subscribeToValueUpdatesUseCase");
        Intrinsics.checkNotNullParameter(unsubscribeFromValueUpdatesUseCase, "unsubscribeFromValueUpdatesUseCase");
        Intrinsics.checkNotNullParameter(requestCandlesHistoryUseCase, "requestCandlesHistoryUseCase");
        Intrinsics.checkNotNullParameter(cachedCandlesProvider, "cachedCandlesProvider");
        Intrinsics.checkNotNullParameter(lastCandleIdProvider, "lastCandleIdProvider");
        this.a = appData;
        this.b = subscribeToValueUpdatesUseCase;
        this.c = unsubscribeFromValueUpdatesUseCase;
        this.d = requestCandlesHistoryUseCase;
        this.e = cachedCandlesProvider;
        this.f = lastCandleIdProvider;
        GP1 gp1I = C1589Ne.i(AbstractC7721xy.a.a);
        this.h = gp1I;
        this.i = C4466ii.f(gp1I);
    }

    @Override // defpackage.InterfaceC3360dR0
    public final void a() {
        this.h.setValue(AbstractC7721xy.a.a);
    }

    @Override // defpackage.InterfaceC3360dR0
    @NotNull
    public final C1699On1 b() {
        return this.i;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0163  */
    /* JADX WARN: Code duplicated, block: B:24:0x016c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0187  */
    /* JADX WARN: Code duplicated, block: B:28:0x018d  */
    /* JADX WARN: Code duplicated, block: B:31:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:33:0x01be  */
    /* JADX WARN: Code duplicated, block: B:37:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:41:0x0235  */
    /* JADX WARN: Code duplicated, block: B:44:0x0252  */
    /* JADX WARN: Code duplicated, block: B:45:0x0278  */
    /* JADX WARN: Code duplicated, block: B:47:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:48:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:52:0x0307  */
    /* JADX WARN: Code duplicated, block: B:54:0x030c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0310  */
    /* JADX WARN: Code duplicated, block: B:57:0x0317  */
    /* JADX WARN: Code duplicated, block: B:60:0x031f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:73:0x039a  */
    /* JADX WARN: Code duplicated, block: B:75:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:78:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x03d3 A[LOOP:0: B:76:0x03c3->B:80:0x03d3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:86:0x0408  */
    /* JADX WARN: Code duplicated, block: B:91:0x03e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, l60] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x0365 -> B:14:0x0064). Please report as a decompilation issue!!! */
    @Override // defpackage.InterfaceC3360dR0
    @Nullable
    public final Object c(@NotNull String str, @NotNull LM lm) {
        C3569eR0 c3569eR0;
        C3989gR0 c3989gR0;
        long jCurrentTimeMillis;
        C3027bp1 c3027bp1;
        MN mn;
        long j2;
        CommonError commonError;
        String str2;
        long j3;
        long jQ;
        C3989gR0 c3989gR1;
        int i;
        int i2;
        int i3;
        C3989gR0 c3989gR2;
        MN mn2;
        String str3;
        int i4;
        int i5;
        C3989gR0 c3989gR3;
        C3027bp1 c3027bp2;
        T t;
        MN mn3;
        String str4;
        int i6;
        Object obj;
        MN mn4;
        C3569eR0 c3569eR1;
        long j4;
        CommonError commonError2;
        long j5;
        long j6;
        long j7;
        C3989gR0 c3989gR4;
        String str5;
        int i7;
        C3027bp1 c3027bp3;
        long j8;
        long j9;
        long j10;
        int i8;
        long j11;
        CommonError commonError3;
        String str6;
        int i9;
        C3027bp1 c3027bp4;
        Object obj2;
        CommonError commonError4;
        CommonResult resultError;
        C3989gR0 c3989gR5;
        long j12;
        long j13;
        long j14;
        long j15;
        CF cf;
        long j16;
        long j17;
        String str7;
        long j18;
        C3027bp1 c3027bp5;
        CommonError commonError5;
        long j19;
        Object objB;
        long j20;
        C3027bp1 c3027bp6;
        int i10;
        Object objB2;
        MN mn5;
        int i11;
        int i12;
        Object objB3;
        MN mn6;
        CommonError error;
        CommonResult resultError2;
        MN mn7;
        int i13;
        C3569eR0 c3569eR2;
        C3989gR0 c3989gR6;
        CommonError commonError6;
        int i14;
        C3027bp1 c3027bp7;
        long j21;
        ResultOk resultOk;
        float size;
        ArrayList arrayList;
        int i15;
        AbstractC8109zn0 abstractC8109zn0;
        C3779fR0 c3779fR0;
        C3027bp1 c3027bp8;
        int i16;
        EnumC3495e41 enumC3495e41;
        String str8;
        int i17;
        String str9;
        Object objA;
        if (lm instanceof C3569eR0) {
            c3569eR0 = (C3569eR0) lm;
            int i18 = c3569eR0.r;
            if ((i18 & Integer.MIN_VALUE) != 0) {
                c3569eR0.r = i18 - Integer.MIN_VALUE;
                c3989gR0 = this;
            } else {
                c3989gR0 = this;
                c3569eR0 = new C3569eR0(c3989gR0, lm);
            }
        } else {
            c3989gR0 = this;
            c3569eR0 = new C3569eR0(c3989gR0, lm);
        }
        Object obj3 = c3569eR0.p;
        MN mn8 = MN.d;
        switch (c3569eR0.r) {
            case 0:
                C3027bp1 c3027bp1B = C4564j.b(obj3);
                c3027bp1B.d = C5020l60.d;
                b.a aVar = b.e;
                long jG = c.g(20, R40.MILLISECONDS);
                b.e.getClass();
                long j22 = b.g;
                jCurrentTimeMillis = System.currentTimeMillis();
                c3027bp1 = c3027bp1B;
                mn = mn8;
                j2 = j;
                commonError = null;
                str2 = str;
                j3 = j22;
                jQ = jG;
                c3989gR1 = c3989gR0;
                i = 0;
                i2 = 1;
                enumC3495e41 = (EnumC3495e41) c3989gR1.a.r.getValue();
                if (enumC3495e41 != null) {
                    i9 = i;
                    if (C7652xe.g(enumC3495e41)) {
                        resultError = new ResultOk(C5653o60.d);
                        long j23 = j3;
                        j12 = jQ;
                        j14 = j23;
                        long j24 = j2;
                        j13 = jCurrentTimeMillis;
                        j15 = j24;
                        commonError4 = commonError;
                        mn8 = mn;
                        str6 = str2;
                        c3989gR5 = c3989gR1;
                    }
                    int i19 = i9 + 1;
                    mn6 = mn8;
                    if (!(resultError instanceof ResultOk)) {
                        if (resultError instanceof ResultError) {
                            error = ((ResultError) resultError).getError();
                        } else {
                            error = commonError4;
                        }
                        if (b.f(j12, j15) < 0 || i19 == i2) {
                            resultError2 = new ResultError(CommonResultKt.a(error));
                        } else if (System.currentTimeMillis() - j13 > b.l(j14)) {
                            resultError2 = new ResultError(CommonResultKt.a(error));
                        } else {
                            b.s(j12);
                            c3569eR0.d = c3989gR5;
                            c3569eR0.e = str6;
                            c3569eR0.g = c3027bp1;
                            c3569eR0.h = error;
                            c3569eR0.j = j15;
                            c3569eR0.n = i2;
                            c3569eR0.k = j14;
                            c3569eR0.l = j13;
                            c3569eR0.m = j12;
                            c3569eR0.o = i19;
                            c3569eR0.r = 5;
                            CommonError commonError7 = error;
                            mn7 = mn6;
                            if (IW.c(j12, c3569eR0) == mn7) {
                                return mn7;
                            }
                            long j25 = j13;
                            j2 = j15;
                            jCurrentTimeMillis = j25;
                            i13 = i2;
                            c3569eR2 = c3569eR0;
                            c3989gR6 = c3989gR5;
                            str2 = str6;
                            long j26 = j14;
                            commonError6 = commonError7;
                            i14 = i19;
                            c3027bp7 = c3027bp1;
                            j21 = j26;
                            mn = mn7;
                            c3989gR1 = c3989gR6;
                            c3569eR0 = c3569eR2;
                            i2 = i13;
                            i = i14;
                            long j27 = j21;
                            c3027bp1 = c3027bp7;
                            commonError = commonError6;
                            jQ = b.q(2, j12);
                            j3 = j27;
                            enumC3495e41 = (EnumC3495e41) c3989gR1.a.r.getValue();
                            if (enumC3495e41 != null) {
                                i9 = i;
                                if (C7652xe.g(enumC3495e41)) {
                                    resultError = new ResultOk(C5653o60.d);
                                    long j28 = j3;
                                    j12 = jQ;
                                    j14 = j28;
                                    long j29 = j2;
                                    j13 = jCurrentTimeMillis;
                                    j15 = j29;
                                    commonError4 = commonError;
                                    mn8 = mn;
                                    str6 = str2;
                                    c3989gR5 = c3989gR1;
                                }
                                int i110 = i9 + 1;
                                mn6 = mn8;
                                if (!(resultError instanceof ResultOk)) {
                                    if (resultError instanceof ResultError) {
                                        error = ((ResultError) resultError).getError();
                                    } else {
                                        error = commonError4;
                                    }
                                    if (b.f(j12, j15) < 0) {
                                    }
                                    resultError2 = new ResultError(CommonResultKt.a(error));
                                } else {
                                    resultError2 = resultError;
                                }
                            } else {
                                i9 = i;
                            }
                        }
                        if (resultError2 instanceof ResultOk) {
                            resultOk = (ResultOk) resultError2;
                            if (!((Collection) resultOk.a()).isEmpty()) {
                                List list = (List) resultOk.a();
                                size = list.size();
                                arrayList = new ArrayList(XE.m(list, 10));
                                i15 = 0;
                                for (Object obj4 : list) {
                                    i16 = i15 + 1;
                                    if (i15 >= 0) {
                                        WE.l();
                                        throw null;
                                    }
                                    arrayList.add(new C3506e70((i15 - size) * 1000, ((BF) obj4).c));
                                    i15 = i16;
                                }
                                RV rv = C6266r20.a;
                                abstractC8109zn0 = QV0.a;
                                c3779fR0 = new C3779fR0(c3989gR5, arrayList, null);
                                c3569eR0.d = c3027bp1;
                                c3569eR0.e = null;
                                c3569eR0.g = null;
                                c3569eR0.h = null;
                                c3569eR0.r = 6;
                                if (C5189lv.p(abstractC8109zn0, c3779fR0, c3569eR0) == mn6) {
                                    return mn6;
                                }
                                c3027bp8 = c3027bp1;
                                c3027bp1 = c3027bp8;
                            }
                        }
                        return c3027bp1.d;
                    }
                    resultError2 = resultError;
                    if (resultError2 instanceof ResultOk) {
                        resultOk = (ResultOk) resultError2;
                        if (!((Collection) resultOk.a()).isEmpty()) {
                            List list2 = (List) resultOk.a();
                            size = list2.size();
                            arrayList = new ArrayList(XE.m(list2, 10));
                            i15 = 0;
                            while (r2.hasNext()) {
                                i16 = i15 + 1;
                                if (i15 >= 0) {
                                    WE.l();
                                    throw null;
                                }
                                arrayList.add(new C3506e70((i15 - size) * 1000, ((BF) obj4).c));
                                i15 = i16;
                            }
                            RV rv2 = C6266r20.a;
                            abstractC8109zn0 = QV0.a;
                            c3779fR0 = new C3779fR0(c3989gR5, arrayList, null);
                            c3569eR0.d = c3027bp1;
                            c3569eR0.e = null;
                            c3569eR0.g = null;
                            c3569eR0.h = null;
                            c3569eR0.r = 6;
                            if (C5189lv.p(abstractC8109zn0, c3779fR0, c3569eR0) == mn6) {
                                return mn6;
                            }
                            c3027bp8 = c3027bp1;
                            c3027bp1 = c3027bp8;
                        }
                    }
                    return c3027bp1.d;
                }
                i9 = i;
                str8 = c3989gR1.g;
                if (str8 != null) {
                    c3569eR0.d = c3989gR1;
                    c3569eR0.e = str2;
                    c3569eR0.g = c3027bp1;
                    c3569eR0.h = commonError;
                    c3569eR0.j = j2;
                    c3569eR0.n = i2;
                    c3569eR0.k = j3;
                    c3569eR0.l = jCurrentTimeMillis;
                    c3569eR0.m = jQ;
                    i17 = i9;
                    c3569eR0.o = i17;
                    str9 = str2;
                    c3569eR0.r = 1;
                    objA = c3989gR1.c.a(str8, c3569eR0);
                    mn2 = mn;
                    if (objA == mn2) {
                        return mn2;
                    }
                    c3989gR2 = c3989gR1;
                    str3 = str9;
                    i3 = i17;
                    Unit unit = Unit.a;
                    i11 = i3;
                } else {
                    mn2 = mn;
                    i11 = i9;
                    String str10 = str2;
                    c3989gR2 = c3989gR1;
                    str3 = str10;
                }
                c3989gR2.g = str3;
                c3569eR0.d = c3989gR2;
                c3569eR0.e = str3;
                c3569eR0.g = c3027bp1;
                c3569eR0.h = commonError;
                c3569eR0.i = c3027bp1;
                c3569eR0.j = j2;
                c3569eR0.n = i2;
                c3569eR0.k = j3;
                c3569eR0.l = jCurrentTimeMillis;
                c3569eR0.m = jQ;
                c3569eR0.o = i11;
                i12 = i2;
                c3569eR0.r = 2;
                objB3 = c3989gR2.b.b(str3, c3569eR0);
                if (objB3 == mn2) {
                    return mn2;
                }
                i5 = i11;
                str4 = str3;
                c3989gR3 = c3989gR2;
                t = objB3;
                i4 = i12;
                mn3 = mn2;
                c3027bp2 = c3027bp1;
                c3027bp1.d = t;
                InterfaceC6396rf0 interfaceC6396rf0 = (InterfaceC6396rf0) c3027bp2.d;
                j20 = jQ;
                long j30 = Fg2.v;
                c3569eR0.d = c3989gR3;
                c3569eR0.e = str4;
                c3569eR0.g = c3027bp2;
                c3569eR0.h = commonError;
                c3569eR0.i = null;
                c3569eR0.j = j2;
                c3569eR0.n = i4;
                c3569eR0.k = j3;
                c3569eR0.l = jCurrentTimeMillis;
                c3027bp6 = c3027bp2;
                c3989gR4 = c3989gR3;
                c3569eR0.m = j20;
                i10 = i5;
                c3569eR0.o = i10;
                c3569eR0.r = 3;
                objB2 = C7236vf0.b(interfaceC6396rf0, j30, new C2483Yf(2), c3569eR0);
                mn5 = mn3;
                if (objB2 == mn5) {
                    return mn5;
                }
                long j31 = j3;
                c3027bp3 = c3027bp6;
                obj = objB2;
                str5 = str4;
                j6 = j31;
                long j32 = j2;
                j5 = jCurrentTimeMillis;
                j7 = j32;
                mn4 = mn5;
                c3569eR1 = c3569eR0;
                commonError2 = commonError;
                i6 = i10;
                i7 = i4;
                j4 = j20;
                cf = (CF) obj;
                if (cf == null) {
                    i9 = i6;
                    long j33 = j4;
                    resultError = new ResultError(new CommonError.OtherError(null, 0, 3, 0 == true ? 1 : 0));
                    j13 = j5;
                    commonError4 = commonError2;
                    c3569eR0 = c3569eR1;
                    i2 = i7;
                    str6 = str5;
                    j15 = j7;
                    c3989gR5 = c3989gR4;
                    j14 = j6;
                    c3027bp1 = c3027bp3;
                    mn8 = mn4;
                    j12 = j33;
                } else {
                    i9 = i6;
                    j16 = j4;
                    j17 = j5;
                    c3989gR4.f.a(cf.d);
                    long jLongValue = ((Number) c3989gR4.f.b().d.getValue()).longValue();
                    c3569eR1.d = c3989gR4;
                    c3569eR1.e = str5;
                    c3569eR1.g = c3027bp3;
                    c3569eR1.h = commonError2;
                    c3569eR1.j = j7;
                    c3569eR1.n = i7;
                    c3569eR1.k = j6;
                    c3569eR1.l = j17;
                    c3569eR1.m = j16;
                    str7 = str5;
                    c3569eR1.o = i9;
                    c3569eR1.r = 4;
                    long j34 = jLongValue - ((long) 900);
                    j18 = j6;
                    c3027bp5 = c3027bp3;
                    commonError5 = commonError2;
                    j19 = j7;
                    objB = c3989gR4.d.b(str7, jLongValue, j34, c3569eR1);
                    mn8 = mn4;
                    if (objB == mn8) {
                        return mn8;
                    }
                    i8 = i7;
                    j10 = j18;
                    str6 = str7;
                    j9 = j17;
                    commonError3 = commonError5;
                    c3027bp4 = c3027bp5;
                    obj2 = objB;
                    j8 = j16;
                    c3569eR0 = c3569eR1;
                    j11 = j19;
                    commonError4 = commonError3;
                    long j35 = j8;
                    resultError = (CommonResult) obj2;
                    c3989gR5 = c3989gR4;
                    c3027bp1 = c3027bp4;
                    i2 = i8;
                    j12 = j35;
                    j13 = j9;
                    j14 = j10;
                    j15 = j11;
                }
                int i111 = i9 + 1;
                mn6 = mn8;
                if (!(resultError instanceof ResultOk)) {
                    if (resultError instanceof ResultError) {
                        error = ((ResultError) resultError).getError();
                    } else {
                        error = commonError4;
                    }
                    if (b.f(j12, j15) < 0) {
                    }
                    resultError2 = new ResultError(CommonResultKt.a(error));
                    if (resultError2 instanceof ResultOk) {
                        resultOk = (ResultOk) resultError2;
                        if (!((Collection) resultOk.a()).isEmpty()) {
                            List list3 = (List) resultOk.a();
                            size = list3.size();
                            arrayList = new ArrayList(XE.m(list3, 10));
                            i15 = 0;
                            while (r2.hasNext()) {
                                i16 = i15 + 1;
                                if (i15 >= 0) {
                                    WE.l();
                                    throw null;
                                }
                                arrayList.add(new C3506e70((i15 - size) * 1000, ((BF) obj4).c));
                                i15 = i16;
                            }
                            RV rv3 = C6266r20.a;
                            abstractC8109zn0 = QV0.a;
                            c3779fR0 = new C3779fR0(c3989gR5, arrayList, null);
                            c3569eR0.d = c3027bp1;
                            c3569eR0.e = null;
                            c3569eR0.g = null;
                            c3569eR0.h = null;
                            c3569eR0.r = 6;
                            if (C5189lv.p(abstractC8109zn0, c3779fR0, c3569eR0) == mn6) {
                                return mn6;
                            }
                            c3027bp8 = c3027bp1;
                            c3027bp1 = c3027bp8;
                        }
                    }
                    return c3027bp1.d;
                }
                resultError2 = resultError;
                if (resultError2 instanceof ResultOk) {
                    resultOk = (ResultOk) resultError2;
                    if (!((Collection) resultOk.a()).isEmpty()) {
                        List list4 = (List) resultOk.a();
                        size = list4.size();
                        arrayList = new ArrayList(XE.m(list4, 10));
                        i15 = 0;
                        while (r2.hasNext()) {
                            i16 = i15 + 1;
                            if (i15 >= 0) {
                                WE.l();
                                throw null;
                            }
                            arrayList.add(new C3506e70((i15 - size) * 1000, ((BF) obj4).c));
                            i15 = i16;
                        }
                        RV rv4 = C6266r20.a;
                        abstractC8109zn0 = QV0.a;
                        c3779fR0 = new C3779fR0(c3989gR5, arrayList, null);
                        c3569eR0.d = c3027bp1;
                        c3569eR0.e = null;
                        c3569eR0.g = null;
                        c3569eR0.h = null;
                        c3569eR0.r = 6;
                        if (C5189lv.p(abstractC8109zn0, c3779fR0, c3569eR0) == mn6) {
                            return mn6;
                        }
                        c3027bp8 = c3027bp1;
                        c3027bp1 = c3027bp8;
                    }
                }
                return c3027bp1.d;
            case 1:
                int i20 = c3569eR0.o;
                long j36 = c3569eR0.m;
                long j37 = c3569eR0.l;
                long j38 = c3569eR0.k;
                int i21 = c3569eR0.n;
                long j39 = c3569eR0.j;
                CommonError commonError8 = c3569eR0.h;
                c3027bp1 = c3569eR0.g;
                String str11 = c3569eR0.e;
                i3 = i20;
                c3989gR2 = (C3989gR0) c3569eR0.d;
                C1795Pt1.b(obj3);
                i2 = i21;
                mn2 = mn8;
                str3 = str11;
                commonError = commonError8;
                j2 = j39;
                j3 = j38;
                jCurrentTimeMillis = j37;
                jQ = j36;
                Unit unit2 = Unit.a;
                i11 = i3;
                c3989gR2.g = str3;
                c3569eR0.d = c3989gR2;
                c3569eR0.e = str3;
                c3569eR0.g = c3027bp1;
                c3569eR0.h = commonError;
                c3569eR0.i = c3027bp1;
                c3569eR0.j = j2;
                c3569eR0.n = i2;
                c3569eR0.k = j3;
                c3569eR0.l = jCurrentTimeMillis;
                c3569eR0.m = jQ;
                c3569eR0.o = i11;
                i12 = i2;
                c3569eR0.r = 2;
                objB3 = c3989gR2.b.b(str3, c3569eR0);
                if (objB3 == mn2) {
                    return mn2;
                }
                i5 = i11;
                str4 = str3;
                c3989gR3 = c3989gR2;
                t = objB3;
                i4 = i12;
                mn3 = mn2;
                c3027bp2 = c3027bp1;
                c3027bp1.d = t;
                InterfaceC6396rf0 interfaceC6396rf1 = (InterfaceC6396rf0) c3027bp2.d;
                j20 = jQ;
                long j310 = Fg2.v;
                c3569eR0.d = c3989gR3;
                c3569eR0.e = str4;
                c3569eR0.g = c3027bp2;
                c3569eR0.h = commonError;
                c3569eR0.i = null;
                c3569eR0.j = j2;
                c3569eR0.n = i4;
                c3569eR0.k = j3;
                c3569eR0.l = jCurrentTimeMillis;
                c3027bp6 = c3027bp2;
                c3989gR4 = c3989gR3;
                c3569eR0.m = j20;
                i10 = i5;
                c3569eR0.o = i10;
                c3569eR0.r = 3;
                objB2 = C7236vf0.b(interfaceC6396rf1, j310, new C2483Yf(2), c3569eR0);
                mn5 = mn3;
                if (objB2 == mn5) {
                    return mn5;
                }
                long j311 = j3;
                c3027bp3 = c3027bp6;
                obj = objB2;
                str5 = str4;
                j6 = j311;
                long j312 = j2;
                j5 = jCurrentTimeMillis;
                j7 = j312;
                mn4 = mn5;
                c3569eR1 = c3569eR0;
                commonError2 = commonError;
                i6 = i10;
                i7 = i4;
                j4 = j20;
                cf = (CF) obj;
                if (cf == null) {
                    i9 = i6;
                    long j313 = j4;
                    resultError = new ResultError(new CommonError.OtherError(null, 0, 3, 0 == true ? 1 : 0));
                    j13 = j5;
                    commonError4 = commonError2;
                    c3569eR0 = c3569eR1;
                    i2 = i7;
                    str6 = str5;
                    j15 = j7;
                    c3989gR5 = c3989gR4;
                    j14 = j6;
                    c3027bp1 = c3027bp3;
                    mn8 = mn4;
                    j12 = j313;
                } else {
                    i9 = i6;
                    j16 = j4;
                    j17 = j5;
                    c3989gR4.f.a(cf.d);
                    long jLongValue2 = ((Number) c3989gR4.f.b().d.getValue()).longValue();
                    c3569eR1.d = c3989gR4;
                    c3569eR1.e = str5;
                    c3569eR1.g = c3027bp3;
                    c3569eR1.h = commonError2;
                    c3569eR1.j = j7;
                    c3569eR1.n = i7;
                    c3569eR1.k = j6;
                    c3569eR1.l = j17;
                    c3569eR1.m = j16;
                    str7 = str5;
                    c3569eR1.o = i9;
                    c3569eR1.r = 4;
                    long j314 = jLongValue2 - ((long) 900);
                    j18 = j6;
                    c3027bp5 = c3027bp3;
                    commonError5 = commonError2;
                    j19 = j7;
                    objB = c3989gR4.d.b(str7, jLongValue2, j314, c3569eR1);
                    mn8 = mn4;
                    if (objB == mn8) {
                        return mn8;
                    }
                    i8 = i7;
                    j10 = j18;
                    str6 = str7;
                    j9 = j17;
                    commonError3 = commonError5;
                    c3027bp4 = c3027bp5;
                    obj2 = objB;
                    j8 = j16;
                    c3569eR0 = c3569eR1;
                    j11 = j19;
                    commonError4 = commonError3;
                    long j315 = j8;
                    resultError = (CommonResult) obj2;
                    c3989gR5 = c3989gR4;
                    c3027bp1 = c3027bp4;
                    i2 = i8;
                    j12 = j315;
                    j13 = j9;
                    j14 = j10;
                    j15 = j11;
                }
                int i112 = i9 + 1;
                mn6 = mn8;
                if (!(resultError instanceof ResultOk)) {
                    if (resultError instanceof ResultError) {
                        error = ((ResultError) resultError).getError();
                    } else {
                        error = commonError4;
                    }
                    if (b.f(j12, j15) < 0) {
                    }
                    resultError2 = new ResultError(CommonResultKt.a(error));
                    if (resultError2 instanceof ResultOk) {
                        resultOk = (ResultOk) resultError2;
                        if (!((Collection) resultOk.a()).isEmpty()) {
                            List list5 = (List) resultOk.a();
                            size = list5.size();
                            arrayList = new ArrayList(XE.m(list5, 10));
                            i15 = 0;
                            while (r2.hasNext()) {
                                i16 = i15 + 1;
                                if (i15 >= 0) {
                                    WE.l();
                                    throw null;
                                }
                                arrayList.add(new C3506e70((i15 - size) * 1000, ((BF) obj4).c));
                                i15 = i16;
                            }
                            RV rv5 = C6266r20.a;
                            abstractC8109zn0 = QV0.a;
                            c3779fR0 = new C3779fR0(c3989gR5, arrayList, null);
                            c3569eR0.d = c3027bp1;
                            c3569eR0.e = null;
                            c3569eR0.g = null;
                            c3569eR0.h = null;
                            c3569eR0.r = 6;
                            if (C5189lv.p(abstractC8109zn0, c3779fR0, c3569eR0) == mn6) {
                                return mn6;
                            }
                            c3027bp8 = c3027bp1;
                            c3027bp1 = c3027bp8;
                        }
                    }
                    return c3027bp1.d;
                }
                resultError2 = resultError;
                if (resultError2 instanceof ResultOk) {
                    resultOk = (ResultOk) resultError2;
                    if (!((Collection) resultOk.a()).isEmpty()) {
                        List list6 = (List) resultOk.a();
                        size = list6.size();
                        arrayList = new ArrayList(XE.m(list6, 10));
                        i15 = 0;
                        while (r2.hasNext()) {
                            i16 = i15 + 1;
                            if (i15 >= 0) {
                                WE.l();
                                throw null;
                            }
                            arrayList.add(new C3506e70((i15 - size) * 1000, ((BF) obj4).c));
                            i15 = i16;
                        }
                        RV rv6 = C6266r20.a;
                        abstractC8109zn0 = QV0.a;
                        c3779fR0 = new C3779fR0(c3989gR5, arrayList, null);
                        c3569eR0.d = c3027bp1;
                        c3569eR0.e = null;
                        c3569eR0.g = null;
                        c3569eR0.h = null;
                        c3569eR0.r = 6;
                        if (C5189lv.p(abstractC8109zn0, c3779fR0, c3569eR0) == mn6) {
                            return mn6;
                        }
                        c3027bp8 = c3027bp1;
                        c3027bp1 = c3027bp8;
                    }
                }
                return c3027bp1.d;
            case 2:
                int i22 = c3569eR0.o;
                long j40 = c3569eR0.m;
                long j41 = c3569eR0.l;
                long j42 = c3569eR0.k;
                int i23 = c3569eR0.n;
                long j43 = c3569eR0.j;
                C3027bp1 c3027bp9 = c3569eR0.i;
                CommonError commonError9 = c3569eR0.h;
                C3027bp1 c3027bp10 = c3569eR0.g;
                String str12 = c3569eR0.e;
                C3989gR0 c3989gR7 = (C3989gR0) c3569eR0.d;
                C1795Pt1.b(obj3);
                i4 = i23;
                i5 = i22;
                c3989gR3 = c3989gR7;
                c3027bp2 = c3027bp10;
                t = obj3;
                mn3 = mn8;
                commonError = commonError9;
                str4 = str12;
                c3027bp1 = c3027bp9;
                j2 = j43;
                j3 = j42;
                jCurrentTimeMillis = j41;
                jQ = j40;
                c3027bp1.d = t;
                InterfaceC6396rf0 interfaceC6396rf2 = (InterfaceC6396rf0) c3027bp2.d;
                j20 = jQ;
                long j316 = Fg2.v;
                c3569eR0.d = c3989gR3;
                c3569eR0.e = str4;
                c3569eR0.g = c3027bp2;
                c3569eR0.h = commonError;
                c3569eR0.i = null;
                c3569eR0.j = j2;
                c3569eR0.n = i4;
                c3569eR0.k = j3;
                c3569eR0.l = jCurrentTimeMillis;
                c3027bp6 = c3027bp2;
                c3989gR4 = c3989gR3;
                c3569eR0.m = j20;
                i10 = i5;
                c3569eR0.o = i10;
                c3569eR0.r = 3;
                objB2 = C7236vf0.b(interfaceC6396rf2, j316, new C2483Yf(2), c3569eR0);
                mn5 = mn3;
                if (objB2 == mn5) {
                    return mn5;
                }
                long j317 = j3;
                c3027bp3 = c3027bp6;
                obj = objB2;
                str5 = str4;
                j6 = j317;
                long j318 = j2;
                j5 = jCurrentTimeMillis;
                j7 = j318;
                mn4 = mn5;
                c3569eR1 = c3569eR0;
                commonError2 = commonError;
                i6 = i10;
                i7 = i4;
                j4 = j20;
                cf = (CF) obj;
                if (cf == null) {
                    i9 = i6;
                    long j319 = j4;
                    resultError = new ResultError(new CommonError.OtherError(null, 0, 3, 0 == true ? 1 : 0));
                    j13 = j5;
                    commonError4 = commonError2;
                    c3569eR0 = c3569eR1;
                    i2 = i7;
                    str6 = str5;
                    j15 = j7;
                    c3989gR5 = c3989gR4;
                    j14 = j6;
                    c3027bp1 = c3027bp3;
                    mn8 = mn4;
                    j12 = j319;
                } else {
                    i9 = i6;
                    j16 = j4;
                    j17 = j5;
                    c3989gR4.f.a(cf.d);
                    long jLongValue3 = ((Number) c3989gR4.f.b().d.getValue()).longValue();
                    c3569eR1.d = c3989gR4;
                    c3569eR1.e = str5;
                    c3569eR1.g = c3027bp3;
                    c3569eR1.h = commonError2;
                    c3569eR1.j = j7;
                    c3569eR1.n = i7;
                    c3569eR1.k = j6;
                    c3569eR1.l = j17;
                    c3569eR1.m = j16;
                    str7 = str5;
                    c3569eR1.o = i9;
                    c3569eR1.r = 4;
                    long j3110 = jLongValue3 - ((long) 900);
                    j18 = j6;
                    c3027bp5 = c3027bp3;
                    commonError5 = commonError2;
                    j19 = j7;
                    objB = c3989gR4.d.b(str7, jLongValue3, j3110, c3569eR1);
                    mn8 = mn4;
                    if (objB == mn8) {
                        return mn8;
                    }
                    i8 = i7;
                    j10 = j18;
                    str6 = str7;
                    j9 = j17;
                    commonError3 = commonError5;
                    c3027bp4 = c3027bp5;
                    obj2 = objB;
                    j8 = j16;
                    c3569eR0 = c3569eR1;
                    j11 = j19;
                    commonError4 = commonError3;
                    long j3111 = j8;
                    resultError = (CommonResult) obj2;
                    c3989gR5 = c3989gR4;
                    c3027bp1 = c3027bp4;
                    i2 = i8;
                    j12 = j3111;
                    j13 = j9;
                    j14 = j10;
                    j15 = j11;
                }
                int i113 = i9 + 1;
                mn6 = mn8;
                if (!(resultError instanceof ResultOk)) {
                    if (resultError instanceof ResultError) {
                        error = ((ResultError) resultError).getError();
                    } else {
                        error = commonError4;
                    }
                    if (b.f(j12, j15) < 0) {
                    }
                    resultError2 = new ResultError(CommonResultKt.a(error));
                    if (resultError2 instanceof ResultOk) {
                        resultOk = (ResultOk) resultError2;
                        if (!((Collection) resultOk.a()).isEmpty()) {
                            List list7 = (List) resultOk.a();
                            size = list7.size();
                            arrayList = new ArrayList(XE.m(list7, 10));
                            i15 = 0;
                            while (r2.hasNext()) {
                                i16 = i15 + 1;
                                if (i15 >= 0) {
                                    WE.l();
                                    throw null;
                                }
                                arrayList.add(new C3506e70((i15 - size) * 1000, ((BF) obj4).c));
                                i15 = i16;
                            }
                            RV rv7 = C6266r20.a;
                            abstractC8109zn0 = QV0.a;
                            c3779fR0 = new C3779fR0(c3989gR5, arrayList, null);
                            c3569eR0.d = c3027bp1;
                            c3569eR0.e = null;
                            c3569eR0.g = null;
                            c3569eR0.h = null;
                            c3569eR0.r = 6;
                            if (C5189lv.p(abstractC8109zn0, c3779fR0, c3569eR0) == mn6) {
                                return mn6;
                            }
                            c3027bp8 = c3027bp1;
                            c3027bp1 = c3027bp8;
                        }
                    }
                    return c3027bp1.d;
                }
                resultError2 = resultError;
                if (resultError2 instanceof ResultOk) {
                    resultOk = (ResultOk) resultError2;
                    if (!((Collection) resultOk.a()).isEmpty()) {
                        List list8 = (List) resultOk.a();
                        size = list8.size();
                        arrayList = new ArrayList(XE.m(list8, 10));
                        i15 = 0;
                        while (r2.hasNext()) {
                            i16 = i15 + 1;
                            if (i15 >= 0) {
                                WE.l();
                                throw null;
                            }
                            arrayList.add(new C3506e70((i15 - size) * 1000, ((BF) obj4).c));
                            i15 = i16;
                        }
                        RV rv8 = C6266r20.a;
                        abstractC8109zn0 = QV0.a;
                        c3779fR0 = new C3779fR0(c3989gR5, arrayList, null);
                        c3569eR0.d = c3027bp1;
                        c3569eR0.e = null;
                        c3569eR0.g = null;
                        c3569eR0.h = null;
                        c3569eR0.r = 6;
                        if (C5189lv.p(abstractC8109zn0, c3779fR0, c3569eR0) == mn6) {
                            return mn6;
                        }
                        c3027bp8 = c3027bp1;
                        c3027bp1 = c3027bp8;
                    }
                }
                return c3027bp1.d;
            case 3:
                int i24 = c3569eR0.o;
                long j44 = c3569eR0.m;
                long j45 = c3569eR0.l;
                long j46 = c3569eR0.k;
                int i25 = c3569eR0.n;
                long j47 = c3569eR0.j;
                CommonError commonError10 = c3569eR0.h;
                C3027bp1 c3027bp11 = c3569eR0.g;
                String str13 = c3569eR0.e;
                C3989gR0 c3989gR8 = (C3989gR0) c3569eR0.d;
                C1795Pt1.b(obj3);
                i6 = i24;
                obj = obj3;
                mn4 = mn8;
                c3569eR1 = c3569eR0;
                j4 = j44;
                commonError2 = commonError10;
                j5 = j45;
                j6 = j46;
                j7 = j47;
                c3989gR4 = c3989gR8;
                str5 = str13;
                i7 = i25;
                c3027bp3 = c3027bp11;
                cf = (CF) obj;
                if (cf == null) {
                    i9 = i6;
                    long j3112 = j4;
                    resultError = new ResultError(new CommonError.OtherError(null, 0, 3, 0 == true ? 1 : 0));
                    j13 = j5;
                    commonError4 = commonError2;
                    c3569eR0 = c3569eR1;
                    i2 = i7;
                    str6 = str5;
                    j15 = j7;
                    c3989gR5 = c3989gR4;
                    j14 = j6;
                    c3027bp1 = c3027bp3;
                    mn8 = mn4;
                    j12 = j3112;
                } else {
                    i9 = i6;
                    j16 = j4;
                    j17 = j5;
                    c3989gR4.f.a(cf.d);
                    long jLongValue4 = ((Number) c3989gR4.f.b().d.getValue()).longValue();
                    c3569eR1.d = c3989gR4;
                    c3569eR1.e = str5;
                    c3569eR1.g = c3027bp3;
                    c3569eR1.h = commonError2;
                    c3569eR1.j = j7;
                    c3569eR1.n = i7;
                    c3569eR1.k = j6;
                    c3569eR1.l = j17;
                    c3569eR1.m = j16;
                    str7 = str5;
                    c3569eR1.o = i9;
                    c3569eR1.r = 4;
                    long j3113 = jLongValue4 - ((long) 900);
                    j18 = j6;
                    c3027bp5 = c3027bp3;
                    commonError5 = commonError2;
                    j19 = j7;
                    objB = c3989gR4.d.b(str7, jLongValue4, j3113, c3569eR1);
                    mn8 = mn4;
                    if (objB == mn8) {
                        return mn8;
                    }
                    i8 = i7;
                    j10 = j18;
                    str6 = str7;
                    j9 = j17;
                    commonError3 = commonError5;
                    c3027bp4 = c3027bp5;
                    obj2 = objB;
                    j8 = j16;
                    c3569eR0 = c3569eR1;
                    j11 = j19;
                    commonError4 = commonError3;
                    long j3114 = j8;
                    resultError = (CommonResult) obj2;
                    c3989gR5 = c3989gR4;
                    c3027bp1 = c3027bp4;
                    i2 = i8;
                    j12 = j3114;
                    j13 = j9;
                    j14 = j10;
                    j15 = j11;
                }
                int i114 = i9 + 1;
                mn6 = mn8;
                if (!(resultError instanceof ResultOk)) {
                    if (resultError instanceof ResultError) {
                        error = ((ResultError) resultError).getError();
                    } else {
                        error = commonError4;
                    }
                    if (b.f(j12, j15) < 0) {
                    }
                    resultError2 = new ResultError(CommonResultKt.a(error));
                    if (resultError2 instanceof ResultOk) {
                        resultOk = (ResultOk) resultError2;
                        if (!((Collection) resultOk.a()).isEmpty()) {
                            List list9 = (List) resultOk.a();
                            size = list9.size();
                            arrayList = new ArrayList(XE.m(list9, 10));
                            i15 = 0;
                            while (r2.hasNext()) {
                                i16 = i15 + 1;
                                if (i15 >= 0) {
                                    WE.l();
                                    throw null;
                                }
                                arrayList.add(new C3506e70((i15 - size) * 1000, ((BF) obj4).c));
                                i15 = i16;
                            }
                            RV rv9 = C6266r20.a;
                            abstractC8109zn0 = QV0.a;
                            c3779fR0 = new C3779fR0(c3989gR5, arrayList, null);
                            c3569eR0.d = c3027bp1;
                            c3569eR0.e = null;
                            c3569eR0.g = null;
                            c3569eR0.h = null;
                            c3569eR0.r = 6;
                            if (C5189lv.p(abstractC8109zn0, c3779fR0, c3569eR0) == mn6) {
                                return mn6;
                            }
                            c3027bp8 = c3027bp1;
                            c3027bp1 = c3027bp8;
                        }
                    }
                    return c3027bp1.d;
                }
                resultError2 = resultError;
                if (resultError2 instanceof ResultOk) {
                    resultOk = (ResultOk) resultError2;
                    if (!((Collection) resultOk.a()).isEmpty()) {
                        List list10 = (List) resultOk.a();
                        size = list10.size();
                        arrayList = new ArrayList(XE.m(list10, 10));
                        i15 = 0;
                        while (r2.hasNext()) {
                            i16 = i15 + 1;
                            if (i15 >= 0) {
                                WE.l();
                                throw null;
                            }
                            arrayList.add(new C3506e70((i15 - size) * 1000, ((BF) obj4).c));
                            i15 = i16;
                        }
                        RV rv10 = C6266r20.a;
                        abstractC8109zn0 = QV0.a;
                        c3779fR0 = new C3779fR0(c3989gR5, arrayList, null);
                        c3569eR0.d = c3027bp1;
                        c3569eR0.e = null;
                        c3569eR0.g = null;
                        c3569eR0.h = null;
                        c3569eR0.r = 6;
                        if (C5189lv.p(abstractC8109zn0, c3779fR0, c3569eR0) == mn6) {
                            return mn6;
                        }
                        c3027bp8 = c3027bp1;
                        c3027bp1 = c3027bp8;
                    }
                }
                return c3027bp1.d;
            case 4:
                int i26 = c3569eR0.o;
                j8 = c3569eR0.m;
                j9 = c3569eR0.l;
                j10 = c3569eR0.k;
                i8 = c3569eR0.n;
                j11 = c3569eR0.j;
                commonError3 = c3569eR0.h;
                C3027bp1 c3027bp12 = c3569eR0.g;
                str6 = c3569eR0.e;
                C3989gR0 c3989gR9 = (C3989gR0) c3569eR0.d;
                C1795Pt1.b(obj3);
                i9 = i26;
                c3027bp4 = c3027bp12;
                c3989gR4 = c3989gR9;
                obj2 = obj3;
                commonError4 = commonError3;
                long j3115 = j8;
                resultError = (CommonResult) obj2;
                c3989gR5 = c3989gR4;
                c3027bp1 = c3027bp4;
                i2 = i8;
                j12 = j3115;
                j13 = j9;
                j14 = j10;
                j15 = j11;
                int i115 = i9 + 1;
                mn6 = mn8;
                if (!(resultError instanceof ResultOk)) {
                    if (resultError instanceof ResultError) {
                        error = ((ResultError) resultError).getError();
                    } else {
                        error = commonError4;
                    }
                    if (b.f(j12, j15) < 0) {
                    }
                    resultError2 = new ResultError(CommonResultKt.a(error));
                    if (resultError2 instanceof ResultOk) {
                        resultOk = (ResultOk) resultError2;
                        if (!((Collection) resultOk.a()).isEmpty()) {
                            List list11 = (List) resultOk.a();
                            size = list11.size();
                            arrayList = new ArrayList(XE.m(list11, 10));
                            i15 = 0;
                            while (r2.hasNext()) {
                                i16 = i15 + 1;
                                if (i15 >= 0) {
                                    WE.l();
                                    throw null;
                                }
                                arrayList.add(new C3506e70((i15 - size) * 1000, ((BF) obj4).c));
                                i15 = i16;
                            }
                            RV rv11 = C6266r20.a;
                            abstractC8109zn0 = QV0.a;
                            c3779fR0 = new C3779fR0(c3989gR5, arrayList, null);
                            c3569eR0.d = c3027bp1;
                            c3569eR0.e = null;
                            c3569eR0.g = null;
                            c3569eR0.h = null;
                            c3569eR0.r = 6;
                            if (C5189lv.p(abstractC8109zn0, c3779fR0, c3569eR0) == mn6) {
                                return mn6;
                            }
                            c3027bp8 = c3027bp1;
                            c3027bp1 = c3027bp8;
                        }
                    }
                    return c3027bp1.d;
                }
                resultError2 = resultError;
                if (resultError2 instanceof ResultOk) {
                    resultOk = (ResultOk) resultError2;
                    if (!((Collection) resultOk.a()).isEmpty()) {
                        List list12 = (List) resultOk.a();
                        size = list12.size();
                        arrayList = new ArrayList(XE.m(list12, 10));
                        i15 = 0;
                        while (r2.hasNext()) {
                            i16 = i15 + 1;
                            if (i15 >= 0) {
                                WE.l();
                                throw null;
                            }
                            arrayList.add(new C3506e70((i15 - size) * 1000, ((BF) obj4).c));
                            i15 = i16;
                        }
                        RV rv12 = C6266r20.a;
                        abstractC8109zn0 = QV0.a;
                        c3779fR0 = new C3779fR0(c3989gR5, arrayList, null);
                        c3569eR0.d = c3027bp1;
                        c3569eR0.e = null;
                        c3569eR0.g = null;
                        c3569eR0.h = null;
                        c3569eR0.r = 6;
                        if (C5189lv.p(abstractC8109zn0, c3779fR0, c3569eR0) == mn6) {
                            return mn6;
                        }
                        c3027bp8 = c3027bp1;
                        c3027bp1 = c3027bp8;
                    }
                }
                return c3027bp1.d;
            case 5:
                int i27 = c3569eR0.o;
                j12 = c3569eR0.m;
                long j48 = c3569eR0.l;
                j21 = c3569eR0.k;
                int i28 = c3569eR0.n;
                long j49 = c3569eR0.j;
                commonError6 = c3569eR0.h;
                C3027bp1 c3027bp13 = c3569eR0.g;
                String str14 = c3569eR0.e;
                C3989gR0 c3989gR10 = (C3989gR0) c3569eR0.d;
                C1795Pt1.b(obj3);
                i13 = i28;
                i14 = i27;
                c3027bp7 = c3027bp13;
                mn7 = mn8;
                j2 = j49;
                jCurrentTimeMillis = j48;
                c3569eR2 = c3569eR0;
                c3989gR6 = c3989gR10;
                str2 = str14;
                mn = mn7;
                c3989gR1 = c3989gR6;
                c3569eR0 = c3569eR2;
                i2 = i13;
                i = i14;
                long j210 = j21;
                c3027bp1 = c3027bp7;
                commonError = commonError6;
                jQ = b.q(2, j12);
                j3 = j210;
                enumC3495e41 = (EnumC3495e41) c3989gR1.a.r.getValue();
                if (enumC3495e41 != null) {
                    i9 = i;
                    if (C7652xe.g(enumC3495e41)) {
                        resultError = new ResultOk(C5653o60.d);
                        long j211 = j3;
                        j12 = jQ;
                        j14 = j211;
                        long j212 = j2;
                        j13 = jCurrentTimeMillis;
                        j15 = j212;
                        commonError4 = commonError;
                        mn8 = mn;
                        str6 = str2;
                        c3989gR5 = c3989gR1;
                    }
                    int i116 = i9 + 1;
                    mn6 = mn8;
                    if (!(resultError instanceof ResultOk)) {
                        if (resultError instanceof ResultError) {
                            error = ((ResultError) resultError).getError();
                        } else {
                            error = commonError4;
                        }
                        if (b.f(j12, j15) < 0) {
                        }
                        resultError2 = new ResultError(CommonResultKt.a(error));
                        if (resultError2 instanceof ResultOk) {
                            resultOk = (ResultOk) resultError2;
                            if (!((Collection) resultOk.a()).isEmpty()) {
                                List list13 = (List) resultOk.a();
                                size = list13.size();
                                arrayList = new ArrayList(XE.m(list13, 10));
                                i15 = 0;
                                while (r2.hasNext()) {
                                    i16 = i15 + 1;
                                    if (i15 >= 0) {
                                        WE.l();
                                        throw null;
                                    }
                                    arrayList.add(new C3506e70((i15 - size) * 1000, ((BF) obj4).c));
                                    i15 = i16;
                                }
                                RV rv13 = C6266r20.a;
                                abstractC8109zn0 = QV0.a;
                                c3779fR0 = new C3779fR0(c3989gR5, arrayList, null);
                                c3569eR0.d = c3027bp1;
                                c3569eR0.e = null;
                                c3569eR0.g = null;
                                c3569eR0.h = null;
                                c3569eR0.r = 6;
                                if (C5189lv.p(abstractC8109zn0, c3779fR0, c3569eR0) == mn6) {
                                    return mn6;
                                }
                                c3027bp8 = c3027bp1;
                                c3027bp1 = c3027bp8;
                            }
                        }
                        return c3027bp1.d;
                    }
                    resultError2 = resultError;
                    if (resultError2 instanceof ResultOk) {
                        resultOk = (ResultOk) resultError2;
                        if (!((Collection) resultOk.a()).isEmpty()) {
                            List list14 = (List) resultOk.a();
                            size = list14.size();
                            arrayList = new ArrayList(XE.m(list14, 10));
                            i15 = 0;
                            while (r2.hasNext()) {
                                i16 = i15 + 1;
                                if (i15 >= 0) {
                                    WE.l();
                                    throw null;
                                }
                                arrayList.add(new C3506e70((i15 - size) * 1000, ((BF) obj4).c));
                                i15 = i16;
                            }
                            RV rv14 = C6266r20.a;
                            abstractC8109zn0 = QV0.a;
                            c3779fR0 = new C3779fR0(c3989gR5, arrayList, null);
                            c3569eR0.d = c3027bp1;
                            c3569eR0.e = null;
                            c3569eR0.g = null;
                            c3569eR0.h = null;
                            c3569eR0.r = 6;
                            if (C5189lv.p(abstractC8109zn0, c3779fR0, c3569eR0) == mn6) {
                                return mn6;
                            }
                            c3027bp8 = c3027bp1;
                            c3027bp1 = c3027bp8;
                        }
                    }
                    return c3027bp1.d;
                }
                i9 = i;
                str8 = c3989gR1.g;
                if (str8 != null) {
                    c3569eR0.d = c3989gR1;
                    c3569eR0.e = str2;
                    c3569eR0.g = c3027bp1;
                    c3569eR0.h = commonError;
                    c3569eR0.j = j2;
                    c3569eR0.n = i2;
                    c3569eR0.k = j3;
                    c3569eR0.l = jCurrentTimeMillis;
                    c3569eR0.m = jQ;
                    i17 = i9;
                    c3569eR0.o = i17;
                    str9 = str2;
                    c3569eR0.r = 1;
                    objA = c3989gR1.c.a(str8, c3569eR0);
                    mn2 = mn;
                    if (objA == mn2) {
                        return mn2;
                    }
                    c3989gR2 = c3989gR1;
                    str3 = str9;
                    i3 = i17;
                    Unit unit3 = Unit.a;
                    i11 = i3;
                } else {
                    mn2 = mn;
                    i11 = i9;
                    String str15 = str2;
                    c3989gR2 = c3989gR1;
                    str3 = str15;
                }
                c3989gR2.g = str3;
                c3569eR0.d = c3989gR2;
                c3569eR0.e = str3;
                c3569eR0.g = c3027bp1;
                c3569eR0.h = commonError;
                c3569eR0.i = c3027bp1;
                c3569eR0.j = j2;
                c3569eR0.n = i2;
                c3569eR0.k = j3;
                c3569eR0.l = jCurrentTimeMillis;
                c3569eR0.m = jQ;
                c3569eR0.o = i11;
                i12 = i2;
                c3569eR0.r = 2;
                objB3 = c3989gR2.b.b(str3, c3569eR0);
                if (objB3 == mn2) {
                    return mn2;
                }
                i5 = i11;
                str4 = str3;
                c3989gR3 = c3989gR2;
                t = objB3;
                i4 = i12;
                mn3 = mn2;
                c3027bp2 = c3027bp1;
                c3027bp1.d = t;
                InterfaceC6396rf0 interfaceC6396rf3 = (InterfaceC6396rf0) c3027bp2.d;
                j20 = jQ;
                long j3116 = Fg2.v;
                c3569eR0.d = c3989gR3;
                c3569eR0.e = str4;
                c3569eR0.g = c3027bp2;
                c3569eR0.h = commonError;
                c3569eR0.i = null;
                c3569eR0.j = j2;
                c3569eR0.n = i4;
                c3569eR0.k = j3;
                c3569eR0.l = jCurrentTimeMillis;
                c3027bp6 = c3027bp2;
                c3989gR4 = c3989gR3;
                c3569eR0.m = j20;
                i10 = i5;
                c3569eR0.o = i10;
                c3569eR0.r = 3;
                objB2 = C7236vf0.b(interfaceC6396rf3, j3116, new C2483Yf(2), c3569eR0);
                mn5 = mn3;
                if (objB2 == mn5) {
                    return mn5;
                }
                long j3117 = j3;
                c3027bp3 = c3027bp6;
                obj = objB2;
                str5 = str4;
                j6 = j3117;
                long j3118 = j2;
                j5 = jCurrentTimeMillis;
                j7 = j3118;
                mn4 = mn5;
                c3569eR1 = c3569eR0;
                commonError2 = commonError;
                i6 = i10;
                i7 = i4;
                j4 = j20;
                cf = (CF) obj;
                if (cf == null) {
                    i9 = i6;
                    long j3119 = j4;
                    resultError = new ResultError(new CommonError.OtherError(null, 0, 3, 0 == true ? 1 : 0));
                    j13 = j5;
                    commonError4 = commonError2;
                    c3569eR0 = c3569eR1;
                    i2 = i7;
                    str6 = str5;
                    j15 = j7;
                    c3989gR5 = c3989gR4;
                    j14 = j6;
                    c3027bp1 = c3027bp3;
                    mn8 = mn4;
                    j12 = j3119;
                } else {
                    i9 = i6;
                    j16 = j4;
                    j17 = j5;
                    c3989gR4.f.a(cf.d);
                    long jLongValue5 = ((Number) c3989gR4.f.b().d.getValue()).longValue();
                    c3569eR1.d = c3989gR4;
                    c3569eR1.e = str5;
                    c3569eR1.g = c3027bp3;
                    c3569eR1.h = commonError2;
                    c3569eR1.j = j7;
                    c3569eR1.n = i7;
                    c3569eR1.k = j6;
                    c3569eR1.l = j17;
                    c3569eR1.m = j16;
                    str7 = str5;
                    c3569eR1.o = i9;
                    c3569eR1.r = 4;
                    long j31110 = jLongValue5 - ((long) 900);
                    j18 = j6;
                    c3027bp5 = c3027bp3;
                    commonError5 = commonError2;
                    j19 = j7;
                    objB = c3989gR4.d.b(str7, jLongValue5, j31110, c3569eR1);
                    mn8 = mn4;
                    if (objB == mn8) {
                        return mn8;
                    }
                    i8 = i7;
                    j10 = j18;
                    str6 = str7;
                    j9 = j17;
                    commonError3 = commonError5;
                    c3027bp4 = c3027bp5;
                    obj2 = objB;
                    j8 = j16;
                    c3569eR0 = c3569eR1;
                    j11 = j19;
                    commonError4 = commonError3;
                    long j31111 = j8;
                    resultError = (CommonResult) obj2;
                    c3989gR5 = c3989gR4;
                    c3027bp1 = c3027bp4;
                    i2 = i8;
                    j12 = j31111;
                    j13 = j9;
                    j14 = j10;
                    j15 = j11;
                }
                int i117 = i9 + 1;
                mn6 = mn8;
                if (!(resultError instanceof ResultOk)) {
                    if (resultError instanceof ResultError) {
                        error = ((ResultError) resultError).getError();
                    } else {
                        error = commonError4;
                    }
                    if (b.f(j12, j15) < 0) {
                    }
                    resultError2 = new ResultError(CommonResultKt.a(error));
                    if (resultError2 instanceof ResultOk) {
                        resultOk = (ResultOk) resultError2;
                        if (!((Collection) resultOk.a()).isEmpty()) {
                            List list15 = (List) resultOk.a();
                            size = list15.size();
                            arrayList = new ArrayList(XE.m(list15, 10));
                            i15 = 0;
                            while (r2.hasNext()) {
                                i16 = i15 + 1;
                                if (i15 >= 0) {
                                    WE.l();
                                    throw null;
                                }
                                arrayList.add(new C3506e70((i15 - size) * 1000, ((BF) obj4).c));
                                i15 = i16;
                            }
                            RV rv15 = C6266r20.a;
                            abstractC8109zn0 = QV0.a;
                            c3779fR0 = new C3779fR0(c3989gR5, arrayList, null);
                            c3569eR0.d = c3027bp1;
                            c3569eR0.e = null;
                            c3569eR0.g = null;
                            c3569eR0.h = null;
                            c3569eR0.r = 6;
                            if (C5189lv.p(abstractC8109zn0, c3779fR0, c3569eR0) == mn6) {
                                return mn6;
                            }
                            c3027bp8 = c3027bp1;
                            c3027bp1 = c3027bp8;
                        }
                    }
                    return c3027bp1.d;
                }
                resultError2 = resultError;
                if (resultError2 instanceof ResultOk) {
                    resultOk = (ResultOk) resultError2;
                    if (!((Collection) resultOk.a()).isEmpty()) {
                        List list16 = (List) resultOk.a();
                        size = list16.size();
                        arrayList = new ArrayList(XE.m(list16, 10));
                        i15 = 0;
                        while (r2.hasNext()) {
                            i16 = i15 + 1;
                            if (i15 >= 0) {
                                WE.l();
                                throw null;
                            }
                            arrayList.add(new C3506e70((i15 - size) * 1000, ((BF) obj4).c));
                            i15 = i16;
                        }
                        RV rv16 = C6266r20.a;
                        abstractC8109zn0 = QV0.a;
                        c3779fR0 = new C3779fR0(c3989gR5, arrayList, null);
                        c3569eR0.d = c3027bp1;
                        c3569eR0.e = null;
                        c3569eR0.g = null;
                        c3569eR0.h = null;
                        c3569eR0.r = 6;
                        if (C5189lv.p(abstractC8109zn0, c3779fR0, c3569eR0) == mn6) {
                            return mn6;
                        }
                        c3027bp8 = c3027bp1;
                        c3027bp1 = c3027bp8;
                    }
                }
                return c3027bp1.d;
            case 6:
                c3027bp8 = (C3027bp1) c3569eR0.d;
                C1795Pt1.b(obj3);
                c3027bp1 = c3027bp8;
                return c3027bp1.d;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
