package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: cZ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3175cZ1 {

    @NotNull
    public static final C6926u92<InterfaceC2966bZ1> a = new C6926u92<>(new C6833tj1(c.l), 0, 23, null, 56);

    @NotNull
    public static final C6926u92<InterfaceC2966bZ1> b = new C6926u92<>(new C6833tj1(e.l), 0, 59, null, 56);

    @NotNull
    public static final C6926u92<InterfaceC2966bZ1> c = new C6926u92<>(new C6833tj1(f.l), 0, 59, null, 40);

    @NotNull
    public static final C1063Gk0<InterfaceC2966bZ1, C3997gU> d = new C1063Gk0<>(new C6833tj1(b.l), new C3997gU(0, 9), 10);

    /* JADX INFO: renamed from: cZ1$a */
    public /* synthetic */ class a extends C3068c21 {
        public static final a l = new a(InterfaceC2966bZ1.class, "amPm", "getAmPm()Lkotlinx/datetime/format/AmPmMarker;");

        @Override // defpackage.C3068c21, defpackage.LJ0
        @Nullable
        public final Object get(@Nullable Object obj) {
            return ((InterfaceC2966bZ1) obj).c();
        }

        @Override // defpackage.C3068c21, defpackage.AJ0
        public final void p(@Nullable Object obj, @Nullable Object obj2) {
            ((InterfaceC2966bZ1) obj).o((Q9) obj2);
        }
    }

    /* JADX INFO: renamed from: cZ1$b */
    public /* synthetic */ class b extends C3068c21 {
        public static final b l = new b(InterfaceC2966bZ1.class, "fractionOfSecond", "getFractionOfSecond()Lkotlinx/datetime/internal/DecimalFraction;");

        @Override // defpackage.C3068c21, defpackage.LJ0
        @Nullable
        public final Object get(@Nullable Object obj) {
            return ((InterfaceC2966bZ1) obj).l();
        }

        @Override // defpackage.C3068c21, defpackage.AJ0
        public final void p(@Nullable Object obj, @Nullable Object obj2) {
            ((InterfaceC2966bZ1) obj).b((C3997gU) obj2);
        }
    }

    /* JADX INFO: renamed from: cZ1$c */
    public /* synthetic */ class c extends C3068c21 {
        public static final c l = new c(InterfaceC2966bZ1.class, "hour", "getHour()Ljava/lang/Integer;");

        @Override // defpackage.C3068c21, defpackage.LJ0
        @Nullable
        public final Object get(@Nullable Object obj) {
            return ((InterfaceC2966bZ1) obj).v();
        }

        @Override // defpackage.C3068c21, defpackage.AJ0
        public final void p(@Nullable Object obj, @Nullable Object obj2) {
            ((InterfaceC2966bZ1) obj).t((Integer) obj2);
        }
    }

    /* JADX INFO: renamed from: cZ1$d */
    public /* synthetic */ class d extends C3068c21 {
        public static final d l = new d(InterfaceC2966bZ1.class, "hourOfAmPm", "getHourOfAmPm()Ljava/lang/Integer;");

        @Override // defpackage.C3068c21, defpackage.LJ0
        @Nullable
        public final Object get(@Nullable Object obj) {
            return ((InterfaceC2966bZ1) obj).m();
        }

        @Override // defpackage.C3068c21, defpackage.AJ0
        public final void p(@Nullable Object obj, @Nullable Object obj2) {
            ((InterfaceC2966bZ1) obj).e((Integer) obj2);
        }
    }

    /* JADX INFO: renamed from: cZ1$e */
    public /* synthetic */ class e extends C3068c21 {
        public static final e l = new e(InterfaceC2966bZ1.class, "minute", "getMinute()Ljava/lang/Integer;");

        @Override // defpackage.C3068c21, defpackage.LJ0
        @Nullable
        public final Object get(@Nullable Object obj) {
            return ((InterfaceC2966bZ1) obj).h();
        }

        @Override // defpackage.C3068c21, defpackage.AJ0
        public final void p(@Nullable Object obj, @Nullable Object obj2) {
            ((InterfaceC2966bZ1) obj).i((Integer) obj2);
        }
    }

    /* JADX INFO: renamed from: cZ1$f */
    public /* synthetic */ class f extends C3068c21 {
        public static final f l = new f(InterfaceC2966bZ1.class, "second", "getSecond()Ljava/lang/Integer;");

        @Override // defpackage.C3068c21, defpackage.LJ0
        @Nullable
        public final Object get(@Nullable Object obj) {
            return ((InterfaceC2966bZ1) obj).y();
        }

        @Override // defpackage.C3068c21, defpackage.AJ0
        public final void p(@Nullable Object obj, @Nullable Object obj2) {
            ((InterfaceC2966bZ1) obj).A((Integer) obj2);
        }
    }

    static {
        a aVar = a.l;
        C6833tj1 accessor = new C6833tj1(aVar);
        String name = aVar.getName();
        Intrinsics.checkNotNullParameter(accessor, "accessor");
        Intrinsics.checkNotNullParameter(name, "name");
        d dVar = d.l;
        C6833tj1 accessor2 = new C6833tj1(dVar);
        String name2 = dVar.getName();
        Intrinsics.checkNotNullParameter(accessor2, "accessor");
        Intrinsics.checkNotNullParameter(name2, "name");
    }
}
