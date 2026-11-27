package defpackage;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public interface P91 {

    @SuppressLint({"SyntheticAccessor"})
    public static final a.c a = new a.c();

    @SuppressLint({"SyntheticAccessor"})
    public static final a.b b = new a.b();

    public static abstract class a {

        /* JADX INFO: renamed from: P91$a$a, reason: collision with other inner class name */
        public static final class C0114a extends a {
            public final Throwable a;

            public C0114a(@NonNull Throwable th) {
                this.a = th;
            }

            @NonNull
            public final String toString() {
                return "FAILURE (" + this.a.getMessage() + ")";
            }
        }

        public static final class b extends a {
            @NonNull
            public final String toString() {
                return "IN_PROGRESS";
            }
        }

        public static final class c extends a {
            @NonNull
            public final String toString() {
                return "SUCCESS";
            }
        }
    }
}
