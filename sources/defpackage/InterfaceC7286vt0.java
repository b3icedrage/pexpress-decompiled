package defpackage;

import defpackage.D01;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: vt0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC7286vt0<TModel extends D01> {
    void onModelAdded(@NotNull TModel tmodel, @NotNull String str);

    void onModelRemoved(@NotNull TModel tmodel, @NotNull String str);

    void onModelUpdated(@NotNull H01 h01, @NotNull String str);
}
