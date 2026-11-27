package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

/* JADX INFO: renamed from: bt0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC3038bt0 {
    void cacheIAMInfluenceType(@NotNull EnumC1890Qz0 enumC1890Qz0);

    void cacheNotificationInfluenceType(@NotNull EnumC1890Qz0 enumC1890Qz0);

    void cacheNotificationOpenId(@Nullable String str);

    @Nullable
    String getCachedNotificationOpenId();

    @NotNull
    EnumC1890Qz0 getIamCachedInfluenceType();

    int getIamIndirectAttributionWindow();

    int getIamLimit();

    @NotNull
    JSONArray getLastIAMsReceivedData();

    @NotNull
    JSONArray getLastNotificationsReceivedData();

    @NotNull
    EnumC1890Qz0 getNotificationCachedInfluenceType();

    int getNotificationIndirectAttributionWindow();

    int getNotificationLimit();

    boolean isDirectInfluenceEnabled();

    boolean isIndirectInfluenceEnabled();

    boolean isUnattributedInfluenceEnabled();

    void saveIAMs(@NotNull JSONArray jSONArray);

    void saveNotifications(@NotNull JSONArray jSONArray);
}
