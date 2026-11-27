package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: dx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Ldx0;", "LVs0;", "Lcu0;", "_notificationsManager", "Lkt0;", "_locationManager", "<init>", "(Lcu0;Lkt0;)V", "", "promptType", "Lcx0;", "createPrompt", "(Ljava/lang/String;)Lcx0;", "Lcu0;", "Lkt0;", "com.onesignal.inAppMessages"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C3468dx0 implements InterfaceC2259Vs0 {

    @NotNull
    private final InterfaceC4974kt0 _locationManager;

    @NotNull
    private final InterfaceC3250cu0 _notificationsManager;

    public C3468dx0(@NotNull InterfaceC3250cu0 _notificationsManager, @NotNull InterfaceC4974kt0 _locationManager) {
        Intrinsics.checkNotNullParameter(_notificationsManager, "_notificationsManager");
        Intrinsics.checkNotNullParameter(_locationManager, "_locationManager");
        this._notificationsManager = _notificationsManager;
        this._locationManager = _locationManager;
    }

    @Override // defpackage.InterfaceC2259Vs0
    @Nullable
    public AbstractC3259cx0 createPrompt(@NotNull String promptType) {
        Intrinsics.checkNotNullParameter(promptType, "promptType");
        if (Intrinsics.a(promptType, "push")) {
            return new C3678ex0(this._notificationsManager);
        }
        if (Intrinsics.a(promptType, "location")) {
            return new C2535Yw0(this._locationManager);
        }
        return null;
    }
}
