package defpackage;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.g;
import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: n02, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5421n02 {
    @NotNull
    public static final void a(@NotNull Toolbar toolbar, @NotNull g activity) {
        Intrinsics.checkNotNullParameter(toolbar, "<this>");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(activity, "<this>");
        toolbar.setNavigationIcon(C6333rM.getDrawable(activity, R.drawable.ic_previous));
        toolbar.setNavigationOnClickListener(new ViewOnClickListenerC6903u4(activity, 5));
    }
}
