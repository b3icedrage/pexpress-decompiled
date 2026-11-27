package defpackage;

import android.content.Context;
import android.util.TypedValue;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: sX0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6577sX0 {
    public static TypedValue a(@NonNull Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean b(@NonNull Context context, int i, boolean z) {
        TypedValue typedValueA = a(context, i);
        if (typedValueA == null || typedValueA.type != 18) {
            return z;
        }
        return typedValueA.data != 0;
    }

    @NonNull
    public static TypedValue c(@NonNull Context context, int i, @NonNull String str) {
        TypedValue typedValueA = a(context, i);
        if (typedValueA != null) {
            return typedValueA;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }
}
