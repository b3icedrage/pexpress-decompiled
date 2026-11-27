package androidx.activity;

import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.g;
import androidx.lifecycle.k;
import defpackage.FP0;
import defpackage.ML0;
import defpackage.R51;
import defpackage.XO0;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/activity/ImmLeaksCleaner;", "Landroidx/lifecycle/k;", R51.PUSH_ADDITIONAL_DATA_KEY, "c", "d", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ImmLeaksCleaner implements k {

    public static abstract class a {
    }

    public static final class b extends ML0 implements Function0<a> {
        public static final b d = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final a invoke() {
            try {
                Field servedViewField = InputMethodManager.class.getDeclaredField("mServedView");
                servedViewField.setAccessible(true);
                Field nextServedViewField = InputMethodManager.class.getDeclaredField("mNextServedView");
                nextServedViewField.setAccessible(true);
                Field hField = InputMethodManager.class.getDeclaredField("mH");
                hField.setAccessible(true);
                Intrinsics.checkNotNullExpressionValue(hField, "hField");
                Intrinsics.checkNotNullExpressionValue(servedViewField, "servedViewField");
                Intrinsics.checkNotNullExpressionValue(nextServedViewField, "nextServedViewField");
                Intrinsics.checkNotNullParameter(hField, "hField");
                Intrinsics.checkNotNullParameter(servedViewField, "servedViewField");
                Intrinsics.checkNotNullParameter(nextServedViewField, "nextServedViewField");
                return new d();
            } catch (NoSuchFieldException unused) {
                return c.a;
            }
        }
    }

    public static final class c extends a {

        @NotNull
        public static final c a = new c();
    }

    public static final class d extends a {
    }

    static {
        XO0.b(b.d);
    }

    @Override // androidx.lifecycle.k
    public final void b(@NotNull FP0 source, @NotNull g.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == g.a.ON_DESTROY) {
            throw null;
        }
    }
}
