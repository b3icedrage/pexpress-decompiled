package defpackage;

import android.util.Log;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: ob0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5751ob0 {
    public static final a a = new a();

    /* JADX INFO: renamed from: ob0$b */
    public interface b<T> {
        T a();
    }

    /* JADX INFO: renamed from: ob0$c */
    public static final class c<T> {
        public final b<T> a;
        public final e<T> b;
        public final C1516Mf1 c;

        public c(@NonNull C1516Mf1 c1516Mf1, @NonNull b bVar, @NonNull e eVar) {
            this.c = c1516Mf1;
            this.a = bVar;
            this.b = eVar;
        }

        public final T a() {
            T tA = (T) this.c.a();
            if (tA == null) {
                tA = this.a.a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    tA.getClass().toString();
                }
            }
            if (tA instanceof d) {
                tA.f().a = false;
            }
            return tA;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final boolean b(@NonNull T t) {
            if (t instanceof d) {
                ((d) t).f().a = true;
            }
            this.b.a(t);
            return this.c.b(t);
        }
    }

    /* JADX INFO: renamed from: ob0$d */
    public interface d {
        @NonNull
        RP1.a f();
    }

    /* JADX INFO: renamed from: ob0$e */
    public interface e<T> {
        void a(@NonNull T t);
    }

    @NonNull
    public static c a(int i, @NonNull b bVar) {
        return new c(new C1516Mf1(i), bVar, a);
    }

    /* JADX INFO: renamed from: ob0$a */
    public class a implements e<Object> {
        @Override // defpackage.C5751ob0.e
        public final void a(@NonNull Object obj) {
        }
    }
}
