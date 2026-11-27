package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: sZ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6583sZ0 {

    /* JADX INFO: renamed from: sZ0$a */
    public static final class a extends AbstractC6583sZ0 {

        @NotNull
        public final byte[] a;

        public a(@NotNull byte[] value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.a = value;
        }
    }

    /* JADX INFO: renamed from: sZ0$b */
    public static final class b extends AbstractC6583sZ0 {

        @NotNull
        public final String a;

        public b(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.a = value;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this != obj) {
                return (obj instanceof b) && Intrinsics.a(this.a, ((b) obj).a);
            }
            return true;
        }

        public final int hashCode() {
            String str = this.a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        @NotNull
        public final String toString() {
            return C5807oq.b(new StringBuilder("Text(value="), this.a, ")");
        }
    }
}
