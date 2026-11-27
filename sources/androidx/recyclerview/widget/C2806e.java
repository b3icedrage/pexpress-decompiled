package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: androidx.recyclerview.widget.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2806e<T> {
    public static final b h = new b();
    public final C2803b a;
    public final C2804c<T> b;
    public List<T> e;
    public int g;
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();

    @NonNull
    public List<T> f = Collections.EMPTY_LIST;
    public final b c = h;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.e$a */
    public interface a<T> {
        void a();
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.e$b */
    public static class b implements Executor {
        public final Handler d = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(@NonNull Runnable runnable) {
            this.d.post(runnable);
        }
    }

    public C2806e(@NonNull C2803b c2803b, @NonNull C2804c c2804c) {
        this.a = c2803b;
        this.b = c2804c;
    }

    public final void a(@NonNull List list) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a();
        }
    }

    public final void b(List<T> list) {
        int i = this.g + 1;
        this.g = i;
        List<T> list2 = this.e;
        if (list == list2) {
            return;
        }
        List<T> list3 = this.f;
        C2803b c2803b = this.a;
        if (list == null) {
            int size = list2.size();
            this.e = null;
            this.f = Collections.EMPTY_LIST;
            c2803b.b(0, size);
            a(list3);
            return;
        }
        if (list2 != null) {
            this.b.a.execute(new RunnableC2805d(this, list2, list, i));
            return;
        }
        this.e = list;
        this.f = Collections.unmodifiableList(list);
        c2803b.a(0, list.size());
        a(list3);
    }
}
