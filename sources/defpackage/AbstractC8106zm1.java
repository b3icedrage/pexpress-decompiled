package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: zm1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8106zm1 {

    /* JADX INFO: renamed from: zm1$a */
    public static final class a extends AbstractC8106zm1 {

        @NotNull
        public final String a;

        @Nullable
        public final String b;

        public a(@NotNull String rate, @Nullable String str) {
            Intrinsics.checkNotNullParameter(rate, "rate");
            this.a = rate;
            this.b = str;
        }

        public static a a(a aVar, String rate, String str, int i) {
            if ((i & 1) != 0) {
                rate = aVar.a;
            }
            if ((i & 2) != 0) {
                str = aVar.b;
            }
            aVar.getClass();
            Intrinsics.checkNotNullParameter(rate, "rate");
            return new a(rate, str);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.a(this.a, aVar.a) && Intrinsics.a(this.b, aVar.b);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Draft(rate=");
            sb.append(this.a);
            sb.append(", comment=");
            return C1039Gc0.e(sb, this.b, ')');
        }
    }

    /* JADX INFO: renamed from: zm1$b */
    public static final class b extends AbstractC8106zm1 {

        @NotNull
        public static final b a = new b();
    }

    /* JADX INFO: renamed from: zm1$c */
    public static final class c extends AbstractC8106zm1 {

        @NotNull
        public static final c a = new c();
    }

    /* JADX INFO: renamed from: zm1$d */
    public static final class d extends AbstractC8106zm1 {

        @NotNull
        public final String a;

        public d(@NotNull String rate) {
            Intrinsics.checkNotNullParameter(rate, "rate");
            this.a = rate;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.a(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @NotNull
        public final String toString() {
            return C1039Gc0.e(new StringBuilder("Sent(rate="), this.a, ')');
        }
    }
}
