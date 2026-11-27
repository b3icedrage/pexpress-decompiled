package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Va0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2205Va0 {

    /* JADX INFO: renamed from: Va0$a */
    public static final class a implements InterfaceC2205Va0 {

        @NotNull
        public static final a a = new a();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1893311032;
        }

        @NotNull
        public final String toString() {
            return "BlockedMalformed";
        }
    }

    /* JADX INFO: renamed from: Va0$b */
    public static final class b implements InterfaceC2205Va0 {

        @NotNull
        public static final b a = new b();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -2044400352;
        }

        @NotNull
        public final String toString() {
            return "BlockedSelfTarget";
        }
    }

    /* JADX INFO: renamed from: Va0$c */
    public static final class c implements InterfaceC2205Va0 {

        @NotNull
        public static final c a = new c();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1834643654;
        }

        @NotNull
        public final String toString() {
            return "BlockedUnsafeTarget";
        }
    }

    /* JADX INFO: renamed from: Va0$d */
    public static final class d implements InterfaceC2205Va0 {

        @NotNull
        public static final d a = new d();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1204957318;
        }

        @NotNull
        public final String toString() {
            return "LaunchedApp";
        }
    }

    /* JADX INFO: renamed from: Va0$e */
    public static final class e implements InterfaceC2205Va0 {

        @NotNull
        public static final e a = new e();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -123336777;
        }

        @NotNull
        public final String toString() {
            return "LaunchedMarket";
        }
    }

    /* JADX INFO: renamed from: Va0$f */
    public static final class f implements InterfaceC2205Va0 {

        @NotNull
        public final String a;

        public f(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.a = url;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && Intrinsics.a(this.a, ((f) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @NotNull
        public final String toString() {
            return C5807oq.b(new StringBuilder("LoadFallback(url="), this.a, ")");
        }
    }

    /* JADX INFO: renamed from: Va0$g */
    public static final class g implements InterfaceC2205Va0 {

        @NotNull
        public static final g a = new g();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 1513708165;
        }

        @NotNull
        public final String toString() {
            return "LoadInWebView";
        }
    }

    /* JADX INFO: renamed from: Va0$h */
    public static final class h implements InterfaceC2205Va0 {

        @NotNull
        public static final h a = new h();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 1638940512;
        }

        @NotNull
        public final String toString() {
            return "NoHandler";
        }
    }
}
