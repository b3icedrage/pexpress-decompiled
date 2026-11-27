package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: wX1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7419wX1 extends AbstractRunnableC6788tX1 {

    @NotNull
    public final Runnable g;

    public C7419wX1(@NotNull Runnable runnable, long j, @NotNull C6998uX1 c6998uX1) {
        super(j, c6998uX1);
        this.g = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.g.run();
        } finally {
            this.e.getClass();
        }
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.g;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(C3787fU.f(runnable));
        sb.append(", ");
        sb.append(this.d);
        sb.append(", ");
        sb.append(this.e);
        sb.append(']');
        return sb.toString();
    }
}
