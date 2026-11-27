package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: It0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC1246It0 {
    void addNotificationActionButtons(@NotNull JSONObject jSONObject, @NotNull QB0 qb0, @Nullable C4133h61 c4133h61, int i, @Nullable String str);

    void addXiaomiSettings(@Nullable C5444n61.a aVar, @NotNull Notification notification);

    @NotNull
    C5444n61.a getBaseOneSignalNotificationBuilder(@NotNull C6283r61 c6283r61);

    @Nullable
    Bitmap getDefaultLargeIcon();

    int getDefaultSmallIconId();

    int getGroupAlertBehavior();

    @NotNull
    Intent getNewBaseDismissIntent(int i);

    @NotNull
    PendingIntent getNewDismissActionPendingIntent(int i, @NotNull Intent intent);

    @NotNull
    CharSequence getTitle(@NotNull JSONObject jSONObject);

    void removeNotifyOptions(@Nullable C4133h61 c4133h61);
}
