package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: o81, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5662o81 {

    @NotNull
    public static final C6926u92<Sb2> a;

    @NotNull
    public static final C6926u92<Sb2> b;

    @NotNull
    public static final C6926u92<Sb2> c;

    /* JADX INFO: renamed from: o81$a */
    public /* synthetic */ class a extends C3068c21 {
        public static final a l = new a(Sb2.class, "minutesOfHour", "getMinutesOfHour()Ljava/lang/Integer;");

        @Override // defpackage.C3068c21, defpackage.LJ0
        @Nullable
        public final Object get(@Nullable Object obj) {
            return ((Sb2) obj).q();
        }

        @Override // defpackage.C3068c21, defpackage.AJ0
        public final void p(@Nullable Object obj, @Nullable Object obj2) {
            ((Sb2) obj).z((Integer) obj2);
        }
    }

    /* JADX INFO: renamed from: o81$b */
    public /* synthetic */ class b extends C3068c21 {
        public static final b l = new b(Sb2.class, "secondsOfMinute", "getSecondsOfMinute()Ljava/lang/Integer;");

        @Override // defpackage.C3068c21, defpackage.LJ0
        @Nullable
        public final Object get(@Nullable Object obj) {
            return ((Sb2) obj).g();
        }

        @Override // defpackage.C3068c21, defpackage.AJ0
        public final void p(@Nullable Object obj, @Nullable Object obj2) {
            ((Sb2) obj).C((Integer) obj2);
        }
    }

    /* JADX INFO: renamed from: o81$c */
    public static final class c implements InterfaceC0805Dc0<Sb2> {

        @NotNull
        public final C6833tj1<Sb2, Boolean> a = new C6833tj1<>(a.l);

        /* JADX INFO: renamed from: o81$c$a */
        public /* synthetic */ class a extends C3068c21 {
            public static final a l = new a(Sb2.class, "isNegative", "isNegative()Ljava/lang/Boolean;");

            @Override // defpackage.C3068c21, defpackage.LJ0
            @Nullable
            public final Object get(@Nullable Object obj) {
                return ((Sb2) obj).w();
            }

            @Override // defpackage.C3068c21, defpackage.AJ0
            public final void p(@Nullable Object obj, @Nullable Object obj2) {
                ((Sb2) obj).x((Boolean) obj2);
            }
        }

        @Override // defpackage.InterfaceC0805Dc0
        public final C6833tj1 a() {
            return this.a;
        }

        @Override // defpackage.InterfaceC0805Dc0
        public final boolean b(Sb2 sb2) {
            Sb2 obj = sb2;
            Intrinsics.checkNotNullParameter(obj, "obj");
            Integer numD = obj.d();
            if ((numD != null ? numD.intValue() : 0) == 0) {
                Integer numQ = obj.q();
                if ((numQ != null ? numQ.intValue() : 0) == 0) {
                    Integer numG = obj.g();
                    if ((numG != null ? numG.intValue() : 0) == 0) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: o81$d */
    public /* synthetic */ class d extends C3068c21 {
        public static final d l = new d(Sb2.class, "totalHoursAbs", "getTotalHoursAbs()Ljava/lang/Integer;");

        @Override // defpackage.C3068c21, defpackage.LJ0
        @Nullable
        public final Object get(@Nullable Object obj) {
            return ((Sb2) obj).d();
        }

        @Override // defpackage.C3068c21, defpackage.AJ0
        public final void p(@Nullable Object obj, @Nullable Object obj2) {
            ((Sb2) obj).B((Integer) obj2);
        }
    }

    static {
        c cVar = new c();
        a = new C6926u92<>(new C6833tj1(d.l), 0, 18, cVar, 8);
        b = new C6926u92<>(new C6833tj1(a.l), 0, 59, cVar, 8);
        c = new C6926u92<>(new C6833tj1(b.l), 0, 59, cVar, 8);
    }
}
