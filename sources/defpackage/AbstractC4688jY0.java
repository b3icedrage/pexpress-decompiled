package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: jY0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4688jY0 {

    /* JADX INFO: renamed from: jY0$a */
    public static final class a extends AbstractC4688jY0 {
        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return 0;
        }

        @NotNull
        public final String toString() {
            return "Error(messageError=null)";
        }
    }

    /* JADX INFO: renamed from: jY0$b */
    public static final class b extends AbstractC4688jY0 {

        @NotNull
        public static final b a = new b();
    }

    /* JADX INFO: renamed from: jY0$c */
    public static final class c extends AbstractC4688jY0 {

        @NotNull
        public static final c a = new c();
    }

    /* JADX INFO: renamed from: jY0$d */
    public static final class d extends AbstractC4688jY0 {

        @NotNull
        public static final d a = new d();
    }

    /* JADX INFO: renamed from: jY0$e */
    public static final class e extends AbstractC4688jY0 {

        @NotNull
        public final C4220hY0 a;

        public e(@NotNull C4220hY0 media) {
            Intrinsics.checkNotNullParameter(media, "media");
            this.a = media;
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
            return "Success(media=" + this.a + ')';
        }

        public e() {
            this(new C4220hY0((String) null, 15, (String) null, false));
        }
    }
}
