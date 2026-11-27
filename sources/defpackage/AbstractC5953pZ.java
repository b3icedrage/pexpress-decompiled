package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: pZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5953pZ<T> {

    /* JADX INFO: renamed from: pZ$a */
    public static final class a<T> extends AbstractC5953pZ<T> {

        @NotNull
        public final Throwable a;

        public a(@NotNull Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.a = throwable;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this != obj) {
                return (obj instanceof a) && Intrinsics.a(this.a, ((a) obj).a);
            }
            return true;
        }

        public final int hashCode() {
            Throwable th = this.a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @NotNull
        public final String toString() {
            return "Error(throwable=" + this.a + ")";
        }
    }

    /* JADX INFO: renamed from: pZ$b */
    public static final class b<T> extends AbstractC5953pZ<T> {
        public final T a;

        public b(T t) {
            this.a = t;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this != obj) {
                return (obj instanceof b) && Intrinsics.a(this.a, ((b) obj).a);
            }
            return true;
        }

        public final int hashCode() {
            T t = this.a;
            if (t != null) {
                return t.hashCode();
            }
            return 0;
        }

        @NotNull
        public final String toString() {
            return K1.a(new StringBuilder("Success(value="), this.a, ")");
        }
    }
}
