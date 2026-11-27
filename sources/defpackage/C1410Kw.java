package defpackage;

/* JADX INFO: renamed from: Kw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1410Kw extends AbstractC1646Nw.a {
    public int d = 0;
    public final int e;
    public final /* synthetic */ AbstractC1646Nw g;

    public C1410Kw(AbstractC1646Nw abstractC1646Nw) {
        this.g = abstractC1646Nw;
        this.e = abstractC1646Nw.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d < this.e;
    }
}
