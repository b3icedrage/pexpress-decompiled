package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: b80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2882b80 {

    /* JADX INFO: renamed from: b80$a */
    public static abstract class a extends AbstractC2882b80 {

        /* JADX INFO: renamed from: b80$a$a, reason: collision with other inner class name */
        public static final class C0249a<T extends InterfaceC7394wP0.a> extends a {

            @NotNull
            public final T a;

            public C0249a(@NotNull T state) {
                Intrinsics.checkNotNullParameter(state, "state");
                this.a = state;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this != obj) {
                    return (obj instanceof C0249a) && Intrinsics.a(this.a, ((C0249a) obj).a);
                }
                return true;
            }

            public final int hashCode() {
                T t = this.a;
                if (t != null) {
                    return t.hashCode();
                }
                return 0;
            }

            @NotNull
            public final String toString() {
                return "StateChange(state=" + this.a + ")";
            }
        }

        /* JADX INFO: renamed from: b80$a$b */
        public static final class b extends a {

            @NotNull
            public static final b a = new b();
        }
    }

    /* JADX INFO: renamed from: b80$b */
    public static final class b extends AbstractC2882b80 {

        @NotNull
        public static final b a = new b();
    }

    /* JADX INFO: renamed from: b80$c */
    public static final class c<T extends CP1> extends AbstractC2882b80 {

        @NotNull
        public final T a;

        public c(@NotNull T state) {
            Intrinsics.checkNotNullParameter(state, "state");
            this.a = state;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this != obj) {
                return (obj instanceof c) && Intrinsics.a(this.a, ((c) obj).a);
            }
            return true;
        }

        public final int hashCode() {
            T t = this.a;
            if (t != null) {
                return t.hashCode();
            }
            return 0;
        }

        @NotNull
        public final String toString() {
            return "OnStateChange(state=" + this.a + ")";
        }
    }

    /* JADX INFO: renamed from: b80$d */
    public static abstract class d extends AbstractC2882b80 {

        /* JADX INFO: renamed from: b80$d$a */
        public static final class a<T extends Pf2.a> extends d {

            @NotNull
            public final T a;

            public a(@NotNull T event) {
                Intrinsics.checkNotNullParameter(event, "event");
                this.a = event;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this != obj) {
                    return (obj instanceof a) && Intrinsics.a(this.a, ((a) obj).a);
                }
                return true;
            }

            public final int hashCode() {
                T t = this.a;
                if (t != null) {
                    return t.hashCode();
                }
                return 0;
            }

            @NotNull
            public final String toString() {
                return "Event(event=" + this.a + ")";
            }
        }

        /* JADX INFO: renamed from: b80$d$b */
        public static final class b extends d {

            @NotNull
            public static final b a = new b();
        }
    }
}
