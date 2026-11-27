package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: i51, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4339i51 implements InterfaceC1405Ku0 {
    public static final C4339i51 a = new C4339i51();

    @Override // defpackage.InterfaceC1405Ku0
    @NotNull
    public final Future<?> c(@NotNull Runnable runnable, long j) {
        return new FutureTask(new CallableC4129h51());
    }

    @Override // defpackage.InterfaceC1405Ku0
    public final boolean isClosed() {
        return false;
    }

    @Override // defpackage.InterfaceC1405Ku0
    @NotNull
    public final Future<?> submit(@NotNull Runnable runnable) {
        return new FutureTask(new CallableC4129h51());
    }

    @Override // defpackage.InterfaceC1405Ku0
    public final void b() {
    }

    @Override // defpackage.InterfaceC1405Ku0
    public final void a(long j) {
    }
}
