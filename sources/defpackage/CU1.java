package defpackage;

import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0000\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0010J;\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001aR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001b¨\u0006\u001e"}, d2 = {"LCU1;", "LM01;", "LAU1;", "LBU1;", Payload.TYPE_STORE, "Lfu0;", "opRepo", "LTv0;", "_identityModelStore", "LxI;", "_configModelStore", "<init>", "(LBU1;Lfu0;LTv0;LxI;)V", "model", "LQ91;", "getAddOperation", "(LAU1;)LQ91;", "getRemoveOperation", "", "path", "property", "", "oldValue", "newValue", "getUpdateOperation", "(LAU1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)LQ91;", "LTv0;", "LxI;", "Companion", R51.PUSH_ADDITIONAL_DATA_KEY, "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CU1 extends M01<AU1> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final C7582xI _configModelStore;

    @NotNull
    private final C2112Tv0 _identityModelStore;

    /* JADX INFO: renamed from: CU1$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LCU1$a;", "", "<init>", "()V", "LAU1;", "model", "Lkotlin/Pair;", "", "LGU1;", "getSubscriptionEnabledAndStatus", "(LAU1;)Lkotlin/Pair;", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0025  */
        /* JADX WARN: Code duplicated, block: B:13:0x0029  */
        /* JADX WARN: Code duplicated, block: B:9:0x001f  */
        @NotNull
        public final Pair<Boolean, GU1> getSubscriptionEnabledAndStatus(@NotNull AU1 model) {
            GU1 status;
            GU1 gu1;
            boolean z;
            Intrinsics.checkNotNullParameter(model, "model");
            if (model.getOptedIn()) {
                GU1 status2 = model.getStatus();
                gu1 = GU1.SUBSCRIBED;
                if (status2 != gu1 || model.getAddress().length() <= 0) {
                    if (model.getOptedIn()) {
                        status = model.getStatus();
                    } else {
                        status = GU1.UNSUBSCRIBE;
                    }
                    gu1 = status;
                    z = false;
                } else {
                    z = true;
                }
            } else {
                if (model.getOptedIn()) {
                    status = GU1.UNSUBSCRIBE;
                } else {
                    status = model.getStatus();
                }
                gu1 = status;
                z = false;
            }
            return new Pair<>(Boolean.valueOf(z), gu1);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CU1(@NotNull BU1 store, @NotNull InterfaceC3879fu0 opRepo, @NotNull C2112Tv0 _identityModelStore, @NotNull C7582xI _configModelStore) {
        super(store, opRepo);
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(opRepo, "opRepo");
        Intrinsics.checkNotNullParameter(_identityModelStore, "_identityModelStore");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        this._identityModelStore = _identityModelStore;
        this._configModelStore = _configModelStore;
    }

    @Override // defpackage.M01
    @NotNull
    public Q91 getAddOperation(@NotNull AU1 model) {
        Intrinsics.checkNotNullParameter(model, "model");
        Pair<Boolean, GU1> subscriptionEnabledAndStatus = INSTANCE.getSubscriptionEnabledAndStatus(model);
        return new PP(this._configModelStore.getModel().getAppId(), this._identityModelStore.getModel().getOnesignalId(), model.getId(), model.getType(), subscriptionEnabledAndStatus.d.booleanValue(), model.getAddress(), subscriptionEnabledAndStatus.e);
    }

    @Override // defpackage.M01
    @NotNull
    public Q91 getRemoveOperation(@NotNull AU1 model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return new C4894kX(this._configModelStore.getModel().getAppId(), this._identityModelStore.getModel().getOnesignalId(), model.getId());
    }

    @Override // defpackage.M01
    @NotNull
    public Q91 getUpdateOperation(@NotNull AU1 model, @NotNull String path, @NotNull String property, @Nullable Object oldValue, @Nullable Object newValue) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(property, "property");
        Pair<Boolean, GU1> subscriptionEnabledAndStatus = INSTANCE.getSubscriptionEnabledAndStatus(model);
        return new X92(this._configModelStore.getModel().getAppId(), this._identityModelStore.getModel().getOnesignalId(), model.getId(), model.getType(), subscriptionEnabledAndStatus.d.booleanValue(), model.getAddress(), subscriptionEnabledAndStatus.e);
    }
}
