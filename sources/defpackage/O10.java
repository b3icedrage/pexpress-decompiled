package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface O10 {

    public static final class a implements O10 {

        @NotNull
        public final H32.a a;

        public a(@NotNull H32.a direction) {
            Intrinsics.checkNotNullParameter(direction, "direction");
            this.a = direction;
        }

        @Override // defpackage.O10
        @NotNull
        public final H32.a a() {
            return this.a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "ClosePrice(direction=" + this.a + ")";
        }
    }

    public static final class b implements O10 {

        @NotNull
        public final H32.a a;

        public b(@NotNull H32.a direction) {
            Intrinsics.checkNotNullParameter(direction, "direction");
            this.a = direction;
        }

        @Override // defpackage.O10
        @NotNull
        public final H32.a a() {
            return this.a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "RandomDirection(direction=" + this.a + ")";
        }
    }

    public static final class c implements O10 {

        @NotNull
        public final H32.a a;

        public c(@NotNull H32.a direction) {
            Intrinsics.checkNotNullParameter(direction, "direction");
            this.a = direction;
        }

        @Override // defpackage.O10
        @NotNull
        public final H32.a a() {
            return this.a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Success(direction=" + this.a + ")";
        }
    }

    @NotNull
    H32.a a();
}
