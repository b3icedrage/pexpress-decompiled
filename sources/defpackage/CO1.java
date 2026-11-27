package defpackage;

import android.content.res.Resources;
import android.util.TypedValue;
import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public class CO1 {

    @NotNull
    public final ActivityC6781tV0 a;

    public CO1(@NotNull ActivityC6781tV0 activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.a = activity;
    }

    public void a() {
        TypedValue typedValue = new TypedValue();
        Resources.Theme currentTheme = this.a.getTheme();
        currentTheme.resolveAttribute(R.attr.windowSplashScreenBackground, typedValue, true);
        if (currentTheme.resolveAttribute(R.attr.windowSplashScreenAnimatedIcon, typedValue, true)) {
            currentTheme.getDrawable(typedValue.resourceId);
        }
        currentTheme.resolveAttribute(R.attr.splashScreenIconSize, typedValue, true);
        Intrinsics.checkNotNullExpressionValue(currentTheme, "currentTheme");
        b(currentTheme, typedValue);
    }

    public final void b(@NotNull Resources.Theme currentTheme, @NotNull TypedValue typedValue) {
        int i;
        Intrinsics.checkNotNullParameter(currentTheme, "currentTheme");
        Intrinsics.checkNotNullParameter(typedValue, "typedValue");
        if (!currentTheme.resolveAttribute(R.attr.postSplashScreenTheme, typedValue, true) || (i = typedValue.resourceId) == 0) {
            return;
        }
        this.a.setTheme(i);
    }
}
