package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class TZ0 {

    public static final class a extends TZ0 {

        @NotNull
        public static final a a = new a();

        @NotNull
        public final String toString() {
            return "DELIVERED";
        }
    }

    public static final class b extends TZ0 {

        @NotNull
        public static final b a = new b();

        @NotNull
        public final String toString() {
            return "ERROR";
        }
    }

    public static final class c extends TZ0 {

        @NotNull
        public static final c a = new c();

        @NotNull
        public final String toString() {
            return "SENDING";
        }
    }

    public static final class d extends TZ0 {

        @NotNull
        public static final d a = new d();

        @NotNull
        public final String toString() {
            return "SENT";
        }
    }
}
