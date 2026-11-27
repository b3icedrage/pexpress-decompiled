package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: wa0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7427wa0 {

    /* JADX INFO: renamed from: wa0$a */
    public static final class a extends AbstractC7427wa0 {
        public final char a;
        public final boolean b;

        public a(char c) {
            this.a = c;
            this.b = c == 'B';
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Character.hashCode(this.a);
        }

        @NotNull
        public final String toString() {
            return "Loaded(group=" + this.a + ")";
        }
    }

    /* JADX INFO: renamed from: wa0$b */
    public static final class b extends AbstractC7427wa0 {

        @NotNull
        public static final b a = new b();
    }
}
