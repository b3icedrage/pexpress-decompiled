package defpackage;

import android.app.Activity;
import android.content.Context;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Wr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC2338Wr0 {
    void addActivityLifecycleHandler(@NotNull InterfaceC2100Tr0 interfaceC2100Tr0);

    void addApplicationLifecycleHandler(@NotNull InterfaceC2256Vr0 interfaceC2256Vr0);

    @NotNull
    Context getAppContext();

    @Nullable
    /* JADX INFO: renamed from: getCurrent */
    Activity get_current();

    @NotNull
    EnumC0894Eg getEntryState();

    boolean isInForeground();

    void removeActivityLifecycleHandler(@NotNull InterfaceC2100Tr0 interfaceC2100Tr0);

    void removeApplicationLifecycleHandler(@NotNull InterfaceC2256Vr0 interfaceC2256Vr0);

    void setEntryState(@NotNull EnumC0894Eg enumC0894Eg);

    @Nullable
    Object waitUntilActivityReady(@NotNull JM<? super Boolean> jm);

    @Nullable
    Object waitUntilSystemConditionsAvailable(@NotNull JM<? super Boolean> jm);
}
