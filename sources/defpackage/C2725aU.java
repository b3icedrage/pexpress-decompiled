package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: aU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2725aU implements ES0 {

    @NotNull
    public final InterfaceC7195vT0 a;

    @NotNull
    public final AtomicLong b;

    public C2725aU(@NotNull InterfaceC7195vT0 logsRepository) {
        Intrinsics.checkNotNullParameter(logsRepository, "logsRepository");
        this.a = logsRepository;
        this.b = new AtomicLong(0L);
    }

    @Override // defpackage.ES0
    public final void a() {
        this.a.b(new AbstractC5723oS0.b(this.b.getAndIncrement()));
    }

    @Override // defpackage.ES0
    public final void b(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.a.b(new AbstractC5723oS0.f(message, this.b.getAndIncrement()));
    }

    @Override // defpackage.ES0
    public final void c() {
        this.a.b(new AbstractC5723oS0.a(this.b.getAndIncrement()));
    }

    @Override // defpackage.ES0
    public final void d() {
        Intrinsics.checkNotNullParameter(" ", "message");
        this.a.b(new AbstractC5723oS0.e(this.b.getAndIncrement()));
    }

    @Override // defpackage.ES0
    public final void e(int i, @NotNull String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.a.b(new AbstractC5723oS0.c(reason, i, this.b.getAndIncrement()));
    }

    @Override // defpackage.ES0
    public final void f(@NotNull Throwable cause) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        this.a.b(new AbstractC5723oS0.d(this.b.getAndIncrement(), cause));
    }

    @Override // defpackage.ES0
    public final void g(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.a.b(new AbstractC5723oS0.g(message, this.b.getAndIncrement()));
    }

    @Override // defpackage.ES0
    public final void h(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.a.b(new AbstractC5723oS0.h(message, this.b.getAndIncrement()));
    }
}
