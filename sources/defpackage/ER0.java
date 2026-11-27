package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class ER0 extends AbstractC3946gD {
    public final AtomicLong h;

    public ER0() {
        super(0);
        this.h = new AtomicLong(System.currentTimeMillis());
    }

    @Override // defpackage.AbstractC3946gD
    public final String d(QS0 qs0) {
        return Long.toString(this.h.getAndIncrement());
    }
}
