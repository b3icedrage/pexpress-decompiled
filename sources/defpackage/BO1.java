package defpackage;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class BO1 extends CO1 {

    @NotNull
    public final AO1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BO1(@NotNull ActivityC6781tV0 activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.b = new AO1(this, activity);
    }

    @Override // defpackage.CO1
    public final void a() {
        ActivityC6781tV0 activityC6781tV0 = this.a;
        Resources.Theme theme = activityC6781tV0.getTheme();
        Intrinsics.checkNotNullExpressionValue(theme, "activity.theme");
        b(theme, new TypedValue());
        ((ViewGroup) activityC6781tV0.getWindow().getDecorView()).setOnHierarchyChangeListener(this.b);
    }
}
