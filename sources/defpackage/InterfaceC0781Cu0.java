package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Cu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC0781Cu0 {

    /* JADX INFO: renamed from: Cu0$a */
    public interface a {
        void onAccept();

        void onReject(boolean z);
    }

    void registerAsCallback(@NotNull String str, @NotNull a aVar);

    void startPrompt(boolean z, @Nullable String str, @Nullable String str2, @NotNull Class<?> cls);
}
