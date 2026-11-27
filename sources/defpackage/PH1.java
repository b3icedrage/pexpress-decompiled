package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class PH1 implements Iterator<String>, InterfaceC6745tJ0 {
    public int d;
    public final /* synthetic */ C4136h70 e;

    public PH1(C4136h70 c4136h70) {
        this.e = c4136h70;
        this.d = c4136h70.c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d > 0;
    }

    @Override // java.util.Iterator
    public final String next() {
        C4136h70 c4136h70 = this.e;
        int i = this.d;
        this.d = i - 1;
        return c4136h70.e[c4136h70.c - i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
