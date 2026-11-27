package defpackage;

import android.app.Activity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: Mt0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC1557Mt0 {
    @Nullable
    Object canOpenNotification(@NotNull Activity activity, @NotNull JSONObject jSONObject, @NotNull JM<? super Boolean> jm);

    @Nullable
    Object canReceiveNotification(@NotNull JSONObject jSONObject, @NotNull JM<? super Boolean> jm);
}
