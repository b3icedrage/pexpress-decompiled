package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: wu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC7500wu0 extends InterfaceC2607Zu0 {
    void addObserver(@NotNull InterfaceC7710xu0 interfaceC7710xu0);

    @Override // defpackage.InterfaceC2607Zu0
    @NotNull
    /* synthetic */ String getId();

    boolean getOptedIn();

    @NotNull
    String getToken();

    void optIn();

    void optOut();

    void removeObserver(@NotNull InterfaceC7710xu0 interfaceC7710xu0);
}
