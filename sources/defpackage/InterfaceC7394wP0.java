package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: wP0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC7394wP0 extends InterfaceC2236Vk1<a> {

    /* JADX INFO: renamed from: wP0$a */
    public static abstract class a {

        /* JADX INFO: renamed from: wP0$a$a, reason: collision with other inner class name */
        public static final class C0527a extends a {

            @NotNull
            public static final C0527a a = new C0527a();
        }

        /* JADX INFO: renamed from: wP0$a$b */
        public static final class b extends a {

            @NotNull
            public static final b a = new b();
        }

        /* JADX INFO: renamed from: wP0$a$c */
        public static abstract class c extends a {

            /* JADX INFO: renamed from: wP0$a$c$a, reason: collision with other inner class name */
            public static final class C0528a extends c {

                @NotNull
                public static final C0528a a = new C0528a();
            }

            /* JADX INFO: renamed from: wP0$a$c$b */
            public static final class b extends c {

                @NotNull
                public final FL1 a;

                public b() {
                    FL1 shutdownReason = FL1.c;
                    Intrinsics.checkNotNullParameter(shutdownReason, "shutdownReason");
                    this.a = shutdownReason;
                }

                public final boolean equals(@Nullable Object obj) {
                    if (this != obj) {
                        return (obj instanceof b) && Intrinsics.a(this.a, ((b) obj).a);
                    }
                    return true;
                }

                public final int hashCode() {
                    FL1 fl1 = this.a;
                    if (fl1 != null) {
                        return fl1.hashCode();
                    }
                    return 0;
                }

                @NotNull
                public final String toString() {
                    return "WithReason(shutdownReason=" + this.a + ")";
                }
            }
        }
    }
}
