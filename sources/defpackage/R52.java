package defpackage;

import android.content.Context;
import android.location.LocationManager;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class R52 {
    public static R52 d;
    public final Context a;
    public final LocationManager b;
    public final a c = new a();

    public static class a {
        public boolean a;
        public long b;
    }

    public R52(@NonNull Context context, @NonNull LocationManager locationManager) {
        this.a = context;
        this.b = locationManager;
    }
}
