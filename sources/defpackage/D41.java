package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface D41 {

    public static final class a implements D41 {

        @NotNull
        public final InterfaceC2205Va0 a;

        public a(@NotNull InterfaceC2205Va0 decision) {
            Intrinsics.checkNotNullParameter(decision, "decision");
            this.a = decision;
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
            return "AppLink(decision=" + this.a + ")";
        }
    }

    public static final class b implements D41 {

        @NotNull
        public static final b a = new b();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1051632751;
        }

        @NotNull
        public final String toString() {
            return "BlockedMalformed";
        }
    }

    public static final class c implements D41 {

        @NotNull
        public static final c a = new c();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1928344009;
        }

        @NotNull
        public final String toString() {
            return "BlockedSelfTarget";
        }
    }

    public static final class d implements D41 {

        @NotNull
        public static final d a = new d();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 894374119;
        }

        @NotNull
        public final String toString() {
            return "NoBrowser";
        }
    }

    public static final class e implements D41 {

        @NotNull
        public static final e a = new e();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -715233638;
        }

        @NotNull
        public final String toString() {
            return "OpenedInBrowser";
        }
    }

    public static final class f implements D41 {

        @NotNull
        public static final f a = new f();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -1853071018;
        }

        @NotNull
        public final String toString() {
            return "OpenedInCustomTab";
        }
    }

    public static final class g implements D41 {

        @NotNull
        public static final g a = new g();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -45836043;
        }

        @NotNull
        public final String toString() {
            return "Unsupported";
        }
    }
}
