package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: rT1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6356rT1 implements InterfaceC5937pT1 {

    @NotNull
    public final US1 a;

    @NotNull
    public final C6120qK1 b;

    @NotNull
    public final GP1 c;

    @Nullable
    public JQ d;

    public C6356rT1(@NotNull US1 stubCurrentChartPositionProvider) {
        Intrinsics.checkNotNullParameter(stubCurrentChartPositionProvider, "stubCurrentChartPositionProvider");
        this.a = stubCurrentChartPositionProvider;
        this.b = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        this.c = C1589Ne.i(Boolean.FALSE);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // defpackage.InterfaceC5937pT1
    @Nullable
    public final Object a(@NotNull H32.a aVar, double d, @NotNull LM lm) {
        C6147qT1 c6147qT1;
        JQ jq;
        C6356rT1 c6356rT1;
        TS1 bVar;
        C6356rT1 c6356rT2;
        if (lm instanceof C6147qT1) {
            c6147qT1 = (C6147qT1) lm;
            int i = c6147qT1.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                c6147qT1.i = i - Integer.MIN_VALUE;
            } else {
                c6147qT1 = new C6147qT1(this, lm);
            }
        } else {
            c6147qT1 = new C6147qT1(this, lm);
        }
        Object obj = c6147qT1.g;
        Object obj2 = MN.d;
        int i2 = c6147qT1.i;
        if (i2 != 0) {
            if (i2 == 1) {
                jq = c6147qT1.e;
                c6356rT1 = c6147qT1.d;
                C1795Pt1.b(obj);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c6356rT2 = c6147qT1.d;
                C1795Pt1.b(obj);
            }
            c6356rT2.d = null;
            Boolean bool = Boolean.FALSE;
            GP1 gp1 = c6356rT2.c;
            gp1.getClass();
            gp1.m(null, bool);
            return Unit.a;
        }
        C1795Pt1.b(obj);
        if (this.d != null) {
            return Unit.a;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        InterfaceC3786fT1.a.getClass();
        long j = InterfaceC3786fT1.a.b;
        JQ jq2 = new JQ(jCurrentTimeMillis, jCurrentTimeMillis2 + b.l(j), 15, "$", aVar, "", d);
        Boolean bool2 = Boolean.TRUE;
        GP1 gp2 = this.c;
        gp2.getClass();
        gp2.m(null, bool2);
        this.d = jq2;
        c6147qT1.d = this;
        c6147qT1.e = jq2;
        c6147qT1.i = 1;
        Object objC = IW.c(j, c6147qT1);
        if (objC != obj2) {
            objC = Unit.a;
        }
        if (objC != obj2) {
            jq = jq2;
            c6356rT1 = this;
        }
        return obj2;
        C6120qK1 c6120qK1 = c6356rT1.b;
        double d2 = ((double) c6356rT1.a.a.e().b) - jq.g;
        int iOrdinal = jq.e.ordinal();
        int i3 = jq.c;
        if (iOrdinal == 0) {
            bVar = d2 > 0.0d ? new TS1.b(i3 * 0.82f) : new TS1.a(-i3);
        } else {
            if (iOrdinal != 1) {
                throw new C6489s51();
            }
            bVar = d2 < 0.0d ? new TS1.b(i3 * 0.82f) : new TS1.a(-i3);
        }
        c6147qT1.d = c6356rT1;
        c6147qT1.e = null;
        c6147qT1.i = 2;
        if (c6120qK1.a(bVar, c6147qT1) != obj2) {
            c6356rT2 = c6356rT1;
            c6356rT2.d = null;
            Boolean bool3 = Boolean.FALSE;
            GP1 gp3 = c6356rT2.c;
            gp3.getClass();
            gp3.m(null, bool3);
            return Unit.a;
        }
        return obj2;
    }

    @Override // defpackage.InterfaceC5937pT1
    @Nullable
    public final JQ b() {
        return this.d;
    }

    @Override // defpackage.InterfaceC5937pT1
    public final GP1 c() {
        return this.c;
    }

    @Override // defpackage.InterfaceC5937pT1
    public final C6120qK1 d() {
        return this.b;
    }
}
