package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: qD1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6099qD1 {
    public static final AbstractC4836kD1 a;

    /* JADX INFO: renamed from: qD1$a */
    public static final class a {
        public static final OH a = new OH();
    }

    /* JADX INFO: renamed from: qD1$b */
    public static final class b implements Callable<AbstractC4836kD1> {
        @Override // java.util.concurrent.Callable
        public final AbstractC4836kD1 call() {
            return a.a;
        }
    }

    /* JADX INFO: renamed from: qD1$c */
    public static final class c implements Callable<AbstractC4836kD1> {
        @Override // java.util.concurrent.Callable
        public final AbstractC4836kD1 call() {
            return d.a;
        }
    }

    /* JADX INFO: renamed from: qD1$d */
    public static final class d {
        public static final C2899bD0 a = new C2899bD0();
    }

    /* JADX INFO: renamed from: qD1$e */
    public static final class e {
        public static final C7956z41 a = new C7956z41();
    }

    /* JADX INFO: renamed from: qD1$f */
    public static final class f implements Callable<AbstractC4836kD1> {
        @Override // java.util.concurrent.Callable
        public final AbstractC4836kD1 call() {
            return e.a;
        }
    }

    /* JADX INFO: renamed from: qD1$g */
    public static final class g {
        public static final EM1 a = new EM1();
    }

    /* JADX INFO: renamed from: qD1$h */
    public static final class h implements Callable<AbstractC4836kD1> {
        @Override // java.util.concurrent.Callable
        public final AbstractC4836kD1 call() {
            return g.a;
        }
    }

    static {
        EB1.a(new h());
        a = EB1.a(new b());
        EB1.a(new c());
        int i = C4594j42.a;
        EB1.a(new f());
    }
}
