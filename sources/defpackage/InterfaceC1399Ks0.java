package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ks0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC1399Ks0 {
    @Nullable
    Object getIAMData(@NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull JM<? super C3850fl0> jm);

    @Nullable
    Object getIAMPreviewData(@NotNull String str, @NotNull String str2, @NotNull JM<? super C2271Vw0> jm);

    @Nullable
    Object listInAppMessages(@NotNull String str, @NotNull String str2, @NotNull GB1 gb1, @NotNull Function0<Long> function0, @NotNull JM<? super List<C1881Qw0>> jm);

    @Nullable
    Object sendIAMClick(@NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull String str4, @Nullable String str5, boolean z, @NotNull JM<? super Unit> jm);

    @Nullable
    Object sendIAMImpression(@NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull String str4, @NotNull JM<? super Unit> jm);

    @Nullable
    Object sendIAMPageImpression(@NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull String str4, @Nullable String str5, @NotNull JM<? super Unit> jm);
}
