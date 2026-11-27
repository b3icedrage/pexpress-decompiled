package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class A80 extends DN {
    public static final /* synthetic */ int j = 0;
    public long g;
    public boolean h;

    @Nullable
    public C6202qj<AbstractC5427n20<?>> i;

    public final void s1(boolean z) {
        long j2 = this.g - (z ? 4294967296L : 1L);
        this.g = j2;
        if (j2 <= 0 && this.h) {
            shutdown();
        }
    }

    public final void t1(@NotNull AbstractC5427n20<?> abstractC5427n20) {
        C6202qj<AbstractC5427n20<?>> c6202qj = this.i;
        if (c6202qj == null) {
            c6202qj = new C6202qj<>();
            this.i = c6202qj;
        }
        c6202qj.addLast(abstractC5427n20);
    }

    public final void u1(boolean z) {
        this.g = (z ? 4294967296L : 1L) + this.g;
        if (z) {
            return;
        }
        this.h = true;
    }

    public long v1() {
        return !w1() ? Long.MAX_VALUE : 0L;
    }

    public final boolean w1() {
        C6202qj<AbstractC5427n20<?>> c6202qj = this.i;
        if (c6202qj == null) {
            return false;
        }
        AbstractC5427n20<?> abstractC5427n20RemoveFirst = c6202qj.isEmpty() ? null : c6202qj.removeFirst();
        if (abstractC5427n20RemoveFirst == null) {
            return false;
        }
        abstractC5427n20RemoveFirst.run();
        return true;
    }

    public void shutdown() {
    }
}
