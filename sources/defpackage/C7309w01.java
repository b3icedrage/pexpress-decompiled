package defpackage;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Collection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: w01, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0001\u0018\u0000 %2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ#\u0010\f\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001dR$\u0010$\u001a\u00020\u001f2\u0006\u0010\u0006\u001a\u00020\u001f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lw01;", "LYs0;", "<init>", "()V", "", "key", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "addTrigger", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Void;", "", "triggers", "addTriggers", "(Ljava/util/Map;)Ljava/lang/Void;", "removeTrigger", "(Ljava/lang/String;)Ljava/lang/Void;", "", "keys", "removeTriggers", "(Ljava/util/Collection;)Ljava/lang/Void;", "clearTriggers", "()Ljava/lang/Void;", "LUs0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addLifecycleListener", "(LUs0;)Ljava/lang/Void;", "removeLifecycleListener", "LQs0;", "addClickListener", "(LQs0;)Ljava/lang/Void;", "removeClickListener", "", "getPaused", "()Z", "setPaused", "(Z)V", "paused", "Companion", R51.PUSH_ADDITIONAL_DATA_KEY, "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C7309w01 implements InterfaceC2523Ys0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: w01$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\b\u001a\u00060\u0004j\u0002`\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lw01$a;", "", "<init>", "()V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "getEXCEPTION", "()Ljava/lang/Exception;", "EXCEPTION", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Exception getEXCEPTION() {
            return new Exception("Must include gradle module com.onesignal:InAppMessages in order to use this functionality!");
        }

        private Companion() {
        }
    }

    @Override // defpackage.InterfaceC2523Ys0
    /* JADX INFO: renamed from: addTriggers, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ void mo22addTriggers(Map map) throws Exception {
        addTriggers((Map<String, String>) map);
    }

    @Override // defpackage.InterfaceC2523Ys0
    public boolean getPaused() throws Exception {
        throw INSTANCE.getEXCEPTION();
    }

    @Override // defpackage.InterfaceC2523Ys0
    /* JADX INFO: renamed from: removeTriggers, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ void mo27removeTriggers(Collection collection) throws Exception {
        removeTriggers((Collection<String>) collection);
    }

    @Override // defpackage.InterfaceC2523Ys0
    public void setPaused(boolean z) throws Exception {
        throw INSTANCE.getEXCEPTION();
    }

    @Override // defpackage.InterfaceC2523Ys0
    @NotNull
    /* JADX INFO: renamed from: addClickListener, reason: merged with bridge method [inline-methods] */
    public Void mo19addClickListener(@NotNull InterfaceC1869Qs0 listener) throws Exception {
        Intrinsics.checkNotNullParameter(listener, "listener");
        throw INSTANCE.getEXCEPTION();
    }

    @Override // defpackage.InterfaceC2523Ys0
    @NotNull
    /* JADX INFO: renamed from: addLifecycleListener, reason: merged with bridge method [inline-methods] */
    public Void mo20addLifecycleListener(@NotNull InterfaceC2181Us0 listener) throws Exception {
        Intrinsics.checkNotNullParameter(listener, "listener");
        throw INSTANCE.getEXCEPTION();
    }

    @Override // defpackage.InterfaceC2523Ys0
    @NotNull
    /* JADX INFO: renamed from: addTrigger, reason: merged with bridge method [inline-methods] */
    public Void mo21addTrigger(@NotNull String key, @NotNull String value) throws Exception {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        throw INSTANCE.getEXCEPTION();
    }

    @NotNull
    public Void addTriggers(@NotNull Map<String, String> triggers) throws Exception {
        Intrinsics.checkNotNullParameter(triggers, "triggers");
        throw INSTANCE.getEXCEPTION();
    }

    @Override // defpackage.InterfaceC2523Ys0
    @NotNull
    /* JADX INFO: renamed from: clearTriggers, reason: merged with bridge method [inline-methods] */
    public Void mo23clearTriggers() throws Exception {
        throw INSTANCE.getEXCEPTION();
    }

    @Override // defpackage.InterfaceC2523Ys0
    @NotNull
    /* JADX INFO: renamed from: removeClickListener, reason: merged with bridge method [inline-methods] */
    public Void mo24removeClickListener(@NotNull InterfaceC1869Qs0 listener) throws Exception {
        Intrinsics.checkNotNullParameter(listener, "listener");
        throw INSTANCE.getEXCEPTION();
    }

    @Override // defpackage.InterfaceC2523Ys0
    @NotNull
    /* JADX INFO: renamed from: removeLifecycleListener, reason: merged with bridge method [inline-methods] */
    public Void mo25removeLifecycleListener(@NotNull InterfaceC2181Us0 listener) throws Exception {
        Intrinsics.checkNotNullParameter(listener, "listener");
        throw INSTANCE.getEXCEPTION();
    }

    @Override // defpackage.InterfaceC2523Ys0
    @NotNull
    /* JADX INFO: renamed from: removeTrigger, reason: merged with bridge method [inline-methods] */
    public Void mo26removeTrigger(@NotNull String key) throws Exception {
        Intrinsics.checkNotNullParameter(key, "key");
        throw INSTANCE.getEXCEPTION();
    }

    @NotNull
    public Void removeTriggers(@NotNull Collection<String> keys) throws Exception {
        Intrinsics.checkNotNullParameter(keys, "keys");
        throw INSTANCE.getEXCEPTION();
    }
}
