package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: va1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC7217va1 {

    /* JADX INFO: renamed from: va1$a */
    public static final class a implements InterfaceC7217va1 {

        @NotNull
        public final CommonError.ConfigLocked a;

        public a(@NotNull CommonError.ConfigLocked error) {
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
            return "ConfigLocked(error=" + this.a + ")";
        }
    }

    /* JADX INFO: renamed from: va1$b */
    public static final class b implements InterfaceC7217va1 {

        @NotNull
        public final CommonError.NotAuthenticated a;

        public b(@NotNull CommonError.NotAuthenticated error) {
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

    /* JADX INFO: renamed from: va1$c */
    public static final class c implements InterfaceC7217va1 {

        @NotNull
        public static final c a = new c();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1183502277;
        }

        @NotNull
        public final String toString() {
            return "Proceed";
        }
    }

    /* JADX INFO: renamed from: va1$d */
    public static final class d implements InterfaceC7217va1 {

        @NotNull
        public final CommonError.RestrictedCountry a;

        public d(@NotNull CommonError.RestrictedCountry error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.a = error;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.a(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "RestrictedCountry(error=" + this.a + ")";
        }
    }

    /* JADX INFO: renamed from: va1$e */
    public static final class e implements InterfaceC7217va1 {

        @NotNull
        public final CommonError a;

        public e(@NotNull CommonError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.a = error;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && Intrinsics.a(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Retry(error=" + this.a + ")";
        }
    }
}
