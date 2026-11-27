package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: oS0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5723oS0 {

    /* JADX INFO: renamed from: oS0$a */
    public static final class a extends AbstractC5723oS0 {
        public final long a;
        public final long b;

        public a(long j) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.a = j;
            this.b = jCurrentTimeMillis;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
        }

        @NotNull
        public final String toString() {
            return "Connected(id=" + this.a + ", ts=" + this.b + ')';
        }
    }

    /* JADX INFO: renamed from: oS0$b */
    public static final class b extends AbstractC5723oS0 {
        public final long a;
        public final long b;

        public b(long j) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.a = j;
            this.b = jCurrentTimeMillis;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
        }

        @NotNull
        public final String toString() {
            return "Connecting(id=" + this.a + ", ts=" + this.b + ')';
        }
    }

    /* JADX INFO: renamed from: oS0$c */
    public static final class c extends AbstractC5723oS0 {
        public final long a;
        public final long b;
        public final int c;

        @NotNull
        public final String d;

        public c(String reason, int i, long j) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.a = j;
            this.b = jCurrentTimeMillis;
            this.c = i;
            this.d = reason;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b && this.c == cVar.c && Intrinsics.a(this.d, cVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + EF0.a(this.c, C5491nL.a(Long.hashCode(this.a) * 31, 31, this.b), 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Disconnected(id=");
            sb.append(this.a);
            sb.append(", ts=");
            sb.append(this.b);
            sb.append(", code=");
            sb.append(this.c);
            sb.append(", reason=");
            return C1039Gc0.e(sb, this.d, ')');
        }
    }

    /* JADX INFO: renamed from: oS0$d */
    public static final class d extends AbstractC5723oS0 {
        public final long a;
        public final long b;

        @NotNull
        public final Throwable c;

        public d(long j, Throwable cause) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Intrinsics.checkNotNullParameter(cause, "cause");
            this.a = j;
            this.b = jCurrentTimeMillis;
            this.c = cause;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && this.b == dVar.b && Intrinsics.a(this.c, dVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + C5491nL.a(Long.hashCode(this.a) * 31, 31, this.b);
        }

        @NotNull
        public final String toString() {
            return "Error(id=" + this.a + ", ts=" + this.b + ", cause=" + this.c + ')';
        }
    }

    /* JADX INFO: renamed from: oS0$e */
    public static final class e extends AbstractC5723oS0 {
        public final long a;
        public final long b;

        @NotNull
        public final String c;

        public e(long j) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Intrinsics.checkNotNullParameter(" ", "message");
            this.a = j;
            this.b = jCurrentTimeMillis;
            this.c = " ";
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a == eVar.a && this.b == eVar.b && Intrinsics.a(this.c, eVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + C5491nL.a(Long.hashCode(this.a) * 31, 31, this.b);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Ping(id=");
            sb.append(this.a);
            sb.append(", ts=");
            sb.append(this.b);
            sb.append(", message=");
            return C1039Gc0.e(sb, this.c, ')');
        }
    }

    /* JADX INFO: renamed from: oS0$f */
    public static final class f extends AbstractC5723oS0 {
        public final long a;
        public final long b;

        @NotNull
        public final String c;

        public f(String message, long j) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Intrinsics.checkNotNullParameter(message, "message");
            this.a = j;
            this.b = jCurrentTimeMillis;
            this.c = message;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.a == fVar.a && this.b == fVar.b && Intrinsics.a(this.c, fVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + C5491nL.a(Long.hashCode(this.a) * 31, 31, this.b);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Pong(id=");
            sb.append(this.a);
            sb.append(", ts=");
            sb.append(this.b);
            sb.append(", message=");
            return C1039Gc0.e(sb, this.c, ')');
        }
    }

    /* JADX INFO: renamed from: oS0$g */
    public static final class g extends AbstractC5723oS0 {
        public final long a;
        public final long b;

        @NotNull
        public final String c;

        public g(String message, long j) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Intrinsics.checkNotNullParameter(message, "message");
            this.a = j;
            this.b = jCurrentTimeMillis;
            this.c = message;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.a == gVar.a && this.b == gVar.b && Intrinsics.a(this.c, gVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + C5491nL.a(Long.hashCode(this.a) * 31, 31, this.b);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Received(id=");
            sb.append(this.a);
            sb.append(", ts=");
            sb.append(this.b);
            sb.append(", message=");
            return C1039Gc0.e(sb, this.c, ')');
        }
    }

    /* JADX INFO: renamed from: oS0$h */
    public static final class h extends AbstractC5723oS0 {
        public final long a;
        public final long b;

        @NotNull
        public final String c;

        public h(String message, long j) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Intrinsics.checkNotNullParameter(message, "message");
            this.a = j;
            this.b = jCurrentTimeMillis;
            this.c = message;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.a == hVar.a && this.b == hVar.b && Intrinsics.a(this.c, hVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + C5491nL.a(Long.hashCode(this.a) * 31, 31, this.b);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Sent(id=");
            sb.append(this.a);
            sb.append(", ts=");
            sb.append(this.b);
            sb.append(", message=");
            return C1039Gc0.e(sb, this.c, ')');
        }
    }
}
