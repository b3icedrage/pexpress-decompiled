package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: nA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5458nA {

    /* JADX INFO: renamed from: nA$a */
    public static final class a extends AbstractC5458nA {

        @NotNull
        public static final a a = new a();
    }

    /* JADX INFO: renamed from: nA$b */
    public static final class b extends AbstractC5458nA {
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
            return SK.b(new StringBuilder("VisibleCharCounter(charCount="), this.a, ")");
        }
    }
}
