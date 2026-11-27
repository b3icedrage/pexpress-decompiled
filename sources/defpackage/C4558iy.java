package defpackage;

import java.util.concurrent.ScheduledFuture;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: iy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4558iy implements InterfaceC4778jy {

    @NotNull
    public final ScheduledFuture d;

    public C4558iy(@NotNull ScheduledFuture scheduledFuture) {
        this.d = scheduledFuture;
    }

    @Override // defpackage.InterfaceC4778jy
    public final void a(@Nullable Throwable th) {
        if (th != null) {
            this.d.cancel(false);
        }
    }

    @NotNull
    public final String toString() {
        return "CancelFutureOnCancel[" + this.d + ']';
    }
}
