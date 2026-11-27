package defpackage;

import android.app.Activity;
import com.pexpress.tool.MainActivityImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class EV0 implements FV0 {

    @Nullable
    public MainActivityImpl a;

    @Override // defpackage.FV0
    @Nullable
    public final Activity a() {
        return this.a;
    }

    @Override // defpackage.FV0
    @Nullable
    public final Class<Activity> b() {
        if (this.a != null) {
            return MainActivityImpl.class;
        }
        return null;
    }

    @Override // defpackage.FV0
    public final void c(@NotNull MainActivityImpl activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.a = activity;
    }
}
