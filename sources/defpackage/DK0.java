package defpackage;

import android.content.Context;
import com.api.core.backend.repositories.experiments.models.TestingFeaturesParamsRequest;
import com.api.feature.analytics.reporters.ReporterApi;
import com.appsflyer.share.attribution.RequestError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class DK0 extends K0 {

    @NotNull
    public final GK0 f;

    @NotNull
    public final AbstractC4425iW1 g;

    @InterfaceC3368dU(c = "com.base.feature.experiments.remote.knowledge_base.KnowledgeBaseExperiment", f = "KnowledgeBaseExperiment.kt", l = {48, 49, RequestError.RESPONSE_CODE_FAILURE}, m = "makeExperimentRequest")
    public static final class a extends LM {
        public DK0 d;
        public TestingFeaturesParamsRequest e;
        public /* synthetic */ Object g;
        public int i;

        public a(LM lm) {
            super(lm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.g = obj;
            this.i |= Integer.MIN_VALUE;
            return DK0.this.d(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DK0(@NotNull Context context, @NotNull ZT1 subIdProvider, @NotNull GK0 knowledgeBaseLocalExperiment, @NotNull InterfaceC0565Aa0 experimentsProvider, @NotNull InterfaceC0799Da0 experimentRepository, @NotNull ReporterApi reporter, @NotNull AbstractC4425iW1 testIsAvailableUseCase) {
        super(context, subIdProvider, experimentsProvider, experimentRepository, reporter);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(subIdProvider, "subIdProvider");
        Intrinsics.checkNotNullParameter(knowledgeBaseLocalExperiment, "knowledgeBaseLocalExperiment");
        Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
        Intrinsics.checkNotNullParameter(experimentRepository, "experimentRepository");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(testIsAvailableUseCase, "testIsAvailableUseCase");
        this.f = knowledgeBaseLocalExperiment;
        this.g = testIsAvailableUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0082  */
    /* JADX WARN: Code duplicated, block: B:34:0x0092 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x0093  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0077, code lost:
    
        if (r9 == r1) goto L33;
     */
    @Override // defpackage.AbstractC7216va0
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(@org.jetbrains.annotations.NotNull com.api.core.backend.repositories.experiments.models.TestingFeaturesParamsRequest r8, @org.jetbrains.annotations.NotNull defpackage.JM<? super com.api.core.backend.domain.models.resultModels.CommonResult<com.api.core.backend.repositories.experiments.models.TestingFeaturesParamsResponse>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof DK0.a
            if (r0 == 0) goto L13
            r0 = r9
            DK0$a r0 = (DK0.a) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L1a
        L13:
            DK0$a r0 = new DK0$a
            LM r9 = (defpackage.LM) r9
            r0.<init>(r9)
        L1a:
            java.lang.Object r9 = r0.g
            MN r1 = defpackage.MN.d
            int r2 = r0.i
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L49
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            defpackage.C1795Pt1.b(r9)
            return r9
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            DK0 r8 = r0.d
            defpackage.C1795Pt1.b(r9)
            goto L7a
        L3d:
            com.api.core.backend.repositories.experiments.models.TestingFeaturesParamsRequest r8 = r0.e
            DK0 r2 = r0.d
            defpackage.C1795Pt1.b(r9)
            r6 = r9
            r9 = r8
            r8 = r2
            r2 = r6
            goto L62
        L49:
            defpackage.C1795Pt1.b(r9)
            iW1 r9 = r7.g
            rf0 r9 = r9.k()
            r0.d = r7
            r0.e = r8
            r0.i = r5
            java.lang.Object r9 = defpackage.C4466ii.o(r9, r0)
            if (r9 != r1) goto L5f
            goto L91
        L5f:
            r2 = r9
            r9 = r8
            r8 = r7
        L62:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 == 0) goto L6b
            boolean r9 = r2.booleanValue()
            goto L80
        L6b:
            iW1 r2 = r8.g
            r0.d = r8
            r0.e = r9
            r0.i = r4
            java.lang.Object r9 = r2.m(r0)
            if (r9 != r1) goto L7a
            goto L91
        L7a:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
        L80:
            if (r9 == 0) goto L93
            r9 = 0
            r0.d = r9
            r0.e = r9
            r0.i = r3
            Da0 r8 = r8.a
            com.api.core.backend.domain.models.resultModels.ResultError r8 = r8.a()
            if (r8 != r1) goto L92
        L91:
            return r1
        L92:
            return r8
        L93:
            r8.getClass()
            com.api.core.backend.domain.models.resultModels.ResultOk r8 = new com.api.core.backend.domain.models.resultModels.ResultOk
            com.api.core.backend.repositories.experiments.models.TestingFeaturesParamsResponse r9 = new com.api.core.backend.repositories.experiments.models.TestingFeaturesParamsResponse
            r0 = 23
            r9.<init>(r0)
            r8.<init>(r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.DK0.d(com.api.core.backend.repositories.experiments.models.TestingFeaturesParamsRequest, JM):java.lang.Object");
    }

    @Override // defpackage.K0
    @NotNull
    public final C5718oQ1 e() {
        return new C5718oQ1(EnumC7637xa0.KNOWLEDGE_BASE, this.f.o());
    }
}
