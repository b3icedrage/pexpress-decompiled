package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: g52, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3920g52<T> implements Iterator<T>, InterfaceC6745tJ0 {

    @NotNull
    public final C2329Wo0 d;

    @NotNull
    public final ArrayList e = new ArrayList();

    @NotNull
    public Iterator<? extends T> g;

    public C3920g52(@NotNull Jd2 jd2, @NotNull C2329Wo0 c2329Wo0) {
        this.d = c2329Wo0;
        this.g = jd2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.g.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        T next = this.g.next();
        Iterator<? extends T> it = (Iterator) this.d.invoke(next);
        ArrayList arrayList = this.e;
        if (it != null && it.hasNext()) {
            arrayList.add(this.g);
            this.g = it;
            return next;
        }
        while (!this.g.hasNext() && !arrayList.isEmpty()) {
            this.g = (Iterator) CollectionsKt.L(arrayList);
            C2904bF.s(arrayList);
        }
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
