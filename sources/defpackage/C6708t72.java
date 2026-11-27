package defpackage;

import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.credentials.CredentialsApi;

/* JADX INFO: renamed from: t72, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6708t72 {
    public static Typeface a(@NonNull Configuration configuration, @NonNull Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, C1952Ru.h(configuration.fontWeightAdjustment + typeface.getWeight(), 1, CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT), typeface.isItalic());
    }
}
