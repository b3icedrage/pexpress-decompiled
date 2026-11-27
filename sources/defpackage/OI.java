package defpackage;

import android.content.res.Configuration;
import android.os.LocaleList;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class OI {
    public static LocaleList a(Configuration configuration) {
        return configuration.getLocales();
    }

    public static void b(@NonNull Configuration configuration, @NonNull OR0 or0) {
        configuration.setLocales(or0.a.a);
    }
}
