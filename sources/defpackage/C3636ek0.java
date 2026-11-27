package defpackage;

/* JADX INFO: renamed from: ek0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3636ek0 {
    public static final f a = new f();
    public static final e b = new e();
    public static final b c = new b();
    public static final c d = new c();
    public static final d e = new d();

    /* JADX INFO: renamed from: ek0$a */
    public static final class a<T, U> implements InterfaceC0748Cj0<T, U> {
        @Override // defpackage.InterfaceC0748Cj0
        public final U apply(T t) {
            return (U) Pf2.a.class.cast(t);
        }
    }

    /* JADX INFO: renamed from: ek0$b */
    public static final class b {
        public final String toString() {
            return "EmptyAction";
        }
    }

    /* JADX INFO: renamed from: ek0$c */
    public static final class c {
        public final String toString() {
            return "EmptyConsumer";
        }
    }

    /* JADX INFO: renamed from: ek0$d */
    public static final class d {
    }

    /* JADX INFO: renamed from: ek0$e */
    public static final class e implements Runnable {
        public final String toString() {
            return "EmptyRunnable";
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    /* JADX INFO: renamed from: ek0$f */
    public static final class f implements InterfaceC0748Cj0<Object, Object> {
        public final String toString() {
            return "IdentityFunction";
        }

        @Override // defpackage.InterfaceC0748Cj0
        public final Object apply(Object obj) {
            return obj;
        }
    }
}
