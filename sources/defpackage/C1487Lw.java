package defpackage;

/* JADX INFO: renamed from: Lw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1487Lw extends AbstractC1565Mw.a {
    public int d = 0;
    public final int e;
    public final /* synthetic */ AbstractC1565Mw g;

    public C1487Lw(AbstractC1565Mw abstractC1565Mw) {
        this.g = abstractC1565Mw;
        this.e = abstractC1565Mw.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d < this.e;
    }
}
