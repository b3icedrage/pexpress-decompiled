package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.core.backend.domain.models.resultModels.ResultOk;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ic0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4444ic0 implements InterfaceC4234hc0 {

    @NotNull
    public final YV1 a;

    @NotNull
    public final InterfaceC0565Aa0 b;

    @NotNull
    public final GP1 c;

    @NotNull
    public final GP1 d;

    @NotNull
    public final C1699On1 e;

    @NotNull
    public final C1699On1 f;

    /* JADX INFO: renamed from: ic0$a */
    @InterfaceC3368dU(c = "com.base.feature.support.usecases.FetchKnowledgeBaseValuesUseCaseBase", f = "FetchKnowledgeBaseValuesUseCaseBase.kt", l = {28, 30}, m = "execute")
    public static final class a extends LM {
        public C4444ic0 d;
        public boolean e;
        public /* synthetic */ Object g;
        public int i;

        public a(JM<? super a> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.g = obj;
            this.i |= Integer.MIN_VALUE;
            return C4444ic0.this.b(false, this);
        }
    }

    public C4444ic0(@NotNull YV1 supportRepositoryApi, @NotNull InterfaceC0565Aa0 experimentsProviderApi) {
        Intrinsics.checkNotNullParameter(supportRepositoryApi, "supportRepositoryApi");
        Intrinsics.checkNotNullParameter(experimentsProviderApi, "experimentsProviderApi");
        this.a = supportRepositoryApi;
        this.b = experimentsProviderApi;
        C5653o60 c5653o60 = C5653o60.d;
        GP1 gp1I = C1589Ne.i(c5653o60);
        this.c = gp1I;
        GP1 gp1I2 = C1589Ne.i(c5653o60);
        this.d = gp1I2;
        this.e = C4466ii.f(gp1I);
        this.f = C4466ii.f(gp1I2);
    }

    @Override // defpackage.InterfaceC4234hc0
    public final C1699On1 a() {
        return this.f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        if (r2.d(r6, r0) == r1) goto L24;
     */
    @Override // defpackage.InterfaceC4234hc0
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(boolean r6, @org.jetbrains.annotations.NotNull defpackage.JM<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.C4444ic0.a
            if (r0 == 0) goto L13
            r0 = r7
            ic0$a r0 = (defpackage.C4444ic0.a) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            ic0$a r0 = new ic0$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.g
            MN r1 = defpackage.MN.d
            int r2 = r0.i
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.C1795Pt1.b(r7)
            goto L5d
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            boolean r6 = r0.e
            ic0 r2 = r0.d
            defpackage.C1795Pt1.b(r7)
            goto L4d
        L3a:
            defpackage.C1795Pt1.b(r7)
            r0.d = r5
            r0.e = r6
            r0.i = r4
            Aa0 r7 = r5.b
            java.lang.Enum r7 = defpackage.JK0.a(r7, r0)
            if (r7 != r1) goto L4c
            goto L5c
        L4c:
            r2 = r5
        L4d:
            HK0 r4 = defpackage.HK0.CONTROL_GROUP
            if (r7 == r4) goto L60
            r7 = 0
            r0.d = r7
            r0.i = r3
            java.lang.Object r6 = r2.d(r6, r0)
            if (r6 != r1) goto L5d
        L5c:
            return r1
        L5d:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        L60:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4444ic0.b(boolean, JM):java.lang.Object");
    }

    @Override // defpackage.InterfaceC4234hc0
    public final C1699On1 c() {
        return this.e;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(boolean z, LM lm) {
        C4702jc0 c4702jc0;
        C4444ic0 c4444ic0;
        if (lm instanceof C4702jc0) {
            c4702jc0 = (C4702jc0) lm;
            int i = c4702jc0.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4702jc0.h = i - Integer.MIN_VALUE;
            } else {
                c4702jc0 = new C4702jc0(this, lm);
            }
        } else {
            c4702jc0 = new C4702jc0(this, lm);
        }
        Object objA = c4702jc0.e;
        MN mn = MN.d;
        int i2 = c4702jc0.h;
        if (i2 == 0) {
            C1795Pt1.b(objA);
            String str = z ? "activated" : "nonActivated";
            c4702jc0.d = this;
            c4702jc0.h = 1;
            objA = this.a.a(str, c4702jc0);
            if (objA == mn) {
                return mn;
            }
            c4444ic0 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c4444ic0 = c4702jc0.d;
            C1795Pt1.b(objA);
        }
        CommonResult commonResult = (CommonResult) objA;
        if (commonResult instanceof ResultOk) {
            ResultOk resultOk = (ResultOk) commonResult;
            c4444ic0.d.setValue(((C3116cG) resultOk.a()).a);
            c4444ic0.c.setValue(((C3116cG) resultOk.a()).b);
        }
        return Unit.a;
    }
}
