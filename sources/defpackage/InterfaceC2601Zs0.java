package defpackage;

import java.util.Set;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Zs0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC2601Zs0 {
    void cleanInAppMessageClickedClickIds(@Nullable Set<String> set);

    void cleanInAppMessageIds(@Nullable Set<String> set);

    @Nullable
    Set<String> getClickedMessagesId();

    @Nullable
    Set<String> getDismissedMessagesId();

    @Nullable
    Set<String> getImpressionesMessagesId();

    @Nullable
    Long getLastTimeInAppDismissed();

    @Nullable
    String getSavedIAMs();

    @Nullable
    Set<String> getViewPageImpressionedIds();

    void setClickedMessagesId(@Nullable Set<String> set);

    void setDismissedMessagesId(@Nullable Set<String> set);

    void setImpressionesMessagesId(@Nullable Set<String> set);

    void setLastTimeInAppDismissed(@Nullable Long l);

    void setSavedIAMs(@Nullable String str);

    void setViewPageImpressionedIds(@Nullable Set<String> set);
}
