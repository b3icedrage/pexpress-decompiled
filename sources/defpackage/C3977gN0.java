package defpackage;

import android.content.Context;
import com.api.core.backend.domain.models.resultModels.CommonError;
import com.api.core.backend.domain.models.resultModels.CommonErrorClassificationKt;
import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.core.backend.domain.models.resultModels.ResultError;
import com.api.core.backend.domain.models.resultModels.ResultOk;
import com.api.feature.analytics.reporters.ReporterApi;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.impl.core.backend.abstractModels.http.HttpPlatformResponse;
import com.pexpress.tool.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: gN0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3977gN0 {
    public static final long B;
    public static final long C;
    public static final long D;
    public static final long E;
    public static final long F;

    @NotNull
    public static final AtomicInteger G;

    @NotNull
    public static final AtomicInteger H;

    @NotNull
    public static final AtomicBoolean I;

    @NotNull
    public static final AtomicInteger J;

    @Nullable
    public volatile a A;

    @NotNull
    public final Context a;

    @NotNull
    public final C6355rT0 b;

    @NotNull
    public final C4923kf c;

    @NotNull
    public final TM0 d;

    @NotNull
    public final ReporterApi e;

    @NotNull
    public final C3378dX0 f;

    @NotNull
    public final LU g;

    @NotNull
    public final Set<InterfaceC7071ur1> h;

    @NotNull
    public final Set<InterfaceC7295vw0> i;

    @NotNull
    public final L52 j;

    @NotNull
    public final AbstractC5045lD0 k;

    @NotNull
    public final CE1 l;

    @NotNull
    public final InterfaceC7260vl0 m;

    @NotNull
    public final InterfaceC4358iA0 n;

    @NotNull
    public final C5727oT1 o;

    @NotNull
    public final AbstractC5468nD0 p;

    @NotNull
    public final GG q;

    @NotNull
    public final InterfaceC5703oL1 r;

    @NotNull
    public final C6120qK1 s;

    @NotNull
    public final C6120qK1 t;
    public KN u;

    @NotNull
    public final C6120qK1 v;

    @NotNull
    public final GP1 w;

    @NotNull
    public final GP1 x;

    @NotNull
    public final UN0 y;

    @NotNull
    public final AtomicInteger z;

    /* JADX INFO: renamed from: gN0$a */
    public static final class a {

        @NotNull
        public final String a;

        @Nullable
        public final CommonError b;

        public a(@Nullable CommonError commonError, @NotNull String job) {
            Intrinsics.checkNotNullParameter(job, "job");
            this.a = job;
            this.b = commonError;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.a(this.a, aVar.a) && Intrinsics.a(this.b, aVar.b);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            CommonError commonError = this.b;
            return iHashCode + (commonError == null ? 0 : commonError.hashCode());
        }

        @NotNull
        public final String toString() {
            return "FailureCause(job=" + this.a + ", error=" + this.b + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: gN0$b */
    public static final class b {
        public static final b d;
        public static final b e;
        public static final b g;
        public static final b h;
        public static final b i;
        public static final /* synthetic */ b[] j;

        static {
            b bVar = new b("DONE", 0);
            d = bVar;
            b bVar2 = new b("SIGNED_OUT", 1);
            e = bVar2;
            b bVar3 = new b("RETRY", 2);
            g = bVar3;
            b bVar4 = new b("RESTRICTED_COUNTRY", 3);
            h = bVar4;
            b bVar5 = new b("CONFIG_LOCKED", 4);
            i = bVar5;
            b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
            j = bVarArr;
            C1952Ru.i(bVarArr);
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) j.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: gN0$c */
    public static final class c {
        public static final c d;
        public static final c e;
        public static final c g;
        public static final /* synthetic */ c[] h;

        static {
            c cVar = new c("RETRY", 0);
            d = cVar;
            c cVar2 = new c("SIGNED_IN", 1);
            e = cVar2;
            c cVar3 = new c("SIGNED_OUT", 2);
            g = cVar3;
            c[] cVarArr = {cVar, cVar2, cVar3};
            h = cVarArr;
            C1952Ru.i(cVarArr);
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) h.clone();
        }
    }

    /* JADX INFO: renamed from: gN0$d */
    public /* synthetic */ class d {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[c.values().length];
            try {
                c cVar = c.d;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c cVar2 = c.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                c cVar3 = c.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
            int[] iArr2 = new int[b.values().length];
            try {
                b bVar = b.d;
                iArr2[2] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b bVar2 = b.d;
                iArr2[0] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b bVar3 = b.d;
                iArr2[1] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b bVar4 = b.d;
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b bVar5 = b.d;
                iArr2[4] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            b = iArr2;
        }
    }

    static {
        kotlin.time.b.a aVar = kotlin.time.b.e;
        R40 r40 = R40.SECONDS;
        B = kotlin.time.c.g(30, r40);
        C = kotlin.time.c.g(30, r40);
        D = kotlin.time.c.g(15, r40);
        E = kotlin.time.c.g(2, r40);
        F = kotlin.time.c.g(15, r40);
        G = new AtomicInteger(0);
        H = new AtomicInteger(0);
        I = new AtomicBoolean(false);
        J = new AtomicInteger(0);
    }

    public C3977gN0(@NotNull Context context, @NotNull C6355rT0 logoutManager, @NotNull C4923kf appData, @NotNull TM0 platformFunctions, @NotNull ReporterApi reporter, @NotNull C3378dX0 marketingEventsManager, @NotNull LU deeplinkManager, @NotNull Set<InterfaceC7071ur1> experiments, @NotNull Set<InterfaceC7295vw0> imagePreloader, @NotNull L52 tutorialPassedValueUseCase, @NotNull AbstractC5045lD0 isShowValueUseCase, @NotNull CE1 selectAccountScreenPassedUseCase, @NotNull InterfaceC7260vl0 getUserUseCase, @NotNull InterfaceC4358iA0 initializeExecutorUseCase, @NotNull C5727oT1 stubLocalExperiment, @NotNull AbstractC5468nD0 stubShownUseCase, @NotNull GG completePendingRegistration, @NotNull InterfaceC5703oL1 showLoginErrorDialogUseCase) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logoutManager, "logoutManager");
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(platformFunctions, "platformFunctions");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(marketingEventsManager, "marketingEventsManager");
        Intrinsics.checkNotNullParameter(deeplinkManager, "deeplinkManager");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(imagePreloader, "imagePreloader");
        Intrinsics.checkNotNullParameter(tutorialPassedValueUseCase, "tutorialPassedValueUseCase");
        Intrinsics.checkNotNullParameter(isShowValueUseCase, "isShowValueUseCase");
        Intrinsics.checkNotNullParameter(selectAccountScreenPassedUseCase, "selectAccountScreenPassedUseCase");
        Intrinsics.checkNotNullParameter(getUserUseCase, "getUserUseCase");
        Intrinsics.checkNotNullParameter(initializeExecutorUseCase, "initializeExecutorUseCase");
        Intrinsics.checkNotNullParameter(stubLocalExperiment, "stubLocalExperiment");
        Intrinsics.checkNotNullParameter(stubShownUseCase, "stubShownUseCase");
        Intrinsics.checkNotNullParameter(completePendingRegistration, "completePendingRegistration");
        Intrinsics.checkNotNullParameter(showLoginErrorDialogUseCase, "showLoginErrorDialogUseCase");
        this.a = context;
        this.b = logoutManager;
        this.c = appData;
        this.d = platformFunctions;
        this.e = reporter;
        this.f = marketingEventsManager;
        this.g = deeplinkManager;
        this.h = experiments;
        this.i = imagePreloader;
        this.j = tutorialPassedValueUseCase;
        this.k = isShowValueUseCase;
        this.l = selectAccountScreenPassedUseCase;
        this.m = getUserUseCase;
        this.n = initializeExecutorUseCase;
        this.o = stubLocalExperiment;
        this.p = stubShownUseCase;
        this.q = completePendingRegistration;
        this.r = showLoginErrorDialogUseCase;
        this.s = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        this.t = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        this.v = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        Boolean bool = Boolean.FALSE;
        this.w = C1589Ne.i(bool);
        this.x = C1589Ne.i(bool);
        this.y = new UN0(null);
        this.z = new AtomicInteger(0);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public static final Object a(C3977gN0 c3977gN0, int i, LM lm) {
        C4187hN0 c4187hN0;
        Object cVar;
        c3977gN0.getClass();
        if (lm instanceof C4187hN0) {
            c4187hN0 = (C4187hN0) lm;
            int i2 = c4187hN0.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c4187hN0.i = i2 - Integer.MIN_VALUE;
            } else {
                c4187hN0 = new C4187hN0(c3977gN0, lm);
            }
        } else {
            c4187hN0 = new C4187hN0(c3977gN0, lm);
        }
        C4187hN0 c4187hN1 = c4187hN0;
        Object objC = c4187hN1.g;
        MN mn = MN.d;
        int i3 = c4187hN1.i;
        CommonError commonError = null;
        if (i3 == 0) {
            C1795Pt1.b(objC);
            C6945uG c6945uG = (C6945uG) c3977gN0.c.k.getValue();
            String str = c6945uG != null ? c6945uG.b : null;
            c4187hN1.d = c3977gN0;
            c4187hN1.e = i;
            c4187hN1.i = 1;
            objC = c3977gN0.q.c(str, E, D, c4187hN1);
            if (objC == mn) {
                return mn;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = c4187hN1.e;
            c3977gN0 = c4187hN1.d;
            C1795Pt1.b(objC);
        }
        CommonResult added = (CommonResult) objC;
        Set<Integer> set = YN0.a;
        Intrinsics.checkNotNullParameter(added, "added");
        if (added instanceof ResultOk) {
            cVar = ((Boolean) ((ResultOk) added).a()).booleanValue() ? InterfaceC1822Qc1.a.a : InterfaceC1822Qc1.b.a;
        } else {
            if (!(added instanceof ResultError)) {
                throw new C6489s51();
            }
            ResultError resultError = (ResultError) added;
            cVar = CommonErrorClassificationKt.d(resultError.getError()) ? new InterfaceC1822Qc1.c(resultError.getError()) : new InterfaceC1822Qc1.d(resultError.getError());
        }
        if (cVar instanceof InterfaceC1822Qc1.c) {
            commonError = ((InterfaceC1822Qc1.c) cVar).a;
        } else if (cVar instanceof InterfaceC1822Qc1.d) {
            commonError = ((InterfaceC1822Qc1.d) cVar).a;
        } else if (!Intrinsics.a(cVar, InterfaceC1822Qc1.a.a) && !Intrinsics.a(cVar, InterfaceC1822Qc1.b.a)) {
            throw new C6489s51();
        }
        if (commonError != null) {
            c3977gN0.o("Launch: pending add user failed", commonError, i, H);
        }
        return cVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(C3977gN0 c3977gN0, LM lm) {
        C5288mN0 c5288mN0;
        Boolean boolA;
        if (lm instanceof C5288mN0) {
            c5288mN0 = (C5288mN0) lm;
            int i = c5288mN0.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5288mN0.h = i - Integer.MIN_VALUE;
            } else {
                c5288mN0 = new C5288mN0(c3977gN0, lm);
            }
        } else {
            c5288mN0 = new C5288mN0(c3977gN0, lm);
        }
        Object objD = c5288mN0.e;
        MN mn = MN.d;
        int i2 = c5288mN0.h;
        if (i2 == 0) {
            C1795Pt1.b(objD);
            C5498nN0 c5498nN0 = new C5498nN0(c3977gN0, null);
            c5288mN0.d = c3977gN0;
            c5288mN0.h = 1;
            objD = OZ1.d(F, c5498nN0, c5288mN0);
            if (objD == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c3977gN0 = c5288mN0.d;
            C1795Pt1.b(objD);
        }
        CommonResult commonResult = (CommonResult) objD;
        if (commonResult != null && (boolA = YN0.a(commonResult)) != null) {
            ReporterApi.a.a(c3977gN0.e, EnumC5113la.FTD, boolA);
        }
        if (commonResult == null) {
            Set<Integer> set = YN0.a;
            return new InterfaceC7217va1.e(new CommonError.TimeoutException());
        }
        if (YN0.a(commonResult) != null) {
            return InterfaceC7217va1.c.a;
        }
        CommonError error = ((ResultError) commonResult).getError();
        if (error instanceof CommonError.NotAuthenticated) {
            return new InterfaceC7217va1.b((CommonError.NotAuthenticated) error);
        }
        if (error instanceof CommonError.RestrictedCountry) {
            return new InterfaceC7217va1.d((CommonError.RestrictedCountry) error);
        }
        return error instanceof CommonError.ConfigLocked ? new InterfaceC7217va1.a((CommonError.ConfigLocked) error) : new InterfaceC7217va1.e(error);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        if (r6 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0084, code lost:
    
        if (r6 == r1) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.C3977gN0 r6, defpackage.LM r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof defpackage.C5708oN0
            if (r0 == 0) goto L13
            r0 = r7
            oN0 r0 = (defpackage.C5708oN0) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            oN0 r0 = new oN0
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.e
            MN r1 = defpackage.MN.d
            int r2 = r0.h
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            defpackage.C1795Pt1.b(r7)
            goto L87
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            defpackage.C1795Pt1.b(r7)
            goto L70
        L39:
            gN0 r6 = r0.d
            defpackage.C1795Pt1.b(r7)
            goto L53
        L3f:
            defpackage.C1795Pt1.b(r7)
            lD0 r7 = r6.k
            rf0 r7 = r7.l()
            r0.d = r6
            r0.h = r5
            java.lang.Object r7 = defpackage.C4466ii.o(r7, r0)
            if (r7 != r1) goto L53
            goto L86
        L53:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r2 = 0
            if (r7 == 0) goto L73
            r0.d = r2
            r0.h = r4
            qK1 r6 = r6.t
            I41 r7 = defpackage.I41.g
            java.lang.Object r6 = r6.a(r7, r0)
            if (r6 != r1) goto L6b
            goto L6d
        L6b:
            kotlin.Unit r6 = kotlin.Unit.a
        L6d:
            if (r6 != r1) goto L70
            goto L86
        L70:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        L73:
            r0.d = r2
            r0.h = r3
            qK1 r6 = r6.t
            I41 r7 = defpackage.I41.i
            java.lang.Object r6 = r6.a(r7, r0)
            if (r6 != r1) goto L82
            goto L84
        L82:
            kotlin.Unit r6 = kotlin.Unit.a
        L84:
            if (r6 != r1) goto L87
        L86:
            return r1
        L87:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3977gN0.c(gN0, LM):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object d(C3977gN0 c3977gN0, LM lm) {
        C6757tN0 c6757tN0;
        if (lm instanceof C6757tN0) {
            c6757tN0 = (C6757tN0) lm;
            int i = c6757tN0.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c6757tN0.g = i - Integer.MIN_VALUE;
            } else {
                c6757tN0 = new C6757tN0(c3977gN0, lm);
            }
        } else {
            c6757tN0 = new C6757tN0(c3977gN0, lm);
        }
        Object objO = c6757tN0.d;
        MN mn = MN.d;
        int i2 = c6757tN0.g;
        if (i2 == 0) {
            C1795Pt1.b(objO);
            InterfaceC6396rf0<Boolean> interfaceC6396rf0L = c3977gN0.j.l();
            c6757tN0.g = 1;
            objO = C4466ii.o(interfaceC6396rf0L, c6757tN0);
            if (objO == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objO);
        }
        return Boolean.valueOf(!((Boolean) objO).booleanValue());
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0086  */
    /* JADX WARN: Code duplicated, block: B:36:0x0098 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object e(C3977gN0 c3977gN0, LM lm) {
        C6967uN0 c6967uN0;
        Object objO;
        if (lm instanceof C6967uN0) {
            c6967uN0 = (C6967uN0) lm;
            int i = c6967uN0.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c6967uN0.h = i - Integer.MIN_VALUE;
            } else {
                c6967uN0 = new C6967uN0(c3977gN0, lm);
            }
        } else {
            c6967uN0 = new C6967uN0(c3977gN0, lm);
        }
        Object objO2 = c6967uN0.e;
        MN mn = MN.d;
        int i2 = c6967uN0.h;
        if (i2 == 0) {
            C1795Pt1.b(objO2);
            FF ff = (FF) c3977gN0.c.b.getValue();
            if (ff != null && ff.s) {
                InterfaceC6396rf0<Boolean> interfaceC6396rf0L = c3977gN0.k.l();
                c6967uN0.d = c3977gN0;
                c6967uN0.h = 1;
                objO2 = C4466ii.o(interfaceC6396rf0L, c6967uN0);
                if (objO2 != mn) {
                }
                return mn;
            }
            return Boolean.FALSE;
        }
        if (i2 == 1) {
            c3977gN0 = c6967uN0.d;
            C1795Pt1.b(objO2);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(objO2);
                return objO2;
            }
            c3977gN0 = c6967uN0.d;
            C1795Pt1.b(objO2);
        }
        if (!((Boolean) objO2).booleanValue()) {
            InterfaceC6396rf0<Boolean> interfaceC6396rf0L2 = c3977gN0.j.l();
            c6967uN0.d = null;
            c6967uN0.h = 3;
            objO = C4466ii.o(interfaceC6396rf0L2, c6967uN0);
            if (objO != mn) {
                return mn;
            }
            return objO;
        }
        return Boolean.FALSE;
        if (((Boolean) objO2).booleanValue()) {
            InterfaceC6396rf0<Boolean> interfaceC6396rf0L3 = c3977gN0.l.l();
            c6967uN0.d = c3977gN0;
            c6967uN0.h = 2;
            objO2 = C4466ii.o(interfaceC6396rf0L3, c6967uN0);
            if (objO2 != mn) {
                if (!((Boolean) objO2).booleanValue()) {
                    InterfaceC6396rf0<Boolean> interfaceC6396rf0L4 = c3977gN0.j.l();
                    c6967uN0.d = null;
                    c6967uN0.h = 3;
                    objO = C4466ii.o(interfaceC6396rf0L4, c6967uN0);
                    if (objO != mn) {
                        return objO;
                    }
                }
            }
            return mn;
        }
        return Boolean.FALSE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object f(C3977gN0 c3977gN0, LM lm) {
        C7177vN0 c7177vN0;
        if (lm instanceof C7177vN0) {
            c7177vN0 = (C7177vN0) lm;
            int i = c7177vN0.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c7177vN0.h = i - Integer.MIN_VALUE;
            } else {
                c7177vN0 = new C7177vN0(c3977gN0, lm);
            }
        } else {
            c7177vN0 = new C7177vN0(c3977gN0, lm);
        }
        Object objO = c7177vN0.e;
        MN mn = MN.d;
        int i2 = c7177vN0.h;
        if (i2 == 0) {
            C1795Pt1.b(objO);
            InterfaceC6396rf0<Boolean> interfaceC6396rf0L = c3977gN0.p.l();
            c7177vN0.d = c3977gN0;
            c7177vN0.h = 1;
            objO = C4466ii.o(interfaceC6396rf0L, c7177vN0);
            if (objO == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c3977gN0 = c7177vN0.d;
            C1795Pt1.b(objO);
        }
        return Boolean.valueOf(((Boolean) objO).booleanValue() && c3977gN0.o.o());
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:25:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:28:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:32:0x00dc A[PHI: r0 r1 r4 r9
      0x00dc: PHI (r0v8 int) = (r0v6 int), (r0v34 int) binds: [B:30:0x00d8, B:15:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x00dc: PHI (r1v15 java.lang.Object) = (r1v14 java.lang.Object), (r1v1 java.lang.Object) binds: [B:30:0x00d8, B:15:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x00dc: PHI (r4v8 gN0) = (r4v5 gN0), (r4v10 gN0) binds: [B:30:0x00d8, B:15:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x00dc: PHI (r9v5 long) = (r9v3 long), (r9v11 long) binds: [B:30:0x00d8, B:15:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:37:0x0102  */
    /* JADX WARN: Code duplicated, block: B:39:0x010a  */
    /* JADX WARN: Code duplicated, block: B:42:0x017d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0181  */
    /* JADX WARN: Code duplicated, block: B:45:0x018a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0192  */
    /* JADX WARN: Code duplicated, block: B:55:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:58:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:62:0x01d0 A[PHI: r0 r4
      0x01d0: PHI (r0v37 XN0) = (r0v35 XN0), (r0v38 XN0) binds: [B:60:0x01cd, B:13:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x01d0: PHI (r4v14 gN0) = (r4v11 gN0), (r4v17 gN0) binds: [B:60:0x01cd, B:13:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01e2, code lost:
    
        if (defpackage.C4466ii.p(r1, r4, r2) == r3) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Enum g(defpackage.C3977gN0 r17, long r18, int r20, defpackage.LM r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3977gN0.g(gN0, long, int, LM):java.lang.Enum");
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:57:0x0112 A[PHI: r11
      0x0112: PHI (r11v6 gN0) = (r11v3 gN0), (r11v3 gN0), (r11v14 gN0) binds: [B:53:0x00fa, B:55:0x010f, B:19:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0128 A[PHI: r11
      0x0128: PHI (r11v7 gN0) = (r11v6 gN0), (r11v15 gN0) binds: [B:58:0x0125, B:18:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0139, code lost:
    
        if (r12.a("marketing_logged_in", r13, r0) == r1) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Enum h(defpackage.C3977gN0 r11, int r12, defpackage.LM r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3977gN0.h(gN0, int, LM):java.lang.Enum");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x011b, code lost:
    
        if (defpackage.C7236vf0.a(r12, r0) == r1) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object q(defpackage.C3977gN0 r12, defpackage.KN r13, defpackage.LM r14) {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3977gN0.q(gN0, KN, LM):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:106:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:110:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:116:0x020a  */
    /* JADX WARN: Code duplicated, block: B:123:0x023b  */
    /* JADX WARN: Code duplicated, block: B:134:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:136:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:139:0x0318  */
    /* JADX WARN: Code duplicated, block: B:143:0x0325  */
    /* JADX WARN: Code duplicated, block: B:173:0x0251 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x021b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x00d7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x024a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x0246 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:44:0x0116  */
    /* JADX WARN: Code duplicated, block: B:45:0x0118  */
    /* JADX WARN: Code duplicated, block: B:48:0x0122  */
    /* JADX WARN: Code duplicated, block: B:50:0x0125 A[Catch: all -> 0x005d, CancellationException -> 0x0060, TryCatch #6 {CancellationException -> 0x0060, all -> 0x005d, blocks: (B:18:0x0058, B:63:0x015f, B:66:0x0166, B:25:0x006d, B:46:0x011d, B:57:0x0138, B:58:0x013b, B:59:0x0140, B:60:0x0141, B:64:0x0162, B:50:0x0125, B:42:0x00f1), top: B:180:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0130  */
    /* JADX WARN: Code duplicated, block: B:54:0x0133 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x0135  */
    /* JADX WARN: Code duplicated, block: B:57:0x0138 A[Catch: all -> 0x005d, CancellationException -> 0x0060, TryCatch #6 {CancellationException -> 0x0060, all -> 0x005d, blocks: (B:18:0x0058, B:63:0x015f, B:66:0x0166, B:25:0x006d, B:46:0x011d, B:57:0x0138, B:58:0x013b, B:59:0x0140, B:60:0x0141, B:64:0x0162, B:50:0x0125, B:42:0x00f1), top: B:180:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x013b A[Catch: all -> 0x005d, CancellationException -> 0x0060, TryCatch #6 {CancellationException -> 0x0060, all -> 0x005d, blocks: (B:18:0x0058, B:63:0x015f, B:66:0x0166, B:25:0x006d, B:46:0x011d, B:57:0x0138, B:58:0x013b, B:59:0x0140, B:60:0x0141, B:64:0x0162, B:50:0x0125, B:42:0x00f1), top: B:180:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0141 A[Catch: all -> 0x005d, CancellationException -> 0x0060, TryCatch #6 {CancellationException -> 0x0060, all -> 0x005d, blocks: (B:18:0x0058, B:63:0x015f, B:66:0x0166, B:25:0x006d, B:46:0x011d, B:57:0x0138, B:58:0x013b, B:59:0x0140, B:60:0x0141, B:64:0x0162, B:50:0x0125, B:42:0x00f1), top: B:180:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x015d  */
    /* JADX WARN: Code duplicated, block: B:63:0x015f A[Catch: all -> 0x005d, CancellationException -> 0x0060, PHI: r0 r3 r7 r8 r13 r14 r15
      0x015f: PHI (r0v50 java.lang.Object) = (r0v22 java.lang.Object), (r0v1 java.lang.Object) binds: [B:61:0x015b, B:18:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x015f: PHI (r3v13 gN0) = (r3v8 gN0), (r3v14 gN0) binds: [B:61:0x015b, B:18:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x015f: PHI (r7v15 int) = (r7v10 int), (r7v16 int) binds: [B:61:0x015b, B:18:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x015f: PHI (r8v15 cl) = (r8v5 cl), (r8v16 cl) binds: [B:61:0x015b, B:18:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x015f: PHI (r13v8 boolean) = (r13v4 boolean), (r13v9 boolean) binds: [B:61:0x015b, B:18:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x015f: PHI (r14v13 gN0$c) = (r14v6 gN0$c), (r14v14 gN0$c) binds: [B:61:0x015b, B:18:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x015f: PHI (r15v10 cl) = (r15v4 cl), (r15v11 cl) binds: [B:61:0x015b, B:18:0x0058] A[DONT_GENERATE, DONT_INLINE], TryCatch #6 {CancellationException -> 0x0060, all -> 0x005d, blocks: (B:18:0x0058, B:63:0x015f, B:66:0x0166, B:25:0x006d, B:46:0x011d, B:57:0x0138, B:58:0x013b, B:59:0x0140, B:60:0x0141, B:64:0x0162, B:50:0x0125, B:42:0x00f1), top: B:180:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0162 A[Catch: all -> 0x005d, CancellationException -> 0x0060, TryCatch #6 {CancellationException -> 0x0060, all -> 0x005d, blocks: (B:18:0x0058, B:63:0x015f, B:66:0x0166, B:25:0x006d, B:46:0x011d, B:57:0x0138, B:58:0x013b, B:59:0x0140, B:60:0x0141, B:64:0x0162, B:50:0x0125, B:42:0x00f1), top: B:180:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0165  */
    /* JADX WARN: Code duplicated, block: B:68:0x016b  */
    /* JADX WARN: Code duplicated, block: B:70:0x0170  */
    /* JADX WARN: Code duplicated, block: B:71:0x0172  */
    /* JADX WARN: Code duplicated, block: B:74:0x017e  */
    /* JADX WARN: Code duplicated, block: B:76:0x0182 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x0184  */
    /* JADX WARN: Code duplicated, block: B:79:0x0187 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Code duplicated, block: B:80:0x0189 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x018b  */
    /* JADX WARN: Code duplicated, block: B:83:0x018e  */
    /* JADX WARN: Code duplicated, block: B:85:0x0194  */
    /* JADX WARN: Code duplicated, block: B:90:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:95:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:97:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:98:0x01cf  */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x01df, code lost:
    
        if (r3.k(r2, r5) == r6) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0203, code lost:
    
        if (r0 == r6) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x032d, code lost:
    
        if (r0 == r6) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01ab, code lost:
    
        if (r0.a(r2, r5) == r6) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01c2, code lost:
    
        if (r3.k(false, r5) == r6) goto L146;
     */
    /* JADX WARN: Not initialized variable reg: 15, insn: 0x0341: IF  (r15 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:163:0x035f (LINE:834), block:B:156:0x0341 */
    /* JADX WARN: Not initialized variable reg: 15, insn: 0x0360: IF  (r15 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:166:0x0368 (LINE:865), block:B:164:0x0360 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(boolean r25, defpackage.LM r26) {
        /*
            Method dump skipped, instruction units count: 904
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3977gN0.i(boolean, LM):java.lang.Object");
    }

    public final void j(InterfaceC3220cl interfaceC3220cl, c cVar, b bVar) {
        CommonError commonError;
        if (interfaceC3220cl == null) {
            return;
        }
        int i = bVar == null ? -1 : d.b[bVar.ordinal()];
        if (i == -1) {
            CommonError.TimeoutException timeoutException = new CommonError.TimeoutException();
            timeoutException.setPlatformCode("launch_timeout:pending=".concat(m()));
            interfaceC3220cl.c(EnumC4737jl.e, "timeout", UF.c(timeoutException));
            return;
        }
        JX1 jx1C = null;
        if (i != 1) {
            if (i == 2 || i == 3) {
                interfaceC3220cl.b("launch.signed_in", String.valueOf(bVar == b.d && cVar == c.e));
                InterfaceC3220cl.a.a(interfaceC3220cl, EnumC4737jl.d, null, null, 6);
                return;
            } else if (i != 4 && i != 5) {
                throw new C6489s51();
            }
        }
        a aVar = this.A;
        EnumC4737jl enumC4737jl = EnumC4737jl.e;
        String str = aVar != null ? aVar.a : "unknown";
        if (aVar != null && (commonError = aVar.b) != null) {
            jx1C = UF.c(commonError);
        }
        interfaceC3220cl.c(enumC4737jl, str, jx1C);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00aa A[PHI: r12
      0x00aa: PHI (r12v3 gN0) = (r12v2 gN0), (r12v2 gN0), (r12v9 gN0) binds: [B:29:0x00a7, B:26:0x0095, B:17:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b6, code lost:
    
        if (r12.a(r13, r0) == r1) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(boolean r12, defpackage.LM r13) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.C6128qN0
            if (r0 == 0) goto L13
            r0 = r13
            qN0 r0 = (defpackage.C6128qN0) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            qN0 r0 = new qN0
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.g
            MN r1 = defpackage.MN.d
            int r2 = r0.i
            r3 = 0
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L4d
            if (r2 == r7) goto L41
            if (r2 == r6) goto L3a
            if (r2 == r5) goto L3a
            if (r2 != r4) goto L32
            defpackage.C1795Pt1.b(r13)
            goto Lb9
        L32:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L3a:
            gN0 r12 = r0.d
            defpackage.C1795Pt1.b(r13)
            goto Laa
        L41:
            boolean r12 = r0.e
            gN0 r2 = r0.d
            defpackage.C1795Pt1.b(r13)
            r10 = r13
            r13 = r12
            r12 = r2
            r2 = r10
            goto L6e
        L4d:
            defpackage.C1795Pt1.b(r13)
            r0.d = r11
            r0.e = r12
            r0.i = r7
            LU r13 = r11.g
            r13.getClass()
            RV r2 = defpackage.C6266r20.a
            zn0 r2 = defpackage.QV0.a
            JU r7 = new JU
            r7.<init>(r13, r3)
            java.lang.Object r13 = defpackage.C5189lv.p(r2, r7, r0)
            if (r13 != r1) goto L6b
            goto Lb8
        L6b:
            r2 = r13
            r13 = r12
            r12 = r11
        L6e:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            com.api.feature.analytics.reporters.ReporterApi r7 = r12.e
            l80 r8 = defpackage.EnumC5028l80.m
            OU r9 = new OU
            r9.<init>(r2)
            r2 = 12
            com.api.feature.analytics.reporters.ReporterApi.a.b(r7, r8, r9, r3, r2)
            UN0 r2 = r12.y
            if (r13 == 0) goto L98
            rN0 r13 = new rN0
            r13.<init>(r12, r3)
            r0.d = r12
            r0.i = r6
            java.lang.String r5 = "navigate"
            java.lang.Object r13 = r2.a(r5, r13, r0)
            if (r13 != r1) goto Laa
            goto Lb8
        L98:
            sN0 r13 = new sN0
            r13.<init>(r12, r3)
            r0.d = r12
            r0.i = r5
            java.lang.String r5 = "not_registered"
            java.lang.Object r13 = r2.a(r5, r13, r0)
            if (r13 != r1) goto Laa
            goto Lb8
        Laa:
            qK1 r12 = r12.v
            kotlin.Unit r13 = kotlin.Unit.a
            r0.d = r3
            r0.i = r4
            java.lang.Object r12 = r12.a(r13, r0)
            if (r12 != r1) goto Lb9
        Lb8:
            return r1
        Lb9:
            kotlin.Unit r12 = kotlin.Unit.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3977gN0.k(boolean, LM):java.lang.Object");
    }

    public final void l(CommonError commonError, b bVar, int i) {
        o("Launch: our user request failed", commonError, i, G);
        this.A = new a(commonError, "our_user_data");
    }

    public final String m() {
        List listZ;
        UN0 un0 = this.y;
        synchronized (un0.b) {
            listZ = CollectionsKt.Z(un0.b, new VN0());
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listZ) {
            if (((UN0.a) obj).c == null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(XE.m(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((UN0.a) it.next()).a);
        }
        String strJ = CollectionsKt.J(CollectionsKt.Y(arrayList2), ",", null, null, null, 62);
        return strJ.length() == 0 ? DevicePublicKeyStringDef.NONE : strJ;
    }

    public final void n(CommonError error) {
        MN0.a(this.e, error, "Launch: logout, profile error");
        EnumC0936Eu level = EnumC0936Eu.e;
        Set<Integer> set = YN0.a;
        Intrinsics.checkNotNullParameter(error, "error");
        Map extra = OW0.b(new Pair("error_kind", UF.b(error)));
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter("launch_dead_session", "reason");
        Intrinsics.checkNotNullParameter(extra, "extra");
        C1988Sg c1988Sg = U0.O;
        if (c1988Sg != null) {
            c1988Sg.l("auth", "auth.logout", level, PW0.h(extra, new Pair("reason", "launch_dead_session")));
        }
        C2486Yg c2486Yg = U0.Q;
        if (c2486Yg != null) {
            c2486Yg.invoke("launch_dead_session", extra);
        }
    }

    public final void o(String str, CommonError commonError, int i, AtomicInteger atomicInteger) {
        MN0.a(this.e, commonError, str);
        int iIncrementAndGet = atomicInteger.incrementAndGet();
        if (YN0.a.contains(Integer.valueOf(iIncrementAndGet))) {
            String strB = UF.b(commonError);
            C1910Rg c1910Rg = U0.v;
            if (c1910Rg != null) {
                c1910Rg.invoke(new RuntimeException(C2629a1.b(str, ": ", strB)), PW0.e(new Pair("phase", "launch_request_failed"), new Pair("fingerprint_hint", C2629a1.b(str, ":", strB)), new Pair("level", "warning"), new Pair("attempt", Integer.valueOf(i)), new Pair("failed_count", Integer.valueOf(iIncrementAndGet)), new Pair("error_code", Integer.valueOf(commonError.getCode())), new Pair("error_platform_code", KS1.B(HttpPlatformResponse.MAX_MESSAGE_LENGTH, commonError.getPlatformCode()))));
            }
        }
    }

    public final Object p(LM lm) throws Throwable {
        Object objA = this.s.a(new Gf2(R.string.error_no_connection_to_server_title, R.string.retry_text, new Integer(R.string.error_starting_robot_description_text), new Integer(R.drawable.ic_error_big), new C0738Cg(this, 4), null, 992), lm);
        MN mn = MN.d;
        if (objA != mn) {
            objA = Unit.a;
        }
        return objA == mn ? objA : Unit.a;
    }
}
