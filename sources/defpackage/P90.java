package defpackage;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class P90 implements U52, Cloneable {
    public static final P90 g = new P90();
    public final List<Q90> d;
    public final List<Q90> e;

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class a<T> extends T52<T> {
        public T52<T> a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ Gson d;
        public final /* synthetic */ TypeToken e;

        public a(boolean z, boolean z2, Gson gson, TypeToken typeToken) {
            this.b = z;
            this.c = z2;
            this.d = gson;
            this.e = typeToken;
        }

        @Override // defpackage.T52
        public final T a(C7790yH0 c7790yH0) throws IOException {
            if (this.b) {
                c7790yH0.I();
                return null;
            }
            T52<T> t52G = this.a;
            if (t52G == null) {
                t52G = this.d.g(P90.this, this.e);
                this.a = t52G;
            }
            return t52G.a(c7790yH0);
        }

        @Override // defpackage.T52
        public final void b(ZH0 zh0, T t) throws IOException {
            if (this.c) {
                zh0.l();
                return;
            }
            T52<T> t52G = this.a;
            if (t52G == null) {
                t52G = this.d.g(P90.this, this.e);
                this.a = t52G;
            }
            t52G.b(zh0, t);
        }
    }

    public P90() {
        List<Q90> list = Collections.EMPTY_LIST;
        this.d = list;
        this.e = list;
    }

    public static boolean d(Class cls) {
        if (Enum.class.isAssignableFrom(cls) || (cls.getModifiers() & 8) != 0) {
            return false;
        }
        return cls.isAnonymousClass() || cls.isLocalClass();
    }

    @Override // defpackage.U52
    public final <T> T52<T> a(Gson gson, TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        boolean zD = d(rawType);
        boolean z = zD || b(rawType, true);
        boolean z2 = zD || b(rawType, false);
        if (z || z2) {
            return new a(z2, z, gson, typeToken);
        }
        return null;
    }

    public final boolean b(Class<?> cls, boolean z) {
        Iterator<Q90> it = (z ? this.d : this.e).iterator();
        while (it.hasNext()) {
            if (it.next().a()) {
                return true;
            }
        }
        return false;
    }

    public final Object clone() {
        try {
            return (P90) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
