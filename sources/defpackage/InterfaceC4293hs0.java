package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

/* JADX INFO: renamed from: hs0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC4293hs0 {
    void cacheState();

    @NotNull
    EnumC1420Kz0 getChannelType();

    @NotNull
    C1342Jz0 getCurrentSessionInfluence();

    @Nullable
    String getDirectId();

    @NotNull
    String getIdTag();

    @Nullable
    JSONArray getIndirectIds();

    @Nullable
    EnumC1890Qz0 getInfluenceType();

    @NotNull
    JSONArray getLastReceivedIds();

    void resetAndInitInfluence();

    void saveLastId(@Nullable String str);

    void setDirectId(@Nullable String str);

    void setIndirectIds(@Nullable JSONArray jSONArray);

    void setInfluenceType(@Nullable EnumC1890Qz0 enumC1890Qz0);
}
