package defpackage;

import java.util.concurrent.Future;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Ku0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC1405Ku0 {
    void a(long j);

    void b();

    @NotNull
    Future<?> c(@NotNull Runnable runnable, long j);

    boolean isClosed();

    @NotNull
    Future<?> submit(@NotNull Runnable runnable);
}
