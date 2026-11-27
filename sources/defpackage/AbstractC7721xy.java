package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: xy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7721xy {

    /* JADX INFO: renamed from: xy$a */
    public static final class a extends AbstractC7721xy {

        @NotNull
        public static final a a = new a();
    }

    /* JADX INFO: renamed from: xy$b */
    public static final class b extends AbstractC7721xy {

        @NotNull
        public final ArrayList a;

        public b(@NotNull ArrayList result) {
            Intrinsics.checkNotNullParameter(result, "result");
            this.a = result;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.a(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Success(result=" + this.a + ")";
        }
    }
}
