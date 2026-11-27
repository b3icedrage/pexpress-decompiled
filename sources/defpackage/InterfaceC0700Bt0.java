package defpackage;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: Bt0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC0700Bt0 {
    @Nullable
    List<InterfaceC2022Sr0> getActionButtons();

    @Nullable
    JSONObject getAdditionalData();

    int getAndroidNotificationId();

    @Nullable
    C1311Jp getBackgroundImageLayout();

    @Nullable
    String getBigPicture();

    @Nullable
    String getBody();

    @Nullable
    String getCollapseId();

    @Nullable
    String getFromProjectNumber();

    @Nullable
    String getGroupKey();

    @Nullable
    String getGroupMessage();

    @Nullable
    List<InterfaceC0700Bt0> getGroupedNotifications();

    @Nullable
    String getLargeIcon();

    @Nullable
    String getLaunchURL();

    @Nullable
    String getLedColor();

    int getLockScreenVisibility();

    @Nullable
    String getNotificationId();

    int getPriority();

    @NotNull
    String getRawPayload();

    long getSentTime();

    @Nullable
    String getSmallIcon();

    @Nullable
    String getSmallIconAccentColor();

    @Nullable
    String getSound();

    @Nullable
    String getTemplateId();

    @Nullable
    String getTemplateName();

    @Nullable
    String getTitle();

    int getTtl();
}
