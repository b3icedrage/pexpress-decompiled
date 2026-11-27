package defpackage;

import android.app.Notification;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: dv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC3462dv0 {
    void createGenericPendingIntentsForGroup(@Nullable C4133h61 c4133h61, @NotNull QB0 qb0, @NotNull JSONObject jSONObject, @NotNull String str, int i);

    @Nullable
    Object createGrouplessSummaryNotification(@NotNull C6283r61 c6283r61, @NotNull QB0 qb0, int i, int i2, @NotNull JM<? super Unit> jm);

    @NotNull
    Notification createSingleNotificationBeforeSummaryBuilder(@NotNull C6283r61 c6283r61, @Nullable C4133h61 c4133h61);

    @Nullable
    Object createSummaryNotification(@NotNull C6283r61 c6283r61, @Nullable C5444n61.a aVar, int i, @NotNull JM<? super Unit> jm);

    @Nullable
    Object updateSummaryNotification(@NotNull C6283r61 c6283r61, @NotNull JM<? super Unit> jm);
}
