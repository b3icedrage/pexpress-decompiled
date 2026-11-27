package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: jl2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC4740jl2 {

    /* JADX INFO: renamed from: jl2$a */
    public static final class a implements InterfaceC4740jl2 {

        @NotNull
        public final String a;

        public a(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.a = message;
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
            return C5807oq.b(new StringBuilder("Failure(message="), this.a, ")");
        }
    }

    /* JADX INFO: renamed from: jl2$b */
    public static final class b implements InterfaceC4740jl2 {

        @NotNull
        public static final b a = new b();
    }
}
