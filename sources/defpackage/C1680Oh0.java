package defpackage;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Oh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1680Oh0 extends LZ1 {

    @NotNull
    public LZ1 e;

    public C1680Oh0(@NotNull LZ1 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.e = delegate;
    }

    @Override // defpackage.LZ1
    @NotNull
    public final LZ1 a() {
        return this.e.a();
    }

    @Override // defpackage.LZ1
    @NotNull
    public final LZ1 b() {
        return this.e.b();
    }

    @Override // defpackage.LZ1
    public final long c() {
        return this.e.c();
    }

    @Override // defpackage.LZ1
    @NotNull
    public final LZ1 d(long j) {
        return this.e.d(j);
    }

    @Override // defpackage.LZ1
    public final boolean e() {
        return this.e.e();
    }

    @Override // defpackage.LZ1
    public final void f() throws InterruptedIOException {
        this.e.f();
    }

    @Override // defpackage.LZ1
    @NotNull
    public final LZ1 g(long j, @NotNull TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return this.e.g(j, unit);
    }

    @Override // defpackage.LZ1
    public final long h() {
        return this.e.h();
    }
}
