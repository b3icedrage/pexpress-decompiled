package defpackage;

/* JADX INFO: renamed from: fo1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3862fo1 extends C7483wo1.c {
    public final /* synthetic */ K90 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3862fo1(C3024bo1 c3024bo1, C2814ao1 c2814ao1, K90 k90) {
        super(c3024bo1, c2814ao1);
        this.g = k90;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.g.a(-1L, true, true, null);
    }
}
