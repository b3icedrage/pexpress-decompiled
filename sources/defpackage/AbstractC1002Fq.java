package defpackage;

import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: Fq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1002Fq<K, A> {
    public final c<K> c;
    public NU0<A> e;
    public final ArrayList a = new ArrayList(1);
    public boolean b = false;
    public float d = 0.0f;
    public A f = null;
    public float g = -1.0f;
    public float h = -1.0f;

    /* JADX INFO: renamed from: Fq$a */
    public interface a {
        void a();
    }

    /* JADX INFO: renamed from: Fq$b */
    public static final class b<T> implements c<T> {
        @Override // defpackage.AbstractC1002Fq.c
        public final boolean a(float f) {
            throw new IllegalStateException("not implemented");
        }

        @Override // defpackage.AbstractC1002Fq.c
        public final C7589xK0<T> b() {
            throw new IllegalStateException("not implemented");
        }

        @Override // defpackage.AbstractC1002Fq.c
        public final boolean c(float f) {
            return false;
        }

        @Override // defpackage.AbstractC1002Fq.c
        public final float d() {
            return 1.0f;
        }

        @Override // defpackage.AbstractC1002Fq.c
        public final float e() {
            return 0.0f;
        }

        @Override // defpackage.AbstractC1002Fq.c
        public final boolean isEmpty() {
            return true;
        }
    }

    /* JADX INFO: renamed from: Fq$c */
    public interface c<T> {
        boolean a(float f);

        C7589xK0<T> b();

        boolean c(float f);

        float d();

        float e();

        boolean isEmpty();
    }

    /* JADX INFO: renamed from: Fq$d */
    public static final class d<T> implements c<T> {
        public final List<? extends C7589xK0<T>> a;
        public C7589xK0<T> c = null;
        public float d = -1.0f;

        @NonNull
        public C7589xK0<T> b = f(0.0f);

        public d(List<? extends C7589xK0<T>> list) {
            this.a = list;
        }

        @Override // defpackage.AbstractC1002Fq.c
        public final boolean a(float f) {
            C7589xK0<T> c7589xK0 = this.c;
            C7589xK0<T> c7589xK1 = this.b;
            if (c7589xK0 == c7589xK1 && this.d == f) {
                return true;
            }
            this.c = c7589xK1;
            this.d = f;
            return false;
        }

        @Override // defpackage.AbstractC1002Fq.c
        @NonNull
        public final C7589xK0<T> b() {
            return this.b;
        }

        @Override // defpackage.AbstractC1002Fq.c
        public final boolean c(float f) {
            C7589xK0<T> c7589xK0 = this.b;
            if (f >= c7589xK0.b() && f < c7589xK0.a()) {
                return !this.b.c();
            }
            this.b = f(f);
            return true;
        }

        @Override // defpackage.AbstractC1002Fq.c
        public final float d() {
            List<? extends C7589xK0<T>> list = this.a;
            return list.get(list.size() - 1).a();
        }

        @Override // defpackage.AbstractC1002Fq.c
        public final float e() {
            return this.a.get(0).b();
        }

        public final C7589xK0<T> f(float f) {
            List<? extends C7589xK0<T>> list = this.a;
            C7589xK0<T> c7589xK0 = list.get(list.size() - 1);
            if (f >= c7589xK0.b()) {
                return c7589xK0;
            }
            for (int size = list.size() - 2; size >= 1; size--) {
                C7589xK0<T> c7589xK1 = list.get(size);
                if (this.b != c7589xK1 && f >= c7589xK1.b() && f < c7589xK1.a()) {
                    return c7589xK1;
                }
            }
            return list.get(0);
        }

        @Override // defpackage.AbstractC1002Fq.c
        public final boolean isEmpty() {
            return false;
        }
    }

    /* JADX INFO: renamed from: Fq$e */
    public static final class e<T> implements c<T> {

        @NonNull
        public final C7589xK0<T> a;
        public float b = -1.0f;

        public e(List<? extends C7589xK0<T>> list) {
            this.a = list.get(0);
        }

        @Override // defpackage.AbstractC1002Fq.c
        public final boolean a(float f) {
            if (this.b == f) {
                return true;
            }
            this.b = f;
            return false;
        }

        @Override // defpackage.AbstractC1002Fq.c
        public final C7589xK0<T> b() {
            return this.a;
        }

        @Override // defpackage.AbstractC1002Fq.c
        public final boolean c(float f) {
            return !this.a.c();
        }

        @Override // defpackage.AbstractC1002Fq.c
        public final float d() {
            return this.a.a();
        }

        @Override // defpackage.AbstractC1002Fq.c
        public final float e() {
            return this.a.b();
        }

        @Override // defpackage.AbstractC1002Fq.c
        public final boolean isEmpty() {
            return false;
        }
    }

    public AbstractC1002Fq(List<? extends C7589xK0<K>> list) {
        c<K> eVar;
        if (list.isEmpty()) {
            eVar = new b<>();
        } else {
            eVar = list.size() == 1 ? new e<>(list) : new d<>(list);
        }
        this.c = eVar;
    }

    public final void a(a aVar) {
        this.a.add(aVar);
    }

    public final C7589xK0<K> b() {
        C7589xK0<K> c7589xK0B = this.c.b();
        C0564Aa.i();
        return c7589xK0B;
    }

    public float c() {
        if (this.h == -1.0f) {
            this.h = this.c.d();
        }
        return this.h;
    }

    public final float d() {
        C7589xK0<K> c7589xK0B = b();
        if (c7589xK0B == null || c7589xK0B.c()) {
            return 0.0f;
        }
        return c7589xK0B.d.getInterpolation(e());
    }

    public final float e() {
        if (this.b) {
            return 0.0f;
        }
        C7589xK0<K> c7589xK0B = b();
        if (c7589xK0B.c()) {
            return 0.0f;
        }
        return (this.d - c7589xK0B.b()) / (c7589xK0B.a() - c7589xK0B.b());
    }

    public A f() {
        Interpolator interpolator;
        float fE = e();
        if (this.e == null && this.c.a(fE)) {
            return this.f;
        }
        C7589xK0<K> c7589xK0B = b();
        Interpolator interpolator2 = c7589xK0B.e;
        A aG = (interpolator2 == null || (interpolator = c7589xK0B.f) == null) ? g(c7589xK0B, d()) : h(c7589xK0B, fE, interpolator2.getInterpolation(fE), interpolator.getInterpolation(fE));
        this.f = aG;
        return aG;
    }

    public abstract A g(C7589xK0<K> c7589xK0, float f);

    public A h(C7589xK0<K> c7589xK0, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void i() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            ((a) arrayList.get(i)).a();
            i++;
        }
    }

    public void j(float f) {
        c<K> cVar = this.c;
        if (cVar.isEmpty()) {
            return;
        }
        if (this.g == -1.0f) {
            this.g = cVar.e();
        }
        float f2 = this.g;
        if (f < f2) {
            if (f2 == -1.0f) {
                this.g = cVar.e();
            }
            f = this.g;
        } else if (f > c()) {
            f = c();
        }
        if (f == this.d) {
            return;
        }
        this.d = f;
        if (cVar.c(f)) {
            i();
        }
    }

    public final void k(NU0<A> nu0) {
        NU0<A> nu1 = this.e;
        if (nu1 != null) {
            nu1.getClass();
        }
        this.e = nu0;
    }
}
