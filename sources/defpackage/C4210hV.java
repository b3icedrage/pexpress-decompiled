package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: hV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.amplitude.android.utilities.DefaultEventUtils$trackAppUpdatedInstalledEvent$1", f = "DefaultEventUtils.kt", l = {84, 85}, m = "invokeSuspend")
public final class C4210hV extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ LQ1 e;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4210hV(LQ1 lq1, String str, String str2, JM<? super C4210hV> jm) {
        super(2, jm);
        this.e = lq1;
        this.g = str;
        this.h = str2;
    }

    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
        return new C4210hV(this.e, this.g, this.h, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C4210hV) create(kn, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        if (r2.h(r7, r6.h) == r0) goto L15;
     */
    @Override // defpackage.AbstractC7487wq
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
        /*
            r6 = this;
            MN r0 = defpackage.MN.d
            int r1 = r6.d
            LQ1 r2 = r6.e
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            defpackage.C1795Pt1.b(r7)
            goto L40
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            defpackage.C1795Pt1.b(r7)
            goto L33
        L1e:
            defpackage.C1795Pt1.b(r7)
            LQ1$a r7 = LQ1.a.APP_VERSION
            java.lang.String r1 = r6.g
            java.lang.String r5 = "currentVersion"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r5)
            r6.d = r4
            kotlin.Unit r7 = r2.h(r7, r1)
            if (r7 != r0) goto L33
            goto L3f
        L33:
            LQ1$a r7 = LQ1.a.APP_BUILD
            r6.d = r3
            java.lang.String r1 = r6.h
            kotlin.Unit r7 = r2.h(r7, r1)
            if (r7 != r0) goto L40
        L3f:
            return r0
        L40:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4210hV.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
