package defpackage;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Xr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC2442Xr0 {
    boolean cancelRunBackgroundServices();

    boolean getNeedsJobReschedule();

    @Nullable
    Object runBackgroundServices(@NotNull JM<? super Unit> jm);

    void setNeedsJobReschedule(boolean z);
}
