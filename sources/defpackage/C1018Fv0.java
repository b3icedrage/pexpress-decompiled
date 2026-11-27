package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Fv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.amplitude.core.platform.intercept.IdentifyInterceptor$scheduleTransfer$1", f = "IdentifyInterceptor.kt", l = {101, 102}, m = "invokeSuspend")
public final class C1018Fv0 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C1174Hv0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1018Fv0(C1174Hv0 c1174Hv0, JM<? super C1018Fv0> jm) {
        super(2, jm);
        this.e = c1174Hv0;
    }

    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
        return new C1018Fv0(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C1018Fv0) create(kn, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        if (r2.c(r7) == r0) goto L17;
     */
    @Override // defpackage.AbstractC7487wq
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
        /*
            r7 = this;
            MN r0 = defpackage.MN.d
            int r1 = r7.d
            Hv0 r2 = r7.e
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            defpackage.C1795Pt1.b(r8)
            goto L44
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            defpackage.C1795Pt1.b(r8)
            goto L3b
        L1e:
            defpackage.C1795Pt1.b(r8)
            java.util.concurrent.atomic.AtomicBoolean r8 = r2.f
            boolean r8 = r8.get()
            if (r8 != 0) goto L4a
            java.util.concurrent.atomic.AtomicBoolean r8 = r2.f
            r8.getAndSet(r4)
            MI r8 = r2.d
            long r5 = r8.m
            r7.d = r4
            java.lang.Object r8 = defpackage.IW.b(r5, r7)
            if (r8 != r0) goto L3b
            goto L43
        L3b:
            r7.d = r3
            java.lang.Object r8 = r2.c(r7)
            if (r8 != r0) goto L44
        L43:
            return r0
        L44:
            java.util.concurrent.atomic.AtomicBoolean r8 = r2.f
            r0 = 0
            r8.getAndSet(r0)
        L4a:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1018Fv0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
