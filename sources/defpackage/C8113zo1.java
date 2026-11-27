package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: zo1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016¨\u0006\u0017"}, d2 = {"Lzo1;", "Lzu0;", "LTv0;", "_identityModelStore", "Lqj1;", "_propertiesModelStore", "LBU1;", "_subscriptionsModelStore", "LxI;", "_configModelStore", "<init>", "(LTv0;Lqj1;LBU1;LxI;)V", "", "appId", "onesignalId", "", "LQ91;", "getRebuildOperationsIfCurrentUser", "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "LTv0;", "Lqj1;", "LBU1;", "LxI;", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C8113zo1 implements InterfaceC8130zu0 {

    @NotNull
    private final C7582xI _configModelStore;

    @NotNull
    private final C2112Tv0 _identityModelStore;

    @NotNull
    private final C6204qj1 _propertiesModelStore;

    @NotNull
    private final BU1 _subscriptionsModelStore;

    public C8113zo1(@NotNull C2112Tv0 _identityModelStore, @NotNull C6204qj1 _propertiesModelStore, @NotNull BU1 _subscriptionsModelStore, @NotNull C7582xI _configModelStore) {
        Intrinsics.checkNotNullParameter(_identityModelStore, "_identityModelStore");
        Intrinsics.checkNotNullParameter(_propertiesModelStore, "_propertiesModelStore");
        Intrinsics.checkNotNullParameter(_subscriptionsModelStore, "_subscriptionsModelStore");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        this._identityModelStore = _identityModelStore;
        this._propertiesModelStore = _propertiesModelStore;
        this._subscriptionsModelStore = _subscriptionsModelStore;
        this._configModelStore = _configModelStore;
    }

    @Override // defpackage.InterfaceC8130zu0
    @Nullable
    public List<Q91> getRebuildOperationsIfCurrentUser(@NotNull String appId, @NotNull String onesignalId) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(onesignalId, "onesignalId");
        C2034Sv0 c2034Sv0 = new C2034Sv0();
        Object obj = null;
        c2034Sv0.initializeFromModel(null, this._identityModelStore.getModel());
        new C5994pj1().initializeFromModel(null, this._propertiesModelStore.getModel());
        ArrayList arrayList = new ArrayList();
        for (TModel tmodel : this._subscriptionsModelStore.list()) {
            AU1 au1 = new AU1();
            au1.initializeFromModel(null, tmodel);
            arrayList.add(au1);
        }
        if (!Intrinsics.a(c2034Sv0.getOnesignalId(), onesignalId)) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C5936pT0(appId, onesignalId, c2034Sv0.getExternalId(), null, 8, null));
        for (Object obj2 : arrayList) {
            if (Intrinsics.a(((AU1) obj2).getId(), this._configModelStore.getModel().getPushSubscriptionId())) {
                obj = obj2;
                break;
            }
        }
        AU1 au2 = (AU1) obj;
        if (au2 != null) {
            arrayList2.add(new PP(appId, onesignalId, au2.getId(), au2.getType(), au2.getOptedIn(), au2.getAddress(), au2.getStatus()));
        }
        arrayList2.add(new C3658eq1(appId, onesignalId));
        return arrayList2;
    }
}
