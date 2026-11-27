package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface R9 {

    public static final class a implements R9 {

        @NotNull
        public final X91 a;

        public a(@NotNull X91 fallbackStrategy) {
            Intrinsics.checkNotNullParameter(fallbackStrategy, "fallbackStrategy");
            this.a = fallbackStrategy;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a.equals(((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "FallbackStrategyShouldBeUsed(fallbackStrategy=" + this.a + ")";
        }
    }

    public static final class b implements R9 {
        public final int a;

        public b(int i) {
            this.a = i;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        @NotNull
        public final String toString() {
            return SK.b(new StringBuilder("NewAmountCalculated(result="), this.a, ")");
        }
    }
}
