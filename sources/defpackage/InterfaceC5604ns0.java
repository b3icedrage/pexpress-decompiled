package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ns0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC5604ns0 {
    int getCount();

    float getFloat(@NotNull String str);

    int getInt(@NotNull String str);

    long getLong(@NotNull String str);

    @Nullable
    Float getOptFloat(@NotNull String str);

    @Nullable
    Integer getOptInt(@NotNull String str);

    @Nullable
    Long getOptLong(@NotNull String str);

    @Nullable
    String getOptString(@NotNull String str);

    @NotNull
    String getString(@NotNull String str);

    boolean moveToFirst();

    boolean moveToNext();
}
