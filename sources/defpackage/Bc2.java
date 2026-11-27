package defpackage;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class Bc2 {
    public static final long b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static Bc2 d;
    public final ED a;

    public Bc2(ED ed) {
        this.a = ed;
    }

    public final boolean a(@NonNull C0996Fo c0996Fo) {
        if (TextUtils.isEmpty(c0996Fo.d)) {
            return true;
        }
        long j = c0996Fo.f + c0996Fo.g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.a.getClass();
        return j < timeUnit.toSeconds(System.currentTimeMillis()) + b;
    }
}
