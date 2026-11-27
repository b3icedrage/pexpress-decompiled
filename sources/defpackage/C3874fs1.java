package defpackage;

import com.base.feature.analytics.reporters.ReporterBase;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: fs1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.analytics.reporters.ReporterBase$launchUserTracking$2", f = "ReporterBase.kt", l = {UserVerificationMethods.USER_VERIFY_PATTERN, 130}, m = "invokeSuspend")
public final class C3874fs1 extends AW1 implements Function2<Boolean, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ boolean e;
    public final /* synthetic */ ReporterBase g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3874fs1(ReporterBase reporterBase, JM<? super C3874fs1> jm) {
        super(2, jm);
        this.g = reporterBase;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        C3874fs1 c3874fs1 = new C3874fs1(this.g, jm);
        c3874fs1.e = ((Boolean) obj).booleanValue();
        return c3874fs1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, JM<? super Unit> jm) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((C3874fs1) create(bool2, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        if (com.base.feature.analytics.reporters.ReporterBase.n(r2, r7) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
    
        if (r8 == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0055, code lost:
    
        return r0;
     */
    @Override // defpackage.AbstractC7487wq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            MN r0 = defpackage.MN.d
            int r1 = r7.d
            com.base.feature.analytics.reporters.ReporterBase r2 = r7.g
            r3 = 2
            r4 = 1
            r5 = 0
            GP1 r6 = r2.k
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            goto L1a
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            defpackage.C1795Pt1.b(r8)
            goto L56
        L1e:
            defpackage.C1795Pt1.b(r8)
            boolean r8 = r7.e
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r6.getClass()
            r6.m(r5, r1)
            if (r8 == 0) goto L36
            r7.d = r4
            java.lang.Object r8 = com.base.feature.analytics.reporters.ReporterBase.n(r2, r7)
            if (r8 != r0) goto L56
            goto L55
        L36:
            r7.d = r3
            ja r8 = r2.i
            if (r8 == 0) goto L3f
            r8.k(r5)
        L3f:
            ja r8 = r2.i
            if (r8 == 0) goto L51
            xW r8 = r8.n
            if (r8 == 0) goto L51
            java.lang.Object r8 = r8.z(r7)
            if (r8 != r0) goto L4e
            goto L53
        L4e:
            kotlin.Unit r8 = kotlin.Unit.a
            goto L53
        L51:
            kotlin.Unit r8 = kotlin.Unit.a
        L53:
            if (r8 != r0) goto L56
        L55:
            return r0
        L56:
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            r6.getClass()
            r6.m(r5, r8)
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3874fs1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
