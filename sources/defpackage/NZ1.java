package defpackage;

import kotlin.time.b;
import kotlin.time.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class NZ1<U, T extends U> extends ND1<T> implements Runnable {
    public final long i;

    public NZ1(long j, @NotNull LM lm) {
        super(lm, lm.getContext());
        this.i = j;
    }

    @Override // defpackage.C3956gG0
    @NotNull
    public final String e0() {
        return super.e0() + "(timeMillis=" + this.i + ')';
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX WARN: Instruction removed from duplicated block: B:10:0x001f, please report this as an issue */
    @Override // java.lang.Runnable
    public final void run() {
        String strQ;
        GW gwD = IW.d(this.g);
        LW lw = gwD instanceof LW ? (LW) gwD : null;
        long j = this.i;
        if (lw != null) {
            b.a aVar = b.e;
            c.h(j, R40.MILLISECONDS);
            strQ = lw.q();
            if (strQ == null) {
                strQ = "Timed out waiting for " + j + " ms";
            }
        } else {
            strQ = "Timed out waiting for " + j + " ms";
        }
        B(new MZ1(strQ, this));
    }
}
