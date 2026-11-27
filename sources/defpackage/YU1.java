package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class YU1 extends AbstractC6048q0<C3163cV1, C2730aV1.a> {

    @NotNull
    public final Set<E10> j;

    @NotNull
    public final String k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YU1(@NotNull Set<E10> directionCalculatorsSet, @NotNull InterfaceC6444rs1 requestCandlesHistoryUseCase, @NotNull InterfaceC4270hl0 getPlatformTimeUseCase, @NotNull C4953km1 randomDirectionCalculator, @NotNull AbstractC7949z22 tradingAssetsProvider, @NotNull InterfaceC4209hU1 subscribeToValueUpdatesUseCase, @NotNull C2730aV1 summaryIndicatorParamsProvider) {
        super(requestCandlesHistoryUseCase, getPlatformTimeUseCase, randomDirectionCalculator, tradingAssetsProvider, subscribeToValueUpdatesUseCase, summaryIndicatorParamsProvider);
        Intrinsics.checkNotNullParameter(directionCalculatorsSet, "directionCalculatorsSet");
        Intrinsics.checkNotNullParameter(requestCandlesHistoryUseCase, "requestCandlesHistoryUseCase");
        Intrinsics.checkNotNullParameter(getPlatformTimeUseCase, "getPlatformTimeUseCase");
        Intrinsics.checkNotNullParameter(randomDirectionCalculator, "randomDirectionCalculator");
        Intrinsics.checkNotNullParameter(tradingAssetsProvider, "tradingAssetsProvider");
        Intrinsics.checkNotNullParameter(subscribeToValueUpdatesUseCase, "subscribeToValueUpdatesUseCase");
        Intrinsics.checkNotNullParameter(summaryIndicatorParamsProvider, "summaryIndicatorParamsProvider");
        this.j = directionCalculatorsSet;
        CR0 cr0 = CR0.ADX;
        this.k = "summary";
    }

    @Override // defpackage.E10
    @NotNull
    public final String a() {
        return this.k;
    }

    @Override // defpackage.AbstractC6048q0, defpackage.E10
    @Nullable
    public final Object b(@NotNull I10 i10, @NotNull LM lm) {
        C3279d22 asset = i10.a;
        Intrinsics.checkNotNullParameter(asset, "asset");
        return AbstractC6048q0.e(this, new I10(asset, i10.b, i10.c, i10.d, i10.e, i10.f, false), lm);
    }

    @Override // defpackage.AbstractC6048q0
    public final Object g(E10.c cVar, InterfaceC7722xy0 interfaceC7722xy0, C6257r0 c6257r0) {
        C3163cV1 c3163cV1 = (C3163cV1) cVar;
        C2730aV1.a aVar = (C2730aV1.a) interfaceC7722xy0;
        int i = c3163cV1.a;
        int i2 = c3163cV1.b;
        E10.b.b(this, "call-up count: " + i + ", put-down count: " + i2 + ", random results: " + ((this.j.size() - i) - i2));
        if (i > i2) {
            return i(H32.a.CALL_UP, aVar);
        }
        return i < i2 ? i(H32.a.PUT_DOWN, aVar) : k(c6257r0);
    }

    @Override // defpackage.AbstractC6048q0
    public final /* bridge */ /* synthetic */ Object m(List list, I10 i10, InterfaceC7722xy0 interfaceC7722xy0, E10.c cVar, LM lm) {
        return p(list, i10, (C3163cV1) cVar, lm);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0061  */
    /* JADX WARN: Code duplicated, block: B:19:0x0082 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0083  */
    /* JADX WARN: Code duplicated, block: B:23:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0096  */
    /* JADX WARN: Code duplicated, block: B:25:0x009c  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0083 -> B:21:0x0088). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Enum p(@org.jetbrains.annotations.NotNull java.util.List r9, @org.jetbrains.annotations.NotNull defpackage.I10 r10, @org.jetbrains.annotations.NotNull defpackage.C3163cV1 r11, @org.jetbrains.annotations.NotNull defpackage.LM r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof defpackage.XU1
            if (r0 == 0) goto L13
            r0 = r12
            XU1 r0 = (defpackage.XU1) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            XU1 r0 = new XU1
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.k
            MN r1 = defpackage.MN.d
            int r2 = r0.m
            r3 = 1
            if (r2 == 0) goto L41
            if (r2 != r3) goto L39
            java.util.Iterator r9 = r0.j
            Zo1 r10 = r0.i
            Zo1 r11 = r0.h
            cV1 r2 = r0.g
            I10 r4 = r0.e
            java.util.List r5 = r0.d
            defpackage.C1795Pt1.b(r12)
            r7 = r4
            r4 = r10
            r10 = r5
            r5 = r0
            r0 = r11
            r11 = r7
            goto L88
        L39:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L41:
            defpackage.C1795Pt1.b(r12)
            Zo1 r12 = new Zo1
            r12.<init>()
            Zo1 r2 = new Zo1
            r2.<init>()
            java.util.Set<E10> r4 = r8.j
            java.util.Iterator r4 = r4.iterator()
            r7 = r10
            r10 = r9
            r9 = r4
            r4 = r0
            r0 = r12
            r12 = r11
            r11 = r7
        L5b:
            boolean r5 = r9.hasNext()
            if (r5 == 0) goto Lab
            java.lang.Object r5 = r9.next()
            E10 r5 = (defpackage.E10) r5
            java.lang.String r6 = "null cannot be cast to non-null type com.api.feature.trading.direction.base_calculators.AbstractLocalDirectionCalculator<*, *>"
            kotlin.jvm.internal.Intrinsics.c(r5, r6)
            q0 r5 = (defpackage.AbstractC6048q0) r5
            r4.d = r10
            r4.e = r11
            r4.g = r12
            r4.h = r0
            r4.i = r2
            r4.j = r9
            r4.m = r3
            java.lang.Object r5 = r5.d(r10, r11, r4)
            if (r5 != r1) goto L83
            return r1
        L83:
            r7 = r2
            r2 = r12
            r12 = r5
            r5 = r4
            r4 = r7
        L88:
            O10 r12 = (defpackage.O10) r12
            H32$a r12 = r12.a()
            int r12 = r12.ordinal()
            if (r12 == 0) goto La2
            if (r12 != r3) goto L9c
            int r12 = r4.d
            int r12 = r12 + r3
            r4.d = r12
            goto La7
        L9c:
            s51 r9 = new s51
            r9.<init>()
            throw r9
        La2:
            int r12 = r0.d
            int r12 = r12 + r3
            r0.d = r12
        La7:
            r12 = r2
            r2 = r4
            r4 = r5
            goto L5b
        Lab:
            int r9 = r0.d
            r12.a = r9
            int r9 = r2.d
            r12.b = r9
            Tt1 r9 = defpackage.EnumC2107Tt1.d
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.YU1.p(java.util.List, I10, cV1, LM):java.lang.Enum");
    }
}
