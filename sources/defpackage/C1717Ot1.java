package defpackage;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ot1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1717Ot1<T> implements Serializable {

    @NotNull
    public static final a e = new a(null);

    @Nullable
    public final Object d;

    /* JADX INFO: renamed from: Ot1$a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: Ot1$b */
    public static final class b implements Serializable {

        @NotNull
        public final Throwable d;

        public b(@NotNull Throwable exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.d = exception;
        }

        public final boolean equals(@Nullable Object obj) {
            if (obj instanceof b) {
                return Intrinsics.a(this.d, ((b) obj).d);
            }
            return false;
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Failure(" + this.d + ')';
        }
    }

    @Nullable
    public static final Throwable a(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).d;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1717Ot1) {
            return Intrinsics.a(this.d, ((C1717Ot1) obj).d);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.d;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @NotNull
    public final String toString() {
        Object obj = this.d;
        if (obj instanceof b) {
            return ((b) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
