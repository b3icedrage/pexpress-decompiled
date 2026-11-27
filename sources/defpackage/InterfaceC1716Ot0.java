package defpackage;

import android.app.Activity;
import com.onesignal.notifications.INotificationReceivedEvent;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: Ot0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC1716Ot0 {
    void addExternalClickListener(@NotNull InterfaceC1090Gt0 interfaceC1090Gt0);

    void addExternalForegroundLifecycleListener(@NotNull InterfaceC1638Nt0 interfaceC1638Nt0);

    @Nullable
    Object canOpenNotification(@NotNull Activity activity, @NotNull JSONObject jSONObject, @NotNull JM<? super Boolean> jm);

    @Nullable
    Object canReceiveNotification(@NotNull JSONObject jSONObject, @NotNull JM<? super Boolean> jm);

    void externalNotificationWillShowInForeground(@NotNull InterfaceC3041bu0 interfaceC3041bu0);

    void externalRemoteNotificationReceived(@NotNull INotificationReceivedEvent iNotificationReceivedEvent);

    @Nullable
    Object notificationOpened(@NotNull Activity activity, @NotNull JSONArray jSONArray, @NotNull JM<? super Unit> jm);

    @Nullable
    Object notificationReceived(@NotNull C6283r61 c6283r61, @NotNull JM<? super Unit> jm);

    void removeExternalClickListener(@NotNull InterfaceC1090Gt0 interfaceC1090Gt0);

    void removeExternalForegroundLifecycleListener(@NotNull InterfaceC1638Nt0 interfaceC1638Nt0);

    void setInternalNotificationLifecycleCallback(@Nullable InterfaceC1557Mt0 interfaceC1557Mt0);
}
