package defpackage;

import android.content.Context;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: du0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC3459du0 {
    @NotNull
    InterfaceC7283vs0 getDebug();

    @NotNull
    InterfaceC2523Ys0 getInAppMessages();

    @NotNull
    InterfaceC3250cu0 getNotifications();

    @NotNull
    InterfaceC5613nv0 getUser();

    boolean initWithContext(@NotNull Context context, @Nullable String str);

    void login(@NotNull String str);

    void login(@NotNull String str, @Nullable String str2);
}
