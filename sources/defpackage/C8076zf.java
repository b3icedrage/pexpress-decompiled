package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: zf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.impl.core.backend.data_sources.AppDataSourceImpl$platformTime$2", f = "AppDataSourceImpl.kt", l = {29, 36}, m = "invokeSuspend")
public final class C8076zf extends AW1 implements Function2<InterfaceC6606sf0<? super CommonResult<? extends InterfaceC1247It1<Long>>>, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ Object e;

    /* JADX INFO: renamed from: zf$a */
    public static final class a implements InterfaceC1247It1<Long> {
        @Override // defpackage.InterfaceC1247It1
        public final Long a() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    public C8076zf() {
        throw null;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        C8076zf c8076zf = new C8076zf(2, jm);
        c8076zf.e = obj;
        return c8076zf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC6606sf0<? super CommonResult<? extends InterfaceC1247It1<Long>>> interfaceC6606sf0, JM<? super Unit> jm) {
        ((C8076zf) create(interfaceC6606sf0, jm)).invokeSuspend(Unit.a);
        return MN.d;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0041  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        if (defpackage.IW.c(r4, r6) == r0) goto L18;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0052 -> B:7:0x0013). Please report as a decompilation issue!!! */
    @Override // defpackage.AbstractC7487wq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            MN r0 = defpackage.MN.d
            int r1 = r6.d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L25
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            java.lang.Object r1 = r6.e
            sf0 r1 = (defpackage.InterfaceC6606sf0) r1
            defpackage.C1795Pt1.b(r7)
        L13:
            r7 = r1
            goto L2c
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            java.lang.Object r1 = r6.e
            sf0 r1 = (defpackage.InterfaceC6606sf0) r1
            defpackage.C1795Pt1.b(r7)
            goto L42
        L25:
            defpackage.C1795Pt1.b(r7)
            java.lang.Object r7 = r6.e
            sf0 r7 = (defpackage.InterfaceC6606sf0) r7
        L2c:
            com.api.core.backend.domain.models.resultModels.ResultOk r1 = new com.api.core.backend.domain.models.resultModels.ResultOk
            zf$a r4 = new zf$a
            r4.<init>()
            r1.<init>(r4)
            r6.e = r7
            r6.d = r3
            java.lang.Object r1 = r7.a(r1, r6)
            if (r1 != r0) goto L41
            goto L54
        L41:
            r1 = r7
        L42:
            kotlin.time.b$a r7 = kotlin.time.b.e
            R40 r7 = defpackage.R40.SECONDS
            long r4 = kotlin.time.c.g(r3, r7)
            r6.e = r1
            r6.d = r2
            java.lang.Object r7 = defpackage.IW.c(r4, r6)
            if (r7 != r0) goto L13
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8076zf.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
