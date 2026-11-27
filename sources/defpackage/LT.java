package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface LT {

    public interface a extends LT {

        /* JADX INFO: renamed from: LT$a$a, reason: collision with other inner class name */
        public static final class C0084a {
            public static /* synthetic */ void a(a aVar) {
                EnumC6172qb1 enumC6172qb1 = EnumC6172qb1.d;
                aVar.e();
            }
        }

        void c(@NotNull C3693f11 c3693f11);

        void e();

        void h();

        void k(@NotNull EnumC6172qb1 enumC6172qb1);

        void n(@NotNull KT<C7189vR0> kt);

        void r(@NotNull UT ut);
    }

    public interface b extends a, c, d {
    }

    public interface c extends LT {

        public static final class a {
            public static /* synthetic */ void a(c cVar) {
                EnumC6172qb1 enumC6172qb1 = EnumC6172qb1.d;
                cVar.j();
            }

            public static /* synthetic */ void b(c cVar) {
                EnumC6172qb1 enumC6172qb1 = EnumC6172qb1.d;
                cVar.g();
            }

            public static /* synthetic */ void c(c cVar) {
                EnumC6172qb1 enumC6172qb1 = EnumC6172qb1.d;
                cVar.i();
            }
        }

        void g();

        void i();

        void j();

        void o();
    }

    public interface d extends LT {

        public static final class a {
            public static /* synthetic */ void a(d dVar) {
                EnumC6172qb1 enumC6172qb1 = EnumC6172qb1.d;
                dVar.l();
            }

            public static /* synthetic */ void b(d dVar) {
                EnumC6172qb1 enumC6172qb1 = EnumC6172qb1.d;
                dVar.q();
            }
        }

        void f(@NotNull Tb2 tb2);

        void l();

        void m();

        void q();
    }

    void d(@NotNull String str);
}
