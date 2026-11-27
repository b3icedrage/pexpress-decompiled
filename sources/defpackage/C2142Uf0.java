package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Uf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", f = "Merge.kt", l = {213, 213}, m = "invokeSuspend")
public final class C2142Uf0 extends AW1 implements InterfaceC1060Gj0<InterfaceC6606sf0<Object>, Object, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ InterfaceC6606sf0 e;
    public /* synthetic */ Object g;
    public final /* synthetic */ AW1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2142Uf0(Function2<Object, ? super JM<Object>, ? extends Object> function2, JM<? super C2142Uf0> jm) {
        super(3, jm);
        this.h = (AW1) function2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (r1.a(r5, r4) == r0) goto L15;
     */
    /* JADX WARN: Type inference failed for: r3v1, types: [AW1, kotlin.jvm.functions.Function2] */
    @Override // defpackage.AbstractC7487wq
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
        /*
            r4 = this;
            MN r0 = defpackage.MN.d
            int r1 = r4.d
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
            sf0 r1 = r4.e
            defpackage.C1795Pt1.b(r5)
            goto L32
        L1e:
            defpackage.C1795Pt1.b(r5)
            sf0 r1 = r4.e
            java.lang.Object r5 = r4.g
            r4.e = r1
            r4.d = r3
            AW1 r3 = r4.h
            java.lang.Object r5 = r3.invoke(r5, r4)
            if (r5 != r0) goto L32
            goto L3d
        L32:
            r3 = 0
            r4.e = r3
            r4.d = r2
            java.lang.Object r5 = r1.a(r5, r4)
            if (r5 != r0) goto L3e
        L3d:
            return r0
        L3e:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2142Uf0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [AW1, kotlin.jvm.functions.Function2] */
    @Override // defpackage.InterfaceC1060Gj0
    public final Object k(InterfaceC6606sf0<Object> interfaceC6606sf0, Object obj, JM<? super Unit> jm) {
        C2142Uf0 c2142Uf0 = new C2142Uf0(this.h, jm);
        c2142Uf0.e = interfaceC6606sf0;
        c2142Uf0.g = obj;
        return c2142Uf0.invokeSuspend(Unit.a);
    }
}
