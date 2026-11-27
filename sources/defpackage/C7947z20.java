package defpackage;

import java.util.concurrent.ScheduledFuture;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: z20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7947z20 implements A20 {

    @NotNull
    public final ScheduledFuture d;

    public C7947z20(@NotNull ScheduledFuture scheduledFuture) {
        this.d = scheduledFuture;
    }

    @Override // defpackage.A20
    public final void b() {
        this.d.cancel(false);
    }

    @NotNull
    public final String toString() {
        return "DisposableFutureHandle[" + this.d + ']';
    }
}
