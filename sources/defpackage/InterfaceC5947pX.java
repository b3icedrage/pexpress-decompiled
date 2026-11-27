package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: pX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC5947pX {

    /* JADX INFO: renamed from: pX$a */
    public static final class a implements InterfaceC5947pX {

        @NotNull
        public static final a a = new a();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 849890913;
        }

        @NotNull
        public final String toString() {
            return "Failed";
        }
    }

    /* JADX INFO: renamed from: pX$b */
    public static final class b implements InterfaceC5947pX {

        @NotNull
        public final String a;

        public b(@NotNull String path) {
            Intrinsics.checkNotNullParameter(path, "path");
            this.a = path;
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
            return C5807oq.b(new StringBuilder("Saved(path="), this.a, ")");
        }
    }

    /* JADX INFO: renamed from: pX$c */
    public static final class c implements InterfaceC5947pX {

        @NotNull
        public final Uri a;

        @NotNull
        public final String b;

        public c(@NotNull Uri uri, @NotNull String mimeType) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            Intrinsics.checkNotNullParameter(mimeType, "mimeType");
            this.a = uri;
            this.b = mimeType;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.a(this.a, cVar.a) && Intrinsics.a(this.b, cVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "Share(uri=" + this.a + ", mimeType=" + this.b + ")";
        }
    }
}
