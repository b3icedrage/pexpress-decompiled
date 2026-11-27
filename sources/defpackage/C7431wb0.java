package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: wb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.stub.usecases.FakeChartPointsUseCaseBase$subscribe$2", f = "FakeChartPointsUseCaseBase.kt", l = {30, 31}, m = "invokeSuspend")
public final class C7431wb0 extends AW1 implements Function2<InterfaceC6606sf0<? super CF>, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C7641xb0 g;
    public final /* synthetic */ String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7431wb0(C7641xb0 c7641xb0, String str, JM<? super C7431wb0> jm) {
        super(2, jm);
        this.g = c7641xb0;
        this.h = str;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        C7431wb0 c7431wb0 = new C7431wb0(this.g, this.h, jm);
        c7431wb0.e = obj;
        return c7431wb0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC6606sf0<? super CF> interfaceC6606sf0, JM<? super Unit> jm) {
        ((C7431wb0) create(interfaceC6606sf0, jm)).invokeSuspend(Unit.a);
        return MN.d;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0051  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
    
        if (defpackage.IW.c(r3, r10) == r0) goto L18;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005c -> B:7:0x0015). Please report as a decompilation issue!!! */
    @Override // defpackage.AbstractC7487wq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            MN r0 = defpackage.MN.d
            int r1 = r10.d
            xb0 r2 = r10.g
            r8 = 2
            r9 = 1
            if (r1 == 0) goto L27
            if (r1 == r9) goto L1f
            if (r1 != r8) goto L17
            java.lang.Object r1 = r10.e
            sf0 r1 = (defpackage.InterfaceC6606sf0) r1
            defpackage.C1795Pt1.b(r11)
        L15:
            r11 = r1
            goto L31
        L17:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1f:
            java.lang.Object r1 = r10.e
            sf0 r1 = (defpackage.InterfaceC6606sf0) r1
            defpackage.C1795Pt1.b(r11)
            goto L52
        L27:
            defpackage.C1795Pt1.b(r11)
            java.lang.Object r11 = r10.e
            sf0 r11 = (defpackage.InterfaceC6606sf0) r11
            r2.getClass()
        L31:
            r2.getClass()
            double r5 = r2.b
            r3 = 4607415254900752463(0x3ff0d3c36113404f, double:1.0517)
            java.lang.String r7 = r10.h
            CF r1 = defpackage.C7641xb0.c(r2, r3, r5, r7)
            float r3 = r1.c
            double r3 = (double) r3
            r2.b = r3
            r10.e = r11
            r10.d = r9
            java.lang.Object r1 = r11.a(r1, r10)
            if (r1 != r0) goto L51
            goto L5e
        L51:
            r1 = r11
        L52:
            long r3 = defpackage.C7641xb0.c
            r10.e = r1
            r10.d = r8
            java.lang.Object r11 = defpackage.IW.c(r3, r10)
            if (r11 != r0) goto L15
        L5e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7431wb0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
