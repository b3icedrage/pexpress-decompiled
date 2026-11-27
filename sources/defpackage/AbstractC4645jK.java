package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: jK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4645jK {

    /* JADX INFO: renamed from: jK$a */
    public static final class a extends AbstractC4645jK {

        @NotNull
        public static final a a = new a();
    }

    /* JADX INFO: renamed from: jK$b */
    public static final class b extends AbstractC4645jK {

        @NotNull
        public static final b a = new b();
    }

    /* JADX INFO: renamed from: jK$d */
    public static final class d extends AbstractC4645jK {
        public final long a;
        public final long b;

        public d(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        public static d a(d dVar, long j) {
            long j2 = dVar.a;
            dVar.getClass();
            return new d(j2, j);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && this.b == dVar.b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
        }

        @NotNull
        public final String toString() {
            return "Error(timeToReconnect=" + this.a + ", seconds=" + this.b + ')';
        }
    }

    /* JADX INFO: renamed from: jK$e */
    public static final class e extends AbstractC4645jK {

        @NotNull
        public static final e a = new e();
    }

    /* JADX INFO: renamed from: jK$f */
    public static final class f extends AbstractC4645jK {

        @NotNull
        public static final f a = new f();
    }

    /* JADX INFO: renamed from: jK$g */
    public static final class g extends AbstractC4645jK {

        @NotNull
        public static final g a = new g();
    }

    /* JADX INFO: renamed from: jK$c */
    public static final class c extends AbstractC4645jK {
        public final long a;
        public final long b;

        public c(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        public static c a(c cVar, long j) {
            long j2 = cVar.a;
            cVar.getClass();
            return new c(j2, j);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
        }

        @NotNull
        public final String toString() {
            return "Disconnected(timeToReconnect=" + this.a + ", seconds=" + this.b + ')';
        }

        public /* synthetic */ c(long j) {
            this(j, 0L);
        }
    }
}
