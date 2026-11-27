package defpackage;

import java.util.Collection;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Ys0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC2523Ys0 {
    /* JADX INFO: renamed from: addClickListener */
    void mo19addClickListener(@NotNull InterfaceC1869Qs0 interfaceC1869Qs0);

    /* JADX INFO: renamed from: addLifecycleListener */
    void mo20addLifecycleListener(@NotNull InterfaceC2181Us0 interfaceC2181Us0);

    /* JADX INFO: renamed from: addTrigger */
    void mo21addTrigger(@NotNull String str, @NotNull String str2);

    /* JADX INFO: renamed from: addTriggers */
    void mo22addTriggers(@NotNull Map<String, String> map);

    /* JADX INFO: renamed from: clearTriggers */
    void mo23clearTriggers();

    boolean getPaused();

    /* JADX INFO: renamed from: removeClickListener */
    void mo24removeClickListener(@NotNull InterfaceC1869Qs0 interfaceC1869Qs0);

    /* JADX INFO: renamed from: removeLifecycleListener */
    void mo25removeLifecycleListener(@NotNull InterfaceC2181Us0 interfaceC2181Us0);

    /* JADX INFO: renamed from: removeTrigger */
    void mo26removeTrigger(@NotNull String str);

    /* JADX INFO: renamed from: removeTriggers */
    void mo27removeTriggers(@NotNull Collection<String> collection);

    void setPaused(boolean z);
}
