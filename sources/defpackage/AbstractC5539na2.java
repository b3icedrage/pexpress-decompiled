package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: na2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5539na2 {

    /* JADX INFO: renamed from: na2$a */
    public static final class a extends AbstractC5539na2 {

        @NotNull
        public final String a;

        public a(@NotNull String errorMessage) {
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            this.a = errorMessage;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.a(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @NotNull
        public final String toString() {
            return C1039Gc0.e(new StringBuilder("Error(errorMessage="), this.a, ')');
        }
    }

    /* JADX INFO: renamed from: na2$b */
    public static final class b extends AbstractC5539na2 {
        public final long a;

        public b(long j) {
            this.a = j;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        @NotNull
        public final String toString() {
            return "Uploading(size=" + this.a + ')';
        }
    }
}
