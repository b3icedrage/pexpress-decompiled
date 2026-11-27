package defpackage;

import android.view.Menu;
import android.view.MenuItem;
import java.util.Iterator;
import kotlin.Unit;

/* JADX INFO: renamed from: jZ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4691jZ0 implements Iterator<MenuItem>, InterfaceC6745tJ0 {
    public int d;
    final /* synthetic */ Menu e;

    public C4691jZ0(Menu menu) {
        this.e = menu;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d < this.e.size();
    }

    @Override // java.util.Iterator
    public final MenuItem next() {
        Menu menu = this.e;
        int i = this.d;
        this.d = i + 1;
        MenuItem item = menu.getItem(i);
        if (item != null) {
            return item;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        Unit unit;
        Menu menu = this.e;
        int i = this.d - 1;
        this.d = i;
        MenuItem item = menu.getItem(i);
        if (item != null) {
            menu.removeItem(item.getItemId());
            unit = Unit.a;
        } else {
            unit = null;
        }
        if (unit == null) {
            throw new IndexOutOfBoundsException();
        }
    }
}
