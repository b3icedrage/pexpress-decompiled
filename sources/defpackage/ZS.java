package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ZS extends ML0 implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ZS(Object obj, int i) {
        super(1);
        this.d = i;
        this.e = obj;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v8 L81, still in use, count: 2, list:
          (r2v8 L81) from 0x0031: PHI (r2 I:??) = (r2v5 L81), (r2v8 L81) binds: [B:12:0x0030, B:27:0x0031] A[DONT_GENERATE, DONT_INLINE]
          (r2v8 L81) from 0x002b: IGET (r2v8 L81) A[WRAPPED] (LINE:44) L81.a boolean
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.d
            switch(r0) {
                case 0: goto L3b;
                default: goto L5;
            }
        L5:
            jp r5 = (defpackage.C4751jp) r5
            java.lang.String r0 = "backEvent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.Object r1 = r4.e
            androidx.activity.OnBackPressedDispatcher r1 = (androidx.activity.OnBackPressedDispatcher) r1
            L81 r2 = r1.c
            if (r2 != 0) goto L33
            qj<L81> r1 = r1.b
            int r2 = r1.getG()
            java.util.ListIterator r1 = r1.listIterator(r2)
        L1e:
            boolean r2 = r1.hasPrevious()
            if (r2 == 0) goto L30
            java.lang.Object r2 = r1.previous()
            r3 = r2
            L81 r3 = (defpackage.L81) r3
            boolean r3 = r3.a
            if (r3 == 0) goto L1e
            goto L31
        L30:
            r2 = 0
        L31:
            L81 r2 = (defpackage.L81) r2
        L33:
            if (r2 == 0) goto L38
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
        L38:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        L3b:
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            java.lang.Object r0 = r4.e
            IS r0 = (defpackage.IS) r0
            if (r5 == 0) goto L4d
            eT<T> r1 = r0.h
            xd0 r2 = new xd0
            r2.<init>(r5)
            r1.b(r2)
        L4d:
            KW1 r5 = r0.j
            boolean r5 = r5.d()
            if (r5 == 0) goto L60
            KW1 r5 = r0.j
            java.lang.Object r5 = r5.getValue()
            MQ1 r5 = (defpackage.MQ1) r5
            r5.close()
        L60:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ZS.invoke(java.lang.Object):java.lang.Object");
    }
}
