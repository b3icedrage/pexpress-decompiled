package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface Pf2 {

    public static abstract class a {

        /* JADX INFO: renamed from: Pf2$a$a, reason: collision with other inner class name */
        public static final class C0116a extends a {

            @NotNull
            public final FL1 a;

            public C0116a(@NotNull FL1 shutdownReason) {
                Intrinsics.checkNotNullParameter(shutdownReason, "shutdownReason");
                this.a = shutdownReason;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this != obj) {
                    return (obj instanceof C0116a) && Intrinsics.a(this.a, ((C0116a) obj).a);
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
                return "OnConnectionClosed(shutdownReason=" + this.a + ")";
            }
        }

        public static final class b extends a {

            @NotNull
            public final FL1 a;

            public b(@NotNull FL1 shutdownReason) {
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
                return "OnConnectionClosing(shutdownReason=" + this.a + ")";
            }
        }

        public static final class c extends a {

            @NotNull
            public final Exception a;

            public c(@NotNull Exception throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                this.a = throwable;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this != obj) {
                    return (obj instanceof c) && Intrinsics.a(this.a, ((c) obj).a);
                }
                return true;
            }

            public final int hashCode() {
                Exception exc = this.a;
                if (exc != null) {
                    return exc.hashCode();
                }
                return 0;
            }

            @NotNull
            public final String toString() {
                return "OnConnectionFailed(throwable=" + this.a + ")";
            }
        }

        public static final class d<WEB_SOCKET> extends a {

            @NotNull
            public final Qf2 a;

            public d(@NotNull Qf2 webSocket) {
                Intrinsics.checkNotNullParameter(webSocket, "webSocket");
                this.a = webSocket;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this != obj) {
                    return (obj instanceof d) && Intrinsics.a(this.a, ((d) obj).a);
                }
                return true;
            }

            public final int hashCode() {
                Qf2 qf2 = this.a;
                if (qf2 != null) {
                    return qf2.hashCode();
                }
                return 0;
            }

            @NotNull
            public final String toString() {
                return "OnConnectionOpened(webSocket=" + this.a + ")";
            }
        }

        public static final class e extends a {

            @NotNull
            public final AbstractC6583sZ0 a;

            public e(@NotNull AbstractC6583sZ0 message) {
                Intrinsics.checkNotNullParameter(message, "message");
                this.a = message;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this != obj) {
                    return (obj instanceof e) && Intrinsics.a(this.a, ((e) obj).a);
                }
                return true;
            }

            public final int hashCode() {
                AbstractC6583sZ0 abstractC6583sZ0 = this.a;
                if (abstractC6583sZ0 != null) {
                    return abstractC6583sZ0.hashCode();
                }
                return 0;
            }

            @NotNull
            public final String toString() {
                return "OnMessageReceived(message=" + this.a + ")";
            }
        }
    }

    boolean a(@NotNull AbstractC6583sZ0 abstractC6583sZ0);

    boolean b(@NotNull FL1 fl1);

    void cancel();
}
