package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonError;
import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.core.backend.domain.models.resultModels.ResultError;
import com.api.core.backend.domain.models.resultModels.ResultOk;
import com.api.feature.analytics.reporters.ReporterApi;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: zB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7981zB implements InterfaceC7350wB {

    @NotNull
    public final InterfaceC1923Rk0 a;

    @NotNull
    public final ReporterApi b;

    @NotNull
    public final InterfaceC3541eI c;

    @NotNull
    public final C6753tM d;

    @NotNull
    public final C5727oT1 e;

    public C7981zB(@NotNull InterfaceC1923Rk0 getConfigUseCase, @NotNull ReporterApi reporter, @NotNull InterfaceC3541eI configBuilder, @NotNull C6753tM contextHelper, @NotNull C5727oT1 stubLocalExperiment) {
        Intrinsics.checkNotNullParameter(getConfigUseCase, "getConfigUseCase");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(configBuilder, "configBuilder");
        Intrinsics.checkNotNullParameter(contextHelper, "contextHelper");
        Intrinsics.checkNotNullParameter(stubLocalExperiment, "stubLocalExperiment");
        this.a = getConfigUseCase;
        this.b = reporter;
        this.c = configBuilder;
        this.d = contextHelper;
        this.e = stubLocalExperiment;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:26:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:28:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ec A[PHI: r15
      0x00ec: PHI (r15v1 com.api.core.backend.domain.models.resultModels.CommonError) = 
      (r15v0 com.api.core.backend.domain.models.resultModels.CommonError)
      (r15v2 com.api.core.backend.domain.models.resultModels.CommonError)
     binds: [B:27:0x00da, B:29:0x00e9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x00f2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:42:0x0134 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0127 -> B:13:0x0044). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.InterfaceC7350wB
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull defpackage.LM r26) {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7981zB.a(LM):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0068  */
    /* JADX WARN: Code duplicated, block: B:28:0x0072  */
    /* JADX WARN: Code duplicated, block: B:29:0x007d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0096  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00be  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(LM lm) {
        C7561xB c7561xB;
        InterfaceC1923Rk0 interfaceC1923Rk0;
        C7981zB c7981zB;
        C7981zB c7981zB2;
        CommonResult commonResult;
        C6753tM c6753tM;
        String configVersion;
        if (lm instanceof C7561xB) {
            c7561xB = (C7561xB) lm;
            int i = c7561xB.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                c7561xB.i = i - Integer.MIN_VALUE;
            } else {
                c7561xB = new C7561xB(this, lm);
            }
        } else {
            c7561xB = new C7561xB(this, lm);
        }
        Object objA = c7561xB.g;
        MN mn = MN.d;
        int i2 = c7561xB.i;
        Boolean boolValueOf = null;
        if (i2 == 0) {
            C1795Pt1.b(objA);
            c7561xB.d = this;
            interfaceC1923Rk0 = this.a;
            c7561xB.e = interfaceC1923Rk0;
            c7561xB.i = 1;
            objA = this.c.a(c7561xB);
            if (objA != mn) {
                c7981zB = this;
            }
            return mn;
        }
        if (i2 == 1) {
            interfaceC1923Rk0 = c7561xB.e;
            c7981zB = c7561xB.d;
            C1795Pt1.b(objA);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c7981zB2 = c7561xB.d;
            C1795Pt1.b(objA);
        }
        commonResult = (CommonResult) objA;
        if (commonResult instanceof ResultOk) {
            if (commonResult instanceof ResultError) {
                return commonResult;
            }
            throw new C6489s51();
        }
        c6753tM = c7981zB2.d;
        if (c7981zB2.e.o()) {
            configVersion = ((FF) ((ResultOk) commonResult).a()).n;
        } else {
            configVersion = ((FF) ((ResultOk) commonResult).a()).m;
        }
        c6753tM.getClass();
        Intrinsics.checkNotNullParameter(configVersion, "configVersion");
        if (configVersion.length() != 0) {
            String strA = c6753tM.b.a();
            Locale locale = Locale.ROOT;
            String lowerCase = strA.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            String lowerCase2 = configVersion.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            boolValueOf = Boolean.valueOf(QO.k(lowerCase, lowerCase2));
        }
        return boolValueOf != null ? new ResultOk(boolValueOf) : new ResultError(new CommonError.ConfigLocked());
        c7561xB.d = c7981zB;
        c7561xB.e = null;
        c7561xB.i = 2;
        objA = interfaceC1923Rk0.a((GF) objA, c7561xB);
        if (objA != mn) {
            c7981zB2 = c7981zB;
            commonResult = (CommonResult) objA;
            if (commonResult instanceof ResultOk) {
                if (commonResult instanceof ResultError) {
                    return commonResult;
                }
                throw new C6489s51();
            }
            c6753tM = c7981zB2.d;
            if (c7981zB2.e.o()) {
                configVersion = ((FF) ((ResultOk) commonResult).a()).n;
            } else {
                configVersion = ((FF) ((ResultOk) commonResult).a()).m;
            }
            c6753tM.getClass();
            Intrinsics.checkNotNullParameter(configVersion, "configVersion");
            if (configVersion.length() != 0) {
                String strA2 = c6753tM.b.a();
                Locale locale2 = Locale.ROOT;
                String lowerCase3 = strA2.toLowerCase(locale2);
                Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
                String lowerCase4 = configVersion.toLowerCase(locale2);
                Intrinsics.checkNotNullExpressionValue(lowerCase4, "toLowerCase(...)");
                boolValueOf = Boolean.valueOf(QO.k(lowerCase3, lowerCase4));
            }
            if (boolValueOf != null) {
            }
        }
        return mn;
    }
}
