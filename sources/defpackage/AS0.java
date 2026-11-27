package defpackage;

import androidx.annotation.NonNull;
import io.sentry.android.core.b0;

/* JADX INFO: loaded from: classes.dex */
public abstract class AS0 {
    public static final Object a = new Object();
    public static volatile a b;

    public static class a extends AS0 {
        public final int c;

        public a(int i) {
            this.c = i;
        }

        @Override // defpackage.AS0
        public final void a(@NonNull String str, @NonNull String str2) {
            if (this.c <= 6) {
                b0.c(str, str2);
            }
        }

        @Override // defpackage.AS0
        public final void b(@NonNull String str, @NonNull String str2, @NonNull Throwable th) {
            if (this.c <= 6) {
                b0.d(str, str2, th);
            }
        }

        @Override // defpackage.AS0
        public final void e(@NonNull String str, @NonNull String str2) {
            if (this.c <= 5) {
                b0.e(str, str2);
            }
        }
    }

    @NonNull
    public static AS0 c() {
        a aVar;
        synchronized (a) {
            try {
                if (b == null) {
                    b = new a(3);
                }
                aVar = b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    @NonNull
    public static String d(@NonNull String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public abstract void a(@NonNull String str, @NonNull String str2);

    public abstract void b(@NonNull String str, @NonNull String str2, @NonNull Throwable th);

    public abstract void e(@NonNull String str, @NonNull String str2);
}
