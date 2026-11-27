package defpackage;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class ZF1 {

    @NotNull
    public static final Set<String> a;

    @NotNull
    public static final Set<String> b;

    @NotNull
    public static final Set<String> c;

    public static final class a {
        public final double a;
        public final double b;
        public final double c;
        public final double d;

        public a(double d, double d2, double d3, double d4) {
            this.a = d;
            this.b = d2;
            this.c = d3;
            this.d = d4;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Double.compare(this.a, aVar.a) == 0 && Double.compare(this.b, aVar.b) == 0 && Double.compare(this.c, aVar.c) == 0 && Double.compare(this.d, aVar.d) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.d) + ID.a(this.c, ID.a(this.b, Double.hashCode(this.a) * 31, 31), 31);
        }

        @NotNull
        public final String toString() {
            return "TraceSampleRates(robot=" + this.a + ", auth=" + this.b + ", launch=" + this.c + ", other=" + this.d + ")";
        }
    }

    static {
        String[] elements = {"debug", "qa", "rc"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        a = C1526Mj.H(elements);
        String[] elements2 = {"Authorization", "X-Auth-Token", "X-CSRF-Token", "Cookie", "Set-Cookie"};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        b = C1526Mj.H(elements2);
        String[] elements3 = {"Cookie", "Set-Cookie", "cookies"};
        Intrinsics.checkNotNullParameter(elements3, "elements");
        c = C1526Mj.H(elements3);
    }
}
