package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class TZ1 extends ContextWrapper {
    public static final Object a = null;

    public static void a(@NonNull Context context) {
        if ((context instanceof TZ1) || (context.getResources() instanceof VZ1)) {
            return;
        }
        context.getResources();
        int i = C4240hd2.a;
    }
}
