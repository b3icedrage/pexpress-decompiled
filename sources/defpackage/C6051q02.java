package defpackage;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: q02, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6051q02 {

    /* JADX INFO: renamed from: q02$a */
    public static class a {
        public static void a(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    public static void a(@NonNull View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            a.a(view, charSequence);
            return;
        }
        ViewOnLongClickListenerC6260r02 viewOnLongClickListenerC6260r02 = ViewOnLongClickListenerC6260r02.o;
        if (viewOnLongClickListenerC6260r02 != null && viewOnLongClickListenerC6260r02.d == view) {
            ViewOnLongClickListenerC6260r02.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new ViewOnLongClickListenerC6260r02(view, charSequence);
            return;
        }
        ViewOnLongClickListenerC6260r02 viewOnLongClickListenerC6260r03 = ViewOnLongClickListenerC6260r02.p;
        if (viewOnLongClickListenerC6260r03 != null && viewOnLongClickListenerC6260r03.d == view) {
            viewOnLongClickListenerC6260r03.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }
}
