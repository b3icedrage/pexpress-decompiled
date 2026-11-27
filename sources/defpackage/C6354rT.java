package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: rT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6354rT {

    @NotNull
    public static final C1063Gk0<InterfaceC6145qT, Integer> a = new C1063Gk0<>(new C6833tj1(d.l), null, 14);

    @NotNull
    public static final C6926u92<InterfaceC6145qT> b = new C6926u92<>(new C6833tj1(c.l), 1, 12, null, 56);

    @NotNull
    public static final C6926u92<InterfaceC6145qT> c = new C6926u92<>(new C6833tj1(a.l), 1, 31, null, 56);

    @NotNull
    public static final C6926u92<InterfaceC6145qT> d = new C6926u92<>(new C6833tj1(b.l), 1, 7, null, 56);

    /* JADX INFO: renamed from: rT$a */
    public /* synthetic */ class a extends C3068c21 {
        public static final a l = new a(InterfaceC6145qT.class, "dayOfMonth", "getDayOfMonth()Ljava/lang/Integer;");

        @Override // defpackage.C3068c21, defpackage.LJ0
        @Nullable
        public final Object get(@Nullable Object obj) {
            return ((InterfaceC6145qT) obj).r();
        }

        @Override // defpackage.C3068c21, defpackage.AJ0
        public final void p(@Nullable Object obj, @Nullable Object obj2) {
            ((InterfaceC6145qT) obj).k((Integer) obj2);
        }
    }

    /* JADX INFO: renamed from: rT$b */
    public /* synthetic */ class b extends C3068c21 {
        public static final b l = new b(InterfaceC6145qT.class, "isoDayOfWeek", "getIsoDayOfWeek()Ljava/lang/Integer;");

        @Override // defpackage.C3068c21, defpackage.LJ0
        @Nullable
        public final Object get(@Nullable Object obj) {
            return ((InterfaceC6145qT) obj).n();
        }

        @Override // defpackage.C3068c21, defpackage.AJ0
        public final void p(@Nullable Object obj, @Nullable Object obj2) {
            ((InterfaceC6145qT) obj).u((Integer) obj2);
        }
    }

    /* JADX INFO: renamed from: rT$c */
    public /* synthetic */ class c extends C3068c21 {
        public static final c l = new c(InterfaceC6145qT.class, "monthNumber", "getMonthNumber()Ljava/lang/Integer;");

        @Override // defpackage.C3068c21, defpackage.LJ0
        @Nullable
        public final Object get(@Nullable Object obj) {
            return ((InterfaceC6145qT) obj).s();
        }

        @Override // defpackage.C3068c21, defpackage.AJ0
        public final void p(@Nullable Object obj, @Nullable Object obj2) {
            ((InterfaceC6145qT) obj).f((Integer) obj2);
        }
    }

    /* JADX INFO: renamed from: rT$d */
    public /* synthetic */ class d extends C3068c21 {
        public static final d l = new d(InterfaceC6145qT.class, "year", "getYear()Ljava/lang/Integer;");

        @Override // defpackage.C3068c21, defpackage.LJ0
        @Nullable
        public final Object get(@Nullable Object obj) {
            return ((InterfaceC6145qT) obj).j();
        }

        @Override // defpackage.C3068c21, defpackage.AJ0
        public final void p(@Nullable Object obj, @Nullable Object obj2) {
            ((InterfaceC6145qT) obj).p((Integer) obj2);
        }
    }
}
