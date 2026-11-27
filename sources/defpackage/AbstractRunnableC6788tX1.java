package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: tX1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractRunnableC6788tX1 implements Runnable {
    public long d;

    @NotNull
    public C6998uX1 e;

    public AbstractRunnableC6788tX1(long j, @NotNull C6998uX1 c6998uX1) {
        this.d = j;
        this.e = c6998uX1;
    }

    public AbstractRunnableC6788tX1() {
        this(0L, BX1.g);
    }
}
