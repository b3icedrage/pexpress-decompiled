package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class Jd2 implements Iterator<View>, InterfaceC6745tJ0 {
    public int d;
    final /* synthetic */ ViewGroup e;

    public Jd2(ViewGroup viewGroup) {
        this.e = viewGroup;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d < this.e.getChildCount();
    }

    @Override // java.util.Iterator
    public final View next() {
        ViewGroup viewGroup = this.e;
        int i = this.d;
        this.d = i + 1;
        View childAt = viewGroup.getChildAt(i);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        ViewGroup viewGroup = this.e;
        int i = this.d - 1;
        this.d = i;
        viewGroup.removeViewAt(i);
    }
}
