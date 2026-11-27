package defpackage;

import java.util.List;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: lu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC5187lu0 {
    @Nullable
    Object cleanCachedUniqueOutcomeEventNotifications(@NotNull JM<? super Unit> jm);

    @Nullable
    Object deleteOldOutcomeEvent(@NotNull C8058za1 c8058za1, @NotNull JM<? super Unit> jm);

    @Nullable
    Object getAllEventsToSend(@NotNull JM<? super List<C8058za1>> jm);

    @Nullable
    Object getNotCachedUniqueInfluencesForOutcome(@NotNull String str, @NotNull List<C1342Jz0> list, @NotNull JM<? super List<C1342Jz0>> jm);

    @Nullable
    Object saveOutcomeEvent(@NotNull C8058za1 c8058za1, @NotNull JM<? super Unit> jm);

    @Nullable
    Object saveUniqueOutcomeEventParams(@NotNull C8058za1 c8058za1, @NotNull JM<? super Unit> jm);
}
