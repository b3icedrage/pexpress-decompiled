package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Bi1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.profileandsettings.profile.screens.ProfileViewModelBase$onDoneEditing$1", f = "ProfileViewModelBase.kt", l = {116, 119, 120}, m = "invokeSuspend")
public final class C0668Bi1 extends AW1 implements Function1<JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ AbstractC8090zi1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0668Bi1(AbstractC8090zi1 abstractC8090zi1, JM<? super C0668Bi1> jm) {
        super(1, jm);
        this.e = abstractC8090zi1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C0668Bi1(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super Unit> jm) {
        return ((C0668Bi1) create(jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
    
        if (r8.a(null, r7) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007d, code lost:
    
        if (r8.a(r5, r7) == r0) goto L32;
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
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            zi1 r6 = r7.e
            if (r1 == 0) goto L23
            if (r1 == r4) goto L1f
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            goto L1b
        L13:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1b:
            defpackage.C1795Pt1.b(r8)
            goto L80
        L1f:
            defpackage.C1795Pt1.b(r8)
            goto L3b
        L23:
            defpackage.C1795Pt1.b(r8)
            GP1 r8 = r6.p
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r8.getClass()
            r8.m(r5, r1)
            r7.d = r4
            Nn1 r8 = r6.o
            java.lang.Object r8 = defpackage.C4466ii.o(r8, r7)
            if (r8 != r0) goto L3b
            goto L7f
        L3b:
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L54
            int r1 = r8.length()
            if (r1 != 0) goto L46
            goto L54
        L46:
            yC1 r0 = r6.f
            java.lang.CharSequence r8 = kotlin.text.StringsKt.d0(r8)
            java.lang.String r8 = r8.toString()
            r0.a(r8)
            goto L80
        L54:
            if (r8 != 0) goto L61
            qK1 r8 = r6.n
            r7.d = r3
            java.lang.Object r8 = r8.a(r5, r7)
            if (r8 != r0) goto L80
            goto L7f
        L61:
            int r8 = r8.length()
            if (r8 != 0) goto L80
            qK1 r8 = r6.n
            kf r1 = r6.d
            GP1 r1 = r1.c
            java.lang.Object r1 = r1.getValue()
            qG r1 = (defpackage.C6106qG) r1
            if (r1 == 0) goto L77
            java.lang.String r5 = r1.b
        L77:
            r7.d = r2
            java.lang.Object r8 = r8.a(r5, r7)
            if (r8 != r0) goto L80
        L7f:
            return r0
        L80:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0668Bi1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
