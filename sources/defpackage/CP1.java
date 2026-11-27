package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CP1 {

    public static final class a extends CP1 {

        @NotNull
        public final DI1 a;

        public a(@NotNull DI1 session) {
            Intrinsics.checkNotNullParameter(session, "session");
            this.a = session;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this != obj) {
                return (obj instanceof a) && Intrinsics.a(this.a, ((a) obj).a);
            }
            return true;
        }

        public final int hashCode() {
            DI1 di1 = this.a;
            if (di1 != null) {
                return di1.hashCode();
            }
            return 0;
        }

        @NotNull
        public final String toString() {
            return "Connected(session=" + this.a + ")";
        }
    }

    public static final class b extends CP1 {

        @NotNull
        public final DI1 a;
        public final int b;

        public b(@NotNull DI1 session, int i) {
            Intrinsics.checkNotNullParameter(session, "session");
            this.a = session;
            this.b = i;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.a(this.a, bVar.a) && this.b == bVar.b;
        }

        public final int hashCode() {
            DI1 di1 = this.a;
            return Integer.hashCode(this.b) + ((di1 != null ? di1.hashCode() : 0) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Connecting(session=");
            sb.append(this.a);
            sb.append(", retryCount=");
            return SK.b(sb, this.b, ")");
        }
    }

    public static final class c extends CP1 {

        @NotNull
        public static final c a = new c();
    }

    public static final class d extends CP1 {

        @NotNull
        public static final d a = new d();
    }

    public static final class e extends CP1 {

        @NotNull
        public static final e a = new e();
    }

    public static final class f extends CP1 {

        @NotNull
        public final C2449Xt1 a;
        public final int b;
        public final long c;

        public f(@NotNull C2449Xt1 timerDisposable, int i, long j) {
            Intrinsics.checkNotNullParameter(timerDisposable, "timerDisposable");
            this.a = timerDisposable;
            this.b = i;
            this.c = j;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return Intrinsics.a(this.a, fVar.a) && this.b == fVar.b && this.c == fVar.c;
        }

        public final int hashCode() {
            C2449Xt1 c2449Xt1 = this.a;
            return Long.hashCode(this.c) + EF0.a(this.b, (c2449Xt1 != null ? c2449Xt1.hashCode() : 0) * 31, 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("WaitingToRetry(timerDisposable=");
            sb.append(this.a);
            sb.append(", retryCount=");
            sb.append(this.b);
            sb.append(", retryInMillis=");
            return C0681Bn.c(sb, this.c, ")");
        }
    }
}
