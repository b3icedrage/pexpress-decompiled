package defpackage;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: St1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2029St1 implements Runnable {

    @NotNull
    public final Y90 d;

    @NotNull
    public final C6251qy e;

    public RunnableC2029St1(@NotNull Y90 y90, @NotNull C6251qy c6251qy) {
        this.d = y90;
        this.e = c6251qy;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.B(this.d, Unit.a);
    }
}
