package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Xv1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2455Xv1 implements InterfaceC2191Uv1 {

    @NotNull
    public final C4923kf a;

    @NotNull
    public final InterfaceC4315hz1 b;

    @NotNull
    public final C4617jA1 c;

    @NotNull
    public final GP1 d;

    @NotNull
    public final GP1 e;

    @NotNull
    public final GP1 f;

    @NotNull
    public final GP1 g;

    @NotNull
    public final GP1 h;

    @NotNull
    public final GP1 i;

    @NotNull
    public final GP1 j;

    @NotNull
    public final GP1 k;

    @NotNull
    public final GP1 l;

    @NotNull
    public final GP1 m;

    @NotNull
    public final GP1 n;

    @NotNull
    public final GP1 o;

    @NotNull
    public final GP1 p;

    @NotNull
    public final GP1 q;

    @NotNull
    public final GP1 r;

    @NotNull
    public final GP1 s;

    @NotNull
    public final C7786yG t;

    public C2455Xv1(@NotNull C4923kf appDataRepository, @NotNull InterfaceC4315hz1 robotScreenState, @NotNull C4617jA1 robotTrading) {
        Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
        Intrinsics.checkNotNullParameter(robotScreenState, "robotScreenState");
        Intrinsics.checkNotNullParameter(robotTrading, "robotTrading");
        this.a = appDataRepository;
        this.b = robotScreenState;
        this.c = robotTrading;
        Boolean bool = Boolean.FALSE;
        GP1 gp1I = C1589Ne.i(bool);
        this.d = gp1I;
        GP1 gp1I2 = C1589Ne.i(bool);
        this.e = gp1I2;
        GP1 gp1I3 = C1589Ne.i(bool);
        this.f = gp1I3;
        GP1 gp1I4 = C1589Ne.i(bool);
        this.g = gp1I4;
        GP1 gp1I5 = C1589Ne.i(bool);
        this.h = gp1I5;
        GP1 gp1I6 = C1589Ne.i(bool);
        this.i = gp1I6;
        GP1 gp1I7 = C1589Ne.i(bool);
        this.j = gp1I7;
        GP1 gp1I8 = C1589Ne.i(bool);
        this.k = gp1I8;
        GP1 gp1I9 = C1589Ne.i(bool);
        this.l = gp1I9;
        GP1 gp1I10 = C1589Ne.i(bool);
        this.m = gp1I10;
        GP1 gp1I11 = C1589Ne.i(bool);
        this.n = gp1I11;
        GP1 gp1I12 = C1589Ne.i(bool);
        this.o = gp1I12;
        GP1 gp1I13 = C1589Ne.i(bool);
        this.p = gp1I13;
        GP1 gp1I14 = C1589Ne.i(Boolean.TRUE);
        GP1 gp1I15 = C1589Ne.i(bool);
        this.q = gp1I15;
        GP1 gp1I16 = C1589Ne.i(bool);
        this.r = gp1I16;
        GP1 gp1I17 = C1589Ne.i(bool);
        this.s = gp1I17;
        this.t = new C7786yG(gp1I, gp1I2, gp1I3, gp1I4, gp1I5, gp1I6, gp1I7, gp1I8, gp1I9, gp1I10, gp1I11, gp1I12, gp1I13, gp1I14, gp1I15, gp1I16, gp1I17);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC2191Uv1
    @Nullable
    public final void a(@NotNull LM lm) {
        C2269Vv1 c2269Vv1;
        if (lm instanceof C2269Vv1) {
            c2269Vv1 = (C2269Vv1) lm;
            int i = c2269Vv1.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2269Vv1.g = i - Integer.MIN_VALUE;
            } else {
                c2269Vv1 = new C2269Vv1(this, lm);
            }
        } else {
            c2269Vv1 = new C2269Vv1(this, lm);
        }
        Object obj = c2269Vv1.d;
        MN mn = MN.d;
        int i2 = c2269Vv1.g;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            C1699On1 c1699On1B = this.b.b();
            C2351Wv1 c2351Wv1 = new C2351Wv1(this);
            c2269Vv1.g = 1;
            if (c1699On1B.d.c(c2351Wv1, c2269Vv1) == mn) {
                return;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        throw new C3342dL0();
    }

    @Override // defpackage.InterfaceC2191Uv1
    @NotNull
    public final C7786yG b() {
        return this.t;
    }
}
