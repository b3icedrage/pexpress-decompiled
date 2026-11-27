package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Ai1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.profileandsettings.profile.screens.ProfileViewModelBase$invalidateTextField$1", f = "ProfileViewModelBase.kt", l = {141, 141}, m = "invokeSuspend")
public final class C0590Ai1 extends AW1 implements Function1<JM<? super Unit>, Object> {
    public C6120qK1 d;
    public int e;
    public final /* synthetic */ AbstractC8090zi1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0590Ai1(AbstractC8090zi1 abstractC8090zi1, JM<? super C0590Ai1> jm) {
        super(1, jm);
        this.g = abstractC8090zi1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C0590Ai1(this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super Unit> jm) {
        return ((C0590Ai1) create(jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (r1.a(r5, r4) == r0) goto L15;
     */
    @Override // defpackage.AbstractC7487wq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            MN r0 = defpackage.MN.d
            int r1 = r4.e
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            defpackage.C1795Pt1.b(r5)
            goto L3e
        L10:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L18:
            qK1 r1 = r4.d
            defpackage.C1795Pt1.b(r5)
            goto L32
        L1e:
            defpackage.C1795Pt1.b(r5)
            zi1 r5 = r4.g
            qK1 r1 = r5.n
            r4.d = r1
            r4.e = r3
            Nn1 r5 = r5.o
            java.lang.Object r5 = defpackage.C4466ii.o(r5, r4)
            if (r5 != r0) goto L32
            goto L3d
        L32:
            r3 = 0
            r4.d = r3
            r4.e = r2
            java.lang.Object r5 = r1.a(r5, r4)
            if (r5 != r0) goto L3e
        L3d:
            return r0
        L3e:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0590Ai1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
