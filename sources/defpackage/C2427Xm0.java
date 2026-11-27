package defpackage;

import android.widget.ImageView;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Xm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2427Xm0 implements F32 {

    @NotNull
    public final C2838aw1 a;

    public C2427Xm0(@NotNull C2838aw1 binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.a = binding;
    }

    @Override // defpackage.F32
    @NotNull
    public final ImageView a() {
        ImageView icSettingsItem = this.a.e;
        Intrinsics.checkNotNullExpressionValue(icSettingsItem, "icSettingsItem");
        return icSettingsItem;
    }

    @Override // defpackage.F32
    @NotNull
    public final TextView b() {
        TextView settingsHeaderText = this.a.h;
        Intrinsics.checkNotNullExpressionValue(settingsHeaderText, "settingsHeaderText");
        return settingsHeaderText;
    }

    @Override // defpackage.F32
    @NotNull
    public final TextView c() {
        TextView settingsDescriptionText = this.a.g;
        Intrinsics.checkNotNullExpressionValue(settingsDescriptionText, "settingsDescriptionText");
        return settingsDescriptionText;
    }
}
