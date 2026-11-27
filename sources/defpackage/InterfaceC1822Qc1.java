package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Qc1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1822Qc1 {

    /* JADX INFO: renamed from: Qc1$a */
    public static final class a implements InterfaceC1822Qc1 {

        @NotNull
        public static final a a = new a();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -237661923;
        }

        @NotNull
        public final String toString() {
            return "Added";
        }
    }

    /* JADX INFO: renamed from: Qc1$b */
    public static final class b implements InterfaceC1822Qc1 {

        @NotNull
        public static final b a = new b();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 97872269;
        }

        @NotNull
        public final String toString() {
            return "NothingPending";
        }
    }

    /* JADX INFO: renamed from: Qc1$c */
    public static final class c implements InterfaceC1822Qc1 {

        @NotNull
        public final CommonError a;

        public c(@NotNull CommonError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.a = error;
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
            return "Retry(error=" + this.a + ")";
        }
    }

    /* JADX INFO: renamed from: Qc1$d */
    public static final class d implements InterfaceC1822Qc1 {

        @NotNull
        public final CommonError a;

        public d(@NotNull CommonError error) {
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
            return "Skip(error=" + this.a + ")";
        }
    }
}
