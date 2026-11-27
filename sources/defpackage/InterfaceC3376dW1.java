package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import io.sentry.android.core.b0;
import java.io.Closeable;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: dW1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3376dW1 extends Closeable {

    /* JADX INFO: renamed from: dW1$a */
    public static abstract class a {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        public static void a(String str) {
            if (d.i(str, ":memory:")) {
                return;
            }
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.e(str.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            if (str.subSequence(i, length + 1).toString().length() == 0) {
                return;
            }
            b0.e("SupportSQLite", "deleting the database file: ".concat(str));
            try {
                File file = new File(str);
                Intrinsics.checkNotNullParameter(file, "file");
                SQLiteDatabase.deleteDatabase(file);
            } catch (Exception e) {
                b0.f("SupportSQLite", "delete failed: ", e);
            }
        }

        public void b(@NotNull C3213cj0 db) {
            Intrinsics.checkNotNullParameter(db, "db");
        }

        public abstract void c(@NotNull C3213cj0 c3213cj0);

        public abstract void d(@NotNull C3213cj0 c3213cj0, int i, int i2);

        public void e(@NotNull C3213cj0 db) {
            Intrinsics.checkNotNullParameter(db, "db");
        }

        public abstract void f(@NotNull C3213cj0 c3213cj0, int i, int i2);
    }

    /* JADX INFO: renamed from: dW1$b */
    public static final class b {

        @NotNull
        public final Context a;

        @Nullable
        public final String b;

        @NotNull
        public final a c;
        public final boolean d;
        public final boolean e;

        public b(@NotNull Context context, @Nullable String str, @NotNull a callback, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.a = context;
            this.b = str;
            this.c = callback;
            this.d = z;
            this.e = z2;
        }
    }

    /* JADX INFO: renamed from: dW1$c */
    public interface c {
        @NotNull
        InterfaceC3376dW1 a(@NotNull b bVar);
    }

    @NotNull
    InterfaceC3166cW1 A0();

    @Nullable
    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z);

    @NotNull
    InterfaceC3166cW1 t0();
}
