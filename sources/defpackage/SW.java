package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class SW extends AbstractC5391mr0 {

    @NotNull
    public final PW d;

    @NotNull
    public final InterfaceC0942Ew e;

    @NotNull
    public final AbstractC5391mr0 g;

    @NotNull
    public final CoroutineContext h;

    public SW(@NotNull PW call, @NotNull InterfaceC0942Ew content, @NotNull AbstractC5391mr0 origin) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.d = call;
        this.e = content;
        this.g = origin;
        this.h = origin.getE();
    }

    @Override // defpackage.InterfaceC1393Kq0
    @NotNull
    public final InterfaceC2586Zn0 a() {
        return this.g.a();
    }

    @Override // defpackage.AbstractC5391mr0
    @NotNull
    public final C2250Vp0 b() {
        return this.d;
    }

    @Override // defpackage.AbstractC5391mr0
    @NotNull
    public final InterfaceC0942Ew c() {
        return this.e;
    }

    @Override // defpackage.AbstractC5391mr0
    @NotNull
    public final C4944kk0 d() {
        return this.g.d();
    }

    @Override // defpackage.AbstractC5391mr0
    @NotNull
    public final C4944kk0 e() {
        return this.g.e();
    }

    @Override // defpackage.KN
    @NotNull
    /* JADX INFO: renamed from: f */
    public final CoroutineContext getE() {
        return this.h;
    }

    @Override // defpackage.AbstractC5391mr0
    @NotNull
    public final C0850Dr0 g() {
        return this.g.g();
    }

    @Override // defpackage.AbstractC5391mr0
    @NotNull
    public final C2097Tq0 h() {
        return this.g.h();
    }
}
