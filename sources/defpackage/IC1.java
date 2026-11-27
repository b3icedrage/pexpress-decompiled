package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class IC1 extends AbstractC5391mr0 {

    @NotNull
    public final GC1 d;

    @NotNull
    public final C0850Dr0 e;

    @NotNull
    public final C2097Tq0 g;

    @NotNull
    public final C4944kk0 h;

    @NotNull
    public final C4944kk0 i;

    @NotNull
    public final InterfaceC2586Zn0 j;

    @NotNull
    public final CoroutineContext k;

    @NotNull
    public final C2836aw l;

    public IC1(@NotNull GC1 call, @NotNull byte[] body, @NotNull AbstractC5391mr0 origin) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.d = call;
        C2684aG0 c2684aG0B = ED.b();
        this.e = origin.g();
        this.g = origin.h();
        this.h = origin.d();
        this.i = origin.e();
        this.j = origin.a();
        this.k = origin.getE().t(c2684aG0B);
        this.l = C7652xe.a(body);
    }

    @Override // defpackage.InterfaceC1393Kq0
    @NotNull
    public final InterfaceC2586Zn0 a() {
        return this.j;
    }

    @Override // defpackage.AbstractC5391mr0
    public final C2250Vp0 b() {
        return this.d;
    }

    @Override // defpackage.AbstractC5391mr0
    @NotNull
    public final InterfaceC0942Ew c() {
        return this.l;
    }

    @Override // defpackage.AbstractC5391mr0
    @NotNull
    public final C4944kk0 d() {
        return this.h;
    }

    @Override // defpackage.AbstractC5391mr0
    @NotNull
    public final C4944kk0 e() {
        return this.i;
    }

    @Override // defpackage.KN
    @NotNull
    /* JADX INFO: renamed from: f */
    public final CoroutineContext getE() {
        return this.k;
    }

    @Override // defpackage.AbstractC5391mr0
    @NotNull
    public final C0850Dr0 g() {
        return this.e;
    }

    @Override // defpackage.AbstractC5391mr0
    @NotNull
    public final C2097Tq0 h() {
        return this.g;
    }
}
