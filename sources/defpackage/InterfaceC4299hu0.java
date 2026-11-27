package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

/* JADX INFO: renamed from: hu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC4299hu0 {
    @NotNull
    String getName();

    @Nullable
    JSONArray getNotificationIds();

    @NotNull
    EnumC1890Qz0 getSession();

    long getSessionTime();

    long getTimestamp();

    float getWeight();
}
