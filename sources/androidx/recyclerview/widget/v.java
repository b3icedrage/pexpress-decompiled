package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView.C;
import java.util.List;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public abstract class v<T, VH extends RecyclerView.C> extends RecyclerView.e<VH> {
    public final C2806e<T> d;

    public class a implements C2806e.a<T> {
        public a() {
        }

        @Override // androidx.recyclerview.widget.C2806e.a
        public final void a() {
            v.this.getClass();
        }
    }

    public v(@NonNull p.e<T> eVar) {
        a aVar = new a();
        C2803b c2803b = new C2803b(this);
        synchronized (C2804c.a.a) {
            try {
                if (C2804c.a.b == null) {
                    C2804c.a.b = Executors.newFixedThreadPool(2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C2806e<T> c2806e = new C2806e<>(c2803b, new C2804c(C2804c.a.b, eVar));
        this.d = c2806e;
        c2806e.d.add(aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int c() {
        return this.d.f.size();
    }

    public final T o(int i) {
        return this.d.f.get(i);
    }

    public final void p(List<T> list) {
        this.d.b(list);
    }
}
