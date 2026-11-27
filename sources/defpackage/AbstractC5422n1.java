package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: n1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5422n1 implements InterfaceC5721oR1 {
    public final int d;

    @NotNull
    public final InterfaceC5931pR1 e;
    public int g;
    public double h;

    public AbstractC5422n1(int i, @NotNull InterfaceC5931pR1 client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.d = i;
        this.e = client;
        this.g = i;
    }

    @Override // defpackage.InterfaceC5721oR1
    public final void a(int i) {
        this.g = i;
        i(i);
    }

    @Override // defpackage.InterfaceC5721oR1
    public final int b(@NotNull InterfaceC2441Xr betResult, double d) {
        R9 r9E;
        int iB;
        Intrinsics.checkNotNullParameter(betResult, "betResult");
        boolean z = betResult instanceof InterfaceC2441Xr.e;
        InterfaceC2441Xr.c cVar = InterfaceC2441Xr.c.a;
        if (z) {
            InterfaceC2441Xr.e eVar = (InterfaceC2441Xr.e) betResult;
            this.h = Math.abs(eVar.a) + this.h;
            S9 s9 = new S9(d, this.g, Math.abs(eVar.a), this.h);
            s9.toString();
            r9E = g(s9);
        } else if (betResult instanceof InterfaceC2441Xr.b) {
            InterfaceC2441Xr.b bVar = (InterfaceC2441Xr.b) betResult;
            this.h -= Math.abs(bVar.a);
            S9 s10 = new S9(d, this.g, -Math.abs(bVar.a), this.h);
            s10.toString();
            r9E = d(s10);
        } else if (Intrinsics.a(betResult, InterfaceC2441Xr.a.a)) {
            C6712t82 c6712t82 = new C6712t82(d, this.g, this.h);
            c6712t82.toString();
            r9E = c(c6712t82);
        } else if (Intrinsics.a(betResult, InterfaceC2441Xr.d.a)) {
            C6712t82 c6712t83 = new C6712t82(d, this.g, this.h);
            c6712t83.toString();
            r9E = f(c6712t83);
        } else {
            if (!Intrinsics.a(betResult, cVar)) {
                throw new C6489s51();
            }
            r9E = e();
        }
        if (r9E instanceof R9.b) {
            iB = ((R9.b) r9E).a;
            this.g = iB;
        } else {
            if (!(r9E instanceof R9.a)) {
                throw new C6489s51();
            }
            R9.a aVar = (R9.a) r9E;
            this.e.c(aVar.a);
            C2017Sp1.a.b(X91.class).f();
            iB = aVar.a.b(cVar, d);
            this.g = iB;
        }
        h(iB);
        return iB;
    }

    @NotNull
    public R9 c(@NotNull C6712t82 params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return new R9.b(params.b);
    }

    @NotNull
    public abstract R9 d(@NotNull S9 s9);

    @NotNull
    public R9 e() {
        return new R9.b(this.d);
    }

    @NotNull
    public R9 f(@NotNull C6712t82 params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return new R9.b(params.b);
    }

    @NotNull
    public abstract R9 g(@NotNull S9 s9);

    public void h(int i) {
    }

    public void i(int i) {
    }
}
