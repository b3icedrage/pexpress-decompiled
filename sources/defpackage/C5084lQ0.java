package defpackage;

import android.widget.ImageView;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: lQ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5084lQ0 implements F32 {

    @NotNull
    public final C2611Zv1 a;

    public C5084lQ0(@NotNull C2611Zv1 binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.a = binding;
    }

    @Override // defpackage.F32
    @NotNull
    public final ImageView a() {
        ImageView settingsIcon = this.a.e;
        Intrinsics.checkNotNullExpressionValue(settingsIcon, "settingsIcon");
        return settingsIcon;
    }

    @Override // defpackage.F32
    @NotNull
    public final TextView b() {
        TextView settingsValueText = this.a.h;
        Intrinsics.checkNotNullExpressionValue(settingsValueText, "settingsValueText");
        return settingsValueText;
    }

    @Override // defpackage.F32
    @NotNull
    public final TextView c() {
        TextView settingsTitleText = this.a.g;
        Intrinsics.checkNotNullExpressionValue(settingsTitleText, "settingsTitleText");
        return settingsTitleText;
    }
}
