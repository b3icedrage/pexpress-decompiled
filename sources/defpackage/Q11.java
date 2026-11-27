package defpackage;

import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class Q11 implements InterfaceC7187vQ1 {

    @NotNull
    public final CQ0 a;

    public Q11(@NotNull U22 tradingDefaultsProvider, @NotNull O3 accountModeSelectionUseCase, @NotNull RT0 lossLimitUseCase, @NotNull InterfaceC2152Ui1 profitLimitUseCase, @NotNull MT0 lossLimitRemovedLocalExperiment) {
        Intrinsics.checkNotNullParameter(tradingDefaultsProvider, "tradingDefaultsProvider");
        Intrinsics.checkNotNullParameter(accountModeSelectionUseCase, "accountModeSelectionUseCase");
        Intrinsics.checkNotNullParameter(lossLimitUseCase, "lossLimitUseCase");
        Intrinsics.checkNotNullParameter(profitLimitUseCase, "profitLimitUseCase");
        Intrinsics.checkNotNullParameter(lossLimitRemovedLocalExperiment, "lossLimitRemovedLocalExperiment");
        CQ0 cq0B = VE.b();
        if (lossLimitRemovedLocalExperiment.n()) {
            cq0B.add(new QT0(tradingDefaultsProvider, accountModeSelectionUseCase, lossLimitUseCase));
        }
        cq0B.add(new XX0(tradingDefaultsProvider, accountModeSelectionUseCase, profitLimitUseCase));
        this.a = VE.a(cq0B);
    }

    @Override // defpackage.InterfaceC7187vQ1
    public final void a(@Nullable K12.a aVar) {
        ListIterator listIterator = this.a.listIterator(0);
        while (true) {
            CQ0.c cVar = (CQ0.c) listIterator;
            if (!cVar.hasNext()) {
                return;
            } else {
                ((AbstractC5212m1) cVar.next()).a = aVar;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0061 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0062  */
    /* JADX WARN: Code duplicated, block: B:28:0x006d  */
    /* JADX WARN: Code duplicated, block: B:29:0x006f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0062 -> B:26:0x0065). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.InterfaceC7187vQ1
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object b(@org.jetbrains.annotations.NotNull defpackage.C7398wQ1 r7, @org.jetbrains.annotations.NotNull defpackage.LM r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.P11
            if (r0 == 0) goto L13
            r0 = r8
            P11 r0 = (defpackage.P11) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            P11 r0 = new P11
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.g
            MN r1 = defpackage.MN.d
            int r2 = r0.i
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            java.util.Iterator r7 = r0.e
            wQ1 r2 = r0.d
            defpackage.C1795Pt1.b(r8)
            goto L65
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            defpackage.C1795Pt1.b(r8)
            CQ0 r8 = r6.a
            if (r8 == 0) goto L42
            boolean r2 = r8.isEmpty()
            if (r2 == 0) goto L42
            goto L71
        L42:
            java.util.ListIterator r8 = r8.listIterator(r3)
            r5 = r8
            r8 = r7
            r7 = r5
        L49:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L71
            java.lang.Object r2 = r7.next()
            m1 r2 = (defpackage.AbstractC5212m1) r2
            r0.d = r8
            r0.e = r7
            r0.i = r4
            java.lang.Object r2 = r2.b(r8, r0)
            if (r2 != r1) goto L62
            return r1
        L62:
            r5 = r2
            r2 = r8
            r8 = r5
        L65:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L6f
            r3 = r4
            goto L71
        L6f:
            r8 = r2
            goto L49
        L71:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Q11.b(wQ1, LM):java.lang.Object");
    }
}
