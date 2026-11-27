package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: pO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.providers.CouponProviderBase$startTimerCollector$2$1", f = "CouponProviderBase.kt", l = {85}, m = "invokeSuspend")
public final class C5920pO extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ C5077lO g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5920pO(long j, C5077lO c5077lO, JM<? super C5920pO> jm) {
        super(2, jm);
        this.e = j;
        this.g = c5077lO;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C5920pO(this.e, this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C5920pO) create(kn, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    /* JADX WARN: Code duplicated, block: B:13:0x0040 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x003e -> B:14:0x0041). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.AbstractC7487wq
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            MN r0 = defpackage.MN.d
            int r1 = r9.d
            long r2 = r9.e
            r4 = 1
            if (r1 == 0) goto L17
            if (r1 != r4) goto Lf
            defpackage.C1795Pt1.b(r10)
            goto L41
        Lf:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L17:
            defpackage.C1795Pt1.b(r10)
            long r5 = java.lang.System.currentTimeMillis()
        L1e:
            long r5 = r2 - r5
            r7 = 0
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r1 = 0
            lO r7 = r9.g
            if (r10 <= 0) goto L46
            GP1 r10 = r7.g
            java.lang.Long r7 = new java.lang.Long
            r7.<init>(r5)
            r10.getClass()
            r10.m(r1, r7)
            r9.d = r4
            r5 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r10 = defpackage.IW.b(r5, r9)
            if (r10 != r0) goto L41
            return r0
        L41:
            long r5 = java.lang.System.currentTimeMillis()
            goto L1e
        L46:
            GP1 r10 = r7.g
            java.lang.Long r0 = new java.lang.Long
            r2 = -1
            r0.<init>(r2)
            r10.getClass()
            r10.m(r1, r0)
            kotlin.Unit r10 = kotlin.Unit.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5920pO.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
