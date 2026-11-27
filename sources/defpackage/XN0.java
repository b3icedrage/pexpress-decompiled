package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface XN0 {

    public static final class a implements XN0 {

        @NotNull
        public final CommonError a;

        public a(@NotNull CommonError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.a = error;
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
            return "KeepSession(error=" + this.a + ")";
        }
    }

    public static final class b implements XN0 {

        @NotNull
        public final CommonError a;

        public b(@NotNull CommonError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.a = error;
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
            return "Logout(error=" + this.a + ")";
        }
    }

    public static final class c implements XN0 {

        @NotNull
        public static final c a = new c();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1623699932;
        }

        @NotNull
        public final String toString() {
            return "NoSession";
        }
    }

    public static final class d implements XN0 {

        @NotNull
        public static final d a = new d();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -2116095307;
        }

        @NotNull
        public final String toString() {
            return "Proceed";
        }
    }
}
