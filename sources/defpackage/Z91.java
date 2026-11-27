package defpackage;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class Z91<T> {
    public static final a e = new a();
    public final T a;
    public final b<T> b;
    public final String c;
    public volatile byte[] d;

    public interface b<T> {
        void a(@NonNull byte[] bArr, @NonNull T t, @NonNull MessageDigest messageDigest);
    }

    public Z91(@NonNull String str, T t, @NonNull b<T> bVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        this.c = str;
        this.a = t;
        this.b = bVar;
    }

    @NonNull
    public static Z91 a(@NonNull Object obj, @NonNull String str) {
        return new Z91(str, obj, e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Z91) {
            return this.c.equals(((Z91) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return C5807oq.b(new StringBuilder("Option{key='"), this.c, "'}");
    }

    public class a implements b<Object> {
        @Override // Z91.b
        public final void a(@NonNull byte[] bArr, @NonNull Object obj, @NonNull MessageDigest messageDigest) {
        }
    }
}
