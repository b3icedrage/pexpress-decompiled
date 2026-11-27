package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Xr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2441Xr {

    /* JADX INFO: renamed from: Xr$a */
    public static final class a implements InterfaceC2441Xr {

        @NotNull
        public static final a a = new a();
    }

    /* JADX INFO: renamed from: Xr$b */
    public static final class b implements InterfaceC2441Xr {
        public final double a;

        public b(double d) {
            this.a = d;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Double.compare(this.a, ((b) obj).a) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.a);
        }

        @NotNull
        public final String toString() {
            return "Loose(profitChange=" + this.a + ")";
        }
    }

    /* JADX INFO: renamed from: Xr$c */
    public static final class c implements InterfaceC2441Xr {

        @NotNull
        public static final c a = new c();
    }

    /* JADX INFO: renamed from: Xr$d */
    public static final class d implements InterfaceC2441Xr {

        @NotNull
        public static final d a = new d();
    }

    /* JADX INFO: renamed from: Xr$e */
    public static final class e implements InterfaceC2441Xr {
        public final double a;

        public e(double d) {
            this.a = d;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && Double.compare(this.a, ((e) obj).a) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.a);
        }

        @NotNull
        public final String toString() {
            return "Win(profitChange=" + this.a + ")";
        }
    }
}
