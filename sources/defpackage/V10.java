package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class V10 {

    public static final class a extends V10 {

        @NotNull
        public static final a a = new a();

        @NotNull
        public final String toString() {
            return "Blacklisted";
        }
    }

    public static final class b extends V10 {
        public final int a;

        @NotNull
        public final String b;

        public b(int i, @NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.a = i;
            this.b = message;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && Intrinsics.a(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("DisconnectedByServer(code=");
            sb.append(this.a);
            sb.append(", message=");
            return C1039Gc0.e(sb, this.b, ')');
        }
    }

    public static final class c extends V10 {

        @NotNull
        public static final c a = new c();

        @NotNull
        public final String toString() {
            return "Sanctions";
        }
    }

    public static final class d extends V10 {

        @NotNull
        public static final d a = new d();

        @NotNull
        public final String toString() {
            return "Stopped";
        }
    }

    public static final class e extends V10 {

        @NotNull
        public static final e a = new e();

        @NotNull
        public final String toString() {
            return "Unknown";
        }
    }
}
