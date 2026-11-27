package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ca1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006R4\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"LCa1;", "Lku0;", "Lsu0;", "preferences", "<init>", "(Lsu0;)V", "Lsu0;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getUnattributedUniqueOutcomeEventsSentByChannel", "()Ljava/util/Set;", "setUnattributedUniqueOutcomeEventsSentByChannel", "(Ljava/util/Set;)V", "unattributedUniqueOutcomeEventsSentByChannel", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C0722Ca1 implements InterfaceC4977ku0 {

    @NotNull
    private final InterfaceC6659su0 preferences;

    public C0722Ca1(@NotNull InterfaceC6659su0 preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        this.preferences = preferences;
    }

    @Override // defpackage.InterfaceC4977ku0
    @Nullable
    public Set<String> getUnattributedUniqueOutcomeEventsSentByChannel() {
        return this.preferences.getStringSet("OneSignal", "PREFS_OS_UNATTRIBUTED_UNIQUE_OUTCOME_EVENTS_SENT", null);
    }

    @Override // defpackage.InterfaceC4977ku0
    public void setUnattributedUniqueOutcomeEventsSentByChannel(@Nullable Set<String> set) {
        this.preferences.saveStringSet("OneSignal", "PREFS_OS_UNATTRIBUTED_UNIQUE_OUTCOME_EVENTS_SENT", set);
    }
}
