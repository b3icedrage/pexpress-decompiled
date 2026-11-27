package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Bg1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0662Bg1 {

    /* JADX INFO: renamed from: Bg1$a */
    public static final class a<T> {

        @NotNull
        public final String a;

        public a(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.a = name;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            return Intrinsics.a(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @NotNull
        public final String toString() {
            return this.a;
        }
    }

    /* JADX INFO: renamed from: Bg1$b */
    public static final class b<T> {

        @NotNull
        public final a<T> a;

        public b(@NotNull a key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.a = key;
        }
    }

    @NotNull
    public abstract Map<a<?>, Object> a();

    @Nullable
    public abstract <T> T b(@NotNull a<T> aVar);
}
