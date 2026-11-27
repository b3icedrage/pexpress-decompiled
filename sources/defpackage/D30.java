package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes.dex */
public final class D30 {
    public static volatile boolean a = true;

    public static Drawable a(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (a) {
                return b(context2, i, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e;
            }
            return C6333rM.getDrawable(context2, i);
        } catch (NoClassDefFoundError unused2) {
            a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal<TypedValue> threadLocal = C7708xt1.a;
        return C7708xt1.a.a(resources, i, theme);
    }

    public static Drawable b(Context context, int i, Resources.Theme theme) {
        if (theme != null) {
            HM hm = new HM(context);
            hm.b = theme;
            hm.a(theme.getResources().getConfiguration());
            context = hm;
        }
        return C7652xe.d(context, i);
    }
}
