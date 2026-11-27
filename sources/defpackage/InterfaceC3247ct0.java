package defpackage;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: ct0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC3247ct0 {
    @NotNull
    List<C1342Jz0> getInfluences();

    void onDirectInfluenceFromIAM(@NotNull String str);

    void onDirectInfluenceFromNotification(@NotNull String str);

    void onInAppMessageDismissed();

    void onInAppMessageDisplayed(@NotNull String str);

    void onNotificationReceived(@NotNull String str);
}
