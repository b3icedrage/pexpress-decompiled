package defpackage;

import java.util.Collection;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: nv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC5613nv0 {
    void addAlias(@NotNull String str, @NotNull String str2);

    void addAliases(@NotNull Map<String, String> map);

    void addEmail(@NotNull String str);

    void addObserver(@NotNull InterfaceC5823ov0 interfaceC5823ov0);

    void addSms(@NotNull String str);

    void addTag(@NotNull String str, @NotNull String str2);

    void addTags(@NotNull Map<String, String> map);

    @NotNull
    String getExternalId();

    @NotNull
    String getOnesignalId();

    @NotNull
    InterfaceC7500wu0 getPushSubscription();

    @NotNull
    Map<String, String> getTags();

    void removeAlias(@NotNull String str);

    void removeAliases(@NotNull Collection<String> collection);

    void removeEmail(@NotNull String str);

    void removeObserver(@NotNull InterfaceC5823ov0 interfaceC5823ov0);

    void removeSms(@NotNull String str);

    void removeTag(@NotNull String str);

    void removeTags(@NotNull Collection<String> collection);

    void setLanguage(@NotNull String str);
}
