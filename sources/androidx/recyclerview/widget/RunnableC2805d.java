package androidx.recyclerview.widget;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: androidx.recyclerview.widget.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2805d implements Runnable {
    public final /* synthetic */ List d;
    public final /* synthetic */ List e;
    public final /* synthetic */ int g;
    public final /* synthetic */ C2806e h;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.d$a */
    public class a extends p.b {
        public a() {
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // androidx.recyclerview.widget.p.b
        public final boolean a(int i, int i2) {
            RunnableC2805d runnableC2805d = RunnableC2805d.this;
            Object obj = runnableC2805d.d.get(i);
            Object obj2 = runnableC2805d.e.get(i2);
            if (obj != null && obj2 != null) {
                return runnableC2805d.h.b.b.a((T) obj, (T) obj2);
            }
            if (obj == null && obj2 == null) {
                return true;
            }
            throw new AssertionError();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // androidx.recyclerview.widget.p.b
        public final boolean b(int i, int i2) {
            RunnableC2805d runnableC2805d = RunnableC2805d.this;
            Object obj = runnableC2805d.d.get(i);
            Object obj2 = runnableC2805d.e.get(i2);
            if (obj == null || obj2 == null) {
                return obj == null && obj2 == null;
            }
            return runnableC2805d.h.b.b.b((T) obj, (T) obj2);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // androidx.recyclerview.widget.p.b
        public final Object c(int i, int i2) {
            RunnableC2805d runnableC2805d = RunnableC2805d.this;
            Object obj = runnableC2805d.d.get(i);
            Object obj2 = runnableC2805d.e.get(i2);
            if (obj == null || obj2 == null) {
                throw new AssertionError();
            }
            return runnableC2805d.h.b.b.c((T) obj, (T) obj2);
        }

        @Override // androidx.recyclerview.widget.p.b
        public final int d() {
            return RunnableC2805d.this.e.size();
        }

        @Override // androidx.recyclerview.widget.p.b
        public final int e() {
            return RunnableC2805d.this.d.size();
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.d$b */
    public class b implements Runnable {
        public final /* synthetic */ p.d d;

        public b(p.d dVar) {
            this.d = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            RunnableC2805d runnableC2805d = RunnableC2805d.this;
            C2806e c2806e = runnableC2805d.h;
            if (c2806e.g == runnableC2805d.g) {
                List list = c2806e.f;
                List<T> list2 = runnableC2805d.e;
                c2806e.e = list2;
                c2806e.f = Collections.unmodifiableList(list2);
                this.d.a(c2806e.a);
                c2806e.a(list);
            }
        }
    }

    public RunnableC2805d(C2806e c2806e, List list, List list2, int i) {
        this.h = c2806e;
        this.d = list;
        this.e = list2;
        this.g = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.h.c.execute(new b(p.a(new a())));
    }
}
