package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: f9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3723f9 {

    /* JADX INFO: renamed from: f9$a */
    public static final class a extends AbstractC3723f9 {

        @NotNull
        public static final a a = new a();
    }

    /* JADX INFO: renamed from: f9$b */
    public static final class b extends AbstractC3723f9 {

        @NotNull
        public static final b a = new b();
    }

    /* JADX INFO: renamed from: f9$c */
    public static final class c extends AbstractC3723f9 {

        @NotNull
        public final String a;

        public c(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.a = message;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.a(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @NotNull
        public final String toString() {
            return C1039Gc0.e(new StringBuilder("TextStatus(message="), this.a, ')');
        }
    }

    /* JADX INFO: renamed from: f9$d */
    public static final class d extends AbstractC3723f9 {

        @NotNull
        public static final d a = new d();
    }
}
