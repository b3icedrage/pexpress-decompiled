package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Mz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.changelanguage.screens.changelanguage.ChangeLanguageViewModelBase$updateLanguage$3", f = "ChangeLanguageViewModelBase.kt", l = {UserVerificationMethods.USER_VERIFY_EYEPRINT, 63}, m = "invokeSuspend")
public final class C1574Mz extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public InterfaceC1131Hh d;
    public RL0 e;
    public int g;
    public final /* synthetic */ C1263Iz h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1574Mz(C1263Iz c1263Iz, JM<? super C1574Mz> jm) {
        super(2, jm);
        this.h = c1263Iz;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C1574Mz(this.h, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C1574Mz) create(kn, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
    
        if (r3.a("", r8) == r0) goto L16;
     */
    @Override // defpackage.AbstractC7487wq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            MN r0 = defpackage.MN.d
            int r1 = r8.g
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            defpackage.C1795Pt1.b(r9)
            goto L57
        L10:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L18:
            RL0 r1 = r8.e
            Hh r3 = r8.d
            defpackage.C1795Pt1.b(r9)
            goto L42
        L20:
            defpackage.C1795Pt1.b(r9)
            Iz r9 = r8.h
            Hh r1 = r9.g
            hg0 r4 = new hg0
            GP1 r5 = r9.i
            r6 = 0
            r4.<init>(r5, r6)
            r8.d = r1
            RL0 r9 = r9.d
            r8.e = r9
            r8.g = r3
            java.lang.Object r3 = defpackage.C4466ii.o(r4, r8)
            if (r3 != r0) goto L3e
            goto L56
        L3e:
            r7 = r1
            r1 = r9
            r9 = r3
            r3 = r7
        L42:
            UL0 r9 = (defpackage.UL0) r9
            r1.a(r9)
            r9 = 0
            r8.d = r9
            r8.e = r9
            r8.g = r2
            java.lang.String r9 = ""
            java.lang.Object r9 = r3.a(r9, r8)
            if (r9 != r0) goto L57
        L56:
            return r0
        L57:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1574Mz.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
