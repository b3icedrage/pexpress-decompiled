package defpackage;

import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: av0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC2834av0 {
    @Nullable
    Object createSubscription(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull DU1 du1, @NotNull JM<? super Pair<String, GB1>> jm);

    @Nullable
    Object deleteSubscription(@NotNull String str, @NotNull String str2, @NotNull JM<? super Unit> jm);

    @Nullable
    Object getIdentityFromSubscription(@NotNull String str, @NotNull String str2, @NotNull JM<? super Map<String, String>> jm);

    @Nullable
    Object transferSubscription(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull JM<? super Unit> jm);

    @Nullable
    Object updateSubscription(@NotNull String str, @NotNull String str2, @NotNull DU1 du1, @NotNull JM<? super GB1> jm);
}
