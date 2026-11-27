package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: cu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC3250cu0 {
    /* JADX INFO: renamed from: addClickListener */
    void mo28addClickListener(@NotNull InterfaceC1090Gt0 interfaceC1090Gt0);

    /* JADX INFO: renamed from: addForegroundLifecycleListener */
    void mo29addForegroundLifecycleListener(@NotNull InterfaceC1638Nt0 interfaceC1638Nt0);

    /* JADX INFO: renamed from: addPermissionObserver */
    void mo30addPermissionObserver(@NotNull InterfaceC6240qu0 interfaceC6240qu0);

    /* JADX INFO: renamed from: clearAllNotifications */
    void mo31clearAllNotifications();

    /* JADX INFO: renamed from: getCanRequestPermission */
    boolean mo32getCanRequestPermission();

    /* JADX INFO: renamed from: getPermission */
    boolean mo33getPermission();

    /* JADX INFO: renamed from: removeClickListener */
    void mo34removeClickListener(@NotNull InterfaceC1090Gt0 interfaceC1090Gt0);

    /* JADX INFO: renamed from: removeForegroundLifecycleListener */
    void mo35removeForegroundLifecycleListener(@NotNull InterfaceC1638Nt0 interfaceC1638Nt0);

    /* JADX INFO: renamed from: removeGroupedNotifications */
    void mo36removeGroupedNotifications(@NotNull String str);

    /* JADX INFO: renamed from: removeNotification */
    void mo37removeNotification(int i);

    /* JADX INFO: renamed from: removePermissionObserver */
    void mo38removePermissionObserver(@NotNull InterfaceC6240qu0 interfaceC6240qu0);

    @Nullable
    Object requestPermission(boolean z, @NotNull JM<? super Boolean> jm);
}
