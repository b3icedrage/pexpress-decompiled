package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Ze1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "com.impl.feature.platform.screens.platform.PlatformViewModelImpl$demoBalanceChanged$1", f = "PlatformViewModelImpl.kt", l = {85, ModuleDescriptor.MODULE_VERSION, 87}, m = "invokeSuspend")
public final class C2560Ze1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public String d;
    public int e;
    public final /* synthetic */ C2765af1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2560Ze1(C2765af1 c2765af1, JM<? super C2560Ze1> jm) {
        super(2, jm);
        this.g = c2765af1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C2560Ze1(this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C2560Ze1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        if (r8.h(r2, r7) == r0) goto L20;
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
            int r1 = r7.e
            af1 r2 = r7.g
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L27
            if (r1 == r5) goto L23
            if (r1 == r4) goto L1d
            if (r1 != r3) goto L15
            defpackage.C1795Pt1.b(r8)
            goto L5d
        L15:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1d:
            java.lang.String r1 = r7.d
            defpackage.C1795Pt1.b(r8)
            goto L4a
        L23:
            defpackage.C1795Pt1.b(r8)
            goto L39
        L27:
            defpackage.C1795Pt1.b(r8)
            int r8 = defpackage.C2765af1.G
            kf r8 = r2.d
            GP1 r8 = r8.f
            r7.e = r5
            java.lang.Object r8 = defpackage.C7236vf0.a(r8, r7)
            if (r8 != r0) goto L39
            goto L5c
        L39:
            rG r8 = (defpackage.C6315rG) r8
            java.lang.String r1 = r8.a
            long r5 = defpackage.C2765af1.F
            r7.d = r1
            r7.e = r4
            java.lang.Object r8 = defpackage.IW.c(r5, r7)
            if (r8 != r0) goto L4a
            goto L5c
        L4a:
            ub2 r8 = r2.C
            XF r2 = new XF
            r2.<init>(r1)
            r1 = 0
            r7.d = r1
            r7.e = r3
            java.lang.Object r8 = r8.h(r2, r7)
            if (r8 != r0) goto L5d
        L5c:
            return r0
        L5d:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2560Ze1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
